
package z_sistema_museo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conUbi {
    int ID=0;
    boolean ya_esta;
    public conUbi(){
        
    }
    
    public void existe(String tabla, String consultar, String NL) {
        try {
            ya_esta = false;
            int count = 0;
            String[] datos;
            // variable Arreglo de apoyo
            Statement c1 = Bienvenido.conecionP.createStatement();
            ResultSet c11 = c1.executeQuery("select count(*) from " + tabla);
            c11.next();
            count = c11.getInt(1);
            datos = new String[count];
            // municipio
            Statement verificarMuni = Bienvenido.conecionP.createStatement();
            ResultSet rsMu = verificarMuni.executeQuery("select * from " + tabla);

            int i = 0;
            while (rsMu.next()) {
                String dato = rsMu.getString(2);
                datos[i] = dato;
                i++;
            }

            // existe
            boolean existeC = false;
            for (int j = 0; j < datos.length; j++) {
                //System.out.println(nomE+" == "+datos[j]);
                if (consultar.equals(datos[j])) {
                    existeC = true;
                }
            }
            ID = 0;
            if (NL.equals("L")) {
                if (existeC) {
                    //select from 
                    Statement counyes = Bienvenido.conecionP.createStatement();
                    ResultSet tamayes = counyes.executeQuery("Select * from " + tabla + " where " + tabla + "='" + consultar + "'");
                    tamayes.next();
                    ID = tamayes.getInt(1);
                    ya_esta = true;

                } else {
                    Statement coun = Bienvenido.conecionP.createStatement();
                    ResultSet tama = coun.executeQuery("select count(*) from " + tabla);
                    tama.next();
                    int tamañoDatos = tama.getInt(1);
                    ID = tamañoDatos + 1;
                }
            } else if (NL.equals("N")) {
                if (existeC) {
                    //select from 
                    Statement counyes = Bienvenido.conecionP.createStatement();
                    ResultSet tamayes = counyes.executeQuery("Select * from " + tabla + " where " + tabla + "=" + consultar + "");
                    tamayes.next();
                    ID = tamayes.getInt(1);
                    ya_esta = true;
                } else {
                    Statement coun = Bienvenido.conecionP.createStatement();
                    ResultSet tama = coun.executeQuery("select count(*) from " + tabla);
                    tama.next();
                    int tamañoDatos = tama.getInt(1);
                    ID = tamañoDatos + 1;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
