
package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class frmSistema extends javax.swing.JFrame {


    public frmSistema() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbtnSalir = new javax.swing.JButton();
        jbtnReservar = new javax.swing.JButton();
        jbtnEventos = new javax.swing.JButton();
        jbtnPagos = new javax.swing.JButton();
        jbtnQuejas = new javax.swing.JButton();
        jtbPaneles = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jpReserva = new javax.swing.JPanel();
        pEquipamientos = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pCampos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pDatoEncargado = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pHorarios = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtbReserva = new javax.swing.JTabbedPane();
        pHome = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        pDatos = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jbtnCancelarD = new javax.swing.JButton();
        jbtnAceptarD = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jtxtCelular = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jcbxHInicio = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jcbxNCampo1 = new javax.swing.JComboBox<>();
        jcbxHFin = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jcbxTDeporte = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel49 = new javax.swing.JLabel();
        jtxtDNI = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        pHorario = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jbtnCancelarH = new javax.swing.JButton();
        jbtnAceptarH = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        pCancha = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jbtnCancelarC = new javax.swing.JButton();
        jbtnAceptarC = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jbtnCampo3 = new javax.swing.JButton();
        jbtnCampo5 = new javax.swing.JButton();
        jbtnCampo2 = new javax.swing.JButton();
        jbtnCampo4 = new javax.swing.JButton();
        jbtnCampo6 = new javax.swing.JButton();
        jbtnCampo1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        pEquipamiento = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jbtnCancelarE = new javax.swing.JButton();
        jbtnAceptarE = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jbtnAgregarLays4 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jbtnAgregarLays5 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jbtnAgregarLays6 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jbtnAgregarLays7 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jbtnAgregarLays8 = new javax.swing.JButton();
        jbtnAgregarLays9 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jbtnAgregarLays10 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jButton51 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblCarrito = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jtxtTotalPagar = new javax.swing.JTextField();
        jbtnReservarCarrito = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jpEventos = new javax.swing.JPanel();
        jpPagos = new javax.swing.JPanel();
        jpQuejas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(60, 71, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("LA REDONDA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 80, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 100));

        jPanel2.setBackground(new java.awt.Color(115, 153, 142));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/booking (2).png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reservar");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 60));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eventos");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 80, 60));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pagos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, 60));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quejas");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 80, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salir");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 70, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/calendar.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 50, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/debit-card.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 90, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/complaint.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 40, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/log-out.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 40, 80));

        jbtnSalir.setBackground(new java.awt.Color(60, 71, 84));
        jbtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnSalirMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 140, 60));

        jbtnReservar.setBackground(new java.awt.Color(60, 71, 84));
        jbtnReservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnReservarMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 60));

        jbtnEventos.setBackground(new java.awt.Color(60, 71, 84));
        jbtnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnEventosMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 140, 60));

        jbtnPagos.setBackground(new java.awt.Color(60, 71, 84));
        jbtnPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPagosMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, 60));

        jbtnQuejas.setBackground(new java.awt.Color(60, 71, 84));
        jbtnQuejas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnQuejasMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnQuejas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 140, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 830, 100));

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" a todos peloteros y a repartir chocolateee!!");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 610, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("y los sueños se entrelazan con el balón, les damos la bienvenida");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 800, 60));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("En estas canchas, donde el césped se convierte en escenario ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 800, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/soccer (1).png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 280, 260));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 540));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 540));

        jtbPaneles.addTab("Home", jPanel4);

        jpReserva.setBackground(new java.awt.Color(60, 71, 84));
        jpReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pEquipamientos.setBackground(new java.awt.Color(204, 204, 204));
        pEquipamientos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pEquipamientosMouseMoved(evt);
            }
        });
        pEquipamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pEquipamientosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pEquipamientosMouseExited(evt);
            }
        });
        pEquipamientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Equipamiento");
        pEquipamientos.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 30));
        pEquipamientos.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        jpReserva.add(pEquipamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 190, 70));

        pCampos.setBackground(new java.awt.Color(204, 204, 204));
        pCampos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pCamposMouseMoved(evt);
            }
        });
        pCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCamposMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCamposMouseExited(evt);
            }
        });
        pCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Campos");
        pCampos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, 30));
        pCampos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        jpReserva.add(pCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 70));

        pDatoEncargado.setBackground(new java.awt.Color(204, 204, 204));
        pDatoEncargado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pDatoEncargadoMouseMoved(evt);
            }
        });
        pDatoEncargado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDatoEncargadoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pDatoEncargadoMouseExited(evt);
            }
        });
        pDatoEncargado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Datos ");
        pDatoEncargado.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 60, 30));
        pDatoEncargado.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        jpReserva.add(pDatoEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 70));

        pHorarios.setBackground(new java.awt.Color(204, 204, 204));
        pHorarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pHorariosMouseMoved(evt);
            }
        });
        pHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pHorariosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pHorariosMouseExited(evt);
            }
        });
        pHorarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Horarios");
        pHorarios.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, 30));
        pHorarios.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        jpReserva.add(pHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 190, 70));

        pHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pHome.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -40, 1170, 600));

        jtbReserva.addTab("Home", pHome);

        pDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(60, 71, 84));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarD.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarD.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarD.setText("Cancelar");
        jbtnCancelarD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarDMouseMoved(evt);
            }
        });
        jbtnCancelarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarDMouseExited(evt);
            }
        });
        jPanel5.add(jbtnCancelarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 140, 40));

        jbtnAceptarD.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAceptarD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAceptarD.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAceptarD.setText("Guardar");
        jbtnAceptarD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnAceptarDMouseMoved(evt);
            }
        });
        jbtnAceptarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAceptarDMouseExited(evt);
            }
        });
        jPanel5.add(jbtnAceptarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 140, 40));

        pDatos.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 470, 1020, 80));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del Encargado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 14))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, -1));

        jLabel40.setText("Nombre");
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel9.add(jtxtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, -1));

        jLabel41.setText("Celular");
        jPanel9.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel42.setText("Fecha");
        jPanel9.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel43.setText("Hora inicio");
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jcbxHInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione Hora>>", "08:00:00", "08:30:00", "09:00:00", "09:30:00", "10:00:00", "10:30:00", "11:00:00", "11:30:00", "12:00:00", "12:30:00", "13:00:00", "13:30:00", "14:00:00", "14:30:00", "15:00:00", "15:30:00", "16:00:00", "16:30:00", "17:00:00", "17:30:00", "18:00:00", "18:30:00", "19:00:00", "19:30:00", "20:00:00", "20:30:00", "21:00:00", "21:30:00", "22:00:00", "22:30:00", "23:00:00", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " }));
        jPanel9.add(jcbxHInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, -1));

        jLabel44.setText("N° campo");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jcbxNCampo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione >>", "01", "02", "03", "04", "05", "06" }));
        jPanel9.add(jcbxNCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 160, 20));

        jcbxHFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione Hora>>", "08:00:00", "08:30:00", "09:00:00", "09:30:00", "10:00:00", "10:30:00", "11:00:00", "11:30:00", "12:00:00", "12:30:00", "13:00:00", "13:30:00", "14:00:00", "14:30:00", "15:00:00", "15:30:00", "16:00:00", "16:30:00", "17:00:00", "17:30:00", "18:00:00", "18:30:00", "19:00:00", "19:30:00", "20:00:00", "20:30:00", "21:00:00", "21:30:00", "22:00:00", "22:30:00", "23:00:00", "24:00:00" }));
        jPanel9.add(jcbxHFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 160, -1));

        jLabel45.setText("Hora fin");
        jPanel9.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel46.setText("Tipo de deporte");
        jPanel9.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jcbxTDeporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione >>", "Futbol", "Voley" }));
        jPanel9.add(jcbxTDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 20));
        jPanel9.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, -1));

        jLabel49.setText("Dni");
        jPanel9.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel9.add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, -1));

        pDatos.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 410, 410));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen de WhatsApp 2024-04-18 a las 11.05.35_092b8e65 (1) (1).jpg"))); // NOI18N
        pDatos.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 350, 230));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imagen de la cancha deportiva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 12))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pDatos.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 370, 280));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pDatos.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -40, 1170, 580));

        jtbReserva.addTab("Datos", pDatos);

        pHorario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(60, 71, 84));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarH.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarH.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarH.setText("Cancelar");
        jbtnCancelarH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarHMouseMoved(evt);
            }
        });
        jbtnCancelarH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarHMouseExited(evt);
            }
        });
        jPanel6.add(jbtnCancelarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 140, 40));

        jbtnAceptarH.setBackground(new java.awt.Color(204, 204, 204));
        jbtnAceptarH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAceptarH.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAceptarH.setText("Limpiar");
        jbtnAceptarH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnAceptarHMouseMoved(evt);
            }
        });
        jbtnAceptarH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAceptarHMouseExited(evt);
            }
        });
        jPanel6.add(jbtnAceptarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 140, 40));

        pHorario.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 470, 1020, 80));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Horario de canchas reservadas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 18), new java.awt.Color(51, 68, 87))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Campo", "Hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 570, 310));

        pHorario.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 590, 360));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<<<Seleccione>>>>", "01", "02", "03", "04", "05", "06" }));
        jComboBox7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "N° Campo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 14))); // NOI18N
        pHorario.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 170, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pHorario.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -40, 1170, 580));

        jtbReserva.addTab("Horario", pHorario);

        pCancha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(60, 71, 84));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarC.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarC.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarC.setText("Cancelar");
        jbtnCancelarC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarCMouseMoved(evt);
            }
        });
        jbtnCancelarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarCMouseExited(evt);
            }
        });
        jPanel7.add(jbtnCancelarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 140, 40));

        jbtnAceptarC.setBackground(new java.awt.Color(204, 204, 204));
        jbtnAceptarC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAceptarC.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAceptarC.setText("Aceptar");
        jbtnAceptarC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnAceptarCMouseMoved(evt);
            }
        });
        jbtnAceptarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAceptarCMouseExited(evt);
            }
        });
        jPanel7.add(jbtnAceptarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 140, 40));

        pCancha.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 470, 1020, 80));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 180, -1, 120));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 320, -1, 100));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 60, 100));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 60, 100));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 60, 100));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-field (3).png"))); // NOI18N
        pCancha.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 60, 90));

        jbtnCampo3.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo3.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo3.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo3.setText("        CAMPO 3");
        jbtnCampo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo3ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 300, 120));

        jbtnCampo5.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo5.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo5.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo5.setText("        CAMPO 5");
        jbtnCampo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo5ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 300, 120));

        jbtnCampo2.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo2.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo2.setText("        CAMPO 2");
        jbtnCampo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo2ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 300, 120));

        jbtnCampo4.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo4.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo4.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo4.setText("        CAMPO 4");
        jbtnCampo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo4ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 300, 120));

        jbtnCampo6.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo6.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo6.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo6.setText("        CAMPO 6");
        jbtnCampo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo6ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 300, 120));

        jbtnCampo1.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCampo1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jbtnCampo1.setForeground(new java.awt.Color(102, 51, 30));
        jbtnCampo1.setText("        CAMPO 1");
        jbtnCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCampo1ActionPerformed(evt);
            }
        });
        pCancha.add(jbtnCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 300, 120));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pCancha.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -40, 1170, 580));

        jtbReserva.addTab("Campos", pCancha);

        pEquipamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(60, 71, 84));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCancelarE.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCancelarE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCancelarE.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCancelarE.setText("Cancelar");
        jbtnCancelarE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnCancelarEMouseMoved(evt);
            }
        });
        jbtnCancelarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarEMouseExited(evt);
            }
        });
        jPanel8.add(jbtnCancelarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 140, 40));

        jbtnAceptarE.setBackground(new java.awt.Color(204, 204, 204));
        jbtnAceptarE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAceptarE.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAceptarE.setText("Aceptar");
        jbtnAceptarE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnAceptarEMouseMoved(evt);
            }
        });
        jbtnAceptarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAceptarEMouseExited(evt);
            }
        });
        jPanel8.add(jbtnAceptarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 140, 40));

        pEquipamiento.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 470, 1020, 80));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/soccer-boots.png"))); // NOI18N
        pEquipamiento.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, 80));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/soccer-boots.png"))); // NOI18N
        pEquipamiento.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 80, 80));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/gloves (1).png"))); // NOI18N
        pEquipamiento.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 80, 60));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/soccer (2).png"))); // NOI18N
        pEquipamiento.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 80, 80));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-shirt (2).png"))); // NOI18N
        pEquipamiento.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 276, 60, 80));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/red-card.png"))); // NOI18N
        pEquipamiento.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 80, 80));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-long-socks-with-white-lines (1).png"))); // NOI18N
        pEquipamiento.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 80, 70));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/football-long-socks-with-white-lines (1).png"))); // NOI18N
        pEquipamiento.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 80, 70));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 160, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<seleccione>>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "++" }));
        pEquipamiento.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jbtnAgregarLays4.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregarLays4.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregarLays4.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarLays4.setText("Agregar al carrito");
        jbtnAgregarLays4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarLays4ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jbtnAgregarLays4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 120, 20));

        jButton47.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 140, 170));

        jbtnAgregarLays5.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregarLays5.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregarLays5.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarLays5.setText("Agregar al carrito");
        jbtnAgregarLays5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarLays5ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jbtnAgregarLays5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 120, 20));

        jButton48.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 140, 170));

        jbtnAgregarLays6.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregarLays6.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregarLays6.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarLays6.setText("Agregar al carrito");
        jbtnAgregarLays6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarLays6ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jbtnAgregarLays6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 20));

        jButton49.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 170));

        jbtnAgregarLays7.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregarLays7.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregarLays7.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarLays7.setText("Agregar al carrito");
        jbtnAgregarLays7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarLays7ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jbtnAgregarLays7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 120, 20));

        jButton50.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 140, 170));

        jbtnAgregarLays8.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregarLays8.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregarLays8.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarLays8.setText("Agregar al carrito");
        jbtnAgregarLays8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarLays8ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jbtnAgregarLays8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 120, 20));

        jbtnAgregarLays9.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregarLays9.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregarLays9.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarLays9.setText("Agregar al carrito");
        jbtnAgregarLays9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarLays9ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jbtnAgregarLays9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 120, 20));

        jButton52.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 140, 170));

        jbtnAgregarLays10.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregarLays10.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        jbtnAgregarLays10.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarLays10.setText("Agregar al carrito");
        jbtnAgregarLays10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarLays10ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jbtnAgregarLays10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 120, 20));

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Tu Carrito");
        pEquipamiento.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 95, 90, 40));

        jButton51.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        pEquipamiento.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, 170));

        jtblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Articulo", "Cantidad", "Precio U.", "Precio T."
            }
        ));
        jScrollPane1.setViewportView(jtblCarrito);

        pEquipamiento.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 270, 160));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        pEquipamiento.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 270, 130));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Tu Total");
        pEquipamiento.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 60, -1));

        jLabel48.setBackground(new java.awt.Color(0, 0, 0));
        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("S/.");
        pEquipamiento.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 20, 20));

        jtxtTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalPagarActionPerformed(evt);
            }
        });
        pEquipamiento.add(jtxtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 130, -1));

        jbtnReservarCarrito.setBackground(new java.awt.Color(0, 0, 0));
        jbtnReservarCarrito.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jbtnReservarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        jbtnReservarCarrito.setText("Reservar");
        jbtnReservarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReservarCarritoActionPerformed(evt);
            }
        });
        pEquipamiento.add(jbtnReservarCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 230, -1));
        pEquipamiento.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 270, 130));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ddb18728a2772d3228ecaa8e83aa3c63.jpg"))); // NOI18N
        pEquipamiento.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -40, 1170, 590));

        jtbReserva.addTab("Equipamiento", pEquipamiento);

        jpReserva.add(jtbReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -40, 830, 580));

        jtbPaneles.addTab("Reservar", jpReserva);

        jpEventos.setBackground(new java.awt.Color(153, 153, 255));
        jpEventos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jtbPaneles.addTab("Eventos", jpEventos);

        jpPagos.setBackground(new java.awt.Color(153, 204, 255));
        jpPagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jtbPaneles.addTab("Pagos", jpPagos);

        jpQuejas.setBackground(new java.awt.Color(255, 153, 153));
        jpQuejas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jtbPaneles.addTab("Quejas", jpQuejas);

        getContentPane().add(jtbPaneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1020, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnReservarMouseClicked
        jtbPaneles.setSelectedIndex(1);
    }//GEN-LAST:event_jbtnReservarMouseClicked

    private void jbtnEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEventosMouseClicked
        jtbPaneles.setSelectedIndex(2);
    }//GEN-LAST:event_jbtnEventosMouseClicked

    private void jbtnPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPagosMouseClicked
      jtbPaneles.setSelectedIndex(3);
    }//GEN-LAST:event_jbtnPagosMouseClicked

    private void jbtnQuejasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnQuejasMouseClicked
        jtbPaneles.setSelectedIndex(4);
    }//GEN-LAST:event_jbtnQuejasMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       jtbPaneles.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jbtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jbtnSalirMouseClicked

    private void pCamposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamposMouseMoved
      pCampos.setBackground(new Color(115,153,142));
    }//GEN-LAST:event_pCamposMouseMoved

    private void pCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamposMouseClicked
       jtbReserva.setSelectedIndex(3);
    }//GEN-LAST:event_pCamposMouseClicked

    private void pCamposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamposMouseExited
     pCampos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_pCamposMouseExited

    private void pDatoEncargadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDatoEncargadoMouseMoved
        pDatoEncargado.setBackground(new Color(115,153,142));
    }//GEN-LAST:event_pDatoEncargadoMouseMoved

    private void pDatoEncargadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDatoEncargadoMouseClicked
        jtbReserva.setSelectedIndex(1);
    }//GEN-LAST:event_pDatoEncargadoMouseClicked
   
    private void pDatoEncargadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDatoEncargadoMouseExited
       pDatoEncargado.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_pDatoEncargadoMouseExited

    private void pHorariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHorariosMouseMoved
       pHorarios.setBackground(new Color(115,153,142));
    }//GEN-LAST:event_pHorariosMouseMoved

    private void pHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHorariosMouseClicked
       jtbReserva.setSelectedIndex(2);
    }//GEN-LAST:event_pHorariosMouseClicked

    private void pHorariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pHorariosMouseExited
        pHorarios.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_pHorariosMouseExited

    private void pEquipamientosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEquipamientosMouseMoved
        pEquipamientos.setBackground(new Color(115,153,142));
    }//GEN-LAST:event_pEquipamientosMouseMoved

    private void pEquipamientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEquipamientosMouseClicked
        jtbReserva.setSelectedIndex(4);
    }//GEN-LAST:event_pEquipamientosMouseClicked

    private void pEquipamientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEquipamientosMouseExited
        pEquipamientos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_pEquipamientosMouseExited

    private void jbtnAceptarEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarEMouseMoved
        jbtnAceptarE.setBackground(new Color(115,153,142));
    }//GEN-LAST:event_jbtnAceptarEMouseMoved

    private void jbtnCancelarEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarEMouseMoved
       jbtnCancelarE.setBackground(new Color(178,68,75)); 
    }//GEN-LAST:event_jbtnCancelarEMouseMoved

    private void jbtnAceptarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarEMouseExited
       jbtnAceptarE.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jbtnAceptarEMouseExited

    private void jbtnCancelarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarEMouseExited
       jbtnCancelarE.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jbtnCancelarEMouseExited

    private void jbtnAceptarCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarCMouseMoved
       jbtnAceptarC.setBackground(new Color(115,153,142));
    }//GEN-LAST:event_jbtnAceptarCMouseMoved

    private void jbtnAceptarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarCMouseExited
      jbtnAceptarC.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jbtnAceptarCMouseExited

    private void jbtnCancelarCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarCMouseMoved
        jbtnCancelarC.setBackground(new Color(178,68,75)); 
    }//GEN-LAST:event_jbtnCancelarCMouseMoved

    private void jbtnCancelarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarCMouseExited
         jbtnCancelarC.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jbtnCancelarCMouseExited

    private void jbtnAceptarHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarHMouseMoved
       jbtnAceptarH.setBackground(new Color(115,153,142));
    }//GEN-LAST:event_jbtnAceptarHMouseMoved

    private void jbtnAceptarHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarHMouseExited
       jbtnAceptarH.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jbtnAceptarHMouseExited

    private void jbtnCancelarHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarHMouseMoved
        jbtnCancelarH.setBackground(new Color(178,68,75)); 
    }//GEN-LAST:event_jbtnCancelarHMouseMoved

    private void jbtnCancelarHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarHMouseExited
        jbtnCancelarH.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jbtnCancelarHMouseExited

    private void jbtnAceptarDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarDMouseMoved
       jbtnAceptarD.setBackground(new Color(51,135,204));
    }//GEN-LAST:event_jbtnAceptarDMouseMoved

    private void jbtnAceptarDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAceptarDMouseExited
        jbtnAceptarD.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jbtnAceptarDMouseExited

    private void jbtnCancelarDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarDMouseMoved
         jbtnCancelarD.setBackground(new Color(178,68,75)); 
    }//GEN-LAST:event_jbtnCancelarDMouseMoved

    private void jbtnCancelarDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarDMouseExited
       jbtnCancelarD.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jbtnCancelarDMouseExited

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jbtnAgregarLays4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarLays4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregarLays4ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jbtnAgregarLays5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarLays5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregarLays5ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jbtnAgregarLays6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarLays6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregarLays6ActionPerformed

    private void jbtnAgregarLays7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarLays7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregarLays7ActionPerformed

    private void jbtnAgregarLays8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarLays8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregarLays8ActionPerformed

    private void jbtnAgregarLays9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarLays9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregarLays9ActionPerformed

    private void jbtnAgregarLays10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarLays10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAgregarLays10ActionPerformed

    private void jtxtTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalPagarActionPerformed

    private void jbtnCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo1ActionPerformed
        Campo_1 campo1 = new Campo_1();
        campo1.setVisible(true);
    }//GEN-LAST:event_jbtnCampo1ActionPerformed

    private void jbtnCampo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo6ActionPerformed
          Campo_6 campo6 = new Campo_6();
        campo6.setVisible(true);
    }//GEN-LAST:event_jbtnCampo6ActionPerformed

    private void jbtnCampo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo4ActionPerformed
         Campo_4 campo4 = new Campo_4();
        campo4.setVisible(true);
    }//GEN-LAST:event_jbtnCampo4ActionPerformed

    private void jbtnCampo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo2ActionPerformed
         Campo_2 campo2 = new Campo_2();
        campo2.setVisible(true);
    }//GEN-LAST:event_jbtnCampo2ActionPerformed

    private void jbtnCampo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo5ActionPerformed
          Campo_5 campo5 = new Campo_5();
        campo5.setVisible(true);
    }//GEN-LAST:event_jbtnCampo5ActionPerformed

    private void jbtnCampo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCampo3ActionPerformed
          Campo_3 campo3 = new Campo_3();
        campo3.setVisible(true);
    }//GEN-LAST:event_jbtnCampo3ActionPerformed

    private void jbtnReservarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReservarCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnReservarCarritoActionPerformed

    private void guardarDatosEncargado() {
        String nombre = jtxtNombre.getText();
        String celular = jtxtCelular.getText();
        String dni = jtxtDNI.getText();
        String HoraInicio = jcbxHInicio.getSelectedItem().toString();
        String HoraFin = jcbxHFin.getSelectedItem().toString();
        String TipoDeporte = jcbxTDeporte.getSelectedItem().toString();
        String NCampo = jcbxNCampo1.getSelectedItem().toString();

        try {
            // Establecer la conexión con la base de datos
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:3306/LaRedonda", "nombre", "pass");

            // Crear la consulta SQL para la inserción de datos
           String query = "INSERT INTO datosresidentes (Nombre, Celular, DNI, HoraInicio, HoraFin, TipoDeporte, NCampo) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pst = connection.prepareStatement(query)) {
                // Establecer los parámetros de la consulta
                
                pst.setString(1, nombre);
                pst.setString(2, celular);
                pst.setString(3, dni);
                pst.setString(4, HoraInicio);
                pst.setString(5, HoraFin);
                pst.setString(6, TipoDeporte);
                pst.setString(7, NCampo);
               

                // Ejecutar la consulta
                pst.executeUpdate();
              
            // Actualizar la tabla en DatosResidentes
           // actualizarTablaEnDatosResidentes();
            
                // Actualizar la tabla
               //actualizarTabla();

                // Cerrar la conexión
                connection.close();

                // Limpiar los campos de entrada
                jtxtNombre.setText("");
                jtxtCelular.setText("");
                jtxtDNI.setText("");
                jcbxHInicio.setSelectedIndex(0);
                jcbxHFin.setSelectedIndex(0);
                jcbxTDeporte.setSelectedIndex(0);
                jcbxNCampo1.setSelectedIndex(0);

                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
         FlatLightLaf.setup();
        UIManager.put("Button.arc", 50);         
        UIManager.put("TextComponent.arc", 50);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnAceptarC;
    private javax.swing.JButton jbtnAceptarD;
    private javax.swing.JButton jbtnAceptarE;
    private javax.swing.JButton jbtnAceptarH;
    private javax.swing.JButton jbtnAgregarLays10;
    private javax.swing.JButton jbtnAgregarLays4;
    private javax.swing.JButton jbtnAgregarLays5;
    private javax.swing.JButton jbtnAgregarLays6;
    private javax.swing.JButton jbtnAgregarLays7;
    private javax.swing.JButton jbtnAgregarLays8;
    private javax.swing.JButton jbtnAgregarLays9;
    private javax.swing.JButton jbtnCampo1;
    private javax.swing.JButton jbtnCampo2;
    private javax.swing.JButton jbtnCampo3;
    private javax.swing.JButton jbtnCampo4;
    private javax.swing.JButton jbtnCampo5;
    private javax.swing.JButton jbtnCampo6;
    private javax.swing.JButton jbtnCancelarC;
    private javax.swing.JButton jbtnCancelarD;
    private javax.swing.JButton jbtnCancelarE;
    private javax.swing.JButton jbtnCancelarH;
    private javax.swing.JButton jbtnEventos;
    private javax.swing.JButton jbtnPagos;
    private javax.swing.JButton jbtnQuejas;
    private javax.swing.JButton jbtnReservar;
    private javax.swing.JButton jbtnReservarCarrito;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<String> jcbxHFin;
    private javax.swing.JComboBox<String> jcbxHInicio;
    private javax.swing.JComboBox<String> jcbxNCampo1;
    private javax.swing.JComboBox<String> jcbxTDeporte;
    private javax.swing.JPanel jpEventos;
    private javax.swing.JPanel jpPagos;
    private javax.swing.JPanel jpQuejas;
    private javax.swing.JPanel jpReserva;
    private javax.swing.JTabbedPane jtbPaneles;
    private javax.swing.JTabbedPane jtbReserva;
    private javax.swing.JTable jtblCarrito;
    private javax.swing.JTextField jtxtCelular;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTotalPagar;
    private javax.swing.JPanel pCampos;
    private javax.swing.JPanel pCancha;
    private javax.swing.JPanel pDatoEncargado;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pEquipamiento;
    private javax.swing.JPanel pEquipamientos;
    private javax.swing.JPanel pHome;
    private javax.swing.JPanel pHorario;
    private javax.swing.JPanel pHorarios;
    // End of variables declaration//GEN-END:variables
}
