package model.beans;
public class Asiento {
    
    private int idAsiento,idTren,idCliente;
    private String n_asiento,Descripcion_Asiento,nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asiento() {
    }

    public Asiento(int idAsiento, int idTren, int idCliente, String n_asiento, String Descripcion_Asiento) {
        this.idAsiento = idAsiento;
        this.idTren = idTren;
        this.idCliente = idCliente;
        this.n_asiento = n_asiento;
        this.Descripcion_Asiento = Descripcion_Asiento;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getIdTren() {
        return idTren;
    }

    public void setIdTren(int idTren) {
        this.idTren = idTren;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getN_asiento() {
        return n_asiento;
    }

    public void setN_asiento(String n_asiento) {
        this.n_asiento = n_asiento;
    }

    public String getDescripcion_Asiento() {
        return Descripcion_Asiento;
    }

    public void setDescripcion_Asiento(String Descripcion_Asiento) {
        this.Descripcion_Asiento = Descripcion_Asiento;
    }
    
    
}
