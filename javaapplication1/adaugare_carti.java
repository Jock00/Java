/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alexa
 */
public class adaugare_carti extends javax.swing.JFrame {

    /**
     * Creates new form adaugare_carti
     */
    public adaugare_carti() {
        initComponents();
    }
    private static int id=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nume carte");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Autor");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CNP user");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Imprumutare");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));

        jLabel7.setForeground(new java.awt.Color(255, 0, 51));

        jLabel8.setForeground(new java.awt.Color(255, 0, 51));

        jLabel9.setForeground(new java.awt.Color(255, 0, 51));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Returnare");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Inapoi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(257, 257, 257))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton1)
                        .addGap(114, 114, 114)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(61, 61, 61)))
                .addComponent(jButton3)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/test";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";
      //  private  String bookk=jTextField1.getText();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {

			insertRecordIntoTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private  void insertRecordIntoTable() throws SQLException {
           // jButton1.setToolTipText("Text you choose");
             jLabel6.setText(null);
              jLabel7.setText(null);
               jLabel8.setText(null);
               jLabel9.setText(null);
               jLabel4.setText(null);
               
            id++;
		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
		PreparedStatement preparedStatement1 = null;

		String insertTableSQL = "INSERT INTO rent"
				+ "(name_book,name_autor,cnp_person,date) VALUES"
				+ "(?,?,?,?)";
                String update = "update books set available=available-1 where id=?";
               // String existaUser = "SELECT user from user where id=?";
                
                
                

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);
                        preparedStatement1 = dbConnection.prepareStatement(update);
                        
                                       ResultSet rs = preparedStatement.executeQuery("SELECT * FROM books");
                                      
                                       int id_c=0;
                                       int id_a=0;
                                      int stoc=0;
                                      int cnp_valid=1;
                                       //int ok=0;
    while (rs.next()) {
              String name = rs.getString("name");

        if(jTextField1.getText().equals(rs.getString("name")))
        id_c=Integer.parseInt(rs.getString("id"));
        if(jTextField2.getText().equals(rs.getString("autor")))
        {
            id_a=Integer.parseInt(rs.getString("id"));
            stoc=Integer.parseInt(rs.getString("available"));
                    
        }
        
       // else
     // System.out.println(name);
     // System.out.println(name);
    }
    
    
     ResultSet rs1= preparedStatement.executeQuery("SELECT * FROM person");
                         int exist_person=0;
                  while(rs1.next())
                  {
                     // System.out.println(rs1.t());
                      if(jTextField3.getText().equals(rs1.getString("cnp")))
                          exist_person=1;
                  }
                        int verif=1;
                       
                       
                        if(id_c==0)
                        {
                            jLabel6.setText("Carte inexistenta !");
                            verif = 0; 
                        }
                        else jLabel6.setText(null);
                        if(id_a==0)
                           {
                             jLabel7.setText("Autor inexistent !");
                             verif=0; 
                           }
                        else jLabel7.setText(null);
                        
                        if(exist_person==0 || (jTextField3.getText().length()!=13))
                        {
                            jLabel8.setText("CNP incorect ! !");
                            verif=0;
                        }
                        else jLabel8.setText(null);
                        if(id_a!=id_c)
                             {
                             jLabel9.setText("Cartea si autorul nu corespund !");
                                  verif=0;
                              }
                        else 
                        {  jLabel9.setText(null);
                            if(stoc==0 && id_c==id_a)
                        {
                            jLabel4.setText("STOC INEXISTENT ! !");
                                  verif=0;
                        }}
                        jLabel4.setText(null);
                                if(verif==1){
                                    System.out.println("Row inserted !");
                                    System.out.println(id_c);
                            preparedStatement1.setInt(1, id_c);         
                                     
			preparedStatement.setString(1, jTextField1.getText());
                        preparedStatement.setString(2, jTextField2.getText());
			preparedStatement.setString(3, jTextField3.getText());
                        Date now = new Date();
        //Set date format as you want
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
       preparedStatement.setString(4,sf.format(now));
                 //  preparedStatement.setString(5,null);     
			//preparedStatement.setInt(4, 1);
                       // preparedStatement.setString(5, "da");
                       // preparedStatement1.setInt(1, 1);
			// execute insert SQL stetement
                        
			preparedStatement.executeUpdate();
                        preparedStatement1.executeUpdate();
			                // System.out.println(existaUser);
                                         
                        }
                 
            

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			//System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
                            DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
