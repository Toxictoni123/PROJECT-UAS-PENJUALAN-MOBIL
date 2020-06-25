package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;

public final class beranda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/tampil_mobil.jsp");
    _jspx_dependants.add("/edit_mobil.jsp");
    _jspx_dependants.add("/input_mobil.jsp");
    _jspx_dependants.add("/tampil_supplier.jsp");
    _jspx_dependants.add("/edit_supplier.jsp");
    _jspx_dependants.add("/input_supplier.jsp");
    _jspx_dependants.add("/filehome.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Penjualan Mobil</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"config/style.css\" media=\"screen\">\r\n");
      out.write("         <link href=\"config/cssTable.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("  \r\n");
      out.write("        <div id=\"wrap\">\r\n");
      out.write("            <div id=\"header\">\r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("               <img src=\"images/logo-bsi.png\">\r\n");
      out.write("               <h1><a>PT. Wira Muda</a></h1><br>\r\n");
      out.write("               <h2>Website Rental Mobil UBSI</h2>\r\n");
      out.write("               <h2>Jl. Kamal Raya Raya No.18, Cengkareng, Jakarta Barat</h2>\r\n");
      out.write("               <h4>Telpon 021-123456</h4>\r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div id=\"menu\">\r\n");
      out.write("               <ul>\r\n");
      out.write("                   <li><a href=\"beranda.jsp\">Home</a></li>\r\n");
      out.write("                   <li><a href=\"\">About</a></li>");
      out.write("\r\n");
      out.write("               </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      out.write("  \r\n");
      out.write("            \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <div class=\"left\">\r\n");
      out.write("                    <h2>Data Master</h2>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"beranda.jsp?hal=tampil_mobil\">Daftar Mobil</a></li>\r\n");
      out.write("                        <li><a href=\"beranda.jsp?hal=tampil_supplier\">Daftar Supplier</a></li>\r\n");
      out.write("                        <li><a href=\"#\">User</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                   \r\n");
      out.write("                    <h2>Transaksi</h2>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"transaksi.jsp?hal=transaksi\">Mobil disewa</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("               \r\n");
      out.write("                    <h2>Laporan</h2>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">Laporan Master Akun</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Laporan Kas Masuk</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Laporan Kas Keluar</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("               <div class=\"right\">\r\n");
      out.write("                   \r\n");
      out.write("                   <table width=\"100%\">\r\n");
      out.write("                   <tr>\r\n");
      out.write("                        <td valign=\"top\" width=\"110%\">\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                             ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                     ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampil_mobil'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                         ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Data Master Mobil</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <table width=\"667\" height=\"150\" border=\"1\" align=\"center\">\n");
              out.write("            <tr align=\"center\">\n");
              out.write("                <td colspan=\"6\"><h3>DATA MASTER MOBIL</h3></td>\n");
              out.write("            </tr>\n");
              out.write("            <tr>\n");
              out.write("                <th>KODE MOBIL</th>\n");
              out.write("                <th>NAMA MOBIL</th>\n");
              out.write("                <th>HARGA</th>\n");
              out.write("                <th>STOK</th>\n");
              out.write("                <th>AKSI</th>\n");
              out.write("                \n");
              out.write("            </tr>\n");
              out.write("            ");
//koneksi database--
                
                String kd_mobil=null;
                String nm_mobil=null;
                String harga=null;
                String stok=null;
                ResultSet rs = null;              
                
                koneksi kon = new koneksi();
                rs = kon.stmt.executeQuery("SELECT * FROM mobil ORDER BY kd_mobil asc");
                    
                    while(rs.next())
                    {
                        kd_mobil=rs.getString("kd_mobil");
                        nm_mobil=rs.getString(2);
                        harga=rs.getString(3);
                        stok=rs.getString(4);
                        
                    
            
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td>");
 out.println(kd_mobil); 
              out.write("</td>\n");
              out.write("                <td>");
 out.println(nm_mobil); 
              out.write("</td>\n");
              out.write("                <td>");
 out.println(harga); 
              out.write("</td>\n");
              out.write("                <td>");
 out.println(stok); 
              out.write("</td>\n");
              out.write("                <td><a href=\"beranda.jsp?hal=edit_mobil&kd_mobil=");
 out.println(kd_mobil); 
              out.write(" \">EDIT</a>\n");
              out.write("                 || <a href=\"mobilServlet?aksi=Delete&kd_mobil=");
 out.println(kd_mobil); 
              out.write(" \">HAPUS</a>\n");
              out.write("                </td>\n");
              out.write("                \n");
              out.write("            </tr>\n");
              out.write("            ");
}
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td colspan=\"6\" align=\"center\"><h3><a href=\"beranda.jsp?hal=input_mobil\">Tambah Data</a></h3></td>\n");
              out.write("            </tr>\n");
              out.write("        </table> \n");
              out.write("        ");
kon.close();
              out.write("\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("           \r\n");
              out.write("                                     ");
              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
          out.write("\r\n");
          out.write("                                     ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='edit_mobil'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                         ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
//koneksi database--
                
                String kd_mobil=request.getParameter("kd_mobil");
                String nm_mobil=null;
                String harga=null;
                String stok=null;
                ResultSet rs = null;
                
                
                koneksi kon = new koneksi();
                rs = kon.stmt.executeQuery("SELECT * FROM mobil where kd_mobil = '" + kd_mobil +"'");
                    if (rs.next())
                    {
                        kd_mobil=rs.getString(1);
                        nm_mobil=rs.getString(2);
                        harga=rs.getString(3);
                        stok=rs.getString(4);
                    }
            
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <title>Ubah Data Master Mobil</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("       <form method=\"POST\" action=\"mobilServlet\">\n");
              out.write("        <center>\n");
              out.write("         <table border=\"2\">\n");
              out.write("             <tr>\n");
              out.write("                 <td colspan=\"3\"><h3>UBAH DATA MASTER MOBIL</h3></td>\n");
              out.write("             </tr>\n");
              out.write("             <tr>\n");
              out.write("                 <td>Kode Mobil</td>\n");
              out.write("                 <td>:</td>\n");
              out.write("                 <td><input type=\"text\" value=\"");
              out.print(kd_mobil);
              out.write("\" readonly=\"\">\n");
              out.write("                     <input type=\"hidden\" name=\"kd_mobil\" value=\"");
              out.print(kd_mobil);
              out.write("\"/> \n");
              out.write("                 </td>\n");
              out.write("             </tr>\n");
              out.write("             <tr>\n");
              out.write("                 <td>Nama Mobil</td>\n");
              out.write("                 <td>:</td>\n");
              out.write("                 <td><input type=\"text\" name=\"nm_mobil\" value=\"");
              out.print(nm_mobil);
              out.write("\"/>\n");
              out.write("                 </td>\n");
              out.write("             </tr>\n");
              out.write("             <tr>\n");
              out.write("                 <td>Harga</td>\n");
              out.write("                 <td>:</td>\n");
              out.write("                 <td><input type=\"text\" name=\"harga\" value=\"");
              out.print(harga);
              out.write("\"/>\n");
              out.write("                 </td>    \n");
              out.write("             </tr>\n");
              out.write("             <tr>\n");
              out.write("                 <td>Stok</td>\n");
              out.write("                 <td>:</td>\n");
              out.write("                 <td><input type=\"text\" name=\"stok\" value=\"");
              out.print(stok);
              out.write("\"/>\n");
              out.write("                 </td>    \n");
              out.write("             </tr>\n");
              out.write("             <tr>\n");
              out.write("                  <td colspan=\"3\">\n");
              out.write("                       <center>\n");
              out.write("                           <input type=\"Submit\" name=\"aksi\" value=\"Update\">\n");
              out.write("                           <input type=\"Reset\" value=\"Batal\">\n");
              out.write("                           <a href=\"beranda.jsp?hal=tampil_mobil\">[Lihat Data]</a>\n");
              out.write("                       </center>\n");
              out.write("                  </td>\n");
              out.write("             </tr>\n");
              out.write("         </table>\n");
              out.write("        </center>\n");
              out.write("       </form>\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("           \r\n");
              out.write("                                     ");
              int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
          out.write("\r\n");
          out.write("                                     ");
          if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                                     ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_3.setPageContext(_jspx_page_context);
          _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampil_supplier'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
          if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                         ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Data Master Supplier</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <table width=\"667\" height=\"150\" border=\"1\" align=\"center\">\n");
              out.write("            <tr align=\"center\">\n");
              out.write("                <td colspan=\"6\"><h3>DATA SUPPLIER</h3></td>\n");
              out.write("            </tr>\n");
              out.write("            <tr>\n");
              out.write("                <th>KODE SUPPLIER</th>\n");
              out.write("                <th>NAMA SUPPLIER</th>\n");
              out.write("                <th>ALAMAT</th>\n");
              out.write("                <th>TELPON </th>\n");
              out.write("                <th>AKSI</th>\n");
              out.write("                \n");
              out.write("            </tr>\n");
              out.write("            ");
//koneksi database--
                
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
                        
                    
            
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td>");
 out.println(kd_supp); 
              out.write("</td>\n");
              out.write("                <td>");
 out.println(nm_supp); 
              out.write("</td>\n");
              out.write("                <td>");
 out.println(alamat); 
              out.write("</td>\n");
              out.write("                <td>");
 out.println(telpon); 
              out.write("</td>\n");
              out.write("                <td><a href=\"beranda.jsp?hal=edit_supplier&kd_supp=");
 out.println(kd_supp); 
              out.write(" \">EDIT</a>\n");
              out.write("                 || <a href=\"supplierServlet?aksi=Delete&kd_supp=");
 out.println(kd_supp); 
              out.write(" \">HAPUS</a>\n");
              out.write("                </td>\n");
              out.write("                \n");
              out.write("            </tr>\n");
              out.write("            ");
}
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td colspan=\"6\" align=\"center\"><h3><a href=\"beranda.jsp?hal=input_supplier\">Tambah Data</a></h3></td>\n");
              out.write("            </tr>\n");
              out.write("        </table> \n");
              out.write("        ");
kon.close();
              out.write("\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("           \r\n");
              out.write("                                     ");
              int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
          out.write("\r\n");
          out.write("                                     ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_4.setPageContext(_jspx_page_context);
          _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='edit_supplier'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
          if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                         ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
//koneksi database--
                
                String kd_supp=request.getParameter("kd_supp");
                String nm_supp=null;
                String alamat=null;
                String telpon=null;
                ResultSet rs = null;
                
                
                koneksi kon = new koneksi();
                rs = kon.stmt.executeQuery("SELECT * FROM supplier where kd_supp = '" + kd_supp +"'");
                    if (rs.next())
                    {
                        kd_supp=rs.getString(1);
                        nm_supp=rs.getString(2);
                        alamat=rs.getString(3);
                        telpon=rs.getString(4);
                    }
            
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <title>Ubah Data Supplier</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("       <form method=\"POST\" action=\"supplierServlet\">\n");
              out.write("        <center>\n");
              out.write("         <table border=\"2\">\n");
              out.write("             <tr>\n");
              out.write("                 <td colspan=\"3\"><h3>UBAH DATA SUPPLIER</h3></td>\n");
              out.write("             </tr>\n");
              out.write("             <tr>\n");
              out.write("                 <td>Kode Supplier</td>\n");
              out.write("                 <td>:</td>\n");
              out.write("                 <td><input type=\"text\" value=\"");
              out.print(kd_supp);
              out.write("\" readonly=\"\">\n");
              out.write("                     <input type=\"hidden\" name=\"kd_supp\" value=\"");
              out.print(kd_supp);
              out.write("\"/> \n");
              out.write("                 </td>\n");
              out.write("             </tr>\n");
              out.write("             <tr>\n");
              out.write("                 <td>Nama Supplier</td>\n");
              out.write("                 <td>:</td>\n");
              out.write("                 <td><input type=\"text\" name=\"nm_supp\" value=\"");
              out.print(nm_supp);
              out.write("\"/>\n");
              out.write("                 </td>\n");
              out.write("             </tr>\n");
              out.write("             <tr>\n");
              out.write("                 <td>Alamat</td>\n");
              out.write("                 <td>:</td>\n");
              out.write("                 <td><input type=\"text\" name=\"alamat\" value=\"");
              out.print(alamat);
              out.write("\"/>\n");
              out.write("                 </td>    \n");
              out.write("             </tr>\n");
              out.write("             <tr>\n");
              out.write("                 <td>Telpon</td>\n");
              out.write("                 <td>:</td>\n");
              out.write("                 <td><input type=\"text\" name=\"telpon\" value=\"");
              out.print(telpon);
              out.write("\"/>\n");
              out.write("                 </td>    \n");
              out.write("             </tr>\n");
              out.write("             <tr>\n");
              out.write("                  <td colspan=\"3\">\n");
              out.write("                       <center>\n");
              out.write("                           <input type=\"Submit\" name=\"aksi\" value=\"Update\">\n");
              out.write("                           <input type=\"Reset\" value=\"Batal\">\n");
              out.write("                           <a href=\"beranda.jsp?hal=tampil_supplier\">[Lihat Data]</a>\n");
              out.write("                       </center>\n");
              out.write("                  </td>\n");
              out.write("             </tr>\n");
              out.write("         </table>\n");
              out.write("        </center>\n");
              out.write("       </form>\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("           \r\n");
              out.write("                                     ");
              int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
          out.write("\r\n");
          out.write("                                     ");
          if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                                     ");
          if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                             ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   </table>\r\n");
      out.write("                   <div class=\"footer\">                     \r\n");
      out.write("                        support by<a href=\"http://bsi.ac.id/\"> Tugas UAS prodi SIA</a>,<br>                       \r\n");
      out.write("                   </div>                 \r\n");
      out.write("               </div> \r\n");
      out.write("               <div style=\"clear:both\"></div>\r\n");
      out.write("             ");
      out.write("\r\n");
      out.write("           </div>\r\n");
      out.write("          ");
      out.write("\r\n");
      out.write("        </div>       \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='input_mobil'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                         ");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Input Mobil</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <form method=\"POST\" action=\"mobilServlet\">\n");
        out.write("         <center>\n");
        out.write("             <table border=\"0\">\n");
        out.write("                 <tr>\n");
        out.write("                     <td colspan=\"3\"><h3>INPUT DATA MASTER  MOBIL</h3></td>\n");
        out.write("                 </tr> \n");
        out.write("                 <tr>\n");
        out.write("                     <td>Kode Mobil</td>\n");
        out.write("                     <td>:</td>\n");
        out.write("                     <td><input type=\"text\" name=\"kd_mobil\"></td>\n");
        out.write("                 </tr>\n");
        out.write("                 <tr>\n");
        out.write("                     <td>Nama Mobil</td>\n");
        out.write("                     <td>:</td>\n");
        out.write("                     <td><input type=\"text\" name=\"nm_mobil\"></td>\n");
        out.write("                 </tr>\n");
        out.write("                 \n");
        out.write("                 <tr>\n");
        out.write("                     <td>Harga</td>\n");
        out.write("                     <td>:</td>\n");
        out.write("                     <td><input type=\"text\" name=\"harga\"></td>\n");
        out.write("                 </tr>\n");
        out.write("                 <tr>\n");
        out.write("                     <td>Stok</td>\n");
        out.write("                     <td>:</td>\n");
        out.write("                     <td><input type=\"text\" name=\"stok\"></td>\n");
        out.write("                 </tr>\n");
        out.write("                 <tr>\n");
        out.write("                     <td colspan=\"3\">\n");
        out.write("                       <center>\n");
        out.write("                           <input type=\"Submit\" name=\"aksi\" value=\"Simpan\">\n");
        out.write("                           <input type=\"Reset\" value=\"Batal\">\n");
        out.write("                           <a href=\"beranda.jsp?hal=tampil_mobil\">[Lihat Data]</a>\n");
        out.write("                       </center>   \n");
        out.write("                     </td>\n");
        out.write("                 </tr>\n");
        out.write("             </table>     \n");
        out.write("         </center>\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("           \r\n");
        out.write("                                     ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='input_supplier'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                         ");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Input Supplier</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <form method=\"POST\" action=\"supplierServlet\">\n");
        out.write("         <center>\n");
        out.write("             <table border=\"0\">\n");
        out.write("                 <tr>\n");
        out.write("                     <td colspan=\"3\"><h3>INPUT DATA SUPPLIER</h3></td>\n");
        out.write("                 </tr> \n");
        out.write("                 <tr>\n");
        out.write("                     <td>Kode Supplier</td>\n");
        out.write("                     <td>:</td>\n");
        out.write("                     <td><input type=\"text\" name=\"kd_supp\"></td>\n");
        out.write("                 </tr>\n");
        out.write("                 <tr>\n");
        out.write("                     <td>Nama Supplier</td>\n");
        out.write("                     <td>:</td>\n");
        out.write("                     <td><input type=\"text\" name=\"nm_supp\"></td>\n");
        out.write("                 </tr>\n");
        out.write("                 \n");
        out.write("                 <tr>\n");
        out.write("                     <td>Alamat</td>\n");
        out.write("                     <td>:</td>\n");
        out.write("                     <td><input type=\"text\" name=\"alamat\"></td>\n");
        out.write("                 </tr>\n");
        out.write("                 <tr>\n");
        out.write("                     <td>Telpon</td>\n");
        out.write("                     <td>:</td>\n");
        out.write("                     <td><input type=\"text\" name=\"telpon\"></td>\n");
        out.write("                 </tr>\n");
        out.write("                 <tr>\n");
        out.write("                     <td colspan=\"3\">\n");
        out.write("                       <center>\n");
        out.write("                           <input type=\"Submit\" name=\"aksi\" value=\"Simpan\">\n");
        out.write("                           <input type=\"Reset\" value=\"Batal\">\n");
        out.write("                           <a href=\"beranda.jsp?hal=tampil_supplier\">[Lihat Data]</a>\n");
        out.write("                       </center>   \n");
        out.write("                     </td>\n");
        out.write("                 </tr>\n");
        out.write("             </table>     \n");
        out.write("         </center>\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("           \r\n");
        out.write("                                     ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                         ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Home</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <p style=\"text-align: justify; font-size: 20px\">\n");
        out.write("            <img src=\"images/Mobil wisata.png\" style=\"float: left; margin: 0 9px 3px 0;\" width=\"35%\" height=\"35%\"/><br>\n");
        out.write("            SELAMAT DATANG<br><br>\n");
        out.write("            <span style=\"font-size: 20px; font-weight: bold\">KENYAMANAN ANDA, KEBAHAGIAAN KAMI !!!</span>\n");
        out.write("        </p>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write(" \r\n");
        out.write("                                     ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
