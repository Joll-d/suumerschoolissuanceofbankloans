package edu.sma.bankloans.service.loan.impls;

import edu.sma.bankloans.model.Property;
import edu.sma.bankloans.repository.PropertyFakeRepository;
import edu.sma.bankloans.service.loan.interfaces.IPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PropertyServiceImpl implements IPropertyService{
    private LocalDateTime now = LocalDateTime.now();
    private List<Property> propertys = new ArrayList<>(
            Arrays.asList(
            ));
        @Autowired
        PropertyFakeRepository repository;

        @Override
        public Property create(Property property) {
            return repository.save(property);
        }

        @Override
        public Property update(Property property) {
            return repository.update(property);
        }

        @Override
        public Property get(String id) {
            return repository.findById(id);
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

