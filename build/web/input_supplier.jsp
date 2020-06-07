<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Supplier</title>
    </head>
    <body>
        <form method="POST" action="supplierServlet">
         <center>
             <table border="0">
                 <tr>
                     <td colspan="3"><h3>INPUT DATA SUPPLIER</h3></td>
                 </tr> 
                 <tr>
                     <td>Kode Supplier</td>
                     <td>:</td>
                     <td><input type="text" name="kd_supp"></td>
                 </tr>
                 <tr>
                     <td>Nama Supplier</td>
                     <td>:</td>
                     <td><input type="text" name="nm_supp"></td>
                 </tr>
                 
                 <tr>
                     <td>Alamat</td>
                     <td>:</td>
                     <td><input type="text" name="alamat"></td>
                 </tr>
                 <tr>
                     <td>Telpon</td>
                     <td>:</td>
                     <td><input type="text" name="telpon"></td>
                 </tr>
                 <tr>
                     <td colspan="3">
                       <center>
                           <input type="Submit" name="aksi" value="Simpan">
                           <input type="Reset" value="Batal">
                           <a href="beranda.jsp?hal=tampil_supplier">[Lihat Data]</a>
                       </center>   
                     </td>
                 </tr>
             </table>     
         </center>
        </form>
    </body>
</html>
