package Modelos;

/**
 *
 * @author pc
 */
public class Factura {
    
    private int id;
    private String cliente;
    private String empleado;
    private double total;

    public Factura() {
    }

    public Factura(int id, String cliente, String empleado, double total) {
        this.id = id;
        this.cliente = cliente;
        this.empleado = empleado;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
