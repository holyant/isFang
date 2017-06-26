<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>产品管理|简易ERP</title>
      <script type="text/javascript">
        $(function(){
            loadPros(1);
        });
        function loadPros(id){
          $('#dataList').load("proList?query.label="+id);
        }
      </script>
  </head>

  <body>
<br/>
    <div class="container" id="contentDiv">
      <!-- Main component for a primary marketing message or call to action -->
       </br>
       </br>
       <div class="input-prepend" >
         <h3>
          <c:forEach var="list" items="${list}" varStatus="status">
            <a href="javascript:loadPros(${list.id})"><span class="btn">${list.label}</span></a>
          </c:forEach>
         </h3>
       </div>
      <div id="dataList"> </div>
    </div>
  </body>
</html>
