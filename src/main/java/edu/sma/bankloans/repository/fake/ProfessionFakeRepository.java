package edu.sma.bankloans.repository.fake;
import edu.sma.bankloans.model.Profession;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class ProfessionFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private List<Profession> professions = new ArrayList<>(
            Arrays.asList(
            ));

    public List<Profession> findAll() {
        return this.professions;
    }

    public Profession findById(String id) {
        return this.professions.stream().filter(Profession -> Profession.getId().equals(id)).findFirst().orElse(null);
    }

    public Profession update(Profession Profession) {
        this.deleteById(Profession.getId());
        Profession.setUpdatedAt(LocalDateTime.now());
        this.professions.add(Profession);
        return Profession;
    }

    public void deleteById(String id) {
        Profession Profession = this.findById(id);
        this.professions.remove(Profession);
    }

    public Profession save(Profession Profession) {
        Profession.setId(UUID.randomUUID().toString());
        Profession.setCreatedAt(LocalDateTime.now());
        this.professions.add(Profession);
        return null;
    }

}
