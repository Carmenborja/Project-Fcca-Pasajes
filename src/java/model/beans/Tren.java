package model.beans;
public class Tren {
    
    private int idTren;
    private String Asientos,Descripcion_tren,Ruta,CantidadCoche;

    public Tren() {
    }

    public Tren(int idTren, String Asientos, String Descripcion_tren, String Ruta, String CantidadCoche) {
        this.idTren = idTren;
        this.Asientos = Asientos;
        this.Descripcion_tren = Descripcion_tren;
        this.Ruta = Ruta;
        this.CantidadCoche = CantidadCoche;
    }

    public int getIdTren() {
        return idTren;
    }

    public void setIdTren(int idTren) {
        this.idTren = idTren;
    }

    public String getAsientos() {
        return Asientos;
    }

    public void setAsientos(String Asientos) {
        this.Asientos = Asientos;
    }

    public String getDescripcion_tren() {
        return Descripcion_tren;
    }

    public void setDescripcion_tren(String Descripcion_tren) {
        this.Descripcion_tren = Descripcion_tren;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public String getCantidadCoche() {
        return CantidadCoche;
    }

    public void setCantidadCoche(String CantidadCoche) {
        this.CantidadCoche = CantidadCoche;
    }
    
    
    
}
