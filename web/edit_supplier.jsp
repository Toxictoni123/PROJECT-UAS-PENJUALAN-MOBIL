<%@page import="control.koneksi"%>
<%@page import="java.sql.*" %>

<%//koneksi database--
                
                String kd_supp=request.getParameter("kd_supp");
                String nm_supp=null;
                String alamat=null;
                String telpon=null;
                ResultSet rs = null;
                
                
                koneksi kon = new koneksi();
                rs = kon.stmt.executeQuery("SELECT * FROM supplier where kd_supp = '" + kd_supp +"'");
                    if (rs.next())
                    {
                        kd_supp=rs.getString(1);
                        nm_supp=rs.getString(2);
                        alamat=rs.getString(3);
                        telpon=rs.getString(4);
                    }
            %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ubah Data Supplier</title>
    </head>
    <body>
       <form method="POST" action="supplierServlet">
        <center>
         <table border="2">
             <tr>
                 <td colspan="3"><h3>UBAH DATA SUPPLIER</h3></td>
             </tr>
             <tr>
                 <td>Kode Supplier</td>
                 <td>:</td>
                 <td><input type="text" value="<%=kd_supp%>" readonly="">
                     <input type="hidden" name="kd_supp" value="<%=kd_supp%>"/> 
                 </td>
             </tr>
             <tr>
                 <td>Nama Supplier</td>
                 <td>:</td>
                 <td><input type="text" name="nm_supp" value="<%=nm_supp%>"/>
                 </td>
             </tr>
             <tr>
                 <td>Alamat</td>
                 <td>:</td>
                 <td><input type="text" name="alamat" value="<%=alamat%>"/>
                 </td>    
             </tr>
             <tr>
                 <td>Telpon</td>
                 <td>:</td>
                 <td><input type="text" name="telpon" value="<%=telpon%>"/>
                 </td>    
             </tr>
             <tr>
                  <td colspan="3">
                       <center>
                           <input type="Submit" name="aksi" value="Update">
                           <input type="Reset" value="Batal">
                           <a href="beranda.jsp?hal=tampil_supplier">[Lihat Data]</a>
                       </center>
                  </td>
             </tr>
         </table>
        </center>
       </form>
    </body>
</html>
