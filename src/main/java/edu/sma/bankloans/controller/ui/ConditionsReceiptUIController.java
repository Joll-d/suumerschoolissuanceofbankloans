package edu.sma.bankloans.controller.ui;

import edu.sma.bankloans.form.ConditionsReceiptForm;
import edu.sma.bankloans.model.ConditionsReceipt;
import edu.sma.bankloans.service.impls.ConditionsReceiptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/loans/types/conditions/")
@Controller
public class ConditionsReceiptUIController {
    @Autowired
    ConditionsReceiptServiceImpl service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("conditions", service.getAll());
        ConditionsReceiptForm conditionsReceiptForm = new ConditionsReceiptForm();
        model.addAttribute("form", conditionsReceiptForm);
        return "conditions";
    }

    @GetMapping("/{id}")
    public String showOne(Model model, @PathVariable String id) {
        model.addAttribute("condition", service.get(id));
        return "condition";
    }

    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/loans/types/conditions/";
    }

    @PostMapping("/add")
    public String addConditionsReceipt(@ModelAttribute("form") ConditionsReceiptForm form){
        ConditionsReceipt conditionsReceipt = new ConditionsReceipt();
        conditionsReceipt.setName(form.getName());
        conditionsReceipt.setAgeMin(form.getAgeMin());
        conditionsReceipt.setAgeMax(form.getAgeMax());
        conditionsReceipt.setSalaryMin(form.getSalaryMin());
        conditionsReceipt.setWorkExperience(form.getWorkExperience());
        conditionsReceipt.setCreatedAt(LocalDateTime.now());
        conditionsReceipt.setUpdatedAt(LocalDateTime.now());
        service.update(conditionsReceipt);
        return "redirect:/ui/v1/loans/types/conditions/";

    }
}
