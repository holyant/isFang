package org.apache.jsp.shopManage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class shopAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>店铺新增|简易ERP</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("     body{      \r\n");
      out.write("        background: #728eaa;            \r\n");
      out.write("        margin:0px; \r\n");
      out.write("        padding:0px;\r\n");
      out.write("        text-align:center;\r\n");
      out.write("      }\r\n");
      out.write("      #prodContainer {\r\n");
      out.write("          width: 460px;\r\n");
      out.write("          margin: 30px auto;\r\n");
      out.write("          padding: 60px 30px;\r\n");
      out.write("          background: #c9d0de;\r\n");
      out.write("          border: 1px solid #e1e1e1;\r\n");
      out.write("      }\r\n");
      out.write("      .caption{\r\n");
      out.write("        font-size:large;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("        $(function(){ \r\n");
      out.write("            \r\n");
      out.write("        });\r\n");
      out.write("      </script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\" id=\"contentDiv\">\r\n");
      out.write("    <div id=\"prodContainer\" >\r\n");
      out.write("        <label class=\"caption\">\r\n");
      out.write("              店铺新增\r\n");
      out.write("        </label>\r\n");
      out.write("        <form class=\"form-horizontal\" action=\"shopManage!addShop\"  type=\"post\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"name\">\r\n");
      out.write("                    店家\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" name=\"shop.name\" id=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"person\">\r\n");
      out.write("                    联系人\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" id=\"person\" name=\"shop.person\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.person}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">         \r\n");
      out.write("                <label class=\"control-label\" for=\"addr\">\r\n");
      out.write("                    地址\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" name=\"shop.addr\" id=\"addr\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.addr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"phone\">\r\n");
      out.write("                    电话\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" name=\"shop.phone\" id=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"memo\">\r\n");
      out.write("                    备注\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" name=\"shop.memo\" id=\"memo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.memo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div><label style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fieldErrors.addError[0] }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</label></div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn\">\r\n");
      out.write("                        提交\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a href=\"javascript:content('shopList')\" style=\"margin-left:40px;\"><span class=\"btn\">取消</span></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>  \r\n");
      out.write("      </div> \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
