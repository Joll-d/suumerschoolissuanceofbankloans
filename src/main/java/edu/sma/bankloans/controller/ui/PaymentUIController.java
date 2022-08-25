package edu.sma.bankloans.controller.ui;

import edu.sma.bankloans.form.PaymentForm;
import edu.sma.bankloans.model.Payment;
import edu.sma.bankloans.service.impls.CustomerServiceImpl;
import edu.sma.bankloans.service.impls.LoanTypeServiceImpl;
import edu.sma.bankloans.service.impls.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/loans/payments/")
@Controller
public class PaymentUIController {

    @Autowired
    PaymentServiceImpl service;

    @Autowired
    PaymentServiceImpl servicePayment;
    @Autowired
    LoanTypeServiceImpl serviceType;
    @Autowired
    CustomerServiceImpl serviceCustomer;
    @GetMapping("{id}")
    public String showOne(Model model, @PathVariable("id") String id) {
        PaymentForm paymentForm = new PaymentForm();
        model.addAttribute("payments", servicePayment.getAllById(id));
        model.addAttribute("ID", id);
        model.addAttribute("form", paymentForm);
        return "payments";
    }

    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/loans/payments/";
    }

    @PostMapping("/add/{id}")
    public String addLoan(@ModelAttribute("form") PaymentForm form, @PathVariable("id") String id){
        Payment payment = new Payment();
        payment.setName(form.getName());
        payment.setLoanId(id);
        payment.setPaid(form.getPaid());
        payment.setDelay(form.getDelay());
        payment.setPaymentDate(LocalDateTime.now());
        payment.setCreatedAt(LocalDateTime.now());
        payment.setUpdatedAt(LocalDateTime.now());
        service.create(payment);
        return "redirect:/ui/v1/loans/payments/{id}";

    }

}
