

import Project.connectionProvider;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/*

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
public class Catalogue extends javax.swing.JFrame {
       
    /**
     * Creates new form Catalogue
     */
    public Catalogue() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookCatalogueTable = new javax.swing.JTable();
        refrechTableData = new javax.swing.JButton();
        deleteBook = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        titleBookCatalogue = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(980, 195));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(24, 27, 52));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookCatalogueTable.setBackground(new java.awt.Color(102, 102, 102));
        bookCatalogueTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookCatalogueTable.setForeground(new java.awt.Color(255, 255, 255));
        bookCatalogueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Author", "Publisher", "PublicationYear"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookCatalogueTable.setColumnSelectionAllowed(true);
        bookCatalogueTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(bookCatalogueTable);
        bookCatalogueTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (bookCatalogueTable.getColumnModel().getColumnCount() > 0) {
            bookCatalogueTable.getColumnModel().getColumn(0).setResizable(false);
            bookCatalogueTable.getColumnModel().getColumn(1).setResizable(false);
            bookCatalogueTable.getColumnModel().getColumn(2).setResizable(false);
            bookCatalogueTable.getColumnModel().getColumn(3).setResizable(false);
            bookCatalogueTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 710, 630));

        refrechTableData.setBackground(new java.awt.Color(48, 50, 78));
        refrechTableData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        refrechTableData.setForeground(new java.awt.Color(255, 255, 255));
        refrechTableData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_refresh_25px.png"))); // NOI18N
        refrechTableData.setText("Refresh");
        refrechTableData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrechTableDataActionPerformed(evt);
            }
        });
        jPanel2.add(refrechTableData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 840, 160, 40));

        deleteBook.setBackground(new java.awt.Color(48, 50, 78));
        deleteBook.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteBook.setForeground(new java.awt.Color(255, 255, 255));
        deleteBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_waste_25px.png"))); // NOI18N
        deleteBook.setText("Delete");
        deleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 830, 160, 40));

        jPanel3.setBackground(new java.awt.Color(48, 50, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBookCatalogue.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        titleBookCatalogue.setForeground(new java.awt.Color(255, 255, 255));
        titleBookCatalogue.setText("Book Catalogue");
        jPanel3.add(titleBookCatalogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 70));

        jButton1.setBackground(new java.awt.Color(48, 50, 78));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_search_25px_1.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 30));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 170, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 204)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 230, 320));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("image");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 70, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

      JPanel getJPanel2() {
          return jPanel2;
           }

    private void refrechTableDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrechTableDataActionPerformed
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
       
    }//GEN-LAST:event_refrechTableDataActionPerformed

    private void deleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookActionPerformed
        // The Delete Button
        // delete Button 
         // Get the selected row index
    int row = bookCatalogueTable.getSelectedRow();
    if (row == -1) {
      // No row was selected
      JOptionPane.showMessageDialog(null, "Please select a book to delete.", "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }
    // Confirm delete
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this book?", "Confirm", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.NO_OPTION) {
      return;
    }
    // Get the selected student ID
  
    // Delete the student from the database
    try{
    //int isbn = (int) jTable1.getValueAt(row, 0); // int casting causes error @Nassim
    String isbn = (String) bookCatalogueTable.getValueAt(row, 0);

    // Delete the student from the database
    Connection con=connectionProvider.getCon();
        Statement stmt = con.createStatement();
        String sql = "DELETE FROM book WHERE isbn = '" + isbn+"'";
      stmt.executeUpdate(sql);
    } catch (SQLException ex) {
      ex.printStackTrace();
      return;
    }
    
    // Delete the student from the table model
    DefaultTableModel model = (DefaultTableModel) bookCatalogueTable.getModel();
    model.removeRow(row);
  
    }//GEN-LAST:event_deleteBookActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Search button
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
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookCatalogueTable;
    private javax.swing.JButton deleteBook;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton refrechTableData;
    private javax.swing.JLabel titleBookCatalogue;
    // End of variables declaration//GEN-END:variables

  }
