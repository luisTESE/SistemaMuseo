package z_sistema_museo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class co {

    public static void consulta(String tabla) {// consulta eliminar
        try {
            // variables
            String titulo_obra, nombreMuseo;

            // SQL
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://DESKTOP-GJ22AG6:1433;databaseName=museo;user=Museo;password=321;";
            Connection con = DriverManager.getConnection(connectionURL);
            //System.out.println("Coneccion");

            // aqui comienza la instrucion
            Statement st = con.createStatement(); // activa la instrucion
            
            
            if (tabla.equals("exposicion")) {// para eliminar exposicion
                System.out.println(tabla);
                ResultSet rs = st.executeQuery("select * from " + tabla);
                while (rs.next()) {
                    titulo_obra = rs.getString(1);
                    System.out.println(titulo_obra);
                }
            }
            if (tabla.equals("registro")) {// para eliminar museo
                ResultSet rs = st.executeQuery("select * from " + tabla);
                while (rs.next()) {
                    nombreMuseo = rs.getString(1);
                    System.out.println(nombreMuseo);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
