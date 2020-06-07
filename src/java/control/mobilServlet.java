package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.mobil;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mobilServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            mobil mobil = new mobil();
            koneksi kon = new koneksi();
            PreparedStatement pstmt = null;
            int result = 0;
            
            String aksi = request.getParameter("aksi");
            if (aksi !=null)
            {
                mobil.setKd_mobil(request.getParameter("kd_mobil"));
                mobil.setNm_mobil(request.getParameter("nm_mobil"));              
                mobil.setHarga(request.getParameter("harga"));
                mobil.setStok(request.getParameter("stok"));
                switch (aksi)
                { case "Simpan":
                    pstmt=kon.conn.prepareStatement("INSERT INTO mobil VALUES('"
                            +mobil.getKd_mobil()+"','"
                            +mobil.getNm_mobil()+"','"                            
                            +mobil.getHarga()+"','"
                            +mobil.getStok()+"')");

                    result = pstmt.executeUpdate();
                    if (result > 0) {
                       out.println("<script>"
                               +"alert('Data telah ditambahkan');"
                               +"document.location='beranda.jsp?hal=tampil_mobil';"
                               +"</script>");
                    }
                    break;
                    case"Delete":
                      pstmt=kon.conn.prepareStatement("DELETE FROM mobil WHERE kd_mobil= '"+mobil.getKd_mobil()+"'");
                      result = pstmt.executeUpdate();
                      if (result > 0) {
                       out.println("<script>"
                               +"alert('Data telah dihapus');"
                               +"document.location='beranda.jsp?hal=tampil_mobil';"
                               +"</script>");
                    }
                    break;
                    case"Update":
                       pstmt=kon.conn.prepareStatement("UPDATE mobil SET nm_mobil='"
                            +mobil.getNm_mobil()+"',harga='"                           
                            +mobil.getHarga()+"',stok='"
                            +mobil.getStok()+"'where kd_mobil='"   
                            +mobil.getKd_mobil()+"'");

                       result = pstmt.executeUpdate();
                       if (result > 0) {
                       out.println("<script>"
                               +"alert('Data telah diubah');"
                               +"document.location='beranda.jsp?hal=tampil_mobil';"
                               +"</script>");
                        } 
                    default:
                    break;
                }
            }
            else
            {
                out.println("<script>"
                     +"alert('Gagal Eksekusi');"
                     +"document.location='input_mobil.jsp';"
                     +"</script>");           
            }

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
            Logger.getLogger(mobilServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mobilServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(mobilServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mobilServlet.class.getName()).log(Level.SEVERE, null, ex);
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
