package edu.sma.bankloans.controller.ui;

import edu.sma.bankloans.service.impls.ConditionsReceiptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/v1/loans/types/conditions/")
@Controller
public class ConditionsReceiptUIController {
    @Autowired
    ConditionsReceiptServiceImpl service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("conditions", service.getAll());

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
}
