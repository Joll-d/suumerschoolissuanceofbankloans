package edu.sma.bankloans.service.loan.interfaces;

import edu.sma.bankloans.model.Loan;
import edu.sma.bankloans.model.LoanType;

import java.util.List;

public interface ILoanTypeService {
    LoanType create(LoanType loanType);
    LoanType update(LoanType loanType);
    LoanType get(String id);
    void delete(String id);
    List<LoanType> getAll();
}
