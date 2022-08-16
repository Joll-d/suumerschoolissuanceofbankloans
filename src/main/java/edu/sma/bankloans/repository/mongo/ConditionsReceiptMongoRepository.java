package edu.sma.bankloans.repository.mongo;

import edu.sma.bankloans.model.ConditionsReceipt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ConditionsReceiptMongoRepository extends MongoRepository<ConditionsReceipt, String> {
    List<ConditionsReceipt> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
