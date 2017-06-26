<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <script type="text/javascript" src="/isFang/js/bootstrap-datetimepicker.js"></script>
    <link rel="stylesheet" type="text/css" href="/isFang/css/bootstrap-datetimepicker.min.css">
    <script type="text/javascript" src="/isFang/js/DateFormat.js"></script>
    
    <title>订单管理|简易ERP</title>
      <script type="text/javascript">
        var no=0;
        $(function(){
            $('#statCycleDiv').datetimepicker({});
            //初始化物品列表
            // initPros();
            $("#statCycle").val(new Date().Format("yyyy-MM-dd"));

            $("#label").change(function(){
                initPros();          
            });
        })
        //添加商品
        var proIds = new Array();
        var nums = new Array();
        function addPro(){
          var proName = document.order.pros.options[document.order.pros.selectedIndex].text;
          var num = $("#num").val();
          proIds[no] = $("#pros").val();
          nums[no] = num;
          
          var htmlStr = '<tr class="row'+no+'"><td>'+proName+'</td><td>'+num+'</td><td><a class="btn" href="javascript:delPro('+no+')" role="button">删除</a></td></tr>';
          $(".formTr").before(htmlStr);
          no++;
          $("#unit").val('');
          $("#num").val('1');
          initPros();
        }
        //初始化商品下拉框
        function initPros(){
          $.getJSON("proManage!getProducts?&query.label="+$("#label").val()+"&data="+new Date(), function(data){
              var htmlStr = "";
              for(var i=0;i<data.length;i++){
                var optionStr = "<option value='"+data[i].id+"' >"+data[i].name+" "+data[i].size+"</option>";
                htmlStr+=optionStr;
              }
              $("#pros").html(htmlStr);
            });
        }
        
        //删除
        function delPro(id){
          $(".row"+id).remove();
        }
        //保存
        function save(){
          var prosInfo = "[";
          var j = 0;
          if(no>0){
            for(var i=0;i<no;i++){
              if($(".row"+i).html()){
                if(prosInfo!="[")
                  prosInfo+=","
                prosInfo += "{'proId':'"+proIds[i]+"','amount':'"+nums[i]+"'}";
              }
            }
          }
          if(prosInfo!="[")
            prosInfo+=","
          prosInfo += "{'proId':'"+$("#pros").val()+"','amount':'"+$("#num").val()+"'}";
          var serial;
          var orderDate = $("#statCycle").val();
          orderDate = orderDate.replace(/\-/g,"");
          $.get("orderManage!save?", {"orderDate":orderDate,"label":$("#label").val(),"client":$("#client").val(),"prosInfo":prosInfo+"]"},function(){
            alert("保存成功");
            window.location.reload();
          });
          
        }
      </script>
  </head>

  <body>
   </br>
   </br>
<div class="container" id="contentDiv">
  
      <form name="order" class="form-horizontal">
  <fieldset>
    <legend>订单新增</legend>
    <div >
      <div id="query" >
        日期选择:
        <div  id="statCycleDiv" class="input-append date">
          <input id="statCycle" name="statCycle" data-format="yyyy-MM-dd" type="text" class="span2" ></input>
          <span class="add-on">
            <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
          </span>
        </div>
        选择品牌:
        <select id="label" name="label" class="span2">
          <c:forEach var="list" items="${list}" varStatus="status">
            <option value="${list.id}">${list.label}</option>
            <a href="javascript:loadPros(${list.id})"><span class="btn">${list.label}</span></a>
          </c:forEach>
        </select>
        选择客户:
        <select id="client" class="span3">
          <c:forEach var="shop" items="${shops}" varStatus="status">
            <option value="${shop.id}">${shop.name}</option>
          </c:forEach>  
        </select>
      </div>
    </br>
        <p><a class="btn" href="javascript:addPro();" role="button">添加</a></p>
        <table class="table table-bordered table-hover table-condensed">
          <thead>
            <th>商品名称</th>
            <th>数量</th>
            <th>操作</th>
          </thead>
          <tr class="formTr">
            <td>
              <select id="pros" class="span3" name="pros">
                <c:forEach var="pro" items="${pros}" varStatus="status">
                  <option value="${pro.id}">${pro.name} ${pro.size}</option>
                </c:forEach> 
              </select>
            </td>
            <td><input id="num" type="text" class="span2" value="1"></input></td>
            <td></td>
          </tr>
        </table>
        <p><a class="btn" href="javascript:save()" role="button">保存</a></p>
      </div>
  </fieldset>
  <iframe id="download" src="" scrolling="no" frameborder="0" ></iframe>
  </div>
  </body>
</html>
