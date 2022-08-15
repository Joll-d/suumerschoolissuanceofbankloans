package edu.sma.bankloans.service.loan.interfaces;
import edu.sma.bankloans.model.Property;
import java.util.List;

public interface IPropertyService {
    Property create(Property property);
    Property update(Property property);
    Property get(String id);
    void delete(String id);
    List<Property> getAll();

}
