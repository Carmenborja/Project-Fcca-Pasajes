
package interfaces;

import java.util.List;
import model.beans.Cliente;


public interface ClienteCRUD {
    public List findAll();
    public Cliente findById(int id);
    public boolean create(Cliente cli);
    public boolean edit(Cliente cli);
    public boolean delete(int id);
    public List findByCountry();
}
