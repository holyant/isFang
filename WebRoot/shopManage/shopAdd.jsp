<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>店铺新增|简易ERP</title>
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
              店铺新增
        </label>
        <form class="form-horizontal" action="shopManage!addShop"  type="post">
            
            <div class="control-group">
                <label class="control-label" for="name">
                    店家
                </label>
                <div class="controls">
                    <input type="text" name="shop.name" id="name" value="${s.name}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="person">
                    联系人
                </label>
                <div class="controls">
                    <input type="text" id="person" name="shop.person" value="${s.person}">
                </div>
            </div>
            <div class="control-group">         
                <label class="control-label" for="addr">
                    地址
                </label>
                <div class="controls">
                    <input type="text" name="shop.addr" id="addr" value="${s.addr}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="phone">
                    电话
                </label>
                <div class="controls">
                    <input type="text" name="shop.phone" id="phone" value="${s.phone}">
                </div>
            </div>
           
            <div class="control-group">
                <label class="control-label" for="memo">
                    备注
                </label>
                <div class="controls">
                    <input type="text" name="shop.memo" id="memo" value="${s.memo}">
                </div>
            </div>
            <div><label style="color:red">${fieldErrors.addError[0] }</label></div>
            <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn">
                        提交
                    </button>
                    <a href="javascript:content('shopList')" style="margin-left:40px;"><span class="btn">取消</span></a>
                </div>
            </div>
        </form>  
      </div> 
  </body>
</html>
