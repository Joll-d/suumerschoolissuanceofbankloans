package edu.sma.bankloans.service.interfaces;

import edu.sma.bankloans.model.LoanHistory;

import java.util.List;

public interface ILoanHistoryService {
    LoanHistory create(LoanHistory loanHistory);
    LoanHistory update(LoanHistory loanHistory);
    LoanHistory get(String id);
    void delete(String id);
    List<LoanHistory> getAll();

}
