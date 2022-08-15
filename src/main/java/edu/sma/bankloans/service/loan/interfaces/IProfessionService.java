package edu.sma.bankloans.service.loan.interfaces;

import edu.sma.bankloans.model.Profession;

import java.util.List;

public interface IProfessionService {
    Profession create(Profession profession);
    Profession update(Profession profession);
    Profession get(String id);
    void delete(String id);
    List<Profession> getAll();

}
