package model.beans;

import java.util.Date;

public class Pasaje {
    
    private int idPasaje,idCronograma;
    private String Fecha_pasaje;

    public Pasaje() {
    }

    public Pasaje(int idPasaje, int idCronograma, String Fecha_pasaje) {
        this.idPasaje = idPasaje;
        this.idCronograma = idCronograma;
        this.Fecha_pasaje = Fecha_pasaje;
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

    public String getFecha_pasaje() {
        return Fecha_pasaje;
    }

    public void setFecha_pasaje(String Fecha_pasaje) {
        this.Fecha_pasaje = Fecha_pasaje;
    }
   
    
}
