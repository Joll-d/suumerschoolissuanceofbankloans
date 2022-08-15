package edu.sma.bankloans.repository;
import edu.sma.bankloans.model.Loan;
import edu.sma.bankloans.model.LoanHistory;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class LoanHistoryFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private LoanHistory loanHistory;
    private List<LoanHistory> loanHistories = new ArrayList<>(
            Arrays.asList(
                    new LoanHistory("1","LoanHistory1", new Loan(), now, now),
                    new LoanHistory("2","LoanHistory2", new Loan(), now, now),
                    new LoanHistory("3","LoanHistory3", new Loan(), now, now),
                    new LoanHistory("4","LoanHistory4", new Loan(), now, now)
            ));

    public List<LoanHistory> findAll() {
        return this.loanHistories;
    }

    public LoanHistory findById(String id) {
        return this.loanHistories.stream().filter(LoanHistory -> LoanHistory.getId().equals(id)).findFirst().orElse(null);
    }

    public LoanHistory update(LoanHistory LoanHistory) {
        this.deleteById(LoanHistory.getId());
        LoanHistory.setUpdatedAt(LocalDateTime.now());
        this.loanHistories.add(LoanHistory);
        return LoanHistory;
    }

    public void deleteById(String id) {
        LoanHistory LoanHistory = this.findById(id);
        this.loanHistories.remove(LoanHistory);
    }

    public LoanHistory save(LoanHistory LoanHistory) {
        LoanHistory.setId(UUID.randomUUID().toString());
        LoanHistory.setCreatedAt(LocalDateTime.now());
        this.loanHistories.add(LoanHistory);
        return null;
    }

}
