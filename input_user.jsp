<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input User</title>
    </head>
    <body>
        <form method="POST" action="userServlet">
         <center>
             <table border="0">
                 <tr>
                     <td colspan="3"><h3>INPUT DATA USER</h3></td>
                 </tr> 
                 <tr>
                     <td>Id User</td>
                     <td>:</td>
                     <td><input type="text" name="id_user"></td>
                 </tr>
                 <tr>
                     <td>Nama User</td>
                     <td>:</td>
                     <td><input type="text" name="nm_user"></td>
                 </tr>
                 
                 <tr>
                     <td>Hak Akses</td>
                     <td>:</td>
                     <td><input type="text" name="hak_akses"></td>
                 </tr>
                 <tr>
                     <td>Password</td>
                     <td>:</td>
                     <td><input type="text" name="password"></td>
                 </tr>
                 <tr>
                     <td colspan="3">
                       <center>
                           <input type="Submit" name="aksi" value="Simpan">
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
