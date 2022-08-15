package edu.sma.bankloans.repository;
import edu.sma.bankloans.model.Payment;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class PaymentFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private Payment loanType;
    private List<Payment> payments = new ArrayList<>(
            Arrays.asList(
            ));

    public List<Payment> findAll() {
        return this.payments;
    }

    public Payment findById(String id) {
        return this.payments.stream().filter(Payment -> Payment.getId().equals(id)).findFirst().orElse(null);
    }

    public Payment update(Payment Payment) {
        this.deleteById(Payment.getId());
        Payment.setUpdatedAt(LocalDateTime.now());
        this.payments.add(Payment);
        return Payment;
    }

    public void deleteById(String id) {
        Payment Payment = this.findById(id);
        this.payments.remove(Payment);
    }

    public Payment save(Payment Payment) {
        Payment.setId(UUID.randomUUID().toString());
        Payment.setCreatedAt(LocalDateTime.now());
        this.payments.add(Payment);
        return null;
    }

}
