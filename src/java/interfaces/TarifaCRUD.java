package interfaces;

import java.util.List;
import model.beans.Tarifa;

public interface TarifaCRUD {

    public List findAll();
    public Tarifa findById(int id);
    public boolean create(Tarifa tr);
    public boolean edit(Tarifa tr);
    public boolean delete(int id);
    
}
