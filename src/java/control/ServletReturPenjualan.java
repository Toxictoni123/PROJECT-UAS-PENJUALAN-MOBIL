package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.retur_penjualan;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServletReturPenjualan extends pesan {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String no_retur = request.getParameter("no_retur");
            String tgl = request.getParameter("tgl");
            String total = request.getParameter("total");
            String no_jual = request.getParameter("no_jual"); 
            String kd_mobil = request.getParameter("kd_mobil");
            String aksi = request.getParameter("aksi");
            String sql = "";
            String sql2 = "";
            
            switch(aksi){
                case "Delete":
                        sql = "DELETE FROM sementara2 WHERE kd_mobil='"
                                + kd_mobil + "'";
                        break;
                case "Simpan":
                        sql = "INSERT INTO retur_penjualan VALUES('"
                                + no_retur + "','"
                                + tgl + "','"
                                + total + "','"
                                + no_jual + "')";
                        break;
                case "Cancel":
                        sql = "TRUNCATE TABLE sementara2";
                        break;
            }
            boolean eror = false;
            koneksi kon = new koneksi();
            koneksi kon2 = new koneksi();
            if(aksi.equals("Tambah")){
                sql2="SELECT * FROM penjualan WHERE "
                        + "no_jual='" + no_jual + "'";
                ResultSet rs = kon.ambilData(sql2);
                while(rs.next()){
                    sql2 = "INSERT INTO sementara2 VALUES('"
                            + rs.getString(1) + "','"
                            + rs.getString(2) + "','"
                            + rs.getString(3) + "','"
                            + rs.getString(4) + "','"
                            + rs.getString(5) + "','"
                            + rs.getString(6) + "')";
                    try{
                        kon2.stmt.executeUpdate(sql2);
                    } catch(Exception ex){
                        eror= true;
                    }       
                }
            }else 
                if(!aksi.equals("Simpan")){
                    try{
                        kon.stmt.executeUpdate(sql);
                    } catch(Exception ex){
                        eror= true;
                    }
                } else{
                    sql2= "SELECT * FROM sementara2";
                    ResultSet rs = kon.ambilData(sql2);
                    while(rs.next()){
                        sql = "INSERT INTO retur_penjualan VALUES('"
                                + no_retur + "','"
                                + tgl + "','"
                                + total + "','"
                                + rs.getString(1) + "')"; 
                        String sql1;
                        sql1 = "UPDATE mobil SET stok = stok +"
                                + rs.getString(5)
                                + " WHERE kd_mobil='"
                                + rs.getString(4) + "'";
                        
                        sql2 = "INSERT INTO detail_retur_penjualan VALUES('"
                                + no_retur + "','"
                                + rs.getString(4) + "','"
                                + rs.getString(5) + "','"
                                + rs.getString(6) + "')";
                        
                        try{
                            kon2.stmt.executeUpdate(sql1);
                            kon2.stmt.executeUpdate(sql2);
                        } catch (Exception ex){
                            eror= true;
                        }
                    }
                    sql2 = "TRUNCATE TABLE sementara2";
                        if(!eror){
                            try{
                                kon.stmt.executeUpdate(sql);
                                kon2.stmt.executeUpdate(sql2);
                            } catch (Exception ex){
                                eror= true;
                            }
                        }
                }
                if(!eror)
                    out.print("<script>"
                            + "alert('Data Berhasil di " + aksi + "');"
                            + "window.location='beranda.jsp?hal=retur';"
                            + "</script>");
                else
                    out.print(sql+" "+sql2+"<script>"
                            + "alert('Data Gagal di " + aksi + "');"
                            + "</script>");
                  
        }catch (SQLException ex){
            Logger.getLogger(ServletReturPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletReturPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletReturPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
