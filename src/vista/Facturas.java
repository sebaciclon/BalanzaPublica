
package vista;

import hibernate.Factura;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import operaciones.Operaciones;


public class Facturas extends javax.swing.JFrame {

    Operaciones oper = new Operaciones();
    DefaultTableModel modelo;
    
    public Facturas() {
        initComponents();
        this.setTitle("FACTURAS");
        //this.setLocation(500, 200);
        //para que se vea centrado
        //this.setLocationRelativeTo(this);
        this.setExtendedState(MAXIMIZED_BOTH);
        //para que el usuario no pueda modificar la ventana
        //this.setResizable(false);
        //para el tamaño del frame
        //this.setSize(800, 600);
        //indicamos que la aplicacion finaliza al cerrar la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        List<Factura> listaFacturas = oper.listaFactura();
        comboDesde.addItem(listaFacturas.get(0).getFechaEntrada());
        for(int i = 1; i < listaFacturas.size(); i ++){
            if(listaFacturas.get(i-1).getFechaEntrada().equals(listaFacturas.get(i).getFechaEntrada())){
            } else{
                comboDesde.addItem(listaFacturas.get(i).getFechaEntrada());
            }
        }
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Factura");
        modelo.addColumn("Operador");
        modelo.addColumn("Sr.");
        modelo.addColumn("Producto");
        modelo.addColumn("Transp.");
        modelo.addColumn("Conductor");
        modelo.addColumn("Patente Chasis");
        modelo.addColumn("Patente Acoplado");
        modelo.addColumn("Peso Entrada");
        modelo.addColumn("Peso Salida");
        modelo.addColumn("Peso Neto");
        modelo.addColumn("Fecha Entrada");
        modelo.addColumn("Hora Entrada");
        modelo.addColumn("Fecha Salida");
        modelo.addColumn("Hora Salida");
        tablaFacturas.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboDesde = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFacturas = new javax.swing.JTable();
        btnSeleccion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar factura:");

        jLabel2.setText("Fecha:");

        comboDesde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Factura", "Operador", "Sr", "Producto", "Transp.", "Conductor", "Patente Chasis", "Patente Acoplado", "Peso Entrada", "Peso Salida", "Peso Neto", "Fecha Entrada", "Hora Entrada", "Fecha Salida", "Hora Salida"
            }
        ));
        jScrollPane1.setViewportView(tablaFacturas);

        btnSeleccion.setText("Seleccionar");
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnSeleccion)
                .addGap(170, 170, 170)
                .addComponent(btnEliminar)
                .addGap(93, 93, 93)
                .addComponent(btnSalir)
                .addContainerGap(261, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(comboDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnSeleccion)
                    .addComponent(btnSalir)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        int filas = modelo.getRowCount();
        for(int i = 0; i < filas; i++){
            modelo.removeRow(0);
        }
        
        if(comboDesde.getSelectedIndex() == 0 ){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha de bùsqueda\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else{
            String desde = comboDesde.getSelectedItem().toString();
            
            List<Factura> lista = oper.listaFactura();
            if(lista == null){
                javax.swing.JOptionPane.showMessageDialog(this, "No hay facturas cargadas\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else {
                for(int i = 0; i < lista.size(); i++){
                    
                    String aux = lista.get(i).getFechaEntrada();
                    
                    if(desde.equals(aux)){
                            Object[] fila = new Object[15];
                            fila[0] = lista.get(i).getIdFactura();
                            fila[1] = lista.get(i).getOperador();
                            fila[2] = lista.get(i).getSr();
                            fila[3] = lista.get(i).getProducto();
                            fila[4] = lista.get(i).getTransp();
                            fila[5] = lista.get(i).getConductor();
                            fila[6] = lista.get(i).getPatenteChasis();
                            fila[7] = lista.get(i).getPatenteAcoplado();
                            fila[8] = lista.get(i).getPesoEntrada();
                            fila[9] = lista.get(i).getPesoSalida();
                            fila[10] = lista.get(i).getPesoNeto();
                            fila[11] = lista.get(i).getFechaEntrada();
                            fila[12] = lista.get(i).getHoraEntrada();
                            fila[13] = lista.get(i).getFechaSalida();
                            fila[14] = lista.get(i).getHoraSalida();
                            modelo.addRow(fila);
                    }
                   
                }
            }
           
        
        }
        
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        
        int filaSeleccionada = tablaFacturas.getSelectedRow();

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "No a seleccionado ninguna factura!\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            int nroFactura = (int) tablaFacturas.getValueAt(filaSeleccionada, 0);
            String operador = tablaFacturas.getValueAt(filaSeleccionada, 1).toString();
            String sr = tablaFacturas.getValueAt(filaSeleccionada, 2).toString();
            String producto = tablaFacturas.getValueAt(filaSeleccionada, 3).toString();
            String transp = tablaFacturas.getValueAt(filaSeleccionada, 4).toString();
            String conductor = tablaFacturas.getValueAt(filaSeleccionada, 5).toString();
            String patenteChasis = tablaFacturas.getValueAt(filaSeleccionada, 6).toString();
            String patenteAcoplado = tablaFacturas.getValueAt(filaSeleccionada, 7).toString();
            Double pesoEntrada = (Double) tablaFacturas.getValueAt(filaSeleccionada, 8);
            Double pesoSalida = (Double) tablaFacturas.getValueAt(filaSeleccionada, 9);
            Double pesoNeto = (Double) tablaFacturas.getValueAt(filaSeleccionada, 10);
            String fechaEntrada = tablaFacturas.getValueAt(filaSeleccionada, 11).toString();
            String horaEntrada = tablaFacturas.getValueAt(filaSeleccionada, 12).toString();
            String fechaSalida = tablaFacturas.getValueAt(filaSeleccionada, 13).toString();
            String horaSalida = tablaFacturas.getValueAt(filaSeleccionada, 14).toString();
            
            Facturacion1 f = new Facturacion1(nroFactura, operador, sr, producto, transp, conductor, patenteChasis, patenteAcoplado, pesoEntrada, pesoSalida,
                                            pesoNeto, fechaEntrada, horaEntrada, fechaSalida, horaSalida);
            
            
            f.setVisible(true);
            dispose();
            
        }
    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int filaSeleccionada = tablaFacturas.getSelectedRow();

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "No a seleccionado ninguna factura para eliminar\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            Factura a = new Factura();
            a.setIdFactura((int) tablaFacturas.getValueAt(filaSeleccionada, 0));
            a.setOperador(tablaFacturas.getValueAt(filaSeleccionada, 1).toString());
            a.setSr(tablaFacturas.getValueAt(filaSeleccionada, 2).toString());
            a.setProducto(tablaFacturas.getValueAt(filaSeleccionada, 3).toString());
            a.setTransp(tablaFacturas.getValueAt(filaSeleccionada, 4).toString());
            a.setConductor(tablaFacturas.getValueAt(filaSeleccionada, 6).toString());
            a.setPatenteChasis(tablaFacturas.getValueAt(filaSeleccionada, 7).toString());
            a.setPatenteAcoplado(tablaFacturas.getValueAt(filaSeleccionada, 8).toString());
            a.setPesoEntrada((Double) tablaFacturas.getValueAt(filaSeleccionada, 9));
            a.setPesoSalida((Double) tablaFacturas.getValueAt(filaSeleccionada, 9));
            a.setPesoNeto((Double) tablaFacturas.getValueAt(filaSeleccionada, 9));
            a.setFechaEntrada(tablaFacturas.getValueAt(filaSeleccionada, 10).toString());
            a.setHoraEntrada(tablaFacturas.getValueAt(filaSeleccionada, 10).toString());
            a.setFechaSalida(tablaFacturas.getValueAt(filaSeleccionada, 10).toString());
            a.setHoraSalida(tablaFacturas.getValueAt(filaSeleccionada, 10).toString());
            oper.eliminar(a);
            javax.swing.JOptionPane.showMessageDialog(this, "Factura eliminada de la base de datos\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            modelo.removeRow(filaSeleccionada);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JComboBox<String> comboDesde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFacturas;
    // End of variables declaration//GEN-END:variables
}
