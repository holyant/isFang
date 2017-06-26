<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<!--<![endif]-->

<html xmlns="http://www.w3.org/1999/xhtml" class="not-ie" lang="en">
   <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <title> <decorator:title default="简易ERP" /> </title>
    
    <script type="text/javascript" src="${ctx}/js/jquery-1.10.2.js"></script>
    <script type="text/javascript" src="${ctx}/js/jquery-ui-1.10.4.min.js"></script>
    <script type="text/javascript" src="${ctx}/js/nav.js?rnd="+Math.random()></script>
    
    <link rel="stylesheet" href="${ctx}/css/bootstrap.css">
    <link rel="stylesheet" href="${ctx}/css/jquery-ui-1.7.2.custom.css" >
    <link rel="stylesheet" href="${ctx}/css/theme.css?rnd="+Math.random()>
    <decorator:head />
  </head>
  
  <body>
  	<div id="main_container">
		<!-- include file="/pages/core/common/header.jsp" -->
	    <div class="main_content">
	    	<%@ include file="/common/menu.jsp"%>
	    	<div class="center_content">  
	    		<decorator:body/>
	    	</div>
	    	<div class="clear"></div>
	    </div>
	    <!--include file="/pages/core/common/footer.jsp" -->
	</div>
  
  </body>
  

</html>