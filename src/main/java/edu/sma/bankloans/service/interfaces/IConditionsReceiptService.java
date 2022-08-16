package edu.sma.bankloans.service.interfaces;

import edu.sma.bankloans.model.ConditionsReceipt;

import java.util.List;

public interface IConditionsReceiptService {
    ConditionsReceipt create(ConditionsReceipt conditionsReceipt);
    ConditionsReceipt update(ConditionsReceipt conditionsReceipt);
    ConditionsReceipt get(String id);
    void delete(String id);
    List<ConditionsReceipt> getAll();
    
}
