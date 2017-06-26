<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript">
      $(function(){
        $(".modify").click(modify);
        $(".delete").click(deleteProduct);
      });

      function modify(){
        var id = $(this).attr("id");
        window.location = "proManage!modifyInit?query.id="+id+"&date="+new Date();
      }
      function deleteProduct(){
        window.location = "proManage!delete?id="+$(this).attr("id")+"&date="+new Date();
      }

    </script>
  </head>

  <body>

      <table class="table table-striped table-bordered">
      <thead>
        <tr>
          <th>品牌</th>
          <th>商品编号</th>
          <th>商品名称</th>
          <th>规格</th>
          <th>单位</th>
          <th>单价</th>
          <th>操作</th>
        </tr>
      </thead>
          <tbody>
            <c:choose>
              <c:when test="${fn:length(list)>0 }">
                <c:forEach var="list" items="${list}" varStatus="status">
                  <tr class = "dataRow">
                    <td>${list.label}</td>
                    <td>${list.no}</td>
                    <td>${list.name}</td>
                    <td>${list.size}</td>
                    <td>${list.unit}</td>
                    <td><fmt:formatNumber value="${list.cost}" pattern="#.##"/></td>
                    <td>
                      <a href="javascript:;" class="modify" id="${list.id}"><span class="btn">修改</span></a>
                      <a href="javascript:;" class="delete" id="${list.id}"><span class="btn">删除</span></a>
                    </td>
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
    

  </body>
</html>
