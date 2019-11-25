package z_sistema_museo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class regi extends javax.swing.JPanel {

    String nomM = "", horaE = "", horaS = "";
    String minE = "", minS = "", cp1 = "", calle1 = "", num = "", col = "", mun = "";
    String vitri = "", most = "", mostP = "", siE = "", ban = "";
    String tipM = "";
    int ID;
    boolean ya_esta = false;

    public regi() {
        initComponents();
    }

    public void ID(String tabla) {
        try {
            Statement coun = Bienvenido.conecionP.createStatement();
            ResultSet tama = coun.executeQuery("select count(*) from " + tabla);
            tama.next();
            int tamañoDatos = tama.getInt(1);
            ID = tamañoDatos + 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombreM = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        calle = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        colonia = new javax.swing.JTextField();
        municipio = new javax.swing.JTextField();
        cp = new javax.swing.JTextField();
        horaEntrada = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        minEntrada = new javax.swing.JTextField();
        horaSalida = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        minSalida = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tipoMuseo = new javax.swing.JComboBox<>();
        mostradores = new javax.swing.JTextField();
        vitrinas = new javax.swing.JTextField();
        bancos = new javax.swing.JTextField();
        mostradoresP = new javax.swing.JTextField();
        sillasE = new javax.swing.JTextField();
        registro = new javax.swing.JButton();

        jTabbedPane1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jPanel1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel1.setText("Ubicacion");

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setText("Horario Salida");

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel3.setText("Horario Entrada");

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel4.setText("Nombre del museo");

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel5.setText("Calle");

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel6.setText("Codigo postal");

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel7.setText("Numero");

        jLabel8.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel8.setText("Colonia");

        jLabel9.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel9.setText("Municipio");

        jLabel10.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel10.setText("Registro");

        jLabel20.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel20.setText(":");

        jLabel21.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel21.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                            .addComponent(colonia, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(municipio)))
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
                            .addComponent(minSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
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
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Museo", jPanel1);

        jLabel11.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel11.setText("Tipo de Museo");

        jLabel12.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel12.setText("Tipo de Museo");

        jLabel13.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel13.setText("Poner en el Mobiliario la cantidad existente");

        jLabel15.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel15.setText("Mostradores de Pared");

        jLabel16.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel16.setText("vitrinas");

        jLabel17.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel17.setText("Mostradores");

        jLabel18.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel18.setText("Sillas de espera");

        jLabel19.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel19.setText("Bancos");

        tipoMuseo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arte", "Historia Natural", "Etnografía y folklore", "Ciencias", "Museografía Práctica", "Ciencias Sociales", "Agricultura", "Comercio", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(212, 212, 212)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(mostradores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vitrinas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(jLabel15)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bancos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sillasE, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(mostradoresP, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel12)
                        .addGap(105, 105, 105)
                        .addComponent(tipoMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel13)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(42, 42, 42)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(vitrinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(bancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(mostradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(sillasE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(mostradoresP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jTabbedPane1.addTab("Tipo de museo", jPanel3);

        registro.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        registro.setText("Registro");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(registro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(registro)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        // registro
        nomM = nombreM.getText();
        horaE = horaEntrada.getText();
        minE = minEntrada.getText();
        horaS = horaSalida.getText();
        minS = minSalida.getText();

        tipM = (String) tipoMuseo.getSelectedItem();

        cp1 = cp.getText();
        calle1 = calle.getText();
        num = numero.getText();
        col = colonia.getText();
        mun = municipio.getText();

        vitri = vitrinas.getText();
        most = mostradores.getText();
        mostP = mostradoresP.getText();
        siE = sillasE.getText();
        ban = bancos.getText();

        System.out.println(nomM + horaE + minE + horaS + minS
                + cp1 + calle1 + num + col + mun
                + tipM
                + vitri + most + mostP + siE + ban);
        if (nomM.equals("") || horaE.equals("") || minE.equals("") || horaS.equals("") || minS.equals("")
                || cp1.equals("") || calle1.equals("") || num.equals("") || col.equals("") || mun.equals("")
                || vitri.equals("") || most.equals("") || mostP.equals("") || siE.equals("") || ban.equals("")) {

            JOptionPane.showMessageDialog(null, "llena todas las casillas");
        } else {
            if (horaE.length() > 2 || horaS.length() > 2
                    || minE.length() > 2 || minS.length() > 2
                    || Integer.parseInt(horaE) > 24 || Integer.parseInt(horaS) > 24
                    || Integer.parseInt(minE) > 60 || Integer.parseInt(minS) > 60
                    || cp1.length() != 5) {

                if (horaE.length() > 2 || horaS.length() > 2) {
                    JOptionPane.showMessageDialog(null, "hora tiene mas de 2 digitos");
                }
                if (minE.length() > 2 || minS.length() > 2) {
                    JOptionPane.showMessageDialog(null, "minutos tiene mas de 2 digitos");
                }
                if (Integer.parseInt(horaE) > 24 || Integer.parseInt(horaS) > 24) {
                    JOptionPane.showMessageDialog(null, "horas mayor 24");
                }
                if (Integer.parseInt(minE) > 60 || Integer.parseInt(minS) > 60) {
                    JOptionPane.showMessageDialog(null, "minutos mayor a 60");
                }
                if (cp1.length() != 5) {
                    JOptionPane.showMessageDialog(null, "Cp tiene que tener 5 digitos");
                }

            } else {
                try {

                    System.out.println(nomM + horaE + minE + horaS + minS
                            + cp1 + calle1 + num + col + mun
                            + tipM
                            + vitri + most + mostP + siE + ban);
                    int aux = 0, ID_cp = 0, ID_tipoM = 0, ID_horario = 0;
                    Statement inser = Bienvenido.conecionP.createStatement();

                    //municipio
                    ID("municipio");
                    inser.execute("insert into municipio values(" + ID + ",'" + mun + "')");
                    aux = ID;

                    //colonia
                    ID("colonia");
                    inser.execute("insert into colonia values(" + ID + ",'" + col + "'," + aux + ")");
                    aux = ID;

                    // numero
                    ID("numero");
                    inser.execute("insert into numero values(" + ID + "," + num + "," + aux + ")");
                    aux = ID;

                    //calle
                    ID("calle");
                    inser.execute("insert into calle values(" + ID + ",'" + calle1 + "'," + aux + ")");
                    aux = ID;

                    //cp
                    ID("cp");
                    ID_cp = ID;
                    inser.execute("insert into cp values(" + ID + "," + cp1 + "," + aux + ")");
                    aux = ID;

                    // ========================================== mobilirario y tipo
                    ID("mobiliario");
                    inser.execute("insert into mobiliario values(" + ID + "," + vitri + "," + most + "," + mostP + "," + siE + "," + ban + ")");
                    aux = ID;

                    ID("tipoMuseo");
                    ID_tipoM = ID;
                    inser.execute("insert into tipoMuseo values(" + ID + ",'" + tipM + "'," + aux + ")");

                    // =================================================
                    ID("horario");
                    ID_horario = ID;
                    inser.execute("insert into horario values(" + ID + ",'" + horaE + ":" + minE + "','" + horaS + ":" + minS + "')");
                    aux = ID;

                    /// ========================
                    inser.execute("insert into registro values('" + nomM + "'," + ID_horario + "," + ID_cp + "," + ID_tipoM + ")");

                    Statement st = Bienvenido.conecionP.createStatement(); // activa la sentencia
                    ResultSet rs = st.executeQuery("select * from registro");
                    JOptionPane.showMessageDialog(null, "Agregado");
                } catch (SQLException ex) {
                    Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_registroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bancos;
    private javax.swing.JTextField calle;
    private javax.swing.JTextField colonia;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField horaEntrada;
    private javax.swing.JTextField horaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField minEntrada;
    private javax.swing.JTextField minSalida;
    private javax.swing.JTextField mostradores;
    private javax.swing.JTextField mostradoresP;
    private javax.swing.JTextField municipio;
    private javax.swing.JTextField nombreM;
    private javax.swing.JTextField numero;
    private javax.swing.JButton registro;
    private javax.swing.JTextField sillasE;
    private javax.swing.JComboBox<String> tipoMuseo;
    private javax.swing.JTextField vitrinas;
    // End of variables declaration//GEN-END:variables
}
