package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.penjualan;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServletPenjualan extends pesan {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String no = request.getParameter("no");
            String tgl = request.getParameter("tgl");
            String nof = request.getParameter("nof");  
            String total = request.getParameter("total");
            String nopes = request.getParameter("nopes");
            String kd_mobil = request.getParameter("kd_mobil");            
            String aksi = request.getParameter("aksi");
            String sql = "";
            String sql2 = "";
            
            switch(aksi){
                case "Delete":
                        sql = "DELETE FROM sementara WHERE kd_mobil='"
                                + kd_mobil + "'";
                        break;
                case "Simpan":
                        sql = "INSERT INTO penjualan VALUES('"
                                + no + "','"
                                + tgl + "','"
                                + nof + "','"
                                + kd_mobil + "','"
                                + total + "','"
                                + nopes + "')";
                        break;
                case "Cancel":
                        sql = "TRUNCATE TABLE sementara";
                        break;
            }
            boolean eror = false;
            koneksi kon = new koneksi();
            koneksi kon2 = new koneksi();
            if(aksi.equals("Tambah")){
                sql2="SELECT * FROM pemesanan WHERE "
                        + "no_pesan='" + nopes + "'";
                ResultSet rs = kon.ambilData(sql2);
                while(rs.next()){
                    sql2 = "INSERT INTO sementara VALUES('"
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
                    sql2= "SELECT * FROM sementara";
                    ResultSet rs = kon.ambilData(sql2);
                    while(rs.next()){
                        sql = "INSERT INTO penjualan VALUES('"
                                + no + "','"
                                + tgl + "','"
                                + nof + "','"
                                + rs.getString(4) + "','"
                                + total + "','"
                                + rs.getString(1) + "')"; 
                        String sql1;
                        sql1 = "UPDATE mobil SET stok = stok -"
                                + rs.getString(5)
                                + " WHERE kd_mobil='"
                                + rs.getString(4) + "'";
                        
                        sql2 = "INSERT INTO detail_penjualan VALUES('"
                                + no + "','"
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
                    sql2 = "TRUNCATE TABLE sementara";
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
                            + "window.location='beranda.jsp?hal=jual';"
                            + "</script>");
                else
                    out.print(sql+" "+sql2+"<script>"
                            + "alert('Data Gagal di " + aksi + "');"
                            + "</script>");
        
        
        }catch (SQLException ex){
            Logger.getLogger(ServletPenjualan.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ServletPenjualan.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ServletPenjualan.class.getName()).log(Level.SEVERE, null, ex);
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
