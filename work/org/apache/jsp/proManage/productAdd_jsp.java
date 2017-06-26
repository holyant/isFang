package org.apache.jsp.proManage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class productAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>产品新增|简易ERP</title>\r\n");
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
      out.write("              产品新增\r\n");
      out.write("        </label>\r\n");
      out.write("        <form class=\"form-horizontal\" action=\"proManage!addProduct\"  type=\"post\">\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"label\">\r\n");
      out.write("                    品牌\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <select id=\"label\" name=\"product.label\" >\r\n");
      out.write("                      ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"no\">\r\n");
      out.write("                    商品编号\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" name=\"product.no\" id=\"no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"name\">\r\n");
      out.write("                    商品名称\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" id=\"name\" name=\"product.name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">         \r\n");
      out.write("                <label class=\"control-label\" for=\"size\">\r\n");
      out.write("                    规格\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" name=\"product.size\" id=\"size\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"unit\">\r\n");
      out.write("                    单位\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" name=\"product.unit\" id=\"unit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.unit}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"cost\">\r\n");
      out.write("                    单价\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" name=\"product.cost\" id=\"cost\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.cost}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\" for=\"memo\">\r\n");
      out.write("                    备注\r\n");
      out.write("                </label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <input type=\"text\" name=\"product.memo\" id=\"memo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.memo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div><label style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fieldErrors.addError[0] }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</label></div>\r\n");
      out.write("            <div class=\"control-group\">\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn\" style=\"\">提交</button>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /proManage/productAdd.jsp(55,22) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("list");
    // /proManage/productAdd.jsp(55,22) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /proManage/productAdd.jsp(55,22) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_s_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                      ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /proManage/productAdd.jsp(56,51) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("%{product.label==list.id}");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]++;
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write(" selected = \"selected\" ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]--;
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }
}
