package interfaces;

import java.util.List;
import model.beans.Asiento;

public interface AsientoCRUD {
    
    public List findAll();
    public Asiento findById(int id);
    public boolean create(Asiento asi);
    public boolean edit(Asiento asi);
    public boolean delete(int id);
    
}
