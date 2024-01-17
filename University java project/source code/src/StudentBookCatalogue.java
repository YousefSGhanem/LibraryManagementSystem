
import Project.connectionProvider;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/*

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
public class StudentBookCatalogue extends javax.swing.JFrame {

    /**
     * Creates new form StudentBookCatalogue
     */
    public StudentBookCatalogue() {
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
        bookCatalogueTable = new javax.swing.JTable();
        refreshTable = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        titleBookCatalogue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 27, 52));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookCatalogueTable.setBackground(new java.awt.Color(204, 204, 204));
        bookCatalogueTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookCatalogueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Author", "Publisher", "Publisher Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bookCatalogueTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 670, 680));

        refreshTable.setBackground(new java.awt.Color(48, 50, 78));
        refreshTable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        refreshTable.setForeground(new java.awt.Color(255, 255, 255));
        refreshTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_refresh_25px.png"))); // NOI18N
        refreshTable.setText("Refresh");
        refreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableActionPerformed(evt);
            }
        });
        jPanel1.add(refreshTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 860, 170, 40));

        jPanel3.setBackground(new java.awt.Color(48, 50, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBookCatalogue.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        titleBookCatalogue.setForeground(new java.awt.Color(255, 255, 255));
        titleBookCatalogue.setText("Book Catalogue");
        jPanel3.add(titleBookCatalogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 70));

        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 102, 204)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 230, 320));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, 30));

        jButton1.setBackground(new java.awt.Color(48, 50, 78));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_search_25px_1.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableActionPerformed
        // the refresh Button
        // the refresh Button

        try {
           System.out.println("1");
           Connection con=connectionProvider.getCon();
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT  isbn, title, author, publisher,publicationYear FROM lms.book");
           System.out.println("2");
       // 3. Create the table model
           DefaultTableModel model = new DefaultTableModel();

       // 4. Get the column names and add them to the model
           ResultSetMetaData meta = rs.getMetaData();
           int columnCount = meta.getColumnCount();
           for (int i = 1; i <= columnCount; i++) {
               model.addColumn(meta.getColumnName(i));
           }

       // 5. Add the rows to the model
           while (rs.next()) {
               Object[] row = new Object[columnCount];
               for (int i = 1; i <= columnCount; i++) {
               
                   row[i - 1] = rs.getString(i);  // fixes the problem that catalogue does not show the books 
                  }                               // due to the ISBN being a String and not an Integer  //@Nassim 
                model.addRow(row);
           }
           // 6. Set the model for the JTable
           bookCatalogueTable.setModel(model);
       }

        catch (SQLException e) {
            System.out.println("catch");
           e.printStackTrace();
       }
     ////////////////
         bookCatalogueTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            int selectedRow = bookCatalogueTable.getSelectedRow();
            if (selectedRow != -1) {
                String isbn = (String) bookCatalogueTable.getValueAt(selectedRow, 0);
                Connection con = connectionProvider.getCon();
                try {
                    PreparedStatement statement = con.prepareStatement("SELECT image FROM lms.book WHERE isbn=?");
                    statement.setString(1, isbn);
                    ResultSet rs = statement.executeQuery();
                    if (rs.next()) {
                        Blob imageBlob = rs.getBlob("image");
                        ImageIcon image = new ImageIcon(imageBlob.getBytes(1, (int) imageBlob.length()));
                        jLabel1.setIcon(image);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
});
        /*
        try {
            Connection con=connectionProvider.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT  isbn, title, author, publisher, publicationYear FROM book");
            // 3. Create the table model
            DefaultTableModel model = new DefaultTableModel();

            // 4. Get the column names and add them to the model
            ResultSetMetaData meta = rs.getMetaData();
            int columnCount = meta.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(meta.getColumnName(i));
            }

            // 5. Add the rows to the model
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getString(i); // added for the same reason mentioned in Catalogue.java Line: 190
                    /*
                    if (i == 1) {
                        row[i - 1] = rs.getInt(i);
                    }
                    else {
                        row[i - 1] = rs.getString(i);
                    }
                    
                }
                model.addRow(row);
            }

            // 6. Set the model for the JTable
            bookCatalogueTable.setModel(model);
            // close connection to database
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    }//GEN-LAST:event_refreshTableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // // Search button
         String searchValue = jTextField1.getText();
    // Create a row filter to search for the value
    TableRowSorter<TableModel> sorter = new TableRowSorter<>(bookCatalogueTable.getModel());
    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchValue));
    // Set the row sorter for the table
    bookCatalogueTable.setRowSorter(sorter);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentBookCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentBookCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentBookCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentBookCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                new StudentBookCatalogue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookCatalogueTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton refreshTable;
    private javax.swing.JLabel titleBookCatalogue;
    // End of variables declaration//GEN-END:variables

    JPanel getJPanel2() {
       return jPanel1;
    }
}
