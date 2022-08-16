package edu.sma.bankloans.controller.api;

import edu.sma.bankloans.model.Loan;
import edu.sma.bankloans.service.impls.LoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/v1/loans/")
@RestController
public class LoanRestController {

        @Autowired
        LoanServiceImpl service;

        @GetMapping("")
        public List<Loan> showAll() {
            return service.getAll();
        }

        @GetMapping("/{id}")
        public Loan showOne(@PathVariable String id) {
            return service.get(id);
        }

        @DeleteMapping("/{id}")
        public void del(@PathVariable String id) {
            service.delete(id);
        }

        @PostMapping()
        public Loan insertOne(@RequestBody Loan provider) {
            return service.create(provider);
        }

        @PutMapping()
        public Loan updateOne(@RequestBody Loan provider) {
            return service.update(provider);
        }


    }

