
package vista;

import hibernate.Factura;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import operaciones.Conexion;
import operaciones.Operaciones;


public class Facturacion extends javax.swing.JFrame implements Printable{

    Operaciones oper = new Operaciones();
    
    public Facturacion() {
        initComponents();
        this.setTitle("FACTURACION");
        //this.setLocation(500, 200);
        //para que se vea centrado
        //this.setLocationRelativeTo(this);
        //para que el usuario no pueda modificar la ventana
        //this.setResizable(false);
        //para que se vea en la pantalla completa
        this.setExtendedState(MAXIMIZED_BOTH);
        //para el tamaño del frame
        //this.setSize(1000, 600);
        //indicamos que la aplicacion finaliza al cerrar la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //para poner la fecha de la compu
        /*Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        txtFechaEntrada.setText(formato.format(sistFecha));
        //para poner la hora actual
        Calendar cal = Calendar.getInstance();
        String hora;
        System.out.println(cal.get(cal.MINUTE));
        if(cal.get(cal.MINUTE) < 10){
            String aux = "0"+cal.get(cal.MINUTE);
            hora = cal.get(cal.HOUR_OF_DAY)+":"+aux;
        }else{
            hora = cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE);
        }
        txtHoraEntrada.setText(hora);*/
        txtFechaEntrada.setEditable(false);
        txtFechaSalida.setEditable(false);
        txtHoraEntrada.setEditable(false);
        txtHoraSalida.setEditable(false);
        txtNroTicket.setEditable(false);
        txtNeto.setEditable(false);
        
        
    }

    public Facturacion(int nroFactura, String operador, String sr, String producto, String transp, String conductor, String patenteChasis, String patenteAcoplado, double pesoEntrada, 
                       double pesoSalida, double pesoNeto, String fechaEntrada, String horaEntrada, String fechaSalida, String horaSalida){
        
        initComponents();
        this.setTitle("FACTURACION");
        //this.setLocation(500, 200);
        //this.setLocationRelativeTo(this);
        this.setExtendedState(MAXIMIZED_BOTH);
        //para que el usuario no pueda modificar la ventana
        //this.setResizable(false);
        //para el tamaño del frame
        //this.setSize(1000, 600);
        //indicamos que la aplicacion finaliza al cerrar la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        txtNroTicket.setText(Integer.toString(nroFactura));
        comboOperador.setSelectedItem(operador);
        txtSr.setText(sr);
        txtProducto.setText(producto);
        txtTransp.setText(transp);
        txtConductor.setText(conductor);
        txtPatenteChasis.setText(patenteChasis);
        txtPatenteAcoplado.setText(patenteAcoplado);
        txtEntrada.setText(Double.toString(pesoEntrada));
        txtSalida.setText(Double.toString(pesoSalida));
        txtNeto.setText(Double.toString(pesoNeto));
        txtFechaEntrada.setText(fechaEntrada);
        txtHoraEntrada.setText(horaEntrada);
        txtFechaSalida.setText(fechaSalida);
        txtHoraSalida.setText(horaSalida);
    }
            
            
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFactura = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboOperador = new javax.swing.JComboBox<>();
        txtSr = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTransp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNroTicket = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtConductor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPatenteChasis = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPatenteAcoplado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSalida = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNeto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtFechaEntrada = new javax.swing.JTextField();
        txtFechaSalida = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtHoraEntrada = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCargarPesada = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFactura.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("******************************************************************************************************************");

        jLabel7.setText("Operador:");

        jLabel8.setText("Sr.:");

