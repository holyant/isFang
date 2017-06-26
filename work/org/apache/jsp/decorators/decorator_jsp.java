package org.apache.jsp.decorators;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class decorator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/common/menu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<!--[if lt IE 7 ]><html class=\"ie ie6\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7 ]><html class=\"ie ie7\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!-->\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" class=\"not-ie\" lang=\"en\">\r\n");
      out.write("   <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("    <title> ");
      if (_jspx_meth_decorator_005ftitle_005f0(_jspx_page_context))
        return;
      out.write(" </title>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-ui-1.10.4.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/nav.js?rnd=\"+Math.random()></script>\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/jquery-ui-1.7.2.custom.css\" >\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/theme.css?rnd=\"+Math.random()>\r\n");
      out.write("    ");
      if (_jspx_meth_decorator_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  \t<div id=\"main_container\">\r\n");
      out.write("\t\t<!-- include file=\"/pages/core/common/header.jsp\" -->\r\n");
      out.write("\t    <div class=\"main_content\">\r\n");
      out.write("\t    \t");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/isFang/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"container\" id=\"contentDiv\">\r\n");
      out.write(" <div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("   <div class=\"navbar-inner\">\r\n");
      out.write("     <div class=\"container\">\r\n");
      out.write("       <a class=\"brand\" href=\"/isFang/main.jsp\">\r\n");
      out.write("         简易ERP\r\n");
      out.write("       </a>\r\n");
      out.write("       <div class=\"nav-collapse collapse\">\r\n");
      out.write("         <ul class=\"nav\">\r\n");
      out.write("           <li class=\"dropdown\">\r\n");
      out.write("             <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("               订单管理\r\n");
      out.write("               <b class=\"caret\">\r\n");
      out.write("               </b>\r\n");
      out.write("             </a>\r\n");
      out.write("             <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dLabel\">\r\n");
      out.write("               <li>\r\n");
      out.write("                 <a href=\"javascript:content('orderSearch')\">\r\n");
      out.write("                   订单查询\r\n");
      out.write("                 </a>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                 <a href=\"javascript:content(2)\">\r\n");
      out.write("                   订单新增\r\n");
      out.write("                 </a>\r\n");
      out.write("               </li>\r\n");
      out.write("             </ul>\r\n");
      out.write("           </li>\r\n");
      out.write("           <li class=\"dropdown\">\r\n");
      out.write("             <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("               商品管理\r\n");
      out.write("               <b class=\"caret\">\r\n");
      out.write("               </b>\r\n");
      out.write("             </a>\r\n");
      out.write("             <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dLabel\">\r\n");
      out.write("               <li>\r\n");
      out.write("                 <a href=\"javascript:content(1)\">\r\n");
      out.write("                   产品列表\r\n");
      out.write("                 </a>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                 <a href=\"javascript:content(3)\">\r\n");
      out.write("                   产品新增\r\n");
      out.write("                 </a>\r\n");
      out.write("               </li>\r\n");
      out.write("             </ul>\r\n");
      out.write("           </li>\r\n");
      out.write("\r\n");
      out.write("           <li class=\"dropdown\">\r\n");
      out.write("             <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("               店家管理\r\n");
      out.write("               <b class=\"caret\">\r\n");
      out.write("               </b>\r\n");
      out.write("             </a>\r\n");
      out.write("             <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dLabel\">\r\n");
      out.write("               <li>\r\n");
      out.write("                 <a href=\"javascript:content('shopList')\">\r\n");
      out.write("                   店家列表\r\n");
      out.write("                 </a>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                 <a href=\"javascript:content('addShop')\">\r\n");
      out.write("                   店家新增\r\n");
      out.write("                 </a>\r\n");
      out.write("               </li>\r\n");
      out.write("             </ul>\r\n");
      out.write("           </li>\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("         </ul>\r\n");
      out.write("       </div>\r\n");
      out.write("     </div>\r\n");
      out.write("   </div>\r\n");
      out.write(" </div>");
      out.write("\r\n");
      out.write("\t    \t<div class=\"center_content\">  \r\n");
      out.write("\t    \t\t");
      if (_jspx_meth_decorator_005fbody_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t    \t</div>\r\n");
      out.write("\t    \t<div class=\"clear\"></div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <!--include file=\"/pages/core/common/footer.jsp\" -->\r\n");
      out.write("\t</div>\r\n");
      out.write("  \r\n");
      out.write("  </body>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /decorators/decorator.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /decorators/decorator.jsp(4,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_decorator_005ftitle_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_decorator_005ftitle_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_decorator_005ftitle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005ftitle_005f0.setParent(null);
    // /decorators/decorator.jsp(18,12) name = default type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_decorator_005ftitle_005f0.setDefault("简易ERP");
    int _jspx_eval_decorator_005ftitle_005f0 = _jspx_th_decorator_005ftitle_005f0.doStartTag();
    if (_jspx_th_decorator_005ftitle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.reuse(_jspx_th_decorator_005ftitle_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.reuse(_jspx_th_decorator_005ftitle_005f0);
    return false;
  }

  private boolean _jspx_meth_decorator_005fhead_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_decorator_005fhead_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_decorator_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fhead_005f0.setParent(null);
    int _jspx_eval_decorator_005fhead_005f0 = _jspx_th_decorator_005fhead_005f0.doStartTag();
    if (_jspx_th_decorator_005fhead_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.reuse(_jspx_th_decorator_005fhead_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.reuse(_jspx_th_decorator_005fhead_005f0);
    return false;
  }

  private boolean _jspx_meth_decorator_005fbody_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_decorator_005fbody_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fbody_005f0.setParent(null);
    int _jspx_eval_decorator_005fbody_005f0 = _jspx_th_decorator_005fbody_005f0.doStartTag();
    if (_jspx_th_decorator_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
    return false;
  }
}
