public class Usuario{
    
    private String usuario;
    private String contrasena;
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;

    private Usuario(String usuario, String contrasena, String nombre, String apellido, int dni, int edad){
        
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getUsuario(){
        return usuario;
    }
    public String getContrasena(){
        return contrasena;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    public void setEdad(int edad){
        edad = 0;
    }

}