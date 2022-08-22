package edu.sma.bankloans.service.impls;

import edu.sma.bankloans.model.Property;
import edu.sma.bankloans.repository.mongo.PropertyMongoRepository;
import edu.sma.bankloans.service.interfaces.IPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PropertyServiceImpl implements IPropertyService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Property> property = new ArrayList<>(
            Arrays.asList(
                    new Property("1", "House", "House", 2000000, now, now)
            ));
    @Autowired
    PropertyMongoRepository repository;

    @PostConstruct
    void init() {
        repository.saveAll(property);
    }

    @Override
    public Property create(Property property) {
        return repository.save(property);
    }

    @Override
    public Property update(Property property) {
        return repository.save(property);
    }

    @Override
    public Property get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Property> getAll() {
        return repository.findAll();
    }
}

