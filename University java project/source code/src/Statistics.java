import java.sql.*;
import Project.connectionProvider;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Moahamad Moaqaly 
 * matriculation number: 1310757
 * *************
 * @author Yousef Ghanem 
 * matriculation number: 1310760
 * *+***********
 * @author Nassim Laaraj
 * matriculation number: 1366099
 * 
 *  @author Javiel Figuereo Schade
 * matriculation number: 1324563
 */
public class Statistics extends javax.swing.JFrame {

    /**
     * Creates new form Statistics
     */
    public Statistics() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        issueDetailsTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReturnDetailTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        titleStatistics = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        titleReturnDetails = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        titleIssueDetails = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(980, 195));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 27, 52));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        issueDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(issueDetailsTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 970, 167));

        ReturnDetailTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ReturnDetailTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 970, 167));

        jPanel2.setBackground(new java.awt.Color(24, 27, 52));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 970, 167));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 970, 167));

        jPanel4.setBackground(new java.awt.Color(48, 50, 78));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleStatistics.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        titleStatistics.setForeground(new java.awt.Color(255, 255, 255));
        titleStatistics.setText("Statistics");
        jPanel4.add(titleStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 70));

        jPanel3.setBackground(new java.awt.Color(48, 50, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleReturnDetails.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleReturnDetails.setForeground(new java.awt.Color(255, 255, 255));
        titleReturnDetails.setText("Return Details");
        jPanel3.add(titleReturnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1000, 60));

        jPanel6.setBackground(new java.awt.Color(48, 50, 78));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleIssueDetails.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleIssueDetails.setForeground(new java.awt.Color(255, 255, 255));
        titleIssueDetails.setText("Issue Details");
        jPanel6.add(titleIssueDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1000, 60));

        refresh.setBackground(new java.awt.Color(48, 50, 78));
        refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_refresh_25px.png"))); // NOI18N
        refresh.setText("Refrash");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel2.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 790, 150, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1000));

        jPanel5.setBackground(new java.awt.Color(48, 50, 78));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Issue Details");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1000, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formComponentShown

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // The Refrash Button
         try{
            Connection con=connectionProvider.getCon();
            Statement st=con.createStatement();
            
            ResultSet rs =st.executeQuery("SELECT issue1.isbn, student.name, issue1.isbn, book.title, issue1.issueDate, issue1.dueDate \n" +"FROM student \n" +"INNER JOIN issue1 ON student.studentID = issue1.studentID \n" +"INNER JOIN book ON book.isbn = issue1.isbn \n" +"WHERE issue1.returnBook = 'No';");
            ReturnDetailTable.setModel(DbUtils.resultSetToTableModel(rs));
            ResultSet rs1=st.executeQuery("SELECT issue1.isbn, student.name, issue1.isbn, book.title, issue1.issueDate, issue1.dueDate \n" +"FROM student \n" +"INNER JOIN issue1 ON student.studentID = issue1.studentID \n" +"INNER JOIN book ON book.isbn = issue1.isbn \n" +"WHERE issue1.returnBook = 'Yes'");
            issueDetailsTable.setModel(DbUtils.resultSetToTableModel(rs1));
            
            // close connection to database
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection Error");
        }
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReturnDetailTable;
    private javax.swing.JTable issueDetailsTable;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel titleIssueDetails;
    private javax.swing.JLabel titleReturnDetails;
    private javax.swing.JLabel titleStatistics;
    // End of variables declaration//GEN-END:variables

    JPanel getJPanel2() {
        return jPanel1;
    }
}
