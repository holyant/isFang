<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>店家管理|简易ERP</title>
      <script type="text/javascript">
        $(function(){
          $(".modify").click(modify);
          $(".delete").click(deleteShop);
        });

        function modify(){
          var id = $(this).attr("id");
          window.location = "shopManage!modifyInit?query.id="+id+"&date="+new Date();
        }
        function deleteShop(){
          var id = $(this).attr("id");
          window.location = "shopManage!deleteShop?query.id="+id+"&date="+new Date();
        }
      </script>
  </head>

  <body>
<br/>
    <div class="container" id="contentDiv">
      <!-- Main component for a primary marketing message or call to action -->
       </br>
       </br>
      <table class="table table-striped table-bordered">
      <thead>
        <tr>
          <th>店家</th>
          <th>联系人</th>
          <th>地址</th>
          <th>电话</th>
          <th>操作</th>
        </tr>
      </thead>
          <tbody>
            <c:choose>
              <c:when test="${fn:length(list)>0 }">
                <c:forEach var="list" items="${list}" varStatus="status">
                  <tr class = "dataRow">
                    <td>${list.name}</td>
                    <td>${list.person}</td>
                    <td>${list.addr}</td>
                    <td>${list.phone}</td>
                    <td><a href="javascript:;" class="modify" id="${list.id}"><span class="btn">修改</span></a>
                      <a href="javascript:void(0);" class="delete" id="${list.id}"><span class="btn">删除</span></a></td>
                  </tr>
                </c:forEach>
              </c:when>
              <c:otherwise>
                <tr>
                  <td colspan="108" class="important">
                    暂无数据！
                  </td>
                </tr>
              </c:otherwise>
            </c:choose>
          </tbody>

        </table>
    </div>
  </body>
</html>
