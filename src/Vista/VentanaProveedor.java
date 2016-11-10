/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;

/**
 *
 * @author Santiago Gaviria Oliveros
 */
public class VentanaProveedor extends javax.swing.JFrame {

    /**
     * Creates new form VentanaProveedor
     */
    double valorOferta;
    String nickname;
    public VentanaProveedor(String nickname,double valorOferta) {
        initComponents();
        setLocationRelativeTo(this);
        this.getContentPane().setBackground(Color.WHITE);// Color de fondo de la ventana
        this.valorOferta = valorOferta;
        this.nickname = nickname;
        jLNombreProveedor.setText("Proveedor " + nickname);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNombreProveedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLNombreProveedor.setText("Proveedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jLNombreProveedor)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNombreProveedor)
                .addContainerGap(508, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLNombreProveedor;
    // End of variables declaration//GEN-END:variables
}
