package edu.sma.bankloans.service.interfaces;

import edu.sma.bankloans.model.Payment;

import java.util.List;

public interface IPaymentService {
    Payment create(Payment payment);
    Payment update(Payment payment);
    Payment get(String id);
    void delete(String id);
    List<Payment> getAll();

}
