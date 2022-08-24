package edu.sma.bankloans.repository.fake;

import edu.sma.bankloans.model.Customer;
import edu.sma.bankloans.model.Profession;
import edu.sma.bankloans.model.Property;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomerFakeRepository {

    private LocalDateTime now = LocalDateTime.now();
    private Customer customer;
    private List<Customer> customers = new ArrayList<>(
            Arrays.asList(
                    new Customer("1", "00000", "Customer1",true, 20, new Profession(), new Property(), "---", "+ ---", "--- ---", now, now),
                    new Customer("2", "00000", "Customer2",true, 20, new Profession(), new Property(), "---", "+ ---", "--- ---", now, now),
                    new Customer("3", "00000", "Customer3",true, 18, new Profession(), new Property(), "---", "+ ---", "--- ---", now, now),
                    new Customer("4", "00000", "Customer4",true, 30, new Profession(), new Property(), "---", "+ ---", "--- ---", now, now)
            ));

    public List<Customer> findAll() {
        return this.customers;
    }

    public Customer findById(String id) {
        return this.customers.stream().filter(Customer -> Customer.getId().equals(id)).findFirst().orElse(null);
    }

    public Customer update(Customer Customer) {
        this.deleteById(Customer.getId());
        Customer.setUpdatedAt(LocalDateTime.now());
        this.customers.add(Customer);
        return Customer;
    }

    public void deleteById(String id) {
        Customer Customer = this.findById(id);
        this.customers.remove(Customer);
    }

    public Customer save(Customer Customer) {
        Customer.setId(UUID.randomUUID().toString());
        Customer.setCreatedAt(LocalDateTime.now());
        this.customers.add(Customer);
        return null;
    }
}
