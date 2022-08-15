package edu.sma.bankloans.service.loan.impls;

import edu.sma.bankloans.model.ConditionsReceipt;
import edu.sma.bankloans.model.LoanType;
import edu.sma.bankloans.repository.LoanTypeFakeRepository;
import edu.sma.bankloans.service.loan.interfaces.ILoanTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LoanTypeServiceImpl implements ILoanTypeService {
    private LocalDateTime now = LocalDateTime.now();
    private LoanType loanType;
    private List<LoanType> loans = new ArrayList<>(
            Arrays.asList(
                    new LoanType("1", "LoanType1", new ConditionsReceipt(), 1000, 10000, 15, 12, now, now),
                    new LoanType("2", "LoanType2", new ConditionsReceipt(), 1000, 25000, 12, 12, now, now),
                    new LoanType("3", "LoanType3", new ConditionsReceipt(), 10000, 100000, 9, 36, now, now)
            ));
    @Autowired
    LoanTypeFakeRepository repository;

    @Override
    public LoanType create(LoanType loanType) {
        return repository.save(loanType);
    }

    @Override
    public LoanType update(LoanType loanType) {
        return repository.update(loanType);
    }

    @Override
    public LoanType get(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<LoanType> getAll() {
        return repository.findAll();
    }
}
