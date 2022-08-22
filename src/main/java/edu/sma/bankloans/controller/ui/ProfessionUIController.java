package edu.sma.bankloans.controller.ui;

import edu.sma.bankloans.service.impls.ProfessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/v1/customer/professions/")
@Controller
public class ProfessionUIController {
    @Autowired
    ProfessionServiceImpl service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("professions", service.getAll());

        return "professions";
    }

    @GetMapping("/{id}")
    public String showOne(Model model, @PathVariable String id) {
        model.addAttribute("profession", service.get(id));
        return "profession";
    }

    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/customers/professions/";
    }
}
