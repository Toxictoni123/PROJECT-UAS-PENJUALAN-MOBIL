<%@page import="control.koneksi"%>
<%@page import="java.sql.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Master User</title>
    </head>
    <body>
        <table width="667" height="150" border="1" align="center">
            <tr align="center">
                <td colspan="6"><h3>DATA USER</h3></td>
            </tr>
            <tr>
                <th>ID USER</th>
                <th>NAMA USER</th>
                <th>HAK AKSES</th>
                <th>PASSWORD</th>
                <th>AKSI</th>
                
            </tr>
            <%//koneksi database--
                
                String id_user=null;
                String nm_user=null;
                String hak_akses=null;
                String password=null;
                ResultSet rs = null;              
                
                koneksi kon = new koneksi();
                rs = kon.stmt.executeQuery("SELECT * FROM user ORDER BY id_user asc");
                    
                    while(rs.next())
                    {
                        id_user=rs.getString("id_user");
                        nm_user=rs.getString(2);
                        hak_akses=rs.getString(3);
                        password=rs.getString(4);
                        
                    
            %>
            <tr>
                <td><% out.println(id_user); %></td>
                <td><% out.println(nm_user); %></td>
                <td><% out.println(hak_akses); %></td>
                <td><% out.println(password); %></td>
                <td><a href="beranda.jsp?hal=edit_user&id_user=<% out.println(id_user); %> ">EDIT</a>
                 || <a href="userServlet?aksi=Delete&id_user=<% out.println(id_user); %> ">HAPUS</a>
                </td>
                
            </tr>
            <%}%>
            <tr>
                <td colspan="6" align="center"><h3><a href="beranda.jsp?hal=input_user">Tambah Data</a></h3></td>
            </tr>
        </table> 
        <%kon.close();%>
    </body>
</html>
