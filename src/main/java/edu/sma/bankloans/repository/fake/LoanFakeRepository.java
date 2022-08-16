package edu.sma.bankloans.repository.fake;

import edu.sma.bankloans.model.Customer;
import edu.sma.bankloans.model.Loan;
import edu.sma.bankloans.model.LoanType;
import edu.sma.bankloans.model.Payment;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class LoanFakeRepository {

    private LocalDateTime now = LocalDateTime.now();
    private Loan loan;
    private List<Loan> loans = new ArrayList<>(
            Arrays.asList(
                    new Loan("1","Loan1", new LoanType(), new Customer(), 10000, new Payment(), now, now, now, now),
                    new Loan("2", "Loan2",new LoanType(), new Customer(), 5000, new Payment(), now, now, now, now),
                    new Loan("3", "Loan3",new LoanType(), new Customer(), 100000, new Payment(), now, now, now, now),
                    new Loan("4", "Loan4",new LoanType(), new Customer(), 1000, new Payment(), now, now, now, now)
            ));

    public List<Loan> findAll() {
        return this.loans;
    }

    public Loan findById(String id) {
        return this.loans.stream().filter(Loan -> Loan.getId().equals(id)).findFirst().orElse(null);
    }

    public Loan update(Loan Loan) {
        this.deleteById(Loan.getId());
        Loan.setUpdatedAt(LocalDateTime.now());
        this.loans.add(Loan);
        return Loan;
    }

    public void deleteById(String id) {
        Loan Loan = this.findById(id);
        this.loans.remove(Loan);
    }

    public Loan save(Loan Loan) {
        Loan.setId(UUID.randomUUID().toString());
        Loan.setCreatedAt(LocalDateTime.now());
        this.loans.add(Loan);
        return null;
    }
}
