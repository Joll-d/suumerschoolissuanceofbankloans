package edu.sma.bankloans.service.impls;

import edu.sma.bankloans.model.Customer;
import edu.sma.bankloans.model.Loan;
import edu.sma.bankloans.model.LoanType;
import edu.sma.bankloans.model.Payment;
import edu.sma.bankloans.repository.mongo.LoanMongoRepository;
import edu.sma.bankloans.service.interfaces.ILoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LoanServiceImpl implements ILoanService {
    private LocalDateTime now = LocalDateTime.now();
    private Loan loan;
    private List<Loan> loans = new ArrayList<>(
            Arrays.asList(
                    new Loan("1", "Loan1", new LoanType(), new Customer(), 10000, new Payment(), now, now, now, now),
                    new Loan("2", "Loan2", new LoanType(), new Customer(), 5000, new Payment(), now, now, now, now),
                    new Loan("3", "Loan3", new LoanType(), new Customer(), 100000, new Payment(), now, now, now, now),
                    new Loan("4", "Loan4", new LoanType(), new Customer(), 1000, new Payment(), now, now, now, now)
            ));
    @Autowired
    LoanMongoRepository repository;

    @PostConstruct
    void init() {
        repository.saveAll(loans);
    }

    @Override
    public Loan create(Loan provider) {
        return repository.save(provider);
    }

    @Override
    public Loan update(Loan provider) {
        return repository.save(provider);
    }

    @Override
    public Loan get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Loan> getAll() {
        return repository.findAll();
    }
}

