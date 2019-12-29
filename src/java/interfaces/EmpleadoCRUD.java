package interfaces;

import java.util.List;
import model.beans.Empleado;

public interface EmpleadoCRUD {
    
    public List findAll();
    public Empleado findById(int id);
    public boolean create(Empleado emp);
    public boolean edit(Empleado emp);
    public boolean delete(int id);
    public Empleado validar(String user,String pass);
    
}
