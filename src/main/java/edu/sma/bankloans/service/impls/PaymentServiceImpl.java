package edu.sma.bankloans.service.impls;

import edu.sma.bankloans.model.Payment;
import edu.sma.bankloans.repository.mongo.PaymentMongoRepository;
import edu.sma.bankloans.service.interfaces.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
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
                    new Payment("1","1","asd0",1,true,now,now,now)
            ));
    @Autowired
    PaymentMongoRepository repository;

    @PostConstruct
    void init() {
        repository.saveAll(payments);
    }

    @Override
    public Payment create(Payment payment) {
        return repository.save(payment);
    }

    @Override
    public Payment update(Payment payment) {
        return repository.save(payment);
    }

    @Override
    public Payment get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Payment> getAll() {
        return repository.findAll();
    }

    public List<Payment> getAllById(String id) {
        return repository.findByLoanId(id);
    }
}

