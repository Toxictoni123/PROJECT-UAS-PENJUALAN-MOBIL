package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import control.koneksi;
import java.util.logging.Level;
import java.util.logging.Logger;

public class user {
    private String id;
    private String id_user;
    private String nm_user;
    private String hak_akses;
    private String password;
    koneksi db = null;

    public user(){
        try{
            db = new koneksi();
        } catch (ClassNotFoundException ex){
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getNm_user() {
        return nm_user;
    }

    public void setNm_user(String nm_user) {
        this.nm_user = nm_user;
    }

    public String getHak_akses() {
        return hak_akses;
    }

    public void setHak_akses(String hak_akses) {
        this.hak_akses = hak_akses;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public List LoginUser(String user, String password){
        List data = new ArrayList();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM user WHERE id_user='" + user + "'"
                    + " AND password='" + password + "'";
            rs = db.ambilData(sql);
            
            while (rs.next()){
                user am = new user();
                am.setId(rs.getString("id"));
                am.setId_user(rs.getString("id_user"));
                am.setPassword(rs.getString("password"));
                am.setHak_akses(rs.getString("hak_akses"));
                data.add(am);
            }
            db.diskonek(rs);
        } catch(Exception a){
            System.out.println("Terjadi Kesalahan Cari Login User, pada :\n" + a);
        }
        return data;
    }
}
