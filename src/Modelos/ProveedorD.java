
package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author pc
 */
public class ProveedorD {
    //aqui instancie mi conecion carmelo aqui tambien puedes instancia cualquier otro //
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    //aqui los metodos tipo public, list y boolean carmelo//
    public boolean RegistrarProveedor(Proveedor pr){
        String sql = "INSERT INTO proveedores(codigo, nombre, compañia, telefono) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pr.getCodigo());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getCompañia());
            ps.setString(4, pr.getTelefono());
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
    
    public List ListarProvedor(){
        List<Proveedor> ListaPr = new ArrayList();
        String sql = "SELECT * FROM proveedores";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
             while (rs.next()) {
             
              Proveedor pr = new Proveedor();
              
              pr.setId(rs.getInt("id"));
              pr.setCodigo(rs.getInt("codigo"));
              pr.setNombre(rs.getString("nombre"));
              pr.setCompañia(rs.getString("compañia"));
              pr.setTelefono(rs.getString("telefono"));
              ListaPr.add(pr);
  
         }
            
       } catch (SQLException e) {
           System.out.println(e.toString());
   } 
        return ListaPr;
  } 
    
    public boolean EliminarProveedor(int id){
       String sql = "DELETE FROM proveedores WHERE id = ?";
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
    
    public boolean ModificarProveedor(Proveedor pr){
       
       String sql = "UPDATE proveedores SET codigo=?, nombre=?, compañia=?, telefono=? WHERE id=?";
       try {
           ps=con.prepareStatement(sql);
           ps.setInt(1, pr.getCodigo());
           ps.setString(2, pr.getNombre());
           ps.setString(3, pr.getCompañia());
           ps.setString(4, pr.getTelefono());
           ps.setInt(5, pr.getId());
           ps.execute();
           
           ListarProvedor();
           
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
}