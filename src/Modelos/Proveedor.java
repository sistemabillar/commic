package Modelos;

/**
 *
 * @author pc
 */
public class Proveedor {
    private int id;
    private int codigo;
    private String nombre;
    private String compañia;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(int id, int codigo, String nombre, String compañia, String telefono) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.compañia = compañia;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
