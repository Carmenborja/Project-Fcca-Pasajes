package interfaces;

import java.util.List;
import model.beans.Tren;

public interface TrenCRUD {
  
    public List findAll();
    public Tren findById(int id);
    public boolean create(Tren tn);
    public boolean edit(Tren tn);
    public boolean delete(int id);
    
}
