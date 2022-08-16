package edu.sma.bankloans.repository.mongo;

import edu.sma.bankloans.model.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LoanMongoRepository extends MongoRepository<Loan, String> {
    List<Loan> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
