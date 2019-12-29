package interfaces;

import java.util.List;
import model.beans.Boleta_Pago;

public interface Boleta_PagoCRUD {
    
    public List findAll();
    public Boleta_Pago findById(int id);
    public boolean create(Boleta_Pago bp);
    public boolean edit(Boleta_Pago bp);
    public boolean delete(int id);
    
}
