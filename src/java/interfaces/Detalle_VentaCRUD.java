package interfaces;
import java.util.List;
import model.beans.Detalle_Venta;
public interface Detalle_VentaCRUD {
    
    public List findAll();
    public Detalle_Venta findById(int id);
    public boolean create(Detalle_Venta dv);
    public boolean edit(Detalle_Venta dv);
    public boolean delete(int id);
    
}
