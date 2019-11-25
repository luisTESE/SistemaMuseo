package z_sistema_museo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consulta extends javax.swing.JPanel {

    DefaultTableModel tabla = new DefaultTableModel();
    String nomE = "", musE = "";

    
    
    // agregrar datos
    public Consulta() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        museoC = new javax.swing.JButton();
        exposcionC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consulta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        consultaE = new javax.swing.JTable();
        MuseoE = new javax.swing.JButton();
        mE = new javax.swing.JTextField();
        eE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));

        museoC.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        museoC.setText("Museos");
        museoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                museoCActionPerformed(evt);
            }
        });

        exposcionC.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        exposcionC.setText("Exposciones");
        exposcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exposcionCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jLabel1.setText("Consulta");

        consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(consulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(museoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exposcionC)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(museoC)
                    .addComponent(exposcionC))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel1);

        consultaE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(consultaE);

        MuseoE.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        MuseoE.setText("Museo y Exposicion");
        MuseoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuseoEActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setText("Nombre Museo");

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel3.setText("Exposcion");

        Eliminar.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jLabel4.setText("Eliminar museo o exposicion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(mE, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eE, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Eliminar)
                        .addGap(161, 161, 161)
                        .addComponent(MuseoE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MuseoE)
                    .addComponent(Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exposcionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exposcionCActionPerformed
        // Exposcion C

        try {
            String[] cabecera = {"titulo de la obra", "descripcion", "fecha inicio", "fecha final", "nombre museo"};

            // conteo de que hay
            Statement coun = Bienvenido.conecionP.createStatement();
            ResultSet tama = coun.executeQuery("select count(*) from exposicion");
            tama.next();
            int tamañoDatos = tama.getInt(1);
            //System.out.println(tamañoDatos);
            System.out.println(cabecera.length);
            String[][] datos = new String[tamañoDatos][cabecera.length];

            // impresion
            Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
            ResultSet rs = st.executeQuery("select * FROM exposicion ex\n"
                    + "inner join fecha fe ON ex.id_fecha =  fe.id_fecha\n"
                    + "\n"
                    + "inner join registro re ON ex.nombreM = re.nombreM\n"
                    + "inner join horario ho ON re.id_horario = ho.id_horario");

            int i = 0;
            while (rs.next()) {
                String tituloObra = rs.getString(1);
                String descripcion = rs.getString(2);
                String nombreM = rs.getString(4);
                String fechaI = rs.getString(6);
                String fechaF = rs.getString(7);

                datos[i][0] = tituloObra;
                datos[i][1] = descripcion;
                datos[i][2] = nombreM;
                datos[i][3] = fechaI;
                datos[i][4] = fechaF;
                i++;
            }

            for (int j = 0; j < datos.length; j++) {
                for (int k = 0; k < datos[0].length; k++) {
                    //System.out.println(datos[j][k]);
                }
            }
            consulta.setModel(new DefaultTableModel(datos, cabecera));

        } catch (SQLException ex) {
            Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exposcionCActionPerformed

    private void museoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_museoCActionPerformed
        // Museo C
        try {
            String[] cabecera = {"nombre museo", "hora entrada", "hora salida", "tipo museo", "CP", "calle", "numero", "colonia", "muncipio"};

            // conteo de que hay
            Statement coun = Bienvenido.conecionP.createStatement();
            ResultSet tama = coun.executeQuery("select count(*) from registro");
            tama.next();
            int tamañoDatos = tama.getInt(1);
            //System.out.println(tamañoDatos);
            String[][] datos = new String[tamañoDatos][cabecera.length];

            // impresion
            Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM registro re\n"
                    + "inner join horario ho ON re.id_horario = ho.id_horario\n"
                    + "\n"
                    + "inner join cp p ON p.id_cp = re.id_cp\n"
                    + "inner join calle ca on p.id_calle = ca.id_calle\n"
                    + "inner join numero n on ca.id_numero = n.id_numero\n"
                    + "inner join colonia co on n.id_colonia = co.id_colonia\n"
                    + "inner join municipio m on co.id_municipio = m.id_municipio\n"
                    + "\n"
                    + "inner join tipoMuseo tm ON tm.id_tipoM = re.id_tipoM");

            int i = 0;
            while (rs.next()) {
                String nombreM = rs.getString(1);
                String horaE = rs.getString(6);
                String horaS = rs.getString(7);
                String cp = rs.getString(9);
                String calle = rs.getString(12);
                String numero = rs.getString(15);
                String colonia = rs.getString(18);
                String municipio = rs.getString(21);
                String tipoM = rs.getString(23);

                datos[i][0] = nombreM;
                datos[i][1] = horaE;
                datos[i][2] = horaS;
                datos[i][3] = tipoM;
                datos[i][4] = cp;
                datos[i][5] = calle;
                datos[i][6] = numero;
                datos[i][7] = colonia;
                datos[i][8] = municipio;

                i++;
            }

            for (int j = 0; j < datos.length; j++) {
                for (int k = 0; k < datos[0].length; k++) {
                    //System.out.println(datos[j][k]);
                }
            }
            consulta.setModel(new DefaultTableModel(datos, cabecera));

        } catch (SQLException ex) {
            Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_museoCActionPerformed

    private void MuseoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuseoEActionPerformed
        // Museo E
       try {
            String[] cabecera = {"titulo de la obra", "Nombre del Museo"};

            // conteo de que hay 
            Statement coun = Bienvenido.conecionP.createStatement();
            ResultSet tama = coun.executeQuery("select count(*) FROM exposicion ex\n"
                    + "right join registro re \n"
                    + "ON ex.nombreM = re.nombreM");
            tama.next();
            int tamañoDatos = tama.getInt(1);
            //System.out.println(tamañoDatos);
            String[][] datos = new String[tamañoDatos][cabecera.length];

            // impresion
            Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
            ResultSet rs = st.executeQuery("select * FROM exposicion ex\n"
                    + "right join registro re \n"
                    + "ON ex.nombreM = re.nombreM");

            int i = 0;
            while (rs.next()) {
                String titulo_obra = rs.getString(1);
                String nomM = rs.getString(5);
                
                datos[i][0] = titulo_obra;
                datos[i][1] = nomM;
                //System.out.println(titulo_obra + " " + nomM);
                i++;
            }
            consultaE.setModel(new DefaultTableModel(datos, cabecera));

        } catch (SQLException ex) {
            Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MuseoEActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // Eliminar
        musE = mE.getText();
        nomE = eE.getText();

        if (musE.equals("") && nomE.equals("")) {
            JOptionPane.showMessageDialog(null, "Esta vacio");
        } else {
            if (!musE.equals("")) {
                try {
                    System.out.println(musE);
                    // cuantos hay para el arreglo
                    Statement coun = Bienvenido.conecionP.createStatement();
                    ResultSet tama = coun.executeQuery("select count(*) from registro");
                    tama.next();
                    int tamañoDatos = tama.getInt(1);
                    String[] datos = new String[tamañoDatos];

                    // guardar datos 
                    Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
                    ResultSet rs = st.executeQuery("select * from registro");

                    int i = 0;
                    while (rs.next()) {
                        String titulo_obra = rs.getString(1);
                        datos[i] = titulo_obra;
                        i++;
                    }
                    
                    // comprobar si existe
                    boolean existe = false;
                    for (int j = 0; j < datos.length; j++) {
                        //System.out.println(nomE+" == "+datos[j]);
                        if(musE.equals(datos[j])){
                            existe = true;
                        }
                    }
                    
                    if(existe){
                        // eliminar la exposicion
                        Statement eliminarexpo = Bienvenido.conecionP.createStatement();
                        eliminarexpo.execute("delete exposicion where nombreM = '"+musE+"'");
                        Statement eliminar = Bienvenido.conecionP.createStatement();
                        eliminar.execute("delete registro where nombreM = '"+musE+"'");// eliminar Exposicion SQL
                        JOptionPane.showMessageDialog(null, "Eliminado");
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No existe en la base de datos Museo " + musE);
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (!nomE.equals("")) {
                try {
                    System.out.println(nomE);
                    // cuantos hay para el arreglo
                    Statement coun = Bienvenido.conecionP.createStatement();
                    ResultSet tama = coun.executeQuery("select count(*) from exposicion");
                    tama.next();
                    int tamañoDatos = tama.getInt(1);
                    String[] datos = new String[tamañoDatos];

                    // verificar si la exposicion existe
                    Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
                    ResultSet rs = st.executeQuery("select * from exposicion");

                    int i = 0;
                    while (rs.next()) {
                        String titulo_obra = rs.getString(1);
                        datos[i] = titulo_obra;
                        i++;
                    }
                    
                    // comprobar si existe
                    boolean existe = false;
                    for (int j = 0; j < datos.length; j++) {
                        //System.out.println(nomE+" == "+datos[j]);
                        if(nomE.equals(datos[j])){
                            existe = true;
                        }
                    }
                    
                    if(existe){
                        // eliminar la exposicion
                        System.out.println("si existe"+ nomE);
                        Statement eliminar = Bienvenido.conecionP.createStatement();
                        eliminar.execute("delete exposicion where titulo_obra = '"+nomE+"'");// eliminar Exposicion SQL
                        JOptionPane.showMessageDialog(null, "Eliminado");
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No existe en la base de datos " + nomE);
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Si");
        }
    }//GEN-LAST:event_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton MuseoE;
    private javax.swing.JTable consulta;
    private javax.swing.JTable consultaE;
    private javax.swing.JTextField eE;
    private javax.swing.JButton exposcionC;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mE;
    private javax.swing.JButton museoC;
    // End of variables declaration//GEN-END:variables
}
