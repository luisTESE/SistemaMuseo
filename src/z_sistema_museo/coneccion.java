package z_sistema_museo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class coneccion {

    public static void main(String[] args) throws ClassNotFoundException,  SQLException{
        //se agrega primero el driver que esta en el escritorio
        // vas a la tasa --> propiedades -->librerias (add JAR/FOLDER)
        //la agregas y listo
        
        // la logica
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // despues de los // ir a sql copiamos nombre del servidor
        // en databaseName va el nombre de la base de datos
        // user el usuario
        // password el del usuario
        String connectionURL = "jdbc:sqlserver://DESKTOP-GJ22AG6:1433;databaseName=museo;user=Museo;password=321;";
        
        //varaible de tipo conecion
        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println("Coneccion");
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from municipio");
        
        
        while(rs.next()){
            int idmun = rs.getInt(1);
            String mun = rs.getString(2);
            
            System.out.println(idmun+" "+mun);
        }
        
        // este es una instrucion como insertar y asu
        //Statement instrucion  = con.createStatement();
        //instrucion.execute("insert into municipio values(2,'Azteca')");
        
        
    }
}
