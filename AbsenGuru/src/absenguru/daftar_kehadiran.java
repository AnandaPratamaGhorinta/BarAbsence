package absenguru;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;
import net.connectcode.Code128Auto;
public class daftar_kehadiran extends javax.swing.JFrame {

    public daftar_kehadiran() {
        initComponents();
        load_table();
        kosong();
    }
    
private void kosong(){
        isiNAMA.setText(null);
        isiNIP.setText(null);
        isiNOHP.setText(null);
        h.setText(null);
            s.setText(null);
                a.setText(null);
                    i.setText(null);
                barkode.setText(null);
                
   
    }
 private void load_table(){

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("nip");
        model.addColumn("nama");
        model.addColumn("nohp");
        model.addColumn("hadir");
        model.addColumn("sakit");
        model.addColumn("alpha");
        model.addColumn("izin");
        model.addColumn("kode_barcode");
        

        

        try {
            int no=1;
            String sql = "select * from tbl_absen_guru";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)});
            }
            tabel.setModel(model);
        } catch (Exception e) {
        }}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        isiNIP = new javax.swing.JTextField();
        isiNAMA = new javax.swing.JTextField();
        isiNOHP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        h = new javax.swing.JTextField();
        s = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        i = new javax.swing.JTextField();
        barkode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        barkode1 = new javax.swing.JTextField();
        scan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel10.setText("barcode");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabel.setBackground(new java.awt.Color(204, 255, 204));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setText("DAFTAR KEHADIRAN");

        jButton6.setText("add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("edit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        isiNIP.setBackground(new java.awt.Color(255, 255, 204));
        isiNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiNIPActionPerformed(evt);
            }
        });

        isiNAMA.setBackground(new java.awt.Color(255, 255, 204));
        isiNAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiNAMAActionPerformed(evt);
            }
        });

        isiNOHP.setBackground(new java.awt.Color(255, 255, 204));
        isiNOHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiNOHPActionPerformed(evt);
            }
        });

        jLabel2.setText("NIP");

        jLabel3.setText("NAMA");

        jLabel4.setText("NO HP");

        h.setBackground(new java.awt.Color(255, 255, 204));

        s.setBackground(new java.awt.Color(255, 255, 204));

        a.setBackground(new java.awt.Color(255, 255, 204));

        i.setBackground(new java.awt.Color(255, 255, 204));
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        barkode.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setText("H");

        jLabel6.setText("S");

        jLabel7.setText("A");

        jLabel8.setText("I");

        jLabel9.setText("BAR");

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        barkode1.setEditable(false);
        barkode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barkode1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barkode1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barkode1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        scan.setText("SCAN KARTU");
        scan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absenguru/PIH.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scan))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(11, 11, 11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(s, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                    .addComponent(h))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(barkode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(isiNOHP, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(isiNIP, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(isiNAMA))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(isiNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isiNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton7))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton8)
                            .addComponent(isiNOHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(barkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isiNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiNIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiNIPActionPerformed

    private void isiNAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiNAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiNAMAActionPerformed

    private void isiNOHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiNOHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiNOHPActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
try {
            String sql = "INSERT INTO tbl_absen_guru VALUES ('"+isiNIP.getText()+"','"+isiNAMA.getText()+"','"+isiNOHP.getText()+"','"+h.getText()+"','"+s.getText()+"','"+a.getText()+"','"+i.getText()+"','"+barkode.getText()+"')";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
   
        }     
            load_table();
        kosong();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
try {
                       String sql ="UPDATE tbl_absen_guru SET nip = '"+isiNIP.getText()+"', nama = '"+isiNAMA.getText()+"', nohp = '"+isiNOHP.getText()+"', hadir = '"+h.getText()+"' , sakit = '"+s.getText()+"' , alpha = '"+a.getText()+"' , izin = '"+i.getText()+"', kode_barcode = '"+barkode.getText()+"'  WHERE nip = '"+isiNIP.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        load_table();
        kosong();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
int baris = tabel.rowAtPoint(evt.getPoint());
        String nip =tabel.getValueAt(baris, 1).toString();
        isiNIP.setText(nip);
        String nama =tabel.getValueAt(baris, 2).toString();
        isiNAMA.setText(nama);
        String nohp =tabel.getValueAt(baris, 3).toString();
        isiNOHP.setText(nohp);
        String hadir =tabel.getValueAt(baris, 4).toString();
        h.setText(hadir);
        String sakit =tabel.getValueAt(baris, 5).toString();
        s.setText(sakit);
        String alpha =tabel.getValueAt(baris, 6).toString();
        a.setText(alpha);
        String izin =tabel.getValueAt(baris, 7).toString();
        i.setText(izin);
        
        String kode_barcode =tabel.getValueAt(baris, 8).toString();
        barkode.setText(kode_barcode);
    
        
          // TODO add your handling code here:
    }//GEN-LAST:event_tabelMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
try {
            String sql ="delete from tbl_absen_guru where nip='"+isiNIP.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();             // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Code128Auto code123=new Code128Auto();
String barcode=code123.encode(barkode.getText());
barkode1.setText(barcode);
barkode1.setFont(new java.awt.Font("CCode128_S3_Trial",java.awt.Font.PLAIN,24));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void scanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanActionPerformed
        new Absen().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_scanActionPerformed

    private void barkode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barkode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barkode1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
             String sql ="UPDATE tbl_absen_guru SET nip = '"+isiNIP.getText()+"', nama = '"+isiNAMA.getText()+"', nohp = '"+isiNOHP.getText()+"', hadir = '"+h.getText()+"' , sakit = '"+s.getText()+"' , alpha = '"+a.getText()+"' , izin = '"+i.getText()+"', kode_barcode = '"+barkode.getText()+"'  WHERE nip = '"+isiNIP.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
        }
        load_table();
        kosong();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(daftar_kehadiran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar_kehadiran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar_kehadiran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar_kehadiran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar_kehadiran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField barkode;
    private javax.swing.JTextField barkode1;
    private javax.swing.JTextField h;
    private javax.swing.JTextField i;
    private javax.swing.JTextField isiNAMA;
    private javax.swing.JTextField isiNIP;
    private javax.swing.JTextField isiNOHP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField s;
    private javax.swing.JButton scan;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
