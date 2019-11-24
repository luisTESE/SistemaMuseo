package z_sistema_museo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Actualizar extends javax.swing.JPanel {

    DefaultTableModel tabla = new DefaultTableModel();
    String nomM = "", horaE = "", horaS = "";
    String minE = "", minS = "", cp1 = "", calle1 = "", num = "", col = "", mun = "";
    String vitri = "", most = "", mostP = "", siE = "", ban = "";
    String tipM = "", idubica = "", IDMuseo = "";

    int ID = 0;
    boolean existe = false;

    public Actualizar() {
        initComponents();
    }

    public void verificacion(String tabla, String datoVerificar) {
        try {

            Statement co = Bienvenido.conecionP.createStatement();
            ResultSet con = co.executeQuery("select count(*) from " + tabla);
            con.next();
            int coun = con.getInt(1);
            String[] datos = new String[coun];

            Statement verificar = Bienvenido.conecionP.createStatement();
            ResultSet nM = verificar.executeQuery("select * from " + tabla);

            int i = 0;
            while (nM.next()) {
                String dato = nM.getString(1);
                datos[i] = dato;
                i++;
            }
            existe = false;
            for (int j = 0; j < datos.length; j++) {
                if (datoVerificar.equals(datos[j])) {
                    existe = true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actulizarMobi(String donde,String act,int idmo){
        try{
            Statement actualizar = Bienvenido.conecionP.createStatement();
            actualizar.execute("update mobiliario set "+donde+"="+act+" where id_mobiliario="+idmo);
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nombreM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        horaEntrada = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        minEntrada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        horaSalida = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        minSalida = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        calle = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        colonia = new javax.swing.JTextField();
        municipio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IDUbicacion = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        vitrinas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        mostradores = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        mostradoresP = new javax.swing.JTextField();
        sillasE = new javax.swing.JTextField();
        bancos = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        MuseoID = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        consulta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTabbedPane1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jPanel1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel4.setText("Nombre del museo");

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel3.setText("Horario Entrada");

        jLabel20.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel20.setText(":");

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setText("Horario Salida");

        jLabel21.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel21.setText(":");

        jLabel10.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel10.setText("Museo");

        jButton4.setText("Actualiza hora");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel1.setText("ID Ubicacion");

        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel9.setText("Municipio");

        jLabel8.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel8.setText("Colonia");

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel6.setText("Codigo postal");

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel5.setText("Calle");

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel7.setText("Numero");

        jButton5.setText("Editar Ubicacion");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(horaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(horaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addComponent(jButton4)))))
                .addGap(0, 71, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cp, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colonia)
                            .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IDUbicacion)
                        .addGap(280, 280, 280)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(255, 255, 255))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(horaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(minEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(horaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(minSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(IDUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton5)
                .addGap(92, 92, 92))
        );

        jTabbedPane1.addTab("Museo", jPanel1);

        jLabel16.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel16.setText("vitrinas");

        jLabel17.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel17.setText("Mostradores");

        jLabel15.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel15.setText("Mostradores de Pared");

        jLabel18.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel18.setText("Sillas de espera");

        jLabel19.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel19.setText("Bancos");

        jLabel13.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel13.setText("Mobiliario");

        jLabel22.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel22.setText("Museo");

        jButton6.setText("Mobiliario");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MuseoID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mostradores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(110, 110, 110)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bancos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mostradoresP, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sillasE, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6)))
                                .addComponent(vitrinas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(MuseoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(vitrinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(mostradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(sillasE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostradoresP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(bancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton6)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tipo de museo", jPanel3);

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

        jButton1.setText("Museo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubicacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mobiliario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // consulta Museo
        try {
            String[] cabecera = {"nombre museo", "hora entrada", "hora salida"};

            // conteo de que hay
            Statement coun = Bienvenido.conecionP.createStatement();
            ResultSet tama = coun.executeQuery("select count(*) from registro");
            tama.next();
            int tamañoDatos = tama.getInt(1);

            String[][] datos = new String[tamañoDatos][cabecera.length];

            // impresion
            Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM registro re\n"
                    + "inner join horario ho ON re.id_horario = ho.id_horario");

            int i = 0;
            while (rs.next()) {
                String nM = rs.getString(1);
                String hE = rs.getString(6);
                String hS = rs.getString(7);

                datos[i][0] = nM;
                datos[i][1] = hE;
                datos[i][2] = hS;
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //consulta Ubicacion
        try {
            String[] cabecera = {"id_ubicacion", "cp", "calle", "numero", "colonia", "municipio"};

            // conteo de que hay
            Statement coun = Bienvenido.conecionP.createStatement();
            ResultSet tama = coun.executeQuery("SELECT count(*) FROM cp p \n"
                    + "inner join calle ca on p.id_calle = ca.id_calle\n"
                    + "inner join numero n on ca.id_numero = n.id_numero\n"
                    + "inner join colonia co on n.id_colonia = co.id_colonia\n"
                    + "inner join municipio m on co.id_municipio = m.id_municipio ");
            tama.next();
            int tamañoDatos = tama.getInt(1);
            String[][] datos = new String[tamañoDatos][cabecera.length];

            // impresion
            Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM cp p \n"
                    + "inner join calle ca on p.id_calle = ca.id_calle\n"
                    + "inner join numero n on ca.id_numero = n.id_numero\n"
                    + "inner join colonia co on n.id_colonia = co.id_colonia\n"
                    + "inner join municipio m on co.id_municipio = m.id_municipio ");

            int i = 0;
            while (rs.next()) {
                String ic = rs.getString(1);
                String c1 = rs.getString(2);
                String ca = rs.getString(5);
                String n = rs.getString(8);
                String co = rs.getString(11);
                String m = rs.getString(14);

                datos[i][0] = ic;
                datos[i][1] = c1;
                datos[i][2] = ca;
                datos[i][3] = n;
                datos[i][4] = co;
                datos[i][5] = m;
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // consulta mobiliario
        try {
            String[] cabecera = {"Museo", "id_mobiliario", "vitrinas", "mostradores", "mostradores Pared", "sillas Espera", "bancos"};

            // conteo de que hay
            Statement coun = Bienvenido.conecionP.createStatement();
            ResultSet tama = coun.executeQuery("SELECT count(*) FROM registro re\n"
                    + "inner join tipoMuseo tm ON tm.id_tipoM = re.id_tipoM\n"
                    + "inner join mobiliario mo ON tm.id_mobiliario = mo.id_mobiliario");
            tama.next();
            int tamañoDatos = tama.getInt(1);
            String[][] datos = new String[tamañoDatos][cabecera.length];

            // impresion
            Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM registro re\n"
                    + "inner join tipoMuseo tm ON tm.id_tipoM = re.id_tipoM\n"
                    + "inner join mobiliario mo ON tm.id_mobiliario = mo.id_mobiliario");

            int i = 0;
            while (rs.next()) {
                String nM = rs.getString(1);
                String iM = rs.getString(8);
                String v = rs.getString(9);
                String mo = rs.getString(10);
                String mop = rs.getString(11);
                String se = rs.getString(12);
                String b = rs.getString(13);

                datos[i][0] = nM;
                datos[i][1] = iM;
                datos[i][2] = v;
                datos[i][3] = mo;
                datos[i][4] = mop;
                datos[i][5] = se;
                datos[i][6] = b;
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // actualizar hora
        try {
            nomM = nombreM.getText();
            horaE = horaEntrada.getText();
            horaS = horaSalida.getText();
            minE = minEntrada.getText();
            minS = minSalida.getText();

            if (nomM.equals("")) {
                JOptionPane.showMessageDialog(null, "Esta vacio Nombre del museo");
            } else {
                if (!nomM.equals("")) {
                    verificacion("registro", nomM);
                    if (existe) {
                        Statement IDC = Bienvenido.conecionP.createStatement();
                        ResultSet IDCON = IDC.executeQuery("select * from registro where nombreM='" + nomM + "'");
                        IDCON.next();
                        ID = IDCON.getInt(3);

                        // entrada
                        if (!horaE.equals("") || !minE.equals("")) {
                            if (horaE.length() > 2 || Integer.parseInt(horaE) > 24
                                    || minE.length() > 2 || Integer.parseInt(minE) > 60) {
                                JOptionPane.showMessageDialog(null, "hora tiene mas de 2 digitos o se pasa de 24");

                            } else {
                                try {
                                    Statement actualizar = Bienvenido.conecionP.createStatement();
                                    actualizar.execute("update horario set horaEntrada= '" + horaE + ":" + minE + "' where id_horario=" + ID);
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            }
                        }

                        // salida
                        if (!horaS.equals("") || !minS.equals("")) {
                            if (horaS.length() > 2 || Integer.parseInt(horaS) > 24
                                    || minS.length() > 2 || Integer.parseInt(minS) > 60) {
                                JOptionPane.showMessageDialog(null, "hora tiene mas de 2 digitos o se pasa de 24");

                            } else {
                                try {
                                    Statement actualizar = Bienvenido.conecionP.createStatement();
                                    actualizar.execute("update horario set horaSalida='" + horaS + ":" + minS + "' where id_horario=" + ID);
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "No existe el museo \nque vas a actualizar");
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed

    }//GEN-LAST:event_cpActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Actualizar Ubicacion
        try {
            idubica = IDUbicacion.getText();
            cp1 = cp.getText();
            calle1 = calle.getText();
            num = numero.getText();
            col = colonia.getText();
            mun = municipio.getText();

            Statement actualizar = Bienvenido.conecionP.createStatement();
            if (idubica.equals("")) {
                JOptionPane.showMessageDialog(null, "llena id de ubicacion");
            } else {
                if (!idubica.equals("")) {
                    verificacion("cp", idubica);
                    if (existe) {
                        Statement IDC = Bienvenido.conecionP.createStatement();
                        ResultSet IDCON = IDC.executeQuery("select * from cp where id_cp='" + idubica + "'");
                        IDCON.next();
                        ID = IDCON.getInt(3);

                        // CP
                        if (!cp1.equals("")) {
                            if (cp1.length() != 5) {
                                JOptionPane.showMessageDialog(null, "Cp tiene que tener 5 digitos");
                            } else {
                                actualizar.execute("update cp set cp=" + cp1 + " where id_cp=" + ID);

                            }
                        }

                        // calle
                        if (!calle1.equals("")) {

                            actualizar.execute("update calle set calle='" + calle1 + "' where id_calle=" + ID);

                        }
                        // numero
                        if (!num.equals("")) {

                            actualizar.execute("update numero set numero=" + num + " where id_numero=" + ID);

                        }
                        // colonia
                        if (!col.equals("")) {
                            actualizar.execute("update colonia set colonia='" + col + "' where id_colonia=" + ID);
                        }
                        // municipio
                        if (!mun.equals("")) {
                            actualizar.execute("update municipio set municipio='" + mun + "' where id_municipio=" + ID);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "No existe la id \nque vas a actualizar");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Actualizar mobiliario
        try {
            IDMuseo = MuseoID.getText();
            vitri = vitrinas.getText();
            most = mostradores.getText();
            mostP = mostradoresP.getText();
            siE = sillasE.getText();
            ban = bancos.getText();

            

            if (IDMuseo.equals("")) {
                JOptionPane.showMessageDialog(null, "Esta vacio Nombre del museo");
            } else {
                if (!IDMuseo.equals("")) {
                    verificacion("registro", IDMuseo);
                    if (existe) {
                        Statement IDC = Bienvenido.conecionP.createStatement();
                        ResultSet IDCON = IDC.executeQuery("select * from registro where nombreM='" + IDMuseo + "'");
                        IDCON.next();
                        ID = IDCON.getInt(3);

                        if (!vitri.equals("")) {
                            actulizarMobi("vitrinas",vitri, ID);
                        }
                        
                        if (!most.equals("")) {
                            actulizarMobi("mostradores",most, ID);
                        }
                        
                        if (!mostP.equals("")) {
                            actulizarMobi("mostradoresP",mostP, ID);
                        }
                        
                        if (!siE.equals("")) {
                            actulizarMobi("sillasE",siE, ID);
                        }
                        
                        if (!ban.equals("")) {
                            actulizarMobi("bancos",ban, ID);
                        }

                    } else {

                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDUbicacion;
    private javax.swing.JTextField MuseoID;
    private javax.swing.JTextField bancos;
    private javax.swing.JTextField calle;
    private javax.swing.JTextField colonia;
    private javax.swing.JTable consulta;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField horaEntrada;
    private javax.swing.JTextField horaSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField minEntrada;
    private javax.swing.JTextField minSalida;
    private javax.swing.JTextField mostradores;
    private javax.swing.JTextField mostradoresP;
    private javax.swing.JTextField municipio;
    private javax.swing.JTextField nombreM;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField sillasE;
    private javax.swing.JTextField vitrinas;
    // End of variables declaration//GEN-END:variables
}
