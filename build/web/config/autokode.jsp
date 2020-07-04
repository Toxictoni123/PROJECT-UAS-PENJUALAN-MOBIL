<%@page import="java.sql.*" %>
<%@page import="control.koneksi" %>
<%-- Auto Number No Pemesanan --%>

<%
    try {
        koneksi kon = new koneksi();
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet nopesan = null;
        nopesan = kon.stmt.executeQuery("select max(right(no_pesan,6)) as no FROM pemesanan");
        while(nopesan.next()){
            if(nopesan.first() == false){
                out.println("<input type='hidden' name='no_pesan' value='PS000001' id='nopes'>");
            } else{
                nopesan.last();
                int autonops = nopesan.getInt(1) + 1;
                String nomorps = String.valueOf(autonops);
                int noLong = nomorps.length();
                
                for(int a = 1; a < 7 - noLong; a++){
                    nomorps = "0" + nomorps;
                }
                String nomerps = "PS" + nomorps;
                out.println("<input type='hidden' name='no_pesan' id='nopes' value='" + nomerps + "'>");
            }
        }
    } catch(Exception e){
        out.println(e);
    }
%>