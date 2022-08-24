package edu.sma.bankloans.controller.ui;

import edu.sma.bankloans.form.LoanTypeForm;
import edu.sma.bankloans.model.LoanType;
import edu.sma.bankloans.service.impls.ConditionsReceiptServiceImpl;
import edu.sma.bankloans.service.impls.LoanTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/loans/types/")
@Controller
public class LoanTypeUIController {

    @Autowired
    LoanTypeServiceImpl service;
    @Autowired
    ConditionsReceiptServiceImpl serviceConditions;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("types", service.getAll());
        model.addAttribute("conditions", serviceConditions.getAll());
        LoanTypeForm loanTypeForm = new LoanTypeForm();
        model.addAttribute("form", loanTypeForm);

        return "types";
    }

    @GetMapping("/{id}")
    public String showOne(Model model, @PathVariable String id) {
        model.addAttribute("type", service.get(id));
        return "type";
    }

    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/loans/types/";
    }

    @PostMapping("/add")
    public String addLoanType(@ModelAttribute("form") LoanTypeForm form){
        LoanType loanType = new LoanType();
        loanType.setName(form.getName());
        loanType.setConditions(serviceConditions.get(form.getConditions()));
        loanType.setAmountMin(form.getAmountMin());
        loanType.setAmountMax(form.getAmountMax());
        loanType.setRate(form.getRate());
        loanType.setTerm(form.getTerm());
        loanType.setCreatedAt(LocalDateTime.now());
        loanType.setUpdatedAt(LocalDateTime.now());
        service.create(loanType);
        return "redirect:/ui/v1/loans/types/";

    }

    @PostMapping("/edit/{id}")
    public String updateLoanType(@ModelAttribute("form") LoanTypeForm form, @PathVariable("id") String id){
        LoanType loanType = new LoanType();
        loanType.setId(id);
        loanType.setName(form.getName());
        loanType.setConditions(serviceConditions.get(form.getConditions()));
        loanType.setAmountMin(form.getAmountMin());
        loanType.setAmountMax(form.getAmountMax());
        loanType.setRate(form.getRate());
        loanType.setTerm(form.getTerm());
        loanType.setCreatedAt(service.get(id).getCreatedAt());
        loanType.setUpdatedAt(LocalDateTime.now());
        service.update(loanType);
        return "redirect:/ui/v1/loans/types/";

    }
}

