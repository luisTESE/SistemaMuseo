package z_sistema_museo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Exposicion extends javax.swing.JPanel {

    String nombreM = "", tituloM = "";
    String dI = "", mI = "", aI = "", dF = "", mF = "", aF = "";
    String desc = "";

    public Exposicion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rExpo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        nombreMuseo = new javax.swing.JTextField();
        tituloObra = new javax.swing.JTextField();
        diaI = new javax.swing.JTextField();
        diaF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mesI = new javax.swing.JTextField();
        anoI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mesF = new javax.swing.JTextField();
        anoF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        consultaE = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel1.setText("Titulo de la Obra");

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setText("Descripcion");

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del Museo");

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de inicio");

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de Fin");

        rExpo.setText("registro Exposicion");
        rExpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rExpoActionPerformed(evt);
            }
        });

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel6.setText("/");

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel7.setText("/");

        jLabel8.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel8.setText("/");

        jLabel9.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel9.setText("/");

        jLabel10.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel10.setText("dia");

        jLabel11.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel11.setText("mes");

        jLabel12.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel12.setText("año");

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

        jButton2.setText("Exposicion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tituloObra, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rExpo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(diaI, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                            .addComponent(diaF))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mesF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(anoF))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(mesI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel8))
                                                    .addComponent(jLabel11))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(anoI, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tituloObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(diaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(mesI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(diaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(mesF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(53, 53, 53)
                        .addComponent(rExpo)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rExpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rExpoActionPerformed
        // Registro de Exposicion
        nombreM = nombreMuseo.getText();
        tituloM = tituloObra.getText();

        desc = descripcion.getText();

        dI = diaI.getText();
        mI = mesI.getText();
        aI = anoI.getText();

        dF = diaF.getText();
        mF = mesF.getText();
        aF = anoF.getText();

        //System.out.println(nombreM + tituloM + dI + mI + aI + dF + mF + aF + desc);

        if (nombreM.equals("") || tituloM.equals("")
                || dI.equals("") || mI.equals("") || aI.equals("")
                || dF.equals("") || mF.equals("") || aF.equals("")
                || desc.equals("")) {

            JOptionPane.showMessageDialog(null, "Esta vacio");
        } else {
            if (Integer.parseInt(dI) > 30 || Integer.parseInt(dF) > 30
                    || Integer.parseInt(dI) == 0 || Integer.parseInt(dF) == 0
                    || Integer.parseInt(mI) > 12 || Integer.parseInt(mF) > 12
                    || Integer.parseInt(mI) == 0 || Integer.parseInt(mF) == 0
                    || dI.length() > 2 || dF.length() > 2 || mI.length() > 2 || mF.length() > 2
                    || aI.length() != 4 || aF.length() != 4) {

                if (Integer.parseInt(dI) > 30 || Integer.parseInt(dF) > 30
                        || Integer.parseInt(dI) == 30 || Integer.parseInt(dF) == 30) {
                    JOptionPane.showMessageDialog(null, "EL dia se pasa de 30 o es 0");
                }
                if (Integer.parseInt(mI) > 12 || Integer.parseInt(mF) > 12
                        || Integer.parseInt(mI) == 0 || Integer.parseInt(mF) == 0) {
                    JOptionPane.showMessageDialog(null, "EL mes se pasa de 12 o es 0");
                }
                if (dI.length() > 2 || dF.length() > 2 || mI.length() > 2 || mF.length() > 2) {
                    JOptionPane.showMessageDialog(null, "dia o mes tienen mas de 2 digitos");
                }
                if (aI.length() != 4 || aF.length() != 4) {
                    JOptionPane.showMessageDialog(null, "año tiene que tener 4 digitos");
                }

            } else {
                try {
                    //System.out.println(nombreM + tituloM + dI + mI + aI + dF + mF + aF + desc);
                    int id_fecha = 0;
                    // conteo de cuantos hay
                    Statement coun = Bienvenido.conecionP.createStatement();
                    ResultSet tama = coun.executeQuery("select count(*) from fecha");
                    tama.next();
                    int tamañoDatos = tama.getInt(1);
                    id_fecha = tamañoDatos + 1;
                    System.out.println(id_fecha);
                    // insertar la exposicion
                    Statement agregarfecha = Bienvenido.conecionP.createStatement();
                    agregarfecha.execute("insert into fecha values(" + id_fecha + ",'" + aI + "/" + mI + "/" + dI + "','" + aF + "/" + mF + "/" + dF + "')");
                    Statement agregarexpo = Bienvenido.conecionP.createStatement();
                    agregarexpo.execute("insert into exposicion values('" + tituloM + "','" + desc + "'," + id_fecha + ",'" + nombreM + "')");
                    JOptionPane.showMessageDialog(null, "Agregado");
                } catch (SQLException ex) {
                    Logger.getLogger(co.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }//GEN-LAST:event_rExpoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Consulta Expo
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
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoF;
    private javax.swing.JTextField anoI;
    private javax.swing.JTable consultaE;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField diaF;
    private javax.swing.JTextField diaI;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mesF;
    private javax.swing.JTextField mesI;
    private javax.swing.JTextField nombreMuseo;
    private javax.swing.JButton rExpo;
    private javax.swing.JTextField tituloObra;
    // End of variables declaration//GEN-END:variables
}
