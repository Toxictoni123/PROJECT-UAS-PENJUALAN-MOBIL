package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.supplier;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class supplierServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            supplier supplier = new supplier();
            koneksi kon = new koneksi();
            PreparedStatement pstmt = null;
            int result = 0;
            
            String aksi = request.getParameter("aksi");
            if (aksi !=null)
            {
                supplier.setKd_supp(request.getParameter("kd_supp"));
                supplier.setNm_supp(request.getParameter("nm_supp"));              
                supplier.setAlamat(request.getParameter("alamat"));
                supplier.setTelpon(request.getParameter("telpon"));
                switch (aksi)
                { case "Simpan":
                    pstmt=kon.conn.prepareStatement("INSERT INTO supplier VALUES('"
                            +supplier.getKd_supp()+"','"
                            +supplier.getNm_supp()+"','"                            
                            +supplier.getAlamat()+"','"
                            +supplier.getTelpon()+"')");

                    result = pstmt.executeUpdate();
                    if (result > 0) {
                       out.println("<script>"
                               +"alert('Data telah ditambahkan');"
                               +"document.location='beranda.jsp?hal=tampil_supplier';"
                               +"</script>");
                    }
                    break;
                    case"Delete":
                      pstmt=kon.conn.prepareStatement("DELETE FROM supplier WHERE kd_supp= '"+supplier.getKd_supp()+"'");
                      result = pstmt.executeUpdate();
                      if (result > 0) {
                       out.println("<script>"
                               +"alert('Data telah dihapus');"
                               +"document.location='beranda.jsp?hal=tampil_supplier';"
                               +"</script>");
                    }
                    break;
                    case"Update":
                        pstmt=kon.conn.prepareStatement("UPDATE supplier SET nm_supp='"
                             +supplier.getNm_supp()+"',alamat='"                           
                             +supplier.getAlamat()+"',telpon='"
                             +supplier.getTelpon()+"'where kd_supp='"   
                             +supplier.getKd_supp()+"'");

                        result = pstmt.executeUpdate();
                        if (result > 0) {
                        out.println("<script>"
                                +"alert('Data telah diubah');"
                                +"document.location='beranda.jsp?hal=tampil_supplier';"
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
                     +"document.location='input_supplier.jsp';"
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
            Logger.getLogger(supplierServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(supplierServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(supplierServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(supplierServlet.class.getName()).log(Level.SEVERE, null, ex);
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
