package edu.sma.bankloans.repository.fake;

import edu.sma.bankloans.model.ConditionsReceipt;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class ConditionsFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private List<ConditionsReceipt> conditions = new ArrayList<>(
            Arrays.asList(
                    new ConditionsReceipt("1","Conditions1", 18, 60, 10000, 4, now, now),
                    new ConditionsReceipt("2","Conditions2", 25, 60, 15000, 12, now, now)
            ));

    public List<ConditionsReceipt> findAll() {
        return this.conditions;
    }

    public ConditionsReceipt findById(String id) {
        return this.conditions.stream().filter(ConditionsReceipt -> ConditionsReceipt.getId().equals(id)).findFirst().orElse(null);
    }

    public ConditionsReceipt update(ConditionsReceipt ConditionsReceipt) {
        this.deleteById(ConditionsReceipt.getId());
        ConditionsReceipt.setUpdatedAt(LocalDateTime.now());
        this.conditions.add(ConditionsReceipt);
        return ConditionsReceipt;
    }

    public void deleteById(String id) {
        ConditionsReceipt ConditionsReceipt = this.findById(id);
        this.conditions.remove(ConditionsReceipt);
    }

    public ConditionsReceipt save(ConditionsReceipt ConditionsReceipt) {
        ConditionsReceipt.setId(UUID.randomUUID().toString());
        ConditionsReceipt.setCreatedAt(LocalDateTime.now());
        this.conditions.add(ConditionsReceipt);
        return null;
    }

}
