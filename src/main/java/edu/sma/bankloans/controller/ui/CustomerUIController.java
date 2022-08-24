package edu.sma.bankloans.controller.ui;

import edu.sma.bankloans.form.CustomerForm;
import edu.sma.bankloans.model.Customer;
import edu.sma.bankloans.model.Loan;
import edu.sma.bankloans.model.LoanHistory;
import edu.sma.bankloans.service.impls.CustomerServiceImpl;
import edu.sma.bankloans.service.impls.LoanHistoryServiceImpl;
import edu.sma.bankloans.service.impls.ProfessionServiceImpl;
import edu.sma.bankloans.service.impls.PropertyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/customers/")
@Controller
public class CustomerUIController {

    @Autowired
    CustomerServiceImpl service;
    @Autowired
    ProfessionServiceImpl serviceProfession;
    @Autowired
    PropertyServiceImpl serviceProperty;
    @Autowired
    LoanHistoryServiceImpl serviceHistory;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("customers", service.getAll());
        model.addAttribute("professions", serviceProfession.getAll());
        model.addAttribute("properties", serviceProperty.getAll());
        CustomerForm customerForm = new CustomerForm();
        model.addAttribute("form", customerForm);
        return "customers";
    }

    @GetMapping("/{id}")
    public String showOne(Model model, @PathVariable String id) {
        model.addAttribute("customer", service.get(id));
        return "customer";
    }

    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/customers/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addLoan(@ModelAttribute("form") CustomerForm form){
        Customer customer = new Customer();
        customer.setPassportID(form.getPassportID());
        customer.setName(form.getName());
        customer.setFamily(form.getFamily());
        customer.setProfession(serviceProfession.get(form.getProfession()));
        customer.setProperty(serviceProperty.get(form.getProperty()));
        customer.setAddress(form.getAddress());
        customer.setPhone(form.getPhone());
        customer.setContactPerson(form.getContactPerson());
        customer.setLoanHistory(serviceHistory.create(new LoanHistory("1","none",new Loan(),LocalDateTime.now(),LocalDateTime.now())));
        customer.setCreatedAt(LocalDateTime.now());
        customer.setUpdatedAt(LocalDateTime.now());
        service.create(customer);
        return "redirect:/ui/v1/customers/";

    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateCustomer(@ModelAttribute("form") CustomerForm form, @PathVariable("id") String id){
        Customer customerToUpdate = new Customer();
        customerToUpdate.setId(id);
        customerToUpdate.setPassportID(form.getPassportID());
        customerToUpdate.setName(form.getName());
        customerToUpdate.setFamily(form.getFamily());
        customerToUpdate.setProfession(serviceProfession.get(form.getProfession()));
        customerToUpdate.setProperty(serviceProperty.get(form.getProperty()));
        customerToUpdate.setAddress(form.getAddress());
        customerToUpdate.setPhone(form.getPhone());
        customerToUpdate.setContactPerson(form.getContactPerson());
        customerToUpdate.setLoanHistory(serviceHistory.create(new LoanHistory("1","none",new Loan(),LocalDateTime.now(),LocalDateTime.now())));
        customerToUpdate.setCreatedAt(service.get(id).getCreatedAt());
        customerToUpdate.setUpdatedAt(LocalDateTime.now());
        service.update(customerToUpdate);
        return "redirect:/ui/v1/customers/";

    }
}
