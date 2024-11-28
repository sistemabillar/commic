package Modelos;

/**
 *
 * @author pc
 */
public class Detalle {
    
    private String codigo;
    private String decripcion;
    private String cantidad;
    private double precio;
    private int id_facturas;

    public Detalle() {
    }

    public Detalle(String codigo, String decripcion, String cantidad, double precio, int id_facturas) {
        this.codigo = codigo;
        this.decripcion = decripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_facturas = id_facturas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_facturas() {
        return id_facturas;
    }

    public void setId_facturas(int id_facturas) {
        this.id_facturas = id_facturas;
    }

    
    
}
