package edu.sma.bankloans.controller.ui;

import edu.sma.bankloans.form.LoanForm;
import edu.sma.bankloans.model.Loan;
import edu.sma.bankloans.service.impls.CustomerServiceImpl;
import edu.sma.bankloans.service.impls.LoanServiceImpl;
import edu.sma.bankloans.service.impls.LoanTypeServiceImpl;
import edu.sma.bankloans.service.impls.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

//accepts requests and performs CRUD
@RequestMapping("/ui/v1/loans/")
@Controller
public class LoanUIController {

    @Autowired
    LoanServiceImpl service;

    @Autowired
    PaymentServiceImpl servicePayment;
    @Autowired
    LoanTypeServiceImpl serviceType;
    @Autowired
    CustomerServiceImpl serviceCustomer;
    //returns fame
    @GetMapping("")
    public String showOne(Model model) {
        String updateID = "";
        model.addAttribute("updateID", updateID);
        model.addAttribute("loans", service.getAll());
        LoanForm loanForm = new LoanForm();
        model.addAttribute("types", serviceType.getAll());
        model.addAttribute("customers", serviceCustomer.getAll());
        model.addAttribute("payments", servicePayment.getAll());
        model.addAttribute("form", loanForm);
        return "loans";
    }
    //deletes the record
    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/loans/";
    }
    //adds a record
    @PostMapping("/add")
    public String addLoan(@ModelAttribute("form") LoanForm form, Model model){
        Loan loan = new Loan();
        try {
            loan.setName(form.getName());
            loan.setType(serviceType.get(form.getType()));
            loan.setCustomer(serviceCustomer.get(form.getCustomer()));
            loan.setSum(form.getSum());
            loan.setPayment(servicePayment.get("1"));
        }catch (TypeNotPresentException e){
            model.addAttribute("ErrorID", 0);
        }
            loan.setDateIssuance(LocalDateTime.now());
            loan.setDateRefund(LocalDateTime.now());
            loan.setCreatedAt(LocalDateTime.now());
            loan.setUpdatedAt(LocalDateTime.now());

        service.create(loan);
        return "redirect:/ui/v1/loans/";

    }
    //updates the record
    @PostMapping("/edit/{id}")
    public String updateLoan(@ModelAttribute("form") LoanForm form, @PathVariable("id") String id, Model model){
        Loan loanToUpdate = new Loan();
        try {
            loanToUpdate.setId(id);
            loanToUpdate.setName(form.getName());
            loanToUpdate.setType(serviceType.get(form.getType()));
            loanToUpdate.setCustomer(serviceCustomer.get(form.getCustomer()));
            loanToUpdate.setSum(form.getSum());
            loanToUpdate.setPayment(servicePayment.get(form.getPayment()));
            loanToUpdate.setDateIssuance(LocalDateTime.now());
            loanToUpdate.setDateRefund(LocalDateTime.now());
            loanToUpdate.setCreatedAt(service.get(id).getCreatedAt());
            loanToUpdate.setUpdatedAt(LocalDateTime.now());
        }catch (TypeNotPresentException e){
            model.addAttribute("ErrorID", 0);
        }

        service.update(loanToUpdate);
        return "redirect:/ui/v1/loans/";

    }
}
