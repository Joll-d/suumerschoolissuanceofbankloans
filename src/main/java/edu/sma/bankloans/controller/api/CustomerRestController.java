package edu.sma.bankloans.controller.api;

import edu.sma.bankloans.model.Customer;
import edu.sma.bankloans.service.impls.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/customers/")
@RestController
public class CustomerRestController {
    @Autowired
    CustomerServiceImpl service;

    @GetMapping("")
    public List<Customer> showAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Customer showOne(@PathVariable String id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id) {
        service.delete(id);
    }

    @PostMapping()
    public Customer insertOne(@RequestBody Customer customer) {
        return service.create(customer);
    }

    @PutMapping()
    public Customer updateOne(@RequestBody Customer customer) {
        return service.update(customer);
    }
}