package edu.sma.bankloans.service.impls;

import edu.sma.bankloans.model.*;
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
                    new Loan("1", "Loan1",
                            new LoanType("1", "LoanType1", new ConditionsReceipt("1", "Conditions1", 18, 60, 10000, 4, now, now), 1000, 10000, 15, 12, now, now),
                            new Customer("1", "00000", "Customer1", true, 20, new Profession("1", "Engineer",2,3000,now,now), new Property(), "---", "+ ---", "--- ---", now, now), 10000, new Payment(), now, now, now, now)
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

