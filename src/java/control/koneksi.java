package control;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksi {
    Connection conn=null;
    public Statement stmt=null;
    ResultSet rs;
    
    public koneksi() throws ClassNotFoundException {
        String dbName = "penjualan_mobil";
        String uName = "root";
        String pass = "";
        String URL = "jdbc:mysql://localhost/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        try {
            conn = DriverManager.getConnection(URL, uName, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    public koneksi(String dbName, String uName, String pass) throws ClassNotFoundException {
        String URL ="jdbc:mysql://localhost/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        try{
            conn = DriverManager.getConnection(URL, uName, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    public void close() throws  SQLException{
        conn.close();
        stmt.close();
    }

    
}
