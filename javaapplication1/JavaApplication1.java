/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
/**
 *
 * @author alexa
 */

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       // JFrame.setDefaultLookAndFeelDecorated(true);
        Inceput showFrame = new Inceput();
          showFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // showFrame.setLocation(500,250); 
        //  showFrame.pack();
        showFrame.setSize(800, 500);
        showFrame.setVisible(true);
        // TODO code application logic here
  
	}

}