        comboOperador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        comboOperador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Jorge", "Mariano", "Kevin", "Bruno", "Otro" }));
        comboOperador.setBorder(null);
        comboOperador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboOperadorKeyPressed(evt);
            }
        });

        txtSr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSrKeyPressed(evt);
            }
        });

        jLabel9.setText("Producto:");

        txtProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductoKeyPressed(evt);
            }
        });

        jLabel10.setText("Transp.:");

        txtTransp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTransp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTranspKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("TICKET NRO.:");

        txtNroTicket.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNroTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroTicketActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("******************************************************************************************************************");

        jLabel13.setText("Conductor:");

        txtConductor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConductorKeyPressed(evt);
            }
        });

        jLabel14.setText("Patente Chasis:");

        txtPatenteChasis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPatenteChasis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatenteChasisKeyPressed(evt);
            }
        });

        jLabel15.setText("Patente Acoplado:");

        txtPatenteAcoplado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPatenteAcoplado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatenteAcopladoKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("******************************************************************************************************************");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Entrada:");

        txtEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEntradaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntradaKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Salida:");

        txtSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalidaKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("*******************************");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Neto:");

        txtNeto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Kg.");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Kg.");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Kg.");

        jLabel24.setText("Fecha:");

        jLabel25.setText("Fecha:");

        jLabel26.setText("-");

        jLabel27.setText("-");

        jLabel28.setText("Hs.");

        jLabel29.setText("Hs.");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCargarPesada.setText("Calcular Neto");
        btnCargarPesada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPesadaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
        panelFactura.setLayout(panelFacturaLayout);
        panelFacturaLayout.setHorizontalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20))
                                .addGap(38, 38, 38)
                                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEntrada)
                                    .addComponent(txtSalida)
                                    .addComponent(txtNeto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addGroup(panelFacturaLayout.createSequentialGroup()
                                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel22))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFechaSalida)
                                            .addComponent(txtFechaEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27))
                                        .addGap(4, 4, 4)
                                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                                .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel28))
                                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                                .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel29)))
                                        .addGap(92, 92, 92))))
                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFacturaLayout.createSequentialGroup()
                                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFacturaLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTransp))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFacturaLayout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtProducto))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFacturaLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSr))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFacturaLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(199, 199, 199)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNroTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelFacturaLayout.createSequentialGroup()
                                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFacturaLayout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPatenteChasis))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFacturaLayout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(178, 178, 178)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPatenteAcoplado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(131, 131, 131))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(186, 186, 186))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(173, 173, 173)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCargarPesada, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(254, 254, 254))))
        );
        panelFacturaLayout.setVerticalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCargarPesada)
                    .addComponent(btnBuscar))
                .addGap(49, 49, 49)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnImprimir)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNroTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPatenteChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtPatenteAcoplado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(28, 28, 28)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24)
                    .addComponent(txtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("BALANZA PÙBLICA \"LOS RUSOS\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(comboOperador.getSelectedItem().toString().equals("Seleccione") || txtSr.getText().equals("") || txtProducto.getText().equals("") || txtTransp.getText().equals("") 
          || txtConductor.getText().equals("") || txtPatenteChasis.getText().equals("") || txtPatenteAcoplado.getText().equals("") || txtEntrada.getText().equals("")){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe completar todos los campos!\n", "ADVERTENCIA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            if(txtNroTicket.getText().equals("")){
                if(txtSalida.getText().equals("")){
                    txtSalida.setText("0.0");
                    txtNeto.setText("0.0");
                }
                Factura fac = new Factura(comboOperador.getSelectedItem().toString(), txtSr.getText(), txtProducto.getText(), txtTransp.getText(), txtConductor.getText(),
                                          txtPatenteChasis.getText(), txtPatenteAcoplado.getText(), Double.parseDouble(txtEntrada.getText()) , Double.parseDouble(txtSalida.getText()), 
                                          Double.parseDouble(txtNeto.getText()), txtFechaEntrada.getText(), txtHoraEntrada.getText(), txtFechaSalida.getText(), txtHoraSalida.getText());
                try{               
                    oper.guardarFactura(fac);
                    javax.swing.JOptionPane.showMessageDialog(this, "¡¡Factura guardada!!\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    
                    if(Double.parseDouble(txtSalida.getText()) > 0.0){
                        List<Factura> lista = oper.listaFactura();
                        int i = lista.size()-1;
                        txtNroTicket.setText(lista.get(i).getIdFactura().toString());
                        //Facturacion f = new Facturacion();
                        //f.setVisible(true);
                        //f.txtNroTicket.setText(lista.get(i).getIdFactura().toString());
                        
                    }else {
                        txtSr.setText("");
                        txtProducto.setText("");
                        txtTransp.setText("");
                        txtConductor.setText("");
                        txtPatenteChasis.setText("");
                        txtPatenteAcoplado.setText("");
                        txtEntrada.setText("");
                        txtSalida.setText("");
                        txtNeto.setText("");
                        txtFechaSalida.setText("");
                        txtHoraSalida.setText("");
                        comboOperador.setSelectedItem("Seleccione");
                    }
                    
                } catch (Exception ex) {
                    Logger.getLogger(Facturacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            } else{
                //javax.swing.JOptionPane.showMessageDialog(this, "Si la factura esta completa debe presionar el boton Guardar Fac Terminada!\n", "ADVERTENCIA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                Factura f = new Factura(Integer.parseInt(txtNroTicket.getText()), (String) comboOperador.getSelectedItem(), txtSr.getText(), txtProducto.getText(), txtTransp.getText(), txtConductor.getText(), txtPatenteChasis.getText(),
                txtPatenteAcoplado.getText(), Double.parseDouble(txtEntrada.getText()), Double.parseDouble(txtSalida.getText()), Double.parseDouble(txtNeto.getText()),
                txtFechaEntrada.getText(), txtHoraEntrada.getText(), txtFechaSalida.getText(), txtHoraSalida.getText());
                oper.actualizarFactura(f);
                JOptionPane.showMessageDialog(null, "¡Factura guardada correctamente!");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    //Para que haga salto de linea con enter
    private void comboOperadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboOperadorKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            txtSr.requestFocus();
        }
            
    }//GEN-LAST:event_comboOperadorKeyPressed

    private void txtSrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSrKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            txtProducto.requestFocus();
        }
    }//GEN-LAST:event_txtSrKeyPressed

    private void txtProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            txtTransp.requestFocus();
        }
    }//GEN-LAST:event_txtProductoKeyPressed

    private void txtTranspKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTranspKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            txtConductor.requestFocus();
        }
    }//GEN-LAST:event_txtTranspKeyPressed

    private void txtConductorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConductorKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            txtPatenteChasis.requestFocus();
        }
    }//GEN-LAST:event_txtConductorKeyPressed

    private void txtPatenteChasisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatenteChasisKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            txtPatenteAcoplado.requestFocus();
        }
    }//GEN-LAST:event_txtPatenteChasisKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCargarPesadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPesadaActionPerformed
        
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.00", dfs);
        
        if(txtEntrada.getText().equals("") || txtSalida.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe completar el peso de entrada y salida!\n", "ADVERTENCIA", javax.swing.JOptionPane.INFORMATION_MESSAGE);  
        }else{
            if(Double.parseDouble(txtEntrada.getText()) < Double.parseDouble(txtSalida.getText())){
                txtNeto.setText(String.valueOf(df.format(Double.parseDouble(txtSalida.getText()) - Double.parseDouble(txtEntrada.getText()))));
                Date sistFecha = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
                txtFechaSalida.setText(formato.format(sistFecha));
                Calendar cal = Calendar.getInstance();
                String hora;
                hora = cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE);
                txtHoraSalida.setText(hora);
            }else{
                txtNeto.setText(String.valueOf(df.format(Double.parseDouble(txtEntrada.getText()) - Double.parseDouble(txtSalida.getText()))));
                Date sistFecha = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
                txtFechaSalida.setText(formato.format(sistFecha));
                Calendar cal = Calendar.getInstance();
                String hora;
                hora = cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE);
                txtHoraSalida.setText(hora);
            }
        }
        
        /*double peso = 0;
        peso = oper.peso();
          
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.00", dfs);
                
        if(txtEntrada.getText().equals("") || Double.parseDouble(txtEntrada.getText()) == 0.0){
            txtEntrada.setText(String.valueOf(df.format(peso)));
            txtSalida.setText("0.0");
            txtNeto.setText("0.0");
            txtFechaSalida.setText("--");
            txtHoraSalida.setText("--");
            
        }else{
            if(txtSalida.getText().equals("") || Double.parseDouble(txtSalida.getText()) == 0.0){
                txtSalida.setText(String.valueOf(df.format(peso)));
                double entrada = Double.parseDouble(txtEntrada.getText());
                double salida = Double.parseDouble(txtSalida.getText());
                if(entrada < salida){
                    txtNeto.setText(String.valueOf(df.format(salida - entrada)));
                    Date sistFecha = new Date();
                    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
                    txtFechaSalida.setText(formato.format(sistFecha));
                    Calendar cal = Calendar.getInstance();
                    String hora;
                    hora = cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE);
                    txtHoraSalida.setText(hora);
                }else{
                    txtNeto.setText(String.valueOf(df.format(entrada - salida)));
                    Date sistFecha = new Date();
                    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
                    txtFechaSalida.setText(formato.format(sistFecha));
                    Calendar cal = Calendar.getInstance();
                    String hora;
                    hora = cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE);
                    txtHoraSalida.setText(hora);
                }
            }else
                javax.swing.JOptionPane.showMessageDialog(this, "Ya tiene cargadas las dos pesadas!\n", "ADVERTENCIA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }*/
        
    }//GEN-LAST:event_btnCargarPesadaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        List<Factura> lista = oper.listaFactura();
        if(lista.size() == 0)
            javax.swing.JOptionPane.showMessageDialog(this, "No hay facturas guardadas!\n", "ADVERTENCIA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        else{
            Facturas f = new Facturas();
            f.setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
        if(txtNroTicket.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Factura no lista para imprimir!\n", "ADVERTENCIA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else {
            try {
                Conexion con = new Conexion();
                Connection conn = con.getConexion();
                JasperReport reporte = null;
                //InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("reportes/reporte.jasper");
                //reporte = (JasperReport) JRLoader.loadObject(is);
                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reporte.jasper"));
                Map parametro = new HashMap();
                parametro.put("id_factura", Integer.parseInt(txtNroTicket.getText()));
                JasperPrint jp = JasperFillManager.fillReport(reporte, parametro, conn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setTitle("IMPRIMIR FACTURA");
                jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                jv.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(Facturacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            //dispose();
            
        }       
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtNroTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroTicketActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNroTicket.setText("");
        txtSr.setText("");
        txtProducto.setText("");
        txtTransp.setText("");
        txtConductor.setText("");
        txtPatenteChasis.setText("");
        txtPatenteAcoplado.setText("");
        txtEntrada.setText("");
        txtSalida.setText("");
        txtNeto.setText("");
        txtFechaSalida.setText("");
        txtHoraSalida.setText("");
        comboOperador.setSelectedItem("Seleccione");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtPatenteAcopladoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatenteAcopladoKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            txtEntrada.requestFocus();
        }
    }//GEN-LAST:event_txtPatenteAcopladoKeyPressed

    private void txtEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            txtSalida.requestFocus();
        }
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        txtFechaEntrada.setText(formato.format(sistFecha));
        //para poner la hora actual
        Calendar cal = Calendar.getInstance();
        String hora;
        
        if(cal.get(cal.MINUTE) < 10){
            String aux = "0"+cal.get(cal.MINUTE);
            hora = cal.get(cal.HOUR_OF_DAY)+":"+aux;
        }else{
            hora = cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE);
        }
        txtHoraEntrada.setText(hora);
    }//GEN-LAST:event_txtEntradaKeyPressed

    private void txtEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEntradaKeyTyped

    private void txtSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalidaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSalidaKeyTyped

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Conexion c = new Conexion();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturacion().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargarPesada;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboOperador;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JTextField txtConductor;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtFechaEntrada;
    private javax.swing.JTextField txtFechaSalida;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtNeto;
    private javax.swing.JTextField txtNroTicket;
    private javax.swing.JTextField txtPatenteAcoplado;
    private javax.swing.JTextField txtPatenteChasis;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSalida;
    private javax.swing.JTextField txtSr;
    private javax.swing.JTextField txtTransp;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics g, PageFormat pf, int index) throws PrinterException {
        if(index > 0){
            return NO_SUCH_PAGE;
        }
        Graphics2D gra = (Graphics2D) g;
        gra.translate(pf.getImageableX() + 30, pf.getImageableY() + 30);
        gra.scale(0.65, 0.65);
        panelFactura.printAll(g);
        return PAGE_EXISTS;
    }
}
