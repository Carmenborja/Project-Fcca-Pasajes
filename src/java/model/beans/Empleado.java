package model.beans;
public class Empleado {
   
    private int idEmpleado;
    private String Nombres,Apellidos,Dni,Telefono,Direccion,idTipoEmpleado,Usuario,Contraseña;
    private byte Activo;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String Nombres, String Apellidos, String Dni, String Telefono, String Direccion, String idTipoEmpleado, String Usuario, String Contraseña, byte Activo) {
        this.idEmpleado = idEmpleado;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Dni = Dni;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.idTipoEmpleado = idTipoEmpleado;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Activo = Activo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(String idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public byte getActivo() {
        return Activo;
    }

    public void setActivo(byte Activo) {
        this.Activo = Activo;
    }
    
    
}
