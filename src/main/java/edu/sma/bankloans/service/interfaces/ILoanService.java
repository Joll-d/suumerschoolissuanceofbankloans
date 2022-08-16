package edu.sma.bankloans.service.interfaces;

import edu.sma.bankloans.model.Loan;

import java.util.List;

public interface ILoanService {
    Loan create(Loan loan);
    Loan update(Loan loan);
    Loan get(String id);
    void delete(String id);
    List<Loan> getAll();


}
