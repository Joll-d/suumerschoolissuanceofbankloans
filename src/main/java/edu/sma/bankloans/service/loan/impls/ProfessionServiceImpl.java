package edu.sma.bankloans.service.loan.impls;

import edu.sma.bankloans.model.Profession;
import edu.sma.bankloans.repository.ProfessionFakeRepository;
import edu.sma.bankloans.service.loan.interfaces.IProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        ProfessionFakeRepository repository;

        @Override
        public Profession create(Profession profession) {
            return repository.save(profession);
        }

        @Override
        public Profession update(Profession profession) {
            return repository.update(profession);
        }

        @Override
        public Profession get(String id) {
            return repository.findById(id);
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

