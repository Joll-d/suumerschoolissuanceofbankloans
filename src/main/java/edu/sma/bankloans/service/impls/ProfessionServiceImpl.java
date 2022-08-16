package edu.sma.bankloans.service.impls;

import edu.sma.bankloans.model.Profession;
import edu.sma.bankloans.repository.mongo.ProfessionMongoRepository;
import edu.sma.bankloans.service.interfaces.IProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProfessionServiceImpl implements IProfessionService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Profession> professions = new ArrayList<>(
            Arrays.asList(
            ));
    @Autowired
    ProfessionMongoRepository repository;

    @PostConstruct
    void init() {
        repository.saveAll(professions);
    }

    @Override
    public Profession create(Profession profession) {
        return repository.save(profession);
    }

    @Override
    public Profession update(Profession profession) {
        return repository.save(profession);
    }

    @Override
    public Profession get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Profession> getAll() {
        return repository.findAll();
    }
}

