package app;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author T490S
 */


public class updateAlternatif extends javax.swing.JDialog {

    private String biaya;
    private String keandalan;
    private String kecepatan;
    private String cakupanWilayah;
    private String kualitas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlternatif() {
        return Alternatif;
    }

    public void setAlternatif(String Alternatif) {
        this.Alternatif = Alternatif;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String Biaya) {
        this.biaya = Biaya;
    }

    public String getKeandalan() {
        return keandalan;
    }

    public void setKeandalan(String Keandalan) {
        this.keandalan = Keandalan;
    }

   public String getKecepatan() {
    return kecepatan;
}

public void setKecepatan(String kecepatan) {
    this.kecepatan = kecepatan;
}

public String getCakupanWilayah() {
    return cakupanWilayah;
}

public void setCakupanWilayah(String cakupanWilayah) {
    this.cakupanWilayah = cakupanWilayah;
}

public String getKualitas() {
    return kualitas;
}

public void setKualitas(String kualitas) {
    this.kualitas = kualitas;
}
    /**
     * Creates new form updateAlternatif
     */

    int id;
    String Alternatif;
    String Biaya;
    String Keandalan;
    String Kecepatan;
    String CakupanWilayah;
    String Kualitas;
    
    public updateAlternatif(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        setTitle("Update Data Alternatif");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNamaAlternatif = new javax.swing.JTextField();
        txtbiaya = new javax.swing.JTextField();
        txtkeandalan = new javax.swing.JTextField();
        txtkecepatan = new javax.swing.JTextField();
        txtcakupanwilayah = new javax.swing.JTextField();
        txtkualitas = new javax.swing.JTextField();
        btnUpdateAlternatif = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nama alternatif");

        jLabel2.setText("Kualitas");

        jLabel3.setText("Biaya");

        jLabel4.setText("Keandalan");

        jLabel5.setText("Kecepatan");

        jLabel6.setText("Cakupan Wilayah");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("UPDATE DATA ALTERNATIF");

        btnUpdateAlternatif.setText("Update");
        btnUpdateAlternatif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAlternatifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(txtNamaAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(txtbiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(txtkeandalan, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(txtkecepatan, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(txtcakupanwilayah, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(txtkualitas, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(btnUpdateAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNamaAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtbiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkeandalan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtkecepatan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcakupanwilayah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtkualitas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(btnUpdateAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateAlternatifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAlternatifActionPerformed
        // TODO add your handling code here:
        try {
            
            String alternatif = txtNamaAlternatif.getText();
            String biaya = txtbiaya.getText();
            double biaya1 = Double.parseDouble(biaya);
            String keandalan = txtkeandalan.getText();
            double keandalan1 = Double.parseDouble(keandalan);
            String kecepatan = txtkecepatan.getText();
            double kecepatan1 = Double.parseDouble(kecepatan);
            String cakupanWilayah = txtcakupanwilayah.getText();
            double cakupanWilayah1 = Double.parseDouble(cakupanWilayah);
            String kualitas = txtkualitas.getText();
            double kualitas1 = Double.parseDouble(kualitas);

           String q = "UPDATE alternatif "
           + "set alternatif='"+alternatif+"', "
           + "biaya="+biaya1+", "
           + "keandalan="+keandalan1+","
           + "kecepatan="+kecepatan1+","
           + "cakupan_wilayah="+cakupanWilayah1+","
           + "kualitas="+kualitas1+" "
           + "WHERE id="+getId()+";";

            Connection koneksi = Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            st.executeUpdate(q);
            Main.loadDataAlternatif();
//            String kriteria_ = txtNamaKriteria.getText();
//            String bobot_ = txtBobot.getText();
//            double d = Double.parseDouble(bobot_);
//            Object label_ = cmbLabel.getSelectedItem();
//            String L = String.valueOf(label_);
//            String q = "UPDATE kriteria "
//                    + "set kriteria='"+kriteria_+"', "
//                    + "bobot="+d+", "
//                    + "label='"+L+"' "
//                    + "WHERE id="+getId()+"";//query = ready
//            Connection koneksi = Koneksi.konekKeDB();
//            Statement st = koneksi.createStatement();
//            st.executeUpdate(q);
//            Main.loadDataKriteria();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUpdateAlternatifActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtNamaAlternatif.setText(getAlternatif());
        txtbiaya.setText(getBiaya());
        txtkeandalan.setText(getKeandalan());
        txtkecepatan.setText(getKecepatan());
        txtcakupanwilayah.setText(getCakupanWilayah());
        txtkualitas.setText(getKualitas());

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(updateAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateAlternatif dialog = new updateAlternatif(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnUpdateAlternatif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtNamaAlternatif;
    private javax.swing.JTextField txtbiaya;
    private javax.swing.JTextField txtcakupanwilayah;
    private javax.swing.JTextField txtkeandalan;
    private javax.swing.JTextField txtkecepatan;
    private javax.swing.JTextField txtkualitas;
    // End of variables declaration//GEN-END:variables
}
