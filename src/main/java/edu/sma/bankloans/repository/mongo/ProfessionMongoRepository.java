package edu.sma.bankloans.repository.mongo;

import edu.sma.bankloans.model.Profession;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProfessionMongoRepository extends MongoRepository<Profession, String> {
    List<Profession> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
