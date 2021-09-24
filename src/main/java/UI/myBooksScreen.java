/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import backend.AuthorManager;
import backend.BookManager;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Naritaa
 */
public class myBooksScreen extends javax.swing.JFrame {

    /**
     * Creates new form myBooksScreen
     */
    public myBooksScreen() {
        initComponents();
        setLocationRelativeTo(null);
        
        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<String>();
		String[] books = BookManager.getBookAsArray();
		for (int i = 0; i < books.length; i++) {
			comboModel.addElement(books[i]);
		}
		comboBox.setModel(comboModel);
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
        homeButton = new javax.swing.JButton();
        newBookButton = new javax.swing.JButton();
        myBooksButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        comboBox = new javax.swing.JList<>();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        viewButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FULLY BOOKED");

        homeButton.setBackground(new java.awt.Color(255, 153, 153));
        homeButton.setForeground(new java.awt.Color(0, 0, 0));
        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        newBookButton.setBackground(new java.awt.Color(255, 153, 153));
        newBookButton.setForeground(new java.awt.Color(0, 0, 0));
        newBookButton.setText("NEW BOOK");
        newBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookButtonActionPerformed(evt);
            }
        });

        myBooksButton.setBackground(new java.awt.Color(255, 153, 153));
        myBooksButton.setForeground(new java.awt.Color(0, 0, 0));
        myBooksButton.setText("MY BOOKS");
        myBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBooksButtonActionPerformed(evt);
            }
        });

        comboBox.setBackground(new java.awt.Color(204, 204, 255));
        comboBox.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        comboBox.setForeground(new java.awt.Color(0, 0, 0));
        comboBox.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(comboBox);

        deleteButton.setBackground(new java.awt.Color(255, 204, 102));
        deleteButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        displayArea.setEditable(false);
        displayArea.setBackground(new java.awt.Color(204, 204, 255));
        displayArea.setColumns(20);
        displayArea.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        displayArea.setForeground(new java.awt.Color(0, 0, 0));
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        viewButton.setBackground(new java.awt.Color(255, 204, 102));
        viewButton.setForeground(new java.awt.Color(0, 0, 0));
        viewButton.setText("VIEW");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(newBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(viewButton))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButton)
                    .addComponent(newBookButton)
                    .addComponent(myBooksButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new homeScreen().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void newBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBookButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new newBookScreen().setVisible(true);
    }//GEN-LAST:event_newBookButtonActionPerformed

    private void myBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBooksButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myBooksButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
       
        String book = (String)(comboBox.getSelectedValue());
        
        BookManager.deleteBook(book);
        displayArea.setText("");
        
        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<String>();
		String[] books = BookManager.getBookAsArray();
		for (int i = 0; i < books.length; i++) {
			comboModel.addElement(books[i]);
		}
		comboBox.setModel(comboModel);
         
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        String bookToView; 
        bookToView = (String)(comboBox.getSelectedValue());
        String book = BookManager.getBook(bookToView);
        displayArea.setText(book);
    }//GEN-LAST:event_viewButtonActionPerformed

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
            java.util.logging.Logger.getLogger(myBooksScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myBooksScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myBooksScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myBooksScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myBooksScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> comboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton myBooksButton;
    private javax.swing.JButton newBookButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
