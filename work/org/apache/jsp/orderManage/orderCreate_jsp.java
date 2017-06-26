package org.apache.jsp.orderManage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class orderCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script type=\"text/javascript\" src=\"/isFang/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/isFang/css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/isFang/js/DateFormat.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <title>订单管理|简易ERP</title>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("        var no=0;\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $('#statCycleDiv').datetimepicker({});\r\n");
      out.write("            //初始化物品列表\r\n");
      out.write("            // initPros();\r\n");
      out.write("            $(\"#statCycle\").val(new Date().Format(\"yyyy-MM-dd\"));\r\n");
      out.write("\r\n");
      out.write("            $(\"#label\").change(function(){\r\n");
      out.write("                initPros();          \r\n");
      out.write("            });\r\n");
      out.write("        })\r\n");
      out.write("        //添加商品\r\n");
      out.write("        var proIds = new Array();\r\n");
      out.write("        var nums = new Array();\r\n");
      out.write("        function addPro(){\r\n");
      out.write("          var proName = document.order.pros.options[document.order.pros.selectedIndex].text;\r\n");
      out.write("          var num = $(\"#num\").val();\r\n");
      out.write("          proIds[no] = $(\"#pros\").val();\r\n");
      out.write("          nums[no] = num;\r\n");
      out.write("          \r\n");
      out.write("          var htmlStr = '<tr class=\"row'+no+'\"><td>'+proName+'</td><td>'+num+'</td><td><a class=\"btn\" href=\"javascript:delPro('+no+')\" role=\"button\">删除</a></td></tr>';\r\n");
      out.write("          $(\".formTr\").before(htmlStr);\r\n");
      out.write("          no++;\r\n");
      out.write("          $(\"#unit\").val('');\r\n");
      out.write("          $(\"#num\").val('1');\r\n");
      out.write("          initPros();\r\n");
      out.write("        }\r\n");
      out.write("        //初始化商品下拉框\r\n");
      out.write("        function initPros(){\r\n");
      out.write("          $.getJSON(\"proManage!getProducts?&query.label=\"+$(\"#label\").val()+\"&data=\"+new Date(), function(data){\r\n");
      out.write("              var htmlStr = \"\";\r\n");
      out.write("              for(var i=0;i<data.length;i++){\r\n");
      out.write("                var optionStr = \"<option value='\"+data[i].id+\"' >\"+data[i].name+\" \"+data[i].size+\"</option>\";\r\n");
      out.write("                htmlStr+=optionStr;\r\n");
      out.write("              }\r\n");
      out.write("              $(\"#pros\").html(htmlStr);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        //删除\r\n");
      out.write("        function delPro(id){\r\n");
      out.write("          $(\".row\"+id).remove();\r\n");
      out.write("        }\r\n");
      out.write("        //保存\r\n");
      out.write("        function save(){\r\n");
      out.write("          var prosInfo = \"[\";\r\n");
      out.write("          var j = 0;\r\n");
      out.write("          if(no>0){\r\n");
      out.write("            for(var i=0;i<no;i++){\r\n");
      out.write("              if($(\".row\"+i).html()){\r\n");
      out.write("                if(prosInfo!=\"[\")\r\n");
      out.write("                  prosInfo+=\",\"\r\n");
      out.write("                prosInfo += \"{'proId':'\"+proIds[i]+\"','amount':'\"+nums[i]+\"'}\";\r\n");
      out.write("              }\r\n");
      out.write("            }\r\n");
      out.write("          }\r\n");
      out.write("          if(prosInfo!=\"[\")\r\n");
      out.write("            prosInfo+=\",\"\r\n");
      out.write("          prosInfo += \"{'proId':'\"+$(\"#pros\").val()+\"','amount':'\"+$(\"#num\").val()+\"'}\";\r\n");
      out.write("          var serial;\r\n");
      out.write("          var orderDate = $(\"#statCycle\").val();\r\n");
      out.write("          orderDate = orderDate.replace(/\\-/g,\"\");\r\n");
      out.write("          $.get(\"orderManage!save?\", {\"orderDate\":orderDate,\"label\":$(\"#label\").val(),\"client\":$(\"#client\").val(),\"prosInfo\":prosInfo+\"]\"},function(){\r\n");
      out.write("            alert(\"保存成功\");\r\n");
      out.write("            window.location.reload();\r\n");
      out.write("          });\r\n");
      out.write("          \r\n");
      out.write("        }\r\n");
      out.write("      </script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("   </br>\r\n");
      out.write("   </br>\r\n");
      out.write("<div class=\"container\" id=\"contentDiv\">\r\n");
      out.write("  \r\n");
      out.write("      <form name=\"order\" class=\"form-horizontal\">\r\n");
      out.write("  <fieldset>\r\n");
      out.write("    <legend>订单新增</legend>\r\n");
      out.write("    <div >\r\n");
      out.write("      <div id=\"query\" >\r\n");
      out.write("        日期选择:\r\n");
      out.write("        <div  id=\"statCycleDiv\" class=\"input-append date\">\r\n");
      out.write("          <input id=\"statCycle\" name=\"statCycle\" data-format=\"yyyy-MM-dd\" type=\"text\" class=\"span2\" ></input>\r\n");
      out.write("          <span class=\"add-on\">\r\n");
      out.write("            <i data-time-icon=\"icon-time\" data-date-icon=\"icon-calendar\"></i>\r\n");
      out.write("          </span>\r\n");
      out.write("        </div>\r\n");
      out.write("        选择品牌:\r\n");
      out.write("        <select id=\"label\" name=\"label\" class=\"span2\">\r\n");
      out.write("          ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </select>\r\n");
      out.write("        选择客户:\r\n");
      out.write("        <select id=\"client\" class=\"span3\">\r\n");
      out.write("          ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("        </select>\r\n");
      out.write("      </div>\r\n");
      out.write("    </br>\r\n");
      out.write("        <p><a class=\"btn\" href=\"javascript:addPro();\" role=\"button\">添加</a></p>\r\n");
      out.write("        <table class=\"table table-bordered table-hover table-condensed\">\r\n");
      out.write("          <thead>\r\n");
      out.write("            <th>商品名称</th>\r\n");
      out.write("            <th>数量</th>\r\n");
      out.write("            <th>操作</th>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tr class=\"formTr\">\r\n");
      out.write("            <td>\r\n");
      out.write("              <select id=\"pros\" class=\"span3\" name=\"pros\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("              </select>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td><input id=\"num\" type=\"text\" class=\"span2\" value=\"1\"></input></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <p><a class=\"btn\" href=\"javascript:save()\" role=\"button\">保存</a></p>\r\n");
      out.write("      </div>\r\n");
      out.write("  </fieldset>\r\n");
      out.write("  <iframe id=\"download\" src=\"\" scrolling=\"no\" frameborder=\"0\" ></iframe>\r\n");
      out.write("  </div>\r\n");
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
    // /orderManage/orderCreate.jsp(102,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("list");
    // /orderManage/orderCreate.jsp(102,10) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /orderManage/orderCreate.jsp(102,10) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("            <a href=\"javascript:loadPros(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\"><span class=\"btn\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></a>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /orderManage/orderCreate.jsp(109,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("shop");
    // /orderManage/orderCreate.jsp(109,10) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shops}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /orderManage/orderCreate.jsp(109,10) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /orderManage/orderCreate.jsp(125,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("pro");
    // /orderManage/orderCreate.jsp(125,16) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pros}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /orderManage/orderCreate.jsp(125,16) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                  <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pro.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pro.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pro.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }
}
