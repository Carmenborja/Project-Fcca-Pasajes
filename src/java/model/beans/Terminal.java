package model.beans;
public class Terminal {
   
    private int idTerminal;
    private String Nombre_Terminal,direccion_Terminal,telefono_Terminal,idTren;

    public Terminal() {
    }

    public Terminal(int idTerminal, String idTren, String Nombre_Terminal, String direccion_Terminal, String telefono_Terminal) {
        this.idTerminal = idTerminal;
        this.idTren = idTren;
        this.Nombre_Terminal = Nombre_Terminal;
        this.direccion_Terminal = direccion_Terminal;
        this.telefono_Terminal = telefono_Terminal;
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }

    public String getIdTren() {
        return idTren;
    }

    public void setIdTren(String idTren) {
        this.idTren = idTren;
    }

    public String getNombre_Terminal() {
        return Nombre_Terminal;
    }

    public void setNombre_Terminal(String Nombre_Terminal) {
        this.Nombre_Terminal = Nombre_Terminal;
    }

    public String getDireccion_Terminal() {
        return direccion_Terminal;
    }

    public void setDireccion_Terminal(String direccion_Terminal) {
        this.direccion_Terminal = direccion_Terminal;
    }

    public String getTelefono_Terminal() {
        return telefono_Terminal;
    }

    public void setTelefono_Terminal(String telefono_Terminal) {
        this.telefono_Terminal = telefono_Terminal;
    }
    
    
    
}
