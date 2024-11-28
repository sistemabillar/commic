package Modelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class SalaDao {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
  public boolean agregarSala(Sala Sl) {
        String sql = "INSERT INTO salas (nombre, cantidad) VALUES (?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Sl.getNombre());
            ps.setInt(2, Sl.getCantidad());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } 
  }
  
  public List ListarSalas() {
        List <Sala> listaSl = new ArrayList();
        String sql = "SELECT * FROM salas";
        try {
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery(); 
             while (rs.next()) {
                 
               Sala Sl = new Sala();
               
                Sl.setId(rs.getInt("id"));
                Sl.setNombre(rs.getString("nombre"));
                Sl.setCantidad(rs.getInt("cantidad"));
                listaSl.add(Sl);
            }
             
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaSl;
    }

  
  public boolean eliminarSala(int id) {
        String sql = "DELETE FROM salas WHERE id = ?";
        try   {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
            
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
  
}
