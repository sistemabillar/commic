package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteD {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    //Aqui se publican los metodos Carmelo del acionar tipo logica de los botones //
   public boolean RegistrarCliente(Cliente cl){
        String sql = "INSERT INTO clientes (codigo, nombre, telefono) VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
           
            ps.setInt(1, cl.getCodigo());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getTelefono());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
   public List ListarCliente(){
       List<Cliente> ListaCl = new ArrayList();
       String sql = "SELECT * FROM clientes; ";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = (ResultSet) ps.executeQuery();
          //aqui hago un bucle while para que me detecte las filas de la tabla //
           while (rs.next()) {
             
              Cliente cl = new Cliente();
              
              cl.setId(rs.getInt("id"));
              cl.setCodigo(rs.getInt("codigo"));
              cl.setNombre(rs.getString("nombre"));
              cl.setTelefono(rs.getString("telefono"));
              ListaCl.add(cl);
  
         }
            
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
        return ListaCl;
}
   
   public boolean EliminarCliente(int id){
       String sql = "DELETE FROM clientes WHERE id = ?";
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
   
   public boolean ModificarCliente(Cliente cl){
       String sql = "UPDATE clientes SET codigo=?, nombre=?, telefono=? WHERE id=?";
       try {
           ps=con.prepareStatement(sql);
           ps.setInt(1, cl.getCodigo());
           ps.setString(2, cl.getNombre());
           ps.setString(3, cl.getTelefono());
           ps.setInt(4, cl.getId());
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
   
   public Cliente Buscarcliente(int codigo){
       Cliente cl = new Cliente();
       String sql = "SELECT * FROM clientes WHERE codigo =?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1,codigo);
           rs = ps.executeQuery();
           if (rs.next()) {
               cl.setNombre(rs.getString("nombre"));
               cl.setCodigo(rs.getInt("codigo"));
               cl.setTelefono(rs.getString("telefono"));
               
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return cl;
   }

}