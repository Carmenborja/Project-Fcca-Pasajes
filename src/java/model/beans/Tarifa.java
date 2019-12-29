package model.beans;
public class Tarifa {
    
    private int idTarifa;
    private String idTipoViaje,idCategoria;
    private double Costo;

    public Tarifa() {
    }

    public Tarifa(int idTarifa, String idTipoViaje, String idCategoria, double Costo) {
        this.idTarifa = idTarifa;
        this.idTipoViaje = idTipoViaje;
        this.idCategoria = idCategoria;
        this.Costo = Costo;
    }

    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getIdTipoViaje() {
        return idTipoViaje;
    }

    public void setIdTipoViaje(String idTipoViaje) {
        this.idTipoViaje = idTipoViaje;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    
    
    
    
}
