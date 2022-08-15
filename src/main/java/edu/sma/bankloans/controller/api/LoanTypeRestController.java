package edu.sma.bankloans.controller.api;

import edu.sma.bankloans.model.LoanType;
import edu.sma.bankloans.service.loan.impls.LoanServiceImpl;
import edu.sma.bankloans.service.loan.impls.LoanTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/api/v1/loans/type")
@RestController
public class LoanTypeRestController {
         @Autowired
         LoanTypeServiceImpl service;

        @GetMapping("")
        public List<LoanType> showAll() {
            return service.getAll();
        }

        @GetMapping("/{id}")
        public LoanType showOne(@PathVariable String id) {
            return service.get(id);
        }

        @DeleteMapping("/{id}")
        public void del(@PathVariable String id) {
            service.delete(id);
        }

        @PostMapping()
        public LoanType insertOne(@RequestBody LoanType provider) {
            return service.create(provider);
        }

        @PutMapping()
        public LoanType updateOne(@RequestBody LoanType provider) {
            return service.update(provider);
        }


    }