/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author zerefweismann
 */
public class config {
    public static Connection con;
    public static Connection Con(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/stock_barang","root","dfjklap"); // ambil koneksi
            System.out.println("Koneksi Sukses");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
    public static void main(String[] args) {
        System.out.println(Con());
    }
    
}
