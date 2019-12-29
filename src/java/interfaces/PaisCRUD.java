package interfaces;

import java.util.List;
import model.beans.Pais;

public interface PaisCRUD {
    
    public List findAll();
    public Pais findById(int id);
    public boolean create(Pais p);
    public boolean edit(Pais p);
    public boolean delete(int id);
    
}
