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
               <h2>Website Rental Mobil UBSI</h2>
               <h2>Jl. Kamal Raya Raya No.18, Cengkareng, Jakarta Barat</h2>
               <%--akhir dari header--%>
            </div>
            
            <%--awal menu --%>
            <div id="menu">
               <ul>
                   <li><a href="beranda.jsp">Home</a></li>
                   <li><a href="">About</a></li><%--buat halaman about dengan biodata mahasiswa--%>
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
                        <li><a href="beranda.jsp?hal=tampil_supplier">Daftar Supplier</a></li>
                        <li><a href="#">User</a></li>
                    </ul>
                   
                    <h2>Transaksi</h2>
                    <ul>
                        <li><a href="transaksi.jsp?hal=transaksi">Mobil disewa</a></li>
                        
                    </ul>
               
                    <h2>Laporan</h2>
                    <ul>
                        <li><a href="#">Laporan Master Akun</a></li>
                        <li><a href="#">Laporan Kas Masuk</a></li>
                        <li><a href="#">Laporan Kas Keluar</a></li>
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
                                     <c:when test="${param.hal=='tampil_supplier'}">
                                         <%@include file="tampil_supplier.jsp" %>           
                                     </c:when>
                                     <c:when test="${param.hal=='edit_supplier'}">
                                         <%@include file="edit_supplier.jsp" %>           
                                     </c:when>
                                     <c:when test="${param.hal=='input_supplier'}">
                                         <%@include file="input_supplier.jsp" %>           
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
