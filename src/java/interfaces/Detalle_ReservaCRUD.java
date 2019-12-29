package interfaces;

import java.util.List;
import model.beans.Detalle_Reserva;

public interface Detalle_ReservaCRUD {
    
    public List findAll();
    public Detalle_Reserva findById(int id);
    public boolean create(Detalle_Reserva dr);
    public boolean edit(Detalle_Reserva dr);
    public boolean delete(int id);
    
}
