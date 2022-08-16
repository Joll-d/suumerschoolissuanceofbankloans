package edu.sma.bankloans.service.impls;

import edu.sma.bankloans.model.Customer;
import edu.sma.bankloans.model.LoanHistory;
import edu.sma.bankloans.model.Profession;
import edu.sma.bankloans.model.Property;
import edu.sma.bankloans.repository.mongo.CustomerMongoRepository;
import edu.sma.bankloans.service.interfaces.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    private LocalDateTime now = LocalDateTime.now();
    private Customer customer;
    private List<Customer> customers = new ArrayList<>(
            Arrays.asList(
                    new Customer("1", "00000", "Customer1", true, 20, new Profession(), new Property(), "---", "+ ---", "--- ---", new LoanHistory(), now, now),
                    new Customer("2", "00000", "Customer2", true, 20, new Profession(), new Property(), "---", "+ ---", "--- ---", new LoanHistory(), now, now),
                    new Customer("3", "00000", "Customer3", true, 18, new Profession(), new Property(), "---", "+ ---", "--- ---", new LoanHistory(), now, now),
                    new Customer("4", "00000", "Customer4", true, 30, new Profession(), new Property(), "---", "+ ---", "--- ---", new LoanHistory(), now, now)
            ));
    @Autowired
    CustomerMongoRepository repository;

    @PostConstruct
    void init() {
        repository.saveAll(customers);
    }

    @Override
    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
}

