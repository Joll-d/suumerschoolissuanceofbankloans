package edu.sma.bankloans.repository.mongo;

import edu.sma.bankloans.model.LoanType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanTypeMongoRepository extends MongoRepository<LoanType, String> {
}
