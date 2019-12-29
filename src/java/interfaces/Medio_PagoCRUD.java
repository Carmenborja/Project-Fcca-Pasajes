package interfaces;

import java.util.List;
import model.beans.Medio_Pago;

public interface Medio_PagoCRUD {

    public List findAll();
    public Medio_Pago findById(int id);
    public boolean create(Medio_Pago mp);
    public boolean edit(Medio_Pago mp);
    public boolean delete(int id);
    
}
