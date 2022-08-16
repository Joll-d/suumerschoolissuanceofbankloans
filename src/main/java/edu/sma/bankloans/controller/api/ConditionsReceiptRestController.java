package edu.sma.bankloans.controller.api;

import edu.sma.bankloans.model.ConditionsReceipt;
import edu.sma.bankloans.service.impls.ConditionsReceiptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/loans/type/conditions")
@RestController
public class ConditionsReceiptRestController {
    @Autowired
    ConditionsReceiptServiceImpl service;

    @GetMapping("")
    public List<ConditionsReceipt> showAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ConditionsReceipt showOne(@PathVariable String id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id) {
        service.delete(id);
    }

    @PostMapping()
    public ConditionsReceipt insertOne(@RequestBody ConditionsReceipt conditionsReceipt) {
        return service.create(conditionsReceipt);
    }

    @PutMapping()
    public ConditionsReceipt updateOne(@RequestBody ConditionsReceipt conditionsReceipt) {
        return service.update(conditionsReceipt);
    }
}
