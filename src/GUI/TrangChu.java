/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author Acer
 */
public class TrangChu extends javax.swing.JPanel {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_image = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(1000, 500));
        setLayout(null);

        lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/Tattered-Cover-2-767x500.jpg"))); // NOI18N
        add(lbl_image);
        lbl_image.setBounds(110, 140, 767, 500);

        lbl_title.setBackground(new java.awt.Color(255, 204, 51));
        lbl_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Hệ thống cửa hàng bán sách");
        add(lbl_title);
        lbl_title.setBounds(420, 10, 325, 32);

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon/java.png"))); // NOI18N
        add(lbl_logo);
        lbl_logo.setBounds(210, 0, 128, 128);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_title;
    // End of variables declaration//GEN-END:variables
}
