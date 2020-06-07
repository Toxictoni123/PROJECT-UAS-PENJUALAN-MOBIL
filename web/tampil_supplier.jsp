<%@page import="control.koneksi"%>
<%@page import="java.sql.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Master Supplier</title>
    </head>
    <body>
        <table width="667" height="150" border="1" align="center">
            <tr align="center">
                <td colspan="6"><h3>DATA SUPPLIER</h3></td>
            </tr>
            <tr>
                <th>KODE SUPPLIER</th>
                <th>NAMA SUPPLIER</th>
                <th>ALAMAT</th>
                <th>TELPON </th>
                <th>AKSI</th>
                
            </tr>
            <%//koneksi database--
                
                String kd_supp=null;
                String nm_supp=null;
                String alamat=null;
                String telpon=null;
                ResultSet rs = null;              
                
                koneksi kon = new koneksi();
                rs = kon.stmt.executeQuery("SELECT * FROM supplier ORDER BY kd_supp asc");
                    
                    while(rs.next())
                    {
                        kd_supp=rs.getString("kd_supp");
                        nm_supp=rs.getString(2);
                        alamat=rs.getString(3);
                        telpon=rs.getString(4);
                        
                    
            %>
            <tr>
                <td><% out.println(kd_supp); %></td>
                <td><% out.println(nm_supp); %></td>
                <td><% out.println(alamat); %></td>
                <td><% out.println(telpon); %></td>
                <td><a href="beranda.jsp?hal=edit_supplier&kd_supp=<% out.println(kd_supp); %> ">EDIT</a>
                 || <a href="supplierServlet?aksi=Delete&kd_supp=<% out.println(kd_supp); %> ">HAPUS</a>
                </td>
                
            </tr>
            <%}%>
            <tr>
                <td colspan="6" align="center"><h3><a href="beranda.jsp?hal=input_supplier">Tambah Data</a></h3></td>
            </tr>
        </table> 
        <%kon.close();%>
    </body>
</html>
