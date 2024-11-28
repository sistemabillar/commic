
package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginD {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
   
    public login log(String correo, String contraceña){
        login l = new login();
        String sql = "SELECT * FROM usuarios WHERE correo = ? AND contraceña = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, contraceña);
            rs = ps.executeQuery();
            if (rs.next()) {
                
                l.setId(rs.getInt("id"));
                l.setNombre(rs.getString("nombre"));
                l.setCorreo(rs.getString("correo"));
                l.setContraceña(rs.getString("contraceña"));
                
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
        
    
    }
}
