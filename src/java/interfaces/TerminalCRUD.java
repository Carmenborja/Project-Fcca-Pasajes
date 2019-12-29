package interfaces;

import java.util.List;
import model.beans.Terminal;

public interface TerminalCRUD {

    public List findAll();
    public Terminal findById(int id);
    public boolean create(Terminal tr);
    public boolean edit(Terminal tr);
    public boolean delete(int id);
    
}
