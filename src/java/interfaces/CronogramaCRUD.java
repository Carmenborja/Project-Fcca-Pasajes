package interfaces;

import java.util.List;
import model.beans.Cronograma;

public interface CronogramaCRUD {

    public List findAll();
    public Cronograma findById(int id);
    public boolean create(Cronograma cr);
    public boolean edit(Cronograma cr);
    public boolean delete(int id);
    
}
