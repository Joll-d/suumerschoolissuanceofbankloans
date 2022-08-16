package edu.sma.bankloans.repository.fake;
import edu.sma.bankloans.model.ConditionsReceipt;
import edu.sma.bankloans.model.LoanType;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class LoanTypeFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private LoanType loanType;
    private List<LoanType> loans = new ArrayList<>(
            Arrays.asList(
                    new LoanType("1", "LoanType1", new ConditionsReceipt(), 1000, 10000, 15, 12, now, now),
                    new LoanType("2", "LoanType2", new ConditionsReceipt(), 1000, 25000, 12, 12, now, now),
                    new LoanType("3", "LoanType3", new ConditionsReceipt(), 10000, 100000, 9, 36, now, now)
            ));

    public List<LoanType> findAll() {
        return this.loans;
    }

    public LoanType findById(String id) {
        return this.loans.stream().filter(LoanType -> LoanType.getId().equals(id)).findFirst().orElse(null);
    }

    public LoanType update(LoanType LoanType) {
        this.deleteById(LoanType.getId());
        LoanType.setUpdatedAt(LocalDateTime.now());
        this.loans.add(LoanType);
        return LoanType;
    }

    public void deleteById(String id) {
        LoanType LoanType = this.findById(id);
        this.loans.remove(LoanType);
    }

    public LoanType save(LoanType LoanType) {
        LoanType.setId(UUID.randomUUID().toString());
        LoanType.setCreatedAt(LocalDateTime.now());
        this.loans.add(LoanType);
        return null;
    }

}
