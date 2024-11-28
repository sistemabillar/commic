package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class EmpleadoD {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
public boolean RegistrarEmpleado(Empleado ep){
        String sql = "INSERT INTO empleado (codigo, nombre, cedula, telefono, sueldo, rol) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
           
            ps.setString(1, ep.getCodigo());
            ps.setString(2, ep.getNombre());
            ps.setString(3, ep.getCedula());
            ps.setString(4, ep.getTelefono());
            ps.setDouble(5, ep.getSueldo());
            ps.setString(6, ep.getRol());
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

public List ListarEmpleado(){
       List<Empleado> Listaep = new ArrayList();
       String sql = "SELECT * FROM empleado; ";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = (ResultSet) ps.executeQuery();
          //aqui hago un bucle while para que me detecte las filas de la tabla //
           while (rs.next()) {
             
              Empleado ep = new Empleado();
              
              ep.setId(rs.getInt("id"));
              ep.setCodigo(rs.getString("codigo"));
              ep.setNombre(rs.getString("nombre"));
              ep.setCedula(rs.getString("cedula"));
              ep.setTelefono(rs.getString("telefono"));
              ep.setSueldo(rs.getDouble("sueldo"));
              ep.setRol(rs.getString("rol"));
              Listaep.add(ep);
  
         }
            
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
        return Listaep;
}
}
