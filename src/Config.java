/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FR_COMP
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    public static Connection mysqlconfig;
    static Connection configDB() throws SQLException {
        try{
            String url = "jdbc:mysql://localhost:3306/stok_barang";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("Koneksi gagal!" + e.getMessage());
        }
        return mysqlconfig;
    }
    
}
