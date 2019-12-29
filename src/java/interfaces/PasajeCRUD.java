package interfaces;

import java.util.List;
import model.beans.Pasaje;

public interface PasajeCRUD {

    public List findAll();
    public Pasaje findById(int id);
    public boolean create(Pasaje ps);
    public boolean edit(Pasaje ps);
    public boolean delete(int id);
    
}
