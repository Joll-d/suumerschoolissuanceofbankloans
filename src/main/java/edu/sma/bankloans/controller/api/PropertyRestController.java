package edu.sma.bankloans.controller.api;

import edu.sma.bankloans.model.Property;
import edu.sma.bankloans.service.impls.PropertyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/customer/property")
@RestController
public class PropertyRestController {
    @Autowired
    PropertyServiceImpl service;

    @GetMapping("")
    public List<Property> showAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Property showOne(@PathVariable String id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id) {
        service.delete(id);
    }

    @PostMapping()
    public Property insertOne(@RequestBody Property property) {
        return service.create(property);
    }

    @PutMapping()
    public Property updateOne(@RequestBody Property property) {
        return service.update(property);
    }
}
