package edu.sma.bankloans.controller.ui;

import edu.sma.bankloans.service.impls.LoanTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/v1/loans/types/")
@Controller
public class LoanTypeUIController {

    @Autowired
    LoanTypeServiceImpl service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("types", service.getAll());

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
}

