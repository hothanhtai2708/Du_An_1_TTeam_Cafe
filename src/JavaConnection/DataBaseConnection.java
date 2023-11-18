/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaConnection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author My MSI
 */
public class DataBaseConnection {
    public static Connection getConnection() {
        Connection c = null;
        try {
            // Đăng ký SQL Server Driver với DriverManager
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Thay "MSI" bằng địa chỉ IP hoặc tên máy chủ thực tế
            String url = "jdbc:sqlserver://MSI:1433;DatabaseName=qlBanCafe;encrypt=false;";
            String username = "sa";
            String password = "songlong";

            // Thiết lập kết nối đến cơ sở dữ liệu
            c = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return c;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Statement get() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
