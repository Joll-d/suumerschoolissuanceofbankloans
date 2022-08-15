package edu.sma.bankloans.repository;
import edu.sma.bankloans.model.Property;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class PropertyFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private Property loanType;
    private List<Property> propertys = new ArrayList<>(
            Arrays.asList(
            ));

    public List<Property> findAll() {
        return this.propertys;
    }

    public Property findById(String id) {
        return this.propertys.stream().filter(Property -> Property.getId().equals(id)).findFirst().orElse(null);
    }

    public Property update(Property Property) {
        this.deleteById(Property.getId());
        Property.setUpdatedAt(LocalDateTime.now());
        this.propertys.add(Property);
        return Property;
    }

    public void deleteById(String id) {
        Property Property = this.findById(id);
        this.propertys.remove(Property);
    }

    public Property save(Property Property) {
        Property.setId(UUID.randomUUID().toString());
        Property.setCreatedAt(LocalDateTime.now());
        this.propertys.add(Property);
        return null;
    }

}
