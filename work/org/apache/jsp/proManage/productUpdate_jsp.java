package org.apache.jsp.proManage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class productUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>产品修改|简易ERP</title>\r\n");
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
      out.write("        $(function(){\r\n");
      out.write("           $(\"#confirmBtn\").click(function(){\r\n");
      out.write("              var cost = $(\"[name='cost']\").val();\r\n");
      out.write("              if(isNaN(cost)){\r\n");
      out.write("                $(\"#updateError\").text(\"单价必须为数字类型!\");\r\n");
      out.write("                return;\r\n");
      out.write("              }\r\n");
      out.write("              var url = \"proManage!modifyUpdate?id=\"+$(\"[name='id']\").val()+\"&name=\"+$(\"[name='name']\").val()+\"&size=\"+$(\"[name='size']\").val()+\"&unit=\"+$(\"[name='unit']\").val()+\"&memo=\"+$(\"[name='memo']\").val()+\"&cost=\"+cost;\r\n");
      out.write("              window.location=encodeURI(url);\r\n");
      out.write("           })\r\n");
      out.write("        });\r\n");
      out.write("      </script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\" id=\"contentDiv\">\r\n");
      out.write("    <div id=\"prodContainer\" >\r\n");
      out.write("        <label class=\"caption\">\r\n");
      out.write("              产品修改\r\n");
      out.write("        </label>\r\n");
      out.write("        <form class=\"form-horizontal\" action=\"proManage!modifyUpdate\"  type=\"post\">\r\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"inputEmail\">\r\n");
      out.write("                    品牌\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" disabled=\"true\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"inputEmail\">\r\n");
      out.write("                    商品编号\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" disabled=\"true\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"name\">\r\n");
      out.write("                    商品名称\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" id=\"name\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">         \r\n");
      out.write("                <label class=\"control-label\" for=\"size\">\r\n");
      out.write("                    规格\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"size\" id=\"size\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"unit\">\r\n");
      out.write("                    单位\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.unit}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"unit\" id=\"unit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.unit}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"cost\">\r\n");
      out.write("                    单价\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.cost}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"cost\" id=\"cost\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.cost}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"memo\">\r\n");
      out.write("                    备注\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.memo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"memo\" id=\"memo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.memo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div><label id=\"updateError\" style=\"color:red\"></label></div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn\" id=\"confirmBtn\">\r\n");
      out.write("                        确认\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a href=\"javascript:content(1)\" style=\"margin-left:40px;\"><span class=\"btn\">取消</span></a>\r\n");
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
