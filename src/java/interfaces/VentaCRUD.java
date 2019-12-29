package interfaces;

import java.util.List;
import model.beans.Venta;

public interface VentaCRUD {
 
    public List findAll();
    public Venta findById(int id);
    public boolean create(Venta vt);
    public boolean edit(Venta vt);
    public boolean delete(int id);
    
}
