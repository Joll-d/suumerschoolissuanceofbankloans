package edu.sma.bankloans.repository.mongo;

import edu.sma.bankloans.model.LoanType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LoanTypeMongoRepository extends MongoRepository<LoanType, String> {
    List<LoanType> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
