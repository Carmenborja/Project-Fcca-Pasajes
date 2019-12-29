package model.beans;
public class Pais {
  
    private int idPais;
    private String Nombre;

    public Pais() {
    }

    public Pais(int idPais, String Nombre) {
        this.idPais = idPais;
        this.Nombre = Nombre;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
