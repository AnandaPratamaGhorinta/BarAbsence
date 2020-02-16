/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absenguru;

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
            String url="jdbc:sqlite:sekolah.sql"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    
}