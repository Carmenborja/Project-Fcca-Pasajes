package model.beans;

import java.util.Date;

public class Pasaje {
    
    private int idPasaje,idCronograma;
    private Date Fecha_pasaje;
    private String categoria;

    public Pasaje() {
    }

    public Pasaje(int idPasaje, int idCronograma, Date Fecha_pasaje, String categoria) {
        this.idPasaje = idPasaje;
        this.idCronograma = idCronograma;
        this.Fecha_pasaje = Fecha_pasaje;
        this.categoria = categoria;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public int getIdCronograma() {
        return idCronograma;
    }

    public void setIdCronograma(int idCronograma) {
        this.idCronograma = idCronograma;
    }

    public Date getFecha_pasaje() {
        return Fecha_pasaje;
    }

    public void setFecha_pasaje(Date Fecha_pasaje) {
        this.Fecha_pasaje = Fecha_pasaje;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
