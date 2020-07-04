<%@page import="java.sql.ResultSet" %>
<%@page import="control.koneksi" %>
<%@page import="model.mobil,model.pemesanan" %>
<%@page import="java.util.Date" %>
<%@include file="config/autokode.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%
    java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgl = tahun + "-" + bulan + "-" + tanggal;
    pemesanan pemesanan = new pemesanan();
    mobil mobil = new mobil();
    koneksi kon = new koneksi();
    ResultSet rs = null;
    ResultSet qrymobil = null;
    ResultSet qrypemesanan = null;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transaksi Pemesanan</title>
    </head>
    <body>    
        <h1>Transaksi Pemesanan Mobil</h1><br>
        <form action="ServletPemesanan" method="post">
            <table border="0">
                <h2>Data Mobil</h2>
                <tr>
                    <td>No Pesan</td>
                    <td>: <input type="text" name="no_pesan" id="nopesan" value="" readonly="readonly">
                          <input type="button" onclick="pesan()" value="Add" class="button">  
                    </td>
                </tr>
                <tr>
                    <td>Tanggal Pesan</td> <td>: <input type="text" name="tanggal" value=<%= tgl%> readonly="readonly"></td>
                </tr>
                <tr>
                    <td>Mobil</td>
                    <td>: <select name="kd_mobil" onchange="showEmp(this.value);">
                            <option value="-1">Pilih Mobil</option>  
                
                            <%
                                rs = kon.stmt.executeQuery("SELECT * from mobil ");
                                while(rs.next()){
                                    mobil.setKd_mobil(rs.getString("kd_mobil"));
                                    mobil.setNm_mobil(rs.getString("nm_mobil"));
                            %>
                            <option value="<%=mobil.getKd_mobil()%>"><%=mobil.getKd_mobil()%> ||
                                <%=mobil.getNm_mobil()%>
                            </option>
                            <% } %>
                          </select>
                    </td>
                </tr>
                <input type="hidden" name="emp_id" id="emp_id" value="">
                <tr>
                    <td>Harga</td>
                    <td>: <input type="text" name="harga" id="ename" value="" readonly="readonly" onkeyup="sumPesan();"/></td>
                </tr>
                <tr>
                    <td>Jumlah Pesan</td>
                    <td>: <input type="text" name="jml" id="jml" onkeypress="return hanyaAngka(event)" onkeyup="sumPesan();"/></td>
                </tr>
                <tr>
                    <td>Subtotal</td>
                    <td>: <input type="text" name="sub" id="subtotal" readonly="readonly"/></td>
                </tr>
                <tr>
                    <td>Nama Pelanggan</td>
                    <td>: <input type="text" name="pelanggan"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="TAMBAH" name="aksi"></td>
                </tr>
            </table><br>
            
            <h3>Data Mobil Untuk Dipesan</h3><br>           
            <table border="1" width="535" align="center">
                    <tr>
                        <th>No Pesan</th>
                        <th>Tanggal</th>
                        <th>Nama Pelanggan</th>
                        <th>Kode Mobil</th>
                        <th>Jumlah</th>
                        <th>Total Harga</th>
                        <th>Aksi</th>
                    </tr>
                    <%
                        rs = kon.stmt.executeQuery("SELECT * from pemesanan ");
                        while(rs.next()){
                            out.println("<tr class=isi>"
                                + "<td>" + rs.getString(1) + "</td>"
                                + "<td>" + rs.getString(2) + "</td>"
                                + "<td>" + rs.getString(3) + "</td>"
                                + "<td>" + rs.getString(4) + "</td>"
                                + "<td>" + rs.getString(5) + "</td>"
                                + "<td>" + rs.getString(6) + "</td>"    
                                + "<td><a href=ServletPemesanan?aksi=HAPUS&no_pesan=" + rs.getString(1) + ">Hapus</a></td>"    
                                + "</tr>");
                        }
                    %>
            </table>
                
                <%kon.close();%>
                        
        </form>    
    </body>   
</html>