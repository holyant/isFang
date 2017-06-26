<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>产品修改|简易ERP</title>
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
           $("#confirmBtn").click(function(){
              var cost = $("[name='cost']").val();
              if(isNaN(cost)){
                $("#updateError").text("单价必须为数字类型!");
                return;
              }
              var url = "proManage!modifyUpdate?id="+$("[name='id']").val()+"&name="+$("[name='name']").val()+"&size="+$("[name='size']").val()+"&unit="+$("[name='unit']").val()+"&memo="+$("[name='memo']").val()+"&cost="+cost;
              window.location=encodeURI(url);
           })
        });
      </script>
  </head>

  <body>
    <div class="container" id="contentDiv">
    <div id="prodContainer" >
        <label class="caption">
              产品修改
        </label>
        <form class="form-horizontal" action="proManage!modifyUpdate"  type="post">
            <input type="hidden" name="id" value="${p.id}">
            <div class="control-group">
                <label class="control-label" for="inputEmail">
                    品牌
                </label>
                <div class="controls">
                    <input type="text" placeholder="${p.label}" disabled="true">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">
                    商品编号
                </label>
                <div class="controls">
                    <input type="text" placeholder="${p.no}" disabled="true">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="name">
                    商品名称
                </label>
                <div class="controls">
                    <input type="text" id="name" placeholder="${p.name}" name="name" value="${p.name}">
                </div>
            </div>
            <div class="control-group">         
                <label class="control-label" for="size">
                    规格
                </label>
                <div class="controls">
                    <input type="text" placeholder="${p.size}" name="size" id="size" value="${p.size}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="unit">
                    单位
                </label>
                <div class="controls">
                    <input type="text" placeholder="${p.unit}" name="unit" id="unit" value="${p.unit}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="cost">
                    单价
                </label>
                <div class="controls">
                    <input type="text" placeholder="${p.cost}" name="cost" id="cost" value="${p.cost}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="memo">
                    备注
                </label>
                <div class="controls">
                    <input type="text" placeholder="${p.memo}" name="memo" id="memo" value="${p.memo}">
                </div>
            </div>
            <div><label id="updateError" style="color:red"></label></div>
            <div class="control-group">
                <div class="controls">
                    <button type="button" class="btn" id="confirmBtn">
                        确认
                    </button>
                    <a href="javascript:content(1)" style="margin-left:40px;"><span class="btn">取消</span></a>
                </div>
            </div>
        </form>  
      </div> 
  </body>
</html>
