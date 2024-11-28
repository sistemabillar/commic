
package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ProductosD {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarProductos(Productos pro){
        
        String sql = "INSERT INTO productos( codigo, nombre, proveedor, preciocompra, precioventa, cantidad) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getProveedor());
            ps.setDouble(4, pro.getPreciocompra());
            ps.setDouble(5, pro.getPrecioventa());
            ps.setInt(6, pro.getCantidad());
            ps.execute();
            
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
    }
  }
    
    // este metodo carmelo sirvira para llenar el combobox de los proveedores registrados 
    public void ConsultarProveedor(JComboBox proveedor){
        String sql = "SELECT nombre FROM proveedores";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
             
            while (rs.next()) {
             
             proveedor.addItem(rs.getString("nombre"));
             
         }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public List ListarProductos(){
       List<Productos> ListaPr = new ArrayList();
       String sql = "SELECT * FROM productos; ";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = (ResultSet) ps.executeQuery();
          //aqui hago un bucle while para que me detecte las filas de la tabla //
           while (rs.next()) {
             
              Productos pt = new Productos();
              
              pt.setId(rs.getInt("id"));
              pt.setCodigo(rs.getString("codigo"));
              pt.setNombre(rs.getString("nombre"));
              pt.setProveedor(rs.getString("proveedor"));
              pt.setPreciocompra(rs.getDouble("preciocompra"));
              pt.setPrecioventa(rs.getDouble("precioventa"));
              pt.setCantidad(rs.getInt("cantidad"));
              ListaPr.add(pt);
  
         }
            
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
        return ListaPr;
}
    
     public boolean EliminarProductos(int id){
       String sql = "DELETE FROM productos WHERE id = ?";
       try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
    }
     
     public boolean ModificarProductos(Productos pro){
       String sql = "UPDATE productos SET codigo=?, nombre=?, proveedor=?, preciocompra=?, precioventa=?, cantidad=? WHERE id=?";
       try {
           
           ps=con.prepareStatement(sql);
           
           
           ps.setString(1, pro.getCodigo());
           ps.setString(2, pro.getNombre());
           ps.setString(3, pro.getProveedor());
           ps.setDouble(4, pro.getPreciocompra());
           ps.setDouble(5, pro.getPrecioventa());
           ps.setInt(6, pro.getCantidad());
           ps.setInt(7, pro.getId());
           ps.execute();
           ListarProductos();
           
           return true;
           
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
     
     // carmelo! Este metodo es para buscar el producto en la caja mediante el codigo de producto //
     public Productos BuscarProductos(String cod){
         Productos producto = new Productos();
         String sql = "SELECT * FROM productos WHERE codigo = ?";
         try {
             con= cn.getConnection();
             ps = con.prepareStatement(sql);
             ps.setString(1, cod);
             rs = ps.executeQuery();
             if (rs.next()) {
                 producto.setNombre(rs.getString("nombre"));
                 producto.setPrecioventa(rs.getDouble("precioventa"));
                 producto.setCantidad(rs.getInt("cantidad"));
                 
             }
         } catch (SQLException e) {
             System.out.println(e.toString());
         }
         return producto;
     }
}
