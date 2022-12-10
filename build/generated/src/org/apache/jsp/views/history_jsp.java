package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Controller.ProductController;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/headgame.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("History", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navbarhistory.jsp", out, false);
      out.write('\n');
      out.write(' ');

            ProductController pc = new ProductController();

            String search = "";
            ResultSet rs;

            if (request.getParameter("search") != null) {
                search = request.getParameter("search");
            } 

            if (search.equals("")) {
                rs = pc.get();
            } else {
                rs = pc.getByName(search);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Begin page content -->\n");
      out.write("        <main class=\"flex-shrink-0\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row pt-5\">\n");
      out.write("                    <div class=\"col-6\">\n");
      out.write("                        <form action=\"history\" method=\"GET\">\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"form-label\">Search</label>\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"search\" value=\"");
      out.print( search);
      out.write("\" />\n");
      out.write("                                    <span class=\"input-group-append\">\n");
      out.write("                                        <button class=\"input-group-text bg-light d-block\">\n");
      out.write("                                            <i class='bx bxs-search'></i>\n");
      out.write("                                        </button>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row pt-5\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <table class=\"table table-striped table-hover\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Nama Barang</th>\n");
      out.write("                                    <th>Jenis Barang</th>\n");
      out.write("                                    <th>Stok</th>\n");
      out.write("                                    <th>Aksi</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
 while (rs.next()) {
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print( rs.getString("Username"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString("UserID"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString("Payment"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString("Product"));
      out.write("</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <form action=\"delete?UserID=");
      out.print( rs.getString("UserID") );
      out.write("\" method=\"POST\"\n");
      out.write("                                              onsubmit=\"return confirm('Are you sure want to delete the data?')\"\n");
      out.write("                                        >\n");
      out.write("                                            <a href=\"edit?id=");
      out.print( rs.getString("UserID") );
      out.write("\" class=\"btn btn-sm btn-info\">Edit</a>\n");
      out.write("                                            <input type=\"hidden\" name=\"id\" value=\"");
      out.print( rs.getString("UserID"));
      out.write("\" />\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-sm btn-danger\">Delete</button>\n");
      out.write("                                        </form>\n");
      out.write("                                        \n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
