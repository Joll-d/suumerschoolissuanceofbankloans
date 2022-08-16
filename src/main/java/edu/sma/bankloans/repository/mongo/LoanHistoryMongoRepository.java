package edu.sma.bankloans.repository.mongo;

import edu.sma.bankloans.model.LoanHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LoanHistoryMongoRepository extends MongoRepository<LoanHistory, String> {
    List<LoanHistory> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
