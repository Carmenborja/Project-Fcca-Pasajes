package model.beans;

import java.util.Date;

public class Medio_Pago {
    
    private int idMedioPago;
    private String nombre_titular,apellidos_titular,n_tarjeta,codigo_seguridad,correo;
    private Date fecha_expiracion;

    public Medio_Pago() {
    }

    public Medio_Pago(int idMedioPago, String nombre_titular, String apellidos_titular, String n_tarjeta, String codigo_seguridad, String correo, Date fecha_expiracion) {
        this.idMedioPago = idMedioPago;
        this.nombre_titular = nombre_titular;
        this.apellidos_titular = apellidos_titular;
        this.n_tarjeta = n_tarjeta;
        this.codigo_seguridad = codigo_seguridad;
        this.correo = correo;
        this.fecha_expiracion = fecha_expiracion;
    }

    public int getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(int idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public String getNombre_titular() {
        return nombre_titular;
    }

    public void setNombre_titular(String nombre_titular) {
        this.nombre_titular = nombre_titular;
    }

    public String getApellidos_titular() {
        return apellidos_titular;
    }

    public void setApellidos_titular(String apellidos_titular) {
        this.apellidos_titular = apellidos_titular;
    }

    public String getN_tarjeta() {
        return n_tarjeta;
    }

    public void setN_tarjeta(String n_tarjeta) {
        this.n_tarjeta = n_tarjeta;
    }

    public String getCodigo_seguridad() {
        return codigo_seguridad;
    }

    public void setCodigo_seguridad(String codigo_seguridad) {
        this.codigo_seguridad = codigo_seguridad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(Date fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    
    
}
