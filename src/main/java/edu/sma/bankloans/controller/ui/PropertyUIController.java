package edu.sma.bankloans.controller.ui;

import edu.sma.bankloans.service.impls.PropertyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/v1/customer/property/")
@Controller
public class PropertyUIController {
    @Autowired
    PropertyServiceImpl service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("property", service.getAll());

        return "property";
    }

    @GetMapping("/{id}")
    public String showOne(Model model, @PathVariable String id) {
        model.addAttribute("property", service.get(id));
        return "property";
    }
}
