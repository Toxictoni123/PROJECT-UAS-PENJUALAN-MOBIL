<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="control.koneksi" %>
<%@page import="model.penjualan" %>
<%@page import="java.util.Date" %>
<%@include file="config/autokode.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgl = tahun + "-" + bulan + "-" + tanggal;
    penjualan penjualan = new penjualan();
    ResultSet qryjual = null;
    String no_retur = null;
    String sql = "SELECT MAX(RIGHT(no_jual,6)) FROM retur_penjualan";
    koneksi kon = new koneksi();
    ResultSet rs = kon.stmt.executeQuery(sql);
    if(!rs.next()){
        no_retur = "RPJ000001";
    } else{
        int urutanBaru = rs.getInt(1) + 1;
        String kode = String.valueOf(urutanBaru);
        int panjangKode = kode.length();
        for(int i = panjangKode; i < 6; i++){
            kode = "0" + kode;
        } 
        no_retur = "RPJ" + kode;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transaksi Retur Penjualan</title>
    </head>
    <body>
        <h1>Transaksi Retur Penjualan Mobil</h1><br>
        <form action="ServletReturPenjualan" method="post">
            <table border="0">
                <h2>Data Retur Penjualan</h2>
                <tr>
                    <td>No Retur</td>
                    <td>: <input type="text" name="no_retur" value="<%=no_retur%>" readonly/> </td>
                </tr>
                <tr>
                    <td>Tanggal</td> 
                    <td>: <input type="text" name="tgl" value=<%= tgl%> ></td>
                </tr>
                 <tr>
                    <td>Nomor Penjualan</td> 
                    <td>: <select name="no_jual" onchange="showPesan(this.value);">
                            <option value="-1">Pilih Nomor Penjualan</option>
                            <%
                                qryjual = kon.stmt.executeQuery("SELECT no_jual FROM penjualan where not exists"
                                + "(SELECT * FROM retur_penjualan WHERE penjualan.no_jual=retur_penjualan.no_jual)");
                                while(qryjual.next()){
                                    penjualan.setNo(qryjual.getString("no_jual"));
                            %>
                                <option value="<%=penjualan.getNo()%>"><%=penjualan.getNo()%></option>
                                <% } %>
                          </select>
                    </td>
                </tr>
                <input type="hidden" name="no_jual" id="pesan" value="${param.cari}">
                <tr>
                    <td><input type="submit" name="aksi" value="Tambah"></td>
                </tr>
            </table>
            <%
                sql = "SELECT * FROM sementara2";
                rs = kon.stmt.executeQuery(sql);
            %>
            <br><br>
            <h3>Data Mobil Untuk Diretur</h3><br>
            <table border="2">
                <tr>
                    <th>No Penjualan</th>
                    <th>Tanggal</th>
                    <th>No Faktur</th>
                    <th>Kode Mobil</th>
                    <th>Jumlah</th>
                    <th>No Pemesanan</th>
                    <th>Aksi</th>
                </tr>
                <% if (!rs.next()) { %>
                    <tr>
                        <td colspan="7">Data Masih Kosong</td>
                    </tr>
                <% } %>
                <% rs.beforeFirst(); %>
                <% while (rs.next()) { %>
                    <tr>
                        <td><%= rs.getString(1)%></td>
                        <td><%= rs.getString(2)%></td>
                        <td><%= rs.getString(3)%></td>
                        <td><%= rs.getString(4)%></td>
                        <td><%= rs.getString(5)%></td>
                        <td><%= rs.getString(6)%></td>
                        <td>
                            <a href="ServletReturPenjualan?aksi=Delete&kd_mobil=<%= rs.getString(4)%>">
                            Hapus
                            </a>
                        </td>
                    </tr>
                <% }%>
            </table>
            <table>
                <sql:query var="ttl" dataSource="${dataSource}">
                    SELECT SUM(total_jual) AS ttl_D FROM sementara2
                </sql:query>
                <c:forEach var="ttlDK" items="${ttl.rowsByIndex}"><br>       
                        <tr>
                            <td>Jumlah Mobil Diretur</td>
                            <td>: <input type="text" readonly="readonly" name="total" size="1" value="${ttlDK[0]}"></td>
                        </tr>                 
                </c:forEach>
                <tr>
                    <td><input type="submit" value="Simpan" name="aksi">
                        <input type="reset" value="Cancel">
                    </td> 
                </tr>
                 
            </table>
        </form> 
    </body>
</html>

