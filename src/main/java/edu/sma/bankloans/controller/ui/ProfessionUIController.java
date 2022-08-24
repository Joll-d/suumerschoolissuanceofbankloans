package edu.sma.bankloans.controller.ui;

import edu.sma.bankloans.form.ProfessionForm;
import edu.sma.bankloans.model.Profession;
import edu.sma.bankloans.service.impls.ProfessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/customer/professions/")
@Controller
public class ProfessionUIController {
    @Autowired
    ProfessionServiceImpl service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("professions", service.getAll());
        ProfessionForm professionForm = new ProfessionForm();
        model.addAttribute("form", professionForm);

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

    @PostMapping("/add")
    public String addProfession(@ModelAttribute("form") ProfessionForm form){
        Profession profession = new Profession();
        profession.setName(form.getName());
        profession.setWorkExperience(form.getWorkExperience());
        profession.setSalary(form.getSalary());
        profession.setCreatedAt(LocalDateTime.now());
        profession.setUpdatedAt(LocalDateTime.now());
        service.create(profession);
        return "redirect:/ui/v1/customer/professions/";

    }
}
