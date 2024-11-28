
package Modelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class FacturaD {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    int r;
    public int RegistrarFactura(Factura f){
 
        String sql = "INSERT INTO facturas (cliente, empleado, total) VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, f.getCliente());
            ps.setString(2, f.getEmpleado());
            ps.setDouble(3, f.getTotal());
            ps.execute();
                                    
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    } 
    
    public int RegistrarDetalle(Detalle Df){
        
        String sql = "INSERT INTO detalles (codigo, decripcion, cantidad, precio, id_facturas) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, Df.getCodigo());
            ps.setString(2, Df.getCantidad());
            ps.setDouble(3, Df.getPrecio());
            ps.setInt(4, Df.getId_facturas());
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            
        }finally{
            
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
}