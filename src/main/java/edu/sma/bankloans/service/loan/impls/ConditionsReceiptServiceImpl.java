package edu.sma.bankloans.service.loan.impls;

import edu.sma.bankloans.model.ConditionsReceipt;
import edu.sma.bankloans.repository.ConditionsFakeRepository;
import edu.sma.bankloans.service.loan.interfaces.IConditionsReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ConditionsReceiptServiceImpl implements IConditionsReceiptService {
    private LocalDateTime now = LocalDateTime.now();
    private List<ConditionsReceipt> conditionsReceipts = new ArrayList<>(
            Arrays.asList(
                    new ConditionsReceipt("1","Conditions1", 18, 60, 10000, 4, now, now),
                    new ConditionsReceipt("2","Conditions2", 25, 60, 15000, 12, now, now)
            ));
        @Autowired
        ConditionsFakeRepository repository;

        @Override
        public ConditionsReceipt create(ConditionsReceipt conditionsReceipt) {
            return repository.save(conditionsReceipt);
        }

        @Override
        public ConditionsReceipt update(ConditionsReceipt conditionsReceipt) {
            return repository.update(conditionsReceipt);
        }

        @Override
        public ConditionsReceipt get(String id) {
            return repository.findById(id);
        }

        @Override
        public void delete(String id) {
            repository.deleteById(id);
        }

        @Override
        public List<ConditionsReceipt> getAll() {
            return repository.findAll();
        }
    }

