package org.apache.jsp.orderManage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class orderMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>订单管理|简易ERP</title>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/isFang/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/isFang/css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/isFang/js/DateFormat.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      $(function(){\r\n");
      out.write("          $('#statCycleStartDiv').datetimepicker({});\r\n");
      out.write("          $('#statCycleEndDiv').datetimepicker({});\r\n");
      out.write("      });\r\n");
      out.write("      function search(){\r\n");
      out.write("        var shopId = $(\"#client\").val();\r\n");
      out.write("        var statCycleStart = $(\"#statCycleStart\").val();\r\n");
      out.write("        var statCycleEnd = $(\"#statCycleEnd\").val();\r\n");
      out.write("        $(\"#waitDialog\").css(\"display\",\"block\");\r\n");
      out.write("        var url = \"orderList!showOrders?query.shopId=\"+shopId+\"&query.statCycleStart=\"+statCycleStart+\"&query.statCycleEnd=\"+statCycleEnd+\"&pager.pageNum=\"+$(\"#pageNum\").val()+\"&pager.flag=\"+$(\"#flag\").val()+\"&pager.totalPage=\"+$(\"#totalPage\").val();\r\n");
      out.write("        $(\"#dataList\").load(url,function(){\r\n");
      out.write("            $(\"#waitDialog\").css(\"display\",\"none\");\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("<br/>\r\n");
      out.write("    <div class=\"container\" id=\"contentDiv\">\r\n");
      out.write("      <!-- Main component for a primary marketing message or call to action -->\r\n");
      out.write("       </br>\r\n");
      out.write("       </br>\r\n");
      out.write("       <div style=\"border-bottom:solid grey 1px;margin-bottom:20px;\">\r\n");
      out.write("        <h4>查询条件</h4>\r\n");
      out.write("       </div>\r\n");
      out.write("       <form class=\"form-horizontal\" action=\"\">\r\n");
      out.write("         <span for=\"client\">店家:</span>\r\n");
      out.write("         <select id=\"client\" class=\"span3\">\r\n");
      out.write("          <option value=\"999\">全部</option>\r\n");
      out.write("          ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("         </select>\r\n");
      out.write("          <span for=\"statCycleStartDiv\">起始日期:</span>\r\n");
      out.write("          <div  id=\"statCycleStartDiv\" class=\"input-append date\">\r\n");
      out.write("            <input id=\"statCycleStart\" name=\"statCycleStart\" data-format=\"yyyy-MM-dd\" type=\"text\" class=\"span2\" ></input>\r\n");
      out.write("            <span class=\"add-on\">\r\n");
      out.write("              <i data-time-icon=\"icon-time\" data-date-icon=\"icon-calendar\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </div>\r\n");
      out.write("          <span for=\"statCycleEndDiv\">结束日期:</span>\r\n");
      out.write("          <div  id=\"statCycleEndDiv\" class=\"input-append date\">\r\n");
      out.write("            <input id=\"statCycleEnd\" name=\"statCycleEnd\" data-format=\"yyyy-MM-dd\" type=\"text\" class=\"span2\" ></input>\r\n");
      out.write("            <span class=\"add-on\">\r\n");
      out.write("              <i data-time-icon=\"icon-time\" data-date-icon=\"icon-calendar\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </div>\r\n");
      out.write("          <a class=\"btn\" href=\"javascript:search()\" role=\"button\" style=\"margin-left:20px;\">查询</a>\r\n");
      out.write("\r\n");
      out.write("      </form>\r\n");
      out.write("      <div style=\"position:relative;width:100%;height:20px;\">\r\n");
      out.write("        <div id=\"waitDialog\" class=\"progress progress-striped active\" style=\"display:none;height:20px;width:100px;float:right;\">\r\n");
      out.write("          <div class=\"bar\" style=\"width: 100%;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <div id=\"dataList\"> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <input type=\"hidden\" id=\"pageNum\" value=\"\"/>\r\n");
      out.write("    <input type=\"hidden\" id=\"flag\" value=\"\"/>\r\n");
      out.write("    <input type=\"hidden\" id=\"totalPage\" val=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pager.totalPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
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
    // /orderManage/orderMain.jsp(41,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("shop");
    // /orderManage/orderMain.jsp(41,10) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shops}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /orderManage/orderMain.jsp(41,10) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("          ");
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
}
