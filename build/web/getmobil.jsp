<%@page import="java.sql.*" %>
<%@page import="control.koneksi"%>
<%@page import="model.mobil"%>

<%
  mobil mobil = new mobil();
  koneksi kon = new koneksi();//--koneksi Database--
  ResultSet rs = null;
  String emp_id = request.getParameter("emp_id").toString();
  String data = null;
  Statement st;
  rs = kon.stmt.executeQuery("SELECT * from mobil where kd_mobil='" + emp_id + "' ");
  while (rs.next()){
      data = ":" + rs.getString(3) + ":" + emp_id;
  }
  out.println(data);
%>