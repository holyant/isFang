<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>订单管理|简易ERP</title>
    <script type="text/javascript" src="/isFang/js/bootstrap-datetimepicker.js"></script>
    <link rel="stylesheet" type="text/css" href="/isFang/css/bootstrap-datetimepicker.min.css">
    <script type="text/javascript" src="/isFang/js/DateFormat.js"></script>
    <script type="text/javascript">
      $(function(){
          $('#statCycleStartDiv').datetimepicker({});
          $('#statCycleEndDiv').datetimepicker({});
      });
      function search(){
        var shopId = $("#client").val();
        var statCycleStart = $("#statCycleStart").val();
        var statCycleEnd = $("#statCycleEnd").val();
        $("#waitDialog").css("display","block");
        var url = "orderList!showOrders?query.shopId="+shopId+"&query.statCycleStart="+statCycleStart+"&query.statCycleEnd="+statCycleEnd+"&pager.pageNum="+$("#pageNum").val()+"&pager.flag="+$("#flag").val()+"&pager.totalPage="+$("#totalPage").val();
        $("#dataList").load(url,function(){
            $("#waitDialog").css("display","none");
        });
      }
    </script>
  </head>

  <body>
<br/>
    <div class="container" id="contentDiv">
      <!-- Main component for a primary marketing message or call to action -->
       </br>
       </br>
       <div style="border-bottom:solid grey 1px;margin-bottom:20px;">
        <h4>查询条件</h4>
       </div>
       <form class="form-horizontal" action="">
         <span for="client">店家:</span>
         <select id="client" class="span3">
          <option value="999">全部</option>
          <c:forEach var="shop" items="${shops}" varStatus="status">
            <option value="${shop.id}">${shop.name}</option>
          </c:forEach>  
         </select>
          <span for="statCycleStartDiv">起始日期:</span>
          <div  id="statCycleStartDiv" class="input-append date">
            <input id="statCycleStart" name="statCycleStart" data-format="yyyy-MM-dd" type="text" class="span2" ></input>
            <span class="add-on">
              <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
            </span>
          </div>
          <span for="statCycleEndDiv">结束日期:</span>
          <div  id="statCycleEndDiv" class="input-append date">
            <input id="statCycleEnd" name="statCycleEnd" data-format="yyyy-MM-dd" type="text" class="span2" ></input>
            <span class="add-on">
              <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
            </span>
          </div>
          <a class="btn" href="javascript:search()" role="button" style="margin-left:20px;">查询</a>

      </form>
      <div style="position:relative;width:100%;height:20px;">
        <div id="waitDialog" class="progress progress-striped active" style="display:none;height:20px;width:100px;float:right;">
          <div class="bar" style="width: 100%;"></div>
        </div>
      </div>
      
      <div id="dataList"> </div>
    </div>
    <input type="hidden" id="pageNum" value=""/>
    <input type="hidden" id="flag" value=""/>
    <input type="hidden" id="totalPage" val="${pager.totalPage}">
  </body>

</html>
