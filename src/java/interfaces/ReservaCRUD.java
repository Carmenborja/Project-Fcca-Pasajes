package interfaces;

import java.util.List;
import model.beans.Reserva;

public interface ReservaCRUD {
    
    public List findAll();
    public Reserva findById(int id);
    public boolean create(Reserva rs);
    public boolean edit(Reserva rs);
    public boolean delete(int id);
    
}
