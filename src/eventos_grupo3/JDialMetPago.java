/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos_grupo3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author kriz_
 */
public class JDialMetPago extends javax.swing.JDialog implements ItemListener, ActionListener, MouseWheelListener, InternalFrameListener{

    /**
     * Creates new form jDialMetPago
     */
    public JDialMetPago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        jCboMtdoPago.addItemListener(this);
        jBtnAceptar.addActionListener(this);
        jBtnCancelar.addActionListener(this);
        addMouseWheelListener(this);
        jTxfMtdoPago.setText(jCboMtdoPago.getItemAt(0));
        JMenuBar myMenuBar = new JMenuBar();
        JMenu myMenu = new JMenu("Opciones");
        JMenuItem myMenuItem = new JMenuItem("Ayuda");
        myMenu.add(myMenuItem);
        myMenuBar.add(myMenu);
        myMenuItem.addActionListener(this);
        this.setJMenuBar(myMenuBar);
    }
    int pos = 0;

    public String get_Msg() {
        return jTxfMtdoPago.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCboMtdoPago = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTxfMtdoPago = new javax.swing.JTextField();
        jBtnAceptar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione su método de pago:");

        jCboMtdoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de crédito", "Tarjeta de débito", "Paypal", "Efectivo" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Ha seleccionado:");

        jTxfMtdoPago.setEditable(false);
        jTxfMtdoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxfMtdoPagoActionPerformed(evt);
            }
        });

        jBtnAceptar.setText("Aceptar");

        jBtnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jBtnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jCboMtdoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxfMtdoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCboMtdoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxfMtdoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAceptar)
                    .addComponent(jBtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxfMtdoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxfMtdoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxfMtdoPagoActionPerformed

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
            java.util.logging.Logger.getLogger(JDialMetPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialMetPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialMetPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialMetPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialMetPago dialog = new JDialMetPago(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JComboBox<String> jCboMtdoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTxfMtdoPago;
    // End of variables declaration//GEN-END:variables

    @Override
    public void itemStateChanged(ItemEvent e) {
        int pos = jCboMtdoPago.getSelectedIndex();
        jTxfMtdoPago.setText(jCboMtdoPago.getItemAt(pos));
    }
    int count=0;
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(jBtnAceptar)) {
            dispose();
        } else if (o.equals(jBtnCancelar)) {
            jTxfMtdoPago.setText("");
            dispose();
        }
        count++;
        JInternalFrame f = new JInternalFrame("Frame "+count);
        f.setResizable(true);
        f.setClosable(true);
        f.setMaximizable(true);
        f.setIconifiable(true);
        f.setSize(280,200);
        f.addInternalFrameListener(this);
        f.setVisible(true);
        f.setLayout(new BorderLayout());
        JLabel label = new JLabel("Un Asesor lo atendera inmediatamente");
        f.add(label,BorderLayout.CENTER);
        jPanel2.add(f);
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

        int n = e.getWheelRotation();
        pos = pos + n;
        if (pos >= 0 && pos < jCboMtdoPago.getItemCount()) {
            jCboMtdoPago.setSelectedIndex(pos);
            jTxfMtdoPago.setText(jCboMtdoPago.getItemAt(pos));
        } else {
            if (pos >= jCboMtdoPago.getItemCount()) {
                pos = 3;
            } else if (pos < 0) {
                pos = 0;
            }
        }
    }

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        System.out.println("Internal frame opened");
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        System.out.println("Internal frame closing");
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        System.out.println("Internal frame closed");
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        System.out.println("Internal frame iconified");
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        System.out.println("Internal frame deiconified");
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
        System.out.println("Internal frame activated");
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        System.out.println("Internal frame deactivated");
    }
}
