package edu.sma.bankloans.service.loan.impls;

import edu.sma.bankloans.model.Payment;
import edu.sma.bankloans.repository.PaymentFakeRepository;
import edu.sma.bankloans.service.loan.interfaces.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PaymentServiceImpl implements IPaymentService {
    private LocalDateTime now = LocalDateTime.now();
    private Payment loan;
    private List<Payment> payments = new ArrayList<>(
            Arrays.asList(
            ));
        @Autowired
        PaymentFakeRepository repository;

        @Override
        public Payment create(Payment payment) {
            return repository.save(payment);
        }

        @Override
        public Payment update(Payment payment) {
            return repository.update(payment);
        }

        @Override
        public Payment get(String id) {
            return repository.findById(id);
        }

        @Override
        public void delete(String id) {
            repository.deleteById(id);
        }

        @Override
        public List<Payment> getAll() {
            return repository.findAll();
        }
    }

