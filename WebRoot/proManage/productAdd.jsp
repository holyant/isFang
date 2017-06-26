<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>产品新增|简易ERP</title>
    <link rel="shortcut icon" href="img/favicon.png">

    <title></title>
    <style type="text/css">
     body{      
        background: #728eaa;            
        margin:0px; 
        padding:0px;
        text-align:center;
      }
      #prodContainer {
          width: 460px;
          margin: 30px auto;
          padding: 60px 30px;
          background: #c9d0de;
          border: 1px solid #e1e1e1;
      }
      .caption{
        font-size:large;
        margin-bottom: 20px;
      }
    </style>
      <script type="text/javascript">
        $(function(){ 
            
        });
      </script>
  </head>

  <body>
    <div class="container" id="contentDiv">
    <div id="prodContainer" >
        <label class="caption">
              产品新增
        </label>
        <form class="form-horizontal" action="proManage!addProduct"  type="post">
            <div class="control-group">
                <label class="control-label" for="label">
                    品牌
                </label>
                <div class="controls">
                    <select id="label" name="product.label" >
                      <c:forEach var="list" items="${list}" varStatus="status">
                        <option value="${list.id}" <s:if test="%{product.label==list.id}"> selected = "selected" </s:if>>${list.label}</option>
                      </c:forEach>  
                    </select>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="no">
                    商品编号
                </label>
                <div class="controls">
                    <input type="text" name="product.no" id="no" value="${p.no}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="name">
                    商品名称
                </label>
                <div class="controls">
                    <input type="text" id="name" name="product.name" value="${p.name}">
                </div>
            </div>
            <div class="control-group">         
                <label class="control-label" for="size">
                    规格
                </label>
                <div class="controls">
                    <input type="text" name="product.size" id="size" value="${p.size}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="unit">
                    单位
                </label>
                <div class="controls">
                    <input type="text" name="product.unit" id="unit" value="${p.unit}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="cost">
                    单价
                </label>
                <div class="controls">
                    <input type="text" name="product.cost" id="cost" value="${p.cost}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="memo">
                    备注
                </label>
                <div class="controls">
                    <input type="text" name="product.memo" id="memo" value="${p.memo}">
                </div>
            </div>
            <div><label style="color:red">${fieldErrors.addError[0] }</label></div>
            <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn" style="">提交</button>
                    <a href="javascript:content(1)" style="margin-left:40px;"><span class="btn">取消</span></a>
                </div>
            </div>
        </form>  
      </div> 
  </body>
</html>
