package edu.sma.bankloans.controller.api;

import edu.sma.bankloans.model.Profession;
import edu.sma.bankloans.service.loan.impls.ProfessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/customer/profession")
@RestController
public class ProfessionRestController {
    @Autowired
    ProfessionServiceImpl service;

    @GetMapping("")
    public List<Profession> showAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Profession showOne(@PathVariable String id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id) {
        service.delete(id);
    }

    @PostMapping()
    public Profession insertOne(@RequestBody Profession profession) {
        return service.create(profession);
    }

    @PutMapping()
    public Profession updateOne(@RequestBody Profession profession) {
        return service.update(profession);
    }
}
