<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Penjualan Mobil</title>
        <link rel="stylesheet" type="text/css" href="config/style.css" media="screen">
         <link href="config/cssTable.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%--awal wrap --%>  
        <div id="wrap">
            <div id="header">
               <%--awal header--%>
               <img src="images/logo-bsi.png">
               <h1><a>PT. Wira Muda</a></h1><br>
               <h2>Website Penjualan Mobil UBSI</h2>
               <h2>Jl. Kamal Raya Raya No.18, Cengkareng, Jakarta Barat</h2>
               <h4>Telpon 021-123456</h4>
               <%--akhir dari header--%>
            </div>
            
            <%--awal menu --%>
            <div id="menu">
               <ul>
                   <li><a href="beranda.jsp">Home</a></li>
                   <li><a href="beranda.jsp?hal=about">About</a></li>
                   <li><a href="index.jsp">Logout</a></li>
               </ul>
            </div>
            <%--akhir menu --%>  
            
            <%--awal content--%>
            <div id="content">
                <%--awal left content--%>
                <div class="left">
                    <h2>Data Master</h2>
                    <ul>
                        <li><a href="beranda.jsp?hal=tampil_mobil">Daftar Mobil</a></li>
                        <li><a href="beranda.jsp?hal=tampil_user">Daftar User</a></li>
                        <li><a href="beranda.jsp?hal=tampil_supplier">Daftar Supplier</a></li>
                    </ul>
                   
                    <h2>Transaksi</h2>
                    <ul>
                        <li><a href="beranda.jsp?hal=pesan">Pemesanan Mobil</a></li>
                        <li><a href="beranda.jsp?hal=jual">Penjualan Mobil</a></li>
                        <li><a href="beranda.jsp?hal=retur">Retur Penjualan</a></li>
                    </ul>
               
                    <h2>Laporan</h2>
                    <ul>
                        <li><a href="beranda.jsp?hal=cetaklapmobil">Laporan Data Mobil</a></li>
                        <li><a href="beranda.jsp?hal=cetaklapretur">Laporan Retur</a></li>
                        <li><a href="beranda.jsp?hal=cetaklappenjualan">Laporan Penjualan</a></li>
                    </ul>
                </div>
                <%-- akhir left content --%>
                
               <div class="right">
                   
                   <table width="100%">
                   <tr>
                        <td valign="top" width="110%">
                            <%--isi content sebelah kanan--%>
                            <c:choose>
                                    <c:when test="${param.hal=='tampil_mobil'}">
                                        <%@include file="tampil_mobil.jsp" %>           
                                    </c:when>
                                    <c:when test="${param.hal=='edit_mobil'}">
                                        <%@include file="edit_mobil.jsp" %>           
                                    </c:when>
                                    <c:when test="${param.hal=='input_mobil'}">
                                        <%@include file="input_mobil.jsp" %>           
                                    </c:when>
                                    <c:when test="${param.hal=='tampil_user'}">
                                        <%@include file="tampil_user.jsp" %>           
                                    </c:when>
                                    <c:when test="${param.hal=='edit_user'}">
                                        <%@include file="edit_user.jsp" %>           
                                    </c:when>
                                    <c:when test="${param.hal=='input_user'}">
                                        <%@include file="input_user.jsp" %>           
                                    </c:when>
                                    <c:when test="${param.hal=='tampil_supplier'}">
                                        <%@include file="tampil_supplier.jsp" %>           
                                    </c:when>
                                    <c:when test="${param.hal=='edit_supplier'}">
                                        <%@include file="edit_supplier.jsp" %>           
                                    </c:when>
                                    <c:when test="${param.hal=='input_supplier'}">
                                        <%@include file="input_supplier.jsp" %>           
                                    </c:when>
                                    <c:when test="${param.hal=='pesan'}">
                                        <%@include file="pemesanan.jsp" %>           
                                    </c:when>
                                    <c:when test="${param.hal=='jual'}">
                                         <%@include file="penjualan.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='retur'}">
                                         <%@include file="retur_penjualan.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='cetaklapmobil'}">
                                         <%@include file="CetakLaporanMobil.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='cetaklappenjualan'}">
                                         <%@include file="CetakLaporanPenjualan.jsp" %>
                                     </c:when>
                                     <c:when test="${param.hal=='cetaklapretur'}">
                                         <%@include file="CetakLaporanRetur.jsp" %>
                                     </c:when>
                                     <c:when test="${param.hal=='about'}">
                                         <%@include file="about.jsp" %>           
                                     </c:when>
                                    <c:otherwise>
                                        <%@include file="filehome.jsp" %> 
                                    </c:otherwise>
                            </c:choose>
                        </td>
                   </tr>
                   </table>
                   <div class="footer">                     
                        support by<a href="http://bsi.ac.id/"> Tugas UAS prodi SIA</a>,<br>                       
                   </div>                 
               </div> 
               <div style="clear:both"></div>
             <%--akhir isi content--%>
           </div>
          <%--akhir wrap (halaman web)--%>
        </div>       
    </body>
</html>
