<%@page import="control.koneksi"%>
<%@page import="java.sql.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Master Mobil</title>
    </head>
    <body>
        <table width="667" height="150" border="1" align="center">
            <tr align="center">
                <td colspan="6"><h3>DATA MASTER MOBIL</h3></td>
            </tr>
            <tr>
                <th>KODE MOBIL</th>
                <th>NAMA MOBIL</th>
                <th>HARGA</th>
                <th>STOK</th>
                <th>AKSI</th>
                
            </tr>
            <%//koneksi database--
                
                String kd_mobil=null;
                String nm_mobil=null;
                String harga=null;
                String stok=null;
                ResultSet rs = null;              
                
                koneksi kon = new koneksi();
                rs = kon.stmt.executeQuery("SELECT * FROM mobil ORDER BY kd_mobil asc");
                    
                    while(rs.next())
                    {
                        kd_mobil=rs.getString("kd_mobil");
                        nm_mobil=rs.getString(2);
                        harga=rs.getString(3);
                        stok=rs.getString(4);
                        
                    
            %>
            <tr>
                <td><% out.println(kd_mobil); %></td>
                <td><% out.println(nm_mobil); %></td>
                <td><% out.println(harga); %></td>
                <td><% out.println(stok); %></td>
                <td><a href="beranda.jsp?hal=edit_mobil&kd_mobil=<% out.println(kd_mobil); %> ">EDIT</a>
                 || <a href="mobilServlet?aksi=Delete&kd_mobil=<% out.println(kd_mobil); %> ">HAPUS</a>
                </td>
                
            </tr>
            <%}%>
            <tr>
                <td colspan="6" align="center"><h3><a href="beranda.jsp?hal=input_mobil">Tambah Data</a></h3></td>
            </tr>
        </table> 
        <%kon.close();%>
    </body>
</html>
