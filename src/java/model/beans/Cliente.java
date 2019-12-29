
package model.beans;

import java.io.Serializable;


public class Cliente implements Serializable{
    private int idCliente;
    private String nombres,apellidos,idTipoD,nDocumento,telf,direccion,genero, correo, fechaN, idPais;

    public Cliente(){
        
    }

    public Cliente(int idCliente, String idPais, String nombres, String apellidos, String idTipoD, String nDocumento, String telf, String direccion, String genero, String correo, String fechaN) {
        this.idCliente = idCliente;
        this.idPais = idPais;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idTipoD = idTipoD;
        this.nDocumento = nDocumento;
        this.telf = telf;
        this.direccion = direccion;
        this.genero = genero;
        this.correo = correo;
        this.fechaN = fechaN;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdTipoD() {
        return idTipoD;
    }

    public void setIdTipoD(String idTipoD) {
        this.idTipoD = idTipoD;
    }

    public String getnDocumento() {
        return nDocumento;
    }

    public void setnDocumento(String nDocumento) {
        this.nDocumento = nDocumento;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    
}
