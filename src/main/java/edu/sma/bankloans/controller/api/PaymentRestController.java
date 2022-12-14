package edu.sma.bankloans.controller.api;

import edu.sma.bankloans.model.Payment;
import edu.sma.bankloans.service.impls.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/loans/payment/")
@RestController
public class PaymentRestController {
    @Autowired
    PaymentServiceImpl service;

    @GetMapping("")
    public List<Payment> showAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Payment showOne(@PathVariable String id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id) {
        service.delete(id);
    }

    @PostMapping()
    public Payment insertOne(@RequestBody Payment payment) {
        return service.create(payment);
    }

    @PutMapping()
    public Payment updateOne(@RequestBody Payment payment) {
        return service.update(payment);
    }
}
