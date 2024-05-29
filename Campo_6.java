package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.UIManager;

public class Campo_6 extends javax.swing.JFrame {

    public Campo_6() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtHFinC6 = new javax.swing.JTextField();
        jtxtHInicio6 = new javax.swing.JTextField();
        jbtnMarco = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcbxChalecos6 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jbtnIr = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jbtnGuardarCampo1 = new javax.swing.JButton();
        jbtnVolverCampo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(60, 71, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/pitch.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Campo 6");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 30));

        jSeparator1.setBackground(new java.awt.Color(60, 71, 84));
        jSeparator1.setForeground(new java.awt.Color(60, 71, 84));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 10, 90));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Hora Fin:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 60, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Hora Inicio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 70, 40));

        jtxtHFinC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtHFinC6ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtHFinC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 110, 30));
        jPanel1.add(jtxtHInicio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, 30));

        jbtnMarco.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnMarcoMouseMoved(evt);
            }
        });
        jbtnMarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMarcoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 300, 90));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Equipamiento deportivos necesarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "Equipamiento deportivos a agregar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 1, 14), new java.awt.Color(14, 41, 69))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Otros:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 70, 30));

        jcbxChalecos6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel2.add(jcbxChalecos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Chalecos:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 30));

        jbtnIr.setText("Ir");
        jbtnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIrActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnIr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Monto de equipos agregados:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 190, 30));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 220, -1));

        jLabel10.setText("S/.");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 20, 20));

        jButton2.setBackground(new java.awt.Color(60, 71, 84));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SUMAR");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 620, 180));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Costo por Tiempo:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        jLabel8.setText("S/.");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 190, 70));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pago Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("S/.");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 20, 20));
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 230, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 340, 70));

        jbtnGuardarCampo1.setBackground(new java.awt.Color(32, 112, 61));
        jbtnGuardarCampo1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jbtnGuardarCampo1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGuardarCampo1.setText("Guardar");
        jPanel1.add(jbtnGuardarCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 120, 40));

        jbtnVolverCampo1.setBackground(new java.awt.Color(18, 133, 190));
        jbtnVolverCampo1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jbtnVolverCampo1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnVolverCampo1.setText("Volver");
        jbtnVolverCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVolverCampo1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnVolverCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMarcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMarcoActionPerformed

    private void jbtnMarcoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMarcoMouseMoved
         jbtnMarco.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jbtnMarcoMouseMoved

    private void jtxtHFinC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtHFinC6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtHFinC6ActionPerformed

    private void jbtnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIrActionPerformed
        frmEquipamiento equipo = new frmEquipamiento();
        equipo.setVisible(true);
    }//GEN-LAST:event_jbtnIrActionPerformed

    private void jbtnVolverCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVolverCampo1ActionPerformed
     dispose();
    }//GEN-LAST:event_jbtnVolverCampo1ActionPerformed

    public static void main(String args[]) {

        FlatLightLaf.setup();
        UIManager.put("Button.arc", 50);
        UIManager.put("TextComponent.arc", 50);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campo_6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jbtnGuardarCampo1;
    private javax.swing.JButton jbtnIr;
    private javax.swing.JButton jbtnMarco;
    private javax.swing.JButton jbtnVolverCampo1;
    private javax.swing.JComboBox<String> jcbxChalecos6;
    private javax.swing.JTextField jtxtHFinC6;
    private javax.swing.JTextField jtxtHInicio6;
    // End of variables declaration//GEN-END:variables

    private void System(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
