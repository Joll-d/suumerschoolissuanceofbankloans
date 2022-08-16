package edu.sma.bankloans.repository.mongo;

import edu.sma.bankloans.model.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PropertyMongoRepository extends MongoRepository<Property, String> {
    List<Property> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