jButton1.setToolTipText("kk");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 Inceput frame_begin = new Inceput();
            frame_begin.setVisible(true);
            this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

            try {

			insertRecordIntoTable2();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	

	

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
             private  void insertRecordIntoTable2() throws SQLException {  
            jLabel4.setForeground(Color.red);
                                   jLabel4.setText(null);
		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
		PreparedStatement preparedStatement2 = null;
                String update = "update books set available=available+1 where id=?";
                 String update2 = "update rent set date_f=? where id_r=?";
               // String existaUser = "SELECT user from user where id=?";
                
                
                

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(update);
                       preparedStatement2 = dbConnection.prepareStatement(update2);
                        
                                       ResultSet rs = preparedStatement.executeQuery("SELECT * FROM rent");
                                      
                                       int valid = -1;
                                       int valid_cnp = -1;
                                       int valid_nume = -1;
                                       int valid_autor = -1;
                                       int valid_date = -1;
                                       //int ok=0;
    while (rs.next()) {
              String name = rs.getString("name_book");
              String autor=rs.getString("name_autor");
              String cnp = rs.getString("cnp_person");
              String date=rs.getString("date_f");
      if(name.equals(jTextField1.getText()) && autor.equals(jTextField2.getText()) && cnp.equals(jTextField3.getText()))
        
      {
          valid = Integer.parseInt(rs.getString("id_r"));
          if(date==null)
              valid_date = 1;
      }
      if(name.equals(jTextField1.getText()))
          valid_nume = 1;
      if(autor.equals(jTextField2.getText()))
          valid_autor = 1;
      if(cnp.equals(jTextField3.getText()))
          valid_cnp = 1;
       // else
     // System.out.println(name);
     // System.out.println(name);
    }
    if(valid_date==-1)
        jLabel4.setText("Cartea a fost deja returnata !");
    else jLabel4.setText(null);
    
    if(valid_nume==0)
        jLabel6.setText("Nume inexistent");
    else jLabel6.setText(null);
     if(valid_autor==0)
        jLabel7.setText("Autor inexistent");
    else jLabel7.setText(null);
      if(valid_cnp==0)
        jLabel8.setText("CNP inexistent");
    else jLabel8.setText(null);
                    System.out.println(valid_nume+" "+valid_autor+" "+valid_cnp+" "+valid);
                     if(valid_nume==1 && valid_autor==1 && valid_cnp==1 && valid==-1)
                         jLabel9.setText("Intrare invalida");
                     else jLabel9.setText(null);
                       
                    
                        
                                if(valid>=0 && valid_date==1){
                                   // System.out.println("Row inserted !");
                                   // System.out.println(id_c);
                                   jLabel4.setForeground(Color.black);
                                   jLabel4.setText("Cartea a fost returnata cu succes !");
                            preparedStatement.setInt(1, valid);         
                                     
			preparedStatement2.setInt(2, valid);
                        
                        
                        
                      //  preparedStatement2.setInt(2, valid);
                        Date now = new Date();
        //Set date format as you want
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
       preparedStatement2.setString(1,sf.format(now));
                 //  preparedStatement.setString(5,null);     
			//preparedStatement.setInt(4, 1);
                       // preparedStatement.setString(5, "da");
                       // preparedStatement1.setInt(1, 1);
			// execute insert SQL stetement
                        
			preparedStatement.executeUpdate();
                        preparedStatement2.executeUpdate();
			                // System.out.println(existaUser);
                                         
                        }
                 
            

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
             }
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
            java.util.logging.Logger.getLogger(adaugare_carti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adaugare_carti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adaugare_carti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adaugare_carti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adaugare_carti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
