/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Hafidz
 */
public class configDB {
    public static boolean isLogin = false;
    private static java.sql.Connection mysqlConfig;
    public static java.sql.Connection getKoneksi(){
        try {
            String url="jdbc:mysql://localhost/okky_db";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("Gagal Koneksi"+e.getMessage());
        }
        return mysqlConfig;
    }
}
