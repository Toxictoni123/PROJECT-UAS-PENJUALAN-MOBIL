<%@page import="control.koneksi"%>
<%@page import="java.sql.*" %>

<%//koneksi database--
                
                String kd_mobil=request.getParameter("kd_mobil");
                String nm_mobil=null;
                String harga=null;
                String stok=null;
                ResultSet rs = null;
                
                
                koneksi kon = new koneksi();
                rs = kon.stmt.executeQuery("SELECT * FROM mobil where kd_mobil = '" + kd_mobil +"'");
                    if (rs.next())
                    {
                        kd_mobil=rs.getString(1);
                        nm_mobil=rs.getString(2);
                        harga=rs.getString(3);
                        stok=rs.getString(4);
                    }
            %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ubah Data Master Mobil</title>
    </head>
    <body>
       <form method="POST" action="mobilServlet">
        <center>
         <table border="2">
             <tr>
                 <td colspan="3"><h3>UBAH DATA MASTER MOBIL</h3></td>
             </tr>
             <tr>
                 <td>Kode Mobil</td>
                 <td>:</td>
                 <td><input type="text" value="<%=kd_mobil%>" readonly="">
                     <input type="hidden" name="kd_mobil" value="<%=kd_mobil%>"/> 
                 </td>
             </tr>
             <tr>
                 <td>Nama Mobil</td>
                 <td>:</td>
                 <td><input type="text" name="nm_mobil" value="<%=nm_mobil%>"/>
                 </td>
             </tr>
             <tr>
                 <td>Harga</td>
                 <td>:</td>
                 <td><input type="text" name="harga" value="<%=harga%>"/>
                 </td>    
             </tr>
             <tr>
                 <td>Stok</td>
                 <td>:</td>
                 <td><input type="text" name="stok" value="<%=stok%>"/>
                 </td>    
             </tr>
             <tr>
                  <td colspan="3">
                       <center>
                           <input type="Submit" name="aksi" value="Update">
                           <input type="Reset" value="Batal">
                           <a href="beranda.jsp?hal=tampil_mobil">[Lihat Data]</a>
                       </center>
                  </td>
             </tr>
         </table>
        </center>
       </form>
    </body>
</html>
