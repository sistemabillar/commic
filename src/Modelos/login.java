package Modelos;

/**
 *
 * @author pc
 */
public class login {

    public static login log(String correo, String contraceña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private int id;
    private String nombre;
    private String correo;
    private String contraceña;

    public login() {
    }

    public login(int id, String nombre, String correo, String contraceña) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraceña = contraceña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraceña() {
        return contraceña;
    }

    public void setContraceña(String contraceña) {
        this.contraceña = contraceña;
    }
    
    
}
