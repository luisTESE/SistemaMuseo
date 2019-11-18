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
        ExposicionE = new javax.swing.JButton();
        mE = new javax.swing.JTextField();
        eE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();

        setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        museoC.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        museoC.setText("Museos");
        museoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                museoCActionPerformed(evt);
            }
        });

        exposcionC.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        exposcionC.setText("Exposciones");
        exposcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exposcionCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
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
                .addGap(364, 364, 364)
                .addComponent(jLabel1)
                .addContainerGap(396, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(museoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exposcionC)
                .addGap(143, 143, 143))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exposcionC)
                    .addComponent(museoC))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addGap(25, 25, 25))
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

        MuseoE.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        MuseoE.setText("Museos");
        MuseoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuseoEActionPerformed(evt);
            }
        });

        ExposicionE.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        ExposicionE.setText("Exposciones");
        ExposicionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExposicionEActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Museo");

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel3.setText("Exposcion");

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mE, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(75, 75, 75)
                        .addComponent(eE, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Eliminar)
                .addGap(310, 310, 310))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MuseoE)
                    .addComponent(ExposicionE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(Eliminar)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MuseoE)
                        .addGap(18, 18, 18)
                        .addComponent(ExposicionE)
                        .addGap(198, 198, 198))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(97, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Eliminar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            String[] cabecera = {"Nombre de Museo"};

            // conteo de que hay
            Statement coun = Bienvenido.conecionP.createStatement();
            ResultSet tama = coun.executeQuery("select count(*) from registro");
            tama.next();
            int tamañoDatos = tama.getInt(1);
            //System.out.println(tamañoDatos);
            String[][] datos = new String[tamañoDatos][cabecera.length];

            // impresion
            Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
            ResultSet rs = st.executeQuery("select * from registro");

            int i = 0;
            while (rs.next()) {
                String nombreM = rs.getString(1);
                datos[i][0] = nombreM;
                //System.out.println(titulo_obra);
                i++;
            }
            consultaE.setModel(new DefaultTableModel(datos, cabecera));

        } catch (SQLException ex) {
            Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MuseoEActionPerformed

    private void ExposicionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExposicionEActionPerformed
        // Exposicion E
        try {
            String[] cabecera = {"titulo de la obra"};

            // conteo de que hay
            Statement coun = Bienvenido.conecionP.createStatement();
            ResultSet tama = coun.executeQuery("select count(*) from exposicion");
            tama.next();
            int tamañoDatos = tama.getInt(1);
            //System.out.println(tamañoDatos);
            String[][] datos = new String[tamañoDatos][cabecera.length];

            // impresion
            Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
            ResultSet rs = st.executeQuery("select * from exposicion");

            int i = 0;
            while (rs.next()) {
                String titulo_obra = rs.getString(1);
                datos[i][0] = titulo_obra;
                //System.out.println(titulo_obra);
                i++;
            }
            consultaE.setModel(new DefaultTableModel(datos, cabecera));

        } catch (SQLException ex) {
            Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ExposicionEActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // Eliminar
        musE = mE.getText();
        nomE = eE.getText();

        if (musE.equals("") && nomE.equals("")) {
            JOptionPane.showMessageDialog(null, "Esta vacio");
        } else {
            System.out.println("Si");
        }
    }//GEN-LAST:event_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton ExposicionE;
    private javax.swing.JButton MuseoE;
    private javax.swing.JTable consulta;
    private javax.swing.JTable consultaE;
    private javax.swing.JTextField eE;
    private javax.swing.JButton exposcionC;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mE;
    private javax.swing.JButton museoC;
    // End of variables declaration//GEN-END:variables
}
