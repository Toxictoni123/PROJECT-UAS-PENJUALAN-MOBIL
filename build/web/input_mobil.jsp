<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Mobil</title>
    </head>
    <body>
        <form method="POST" action="mobilServlet">
         <center>
             <table border="0">
                 <tr>
                     <td colspan="3"><h3>INPUT DATA MASTER  MOBIL</h3></td>
                 </tr> 
                 <tr>
                     <td>Kode Mobil</td>
                     <td>:</td>
                     <td><input type="text" name="kd_mobil"></td>
                 </tr>
                 <tr>
                     <td>Nama Mobil</td>
                     <td>:</td>
                     <td><input type="text" name="nm_mobil"></td>
                 </tr>
                 
                 <tr>
                     <td>Harga</td>
                     <td>:</td>
                     <td><input type="text" name="harga"></td>
                 </tr>
                 <tr>
                     <td>Stok</td>
                     <td>:</td>
                     <td><input type="text" name="stok"></td>
                 </tr>
                 <tr>
                     <td colspan="3">
                       <center>
                           <input type="Submit" name="aksi" value="Simpan">
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
