package edu.sma.bankloans.repository.mongo;

import edu.sma.bankloans.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PaymentMongoRepository extends MongoRepository<Payment, String> {
    List<Payment> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
