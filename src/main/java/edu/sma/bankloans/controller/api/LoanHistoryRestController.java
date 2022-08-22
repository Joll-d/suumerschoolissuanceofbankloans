package edu.sma.bankloans.controller.api;

import edu.sma.bankloans.model.LoanHistory;
import edu.sma.bankloans.service.impls.LoanHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/customer/loan-history/")
@RestController
public class LoanHistoryRestController {
    @Autowired
    LoanHistoryServiceImpl service;

    @GetMapping("")
    public List<LoanHistory> showAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public LoanHistory showOne(@PathVariable String id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id) {
        service.delete(id);
    }

    @PostMapping()
    public LoanHistory insertOne(@RequestBody LoanHistory loanHistory) {
        return service.create(loanHistory);
    }

    @PutMapping()
    public LoanHistory updateOne(@RequestBody LoanHistory loanHistory) {
        return service.update(loanHistory);
    }
}
