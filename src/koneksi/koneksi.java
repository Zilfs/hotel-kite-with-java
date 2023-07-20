/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author Hirzi
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    Connection koneksi;
    
    public static Connection Koneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/hotel-pp","root","");
            
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
}
