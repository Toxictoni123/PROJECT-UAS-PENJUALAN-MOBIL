<%@page import="control.koneksi"%>
<%@page import="java.sql.*" %>

<%//koneksi database--
                
                String id_user=request.getParameter("id_user");
                String nm_user=null;
                String hak_akses=null;
                String password=null;
                ResultSet rs = null;
                
                
                koneksi kon = new koneksi();
                rs = kon.stmt.executeQuery("SELECT * FROM user where id_user = '" + id_user +"'");
                    if (rs.next())
                    {
                        id_user=rs.getString(1);
                        nm_user=rs.getString(2);
                        hak_akses=rs.getString(3);
                        password=rs.getString(4);
                    }
            %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ubah Data User</title>
    </head>
    <body>
       <form method="POST" action="userServlet">
        <center>
         <table border="2">
             <tr>
                 <td colspan="3"><h3>UBAH DATA USER</h3></td>
             </tr>
             <tr>
                 <td>Id User</td>
                 <td>:</td>
                 <td><input type="text" value="<%=id_user%>" readonly="">
                     <input type="hidden" name="id_user" value="<%=id_user%>"/> 
                 </td>
             </tr>
             <tr>
                 <td>Nama User</td>
                 <td>:</td>
                 <td><input type="text" name="nm_user" value="<%=nm_user%>"/>
                 </td>
             </tr>
             <tr>
                 <td>Hak Akses</td>
                 <td>:</td>
                 <td><input type="text" name="hak_akses" value="<%=hak_akses%>"/>
                 </td>    
             </tr>
             <tr>
                 <td>Password</td>
                 <td>:</td>
                 <td><input type="text" name="password" value="<%=password%>"/>
                 </td>    
             </tr>
             <tr>
                  <td colspan="3">
                       <center>
                           <input type="Submit" name="aksi" value="Update">
                           <input type="Reset" value="Batal">
                           <a href="beranda.jsp?hal=tampil_user">[Lihat Data]</a>
                       </center>
                  </td>
             </tr>
         </table>
        </center>
       </form>
    </body>
</html>
