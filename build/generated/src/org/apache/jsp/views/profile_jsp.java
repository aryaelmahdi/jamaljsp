package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Controller.ProductController;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Profile</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/headgame.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Valorant", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("     ");

            ProductController pc = new ProductController();
            ResultSet rs;
            String nama = (String)request.getSession().getAttribute("nama");
           
            if (nama!=null) {
                rs = pc.getUsersByName(nama);
            } else {
                rs = (ResultSet)request.getAttribute("rs");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navbarlogin.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"col-12\" id=\"data2\">\n");
      out.write("        <div class=\"row background-data\">\n");
      out.write("            <h2>Data Anda</h2>\n");
      out.write("            <div class=\"col-12 \">\n");
      out.write("                <p>Nama</p>\n");
      out.write("                <input type=\"text\" value=\"\" class=\"input-submit\" id=\"nama\" ");
      out.print( request.getSession(true).getAttribute("nama") );
      out.write(">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <p>Login ID</p>\n");
      out.write("                <input type=\"text\" value=\"\" class=\"input-submit\" id=\"uid\" ");
      out.print( rs.getString("loginid"));
      out.write(">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <p>Password</p>\n");
      out.write("                <input type=\"password\" value=\"\" class=\"input-submit\" id=\"uid\" ");
      out.print( rs.getString("password"));
      out.write(">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <button type=\"submit\" class=\"input-submit2\">Update</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
}
