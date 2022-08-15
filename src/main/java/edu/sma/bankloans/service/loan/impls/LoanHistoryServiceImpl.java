package edu.sma.bankloans.service.loan.impls;

import edu.sma.bankloans.model.Loan;
import edu.sma.bankloans.model.LoanHistory;
import edu.sma.bankloans.repository.LoanHistoryFakeRepository;
import edu.sma.bankloans.service.loan.interfaces.ILoanHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LoanHistoryServiceImpl implements ILoanHistoryService {
    private LocalDateTime now = LocalDateTime.now();
    private LoanHistory loanHistory;
    private List<LoanHistory> loanHistories = new ArrayList<>(
            Arrays.asList(
                    new LoanHistory("1","LoanHistory1", new Loan(), now, now),
                    new LoanHistory("2","LoanHistory2", new Loan(), now, now),
                    new LoanHistory("3","LoanHistory3", new Loan(), now, now),
                    new LoanHistory("4","LoanHistory4", new Loan(), now, now)
            ));
        @Autowired
        LoanHistoryFakeRepository repository;

        @Override
        public LoanHistory create(LoanHistory loanHistory) {
            return repository.save(loanHistory);
        }

        @Override
        public LoanHistory update(LoanHistory loanHistory) {
            return repository.update(loanHistory);
        }

        @Override
        public LoanHistory get(String id) {
            return repository.findById(id);
        }

        @Override
        public void delete(String id) {
            repository.deleteById(id);
        }

        @Override
        public List<LoanHistory> getAll() {
            return repository.findAll();
        }
    }

