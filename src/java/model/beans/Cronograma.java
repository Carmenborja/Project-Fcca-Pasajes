package model.beans;

import java.util.Date;

public class Cronograma {

    private int idCronograma;
    private String Fecha_salida,Fecha_retorno;
    private String hora_partida,hora_llegada,estacion_inicio,estacion_fin,idTerminal;
    private double idTarifa;

    public Cronograma() {
    }

    public Cronograma(int idCronograma, String idTerminal, double idTarifa, String Fecha_salida, String Fecha_retorno, String hora_partida, String hora_llegada, String estacion_inicio, String estacion_fin) {
        this.idCronograma = idCronograma;
        this.idTerminal = idTerminal;
        this.idTarifa = idTarifa;
        this.Fecha_salida = Fecha_salida;
        this.Fecha_retorno = Fecha_retorno;
        this.hora_partida = hora_partida;
        this.hora_llegada = hora_llegada;
        this.estacion_inicio = estacion_inicio;
        this.estacion_fin = estacion_fin;
    }

    public int getIdCronograma() {
        return idCronograma;
    }

    public void setIdCronograma(int idCronograma) {
        this.idCronograma = idCronograma;
    }

    public String getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(String idTerminal) {
        this.idTerminal = idTerminal;
    }

    public double getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(double idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getFecha_salida() {
        return Fecha_salida;
    }

    public void setFecha_salida(String Fecha_salida) {
        this.Fecha_salida = Fecha_salida;
    }

    public String getFecha_retorno() {
        return Fecha_retorno;
    }

    public void setFecha_retorno(String Fecha_retorno) {
        this.Fecha_retorno = Fecha_retorno;
    }

    public String getHora_partida() {
        return hora_partida;
    }

    public void setHora_partida(String hora_partida) {
        this.hora_partida = hora_partida;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public String getEstacion_inicio() {
        return estacion_inicio;
    }

    public void setEstacion_inicio(String estacion_inicio) {
        this.estacion_inicio = estacion_inicio;
    }

    public String getEstacion_fin() {
        return estacion_fin;
    }

    public void setEstacion_fin(String estacion_fin) {
        this.estacion_fin = estacion_fin;
    }

    
}
