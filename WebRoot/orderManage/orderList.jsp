<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>订单管理|简易ERP</title>
      <script type="text/javascript">
        $(function(){
          $(".download").click(download);
          $(".delete").click(deleteOrder);
        });

        function download(){
          var serial = $(this).attr("id");
          window.location = "orderManage!downLoad?serial="+serial+"&date="+new Date();
        }
        function deleteOrder(){
          var serial = $(this).attr("id");
          if(!confirm("确定要删除订单"+serial+"吗?")){
            return;
          }
          $.get("orderManage!deleteOrder?query.serial="+serial+"&date="+new Date(),function(){
            parent.search();
          });
        }
        function prePage(){
          setParentPager("P");
          parent.search();
        }
        function nextPage(){
          setParentPager("N");
          parent.search();
        }
        function setParentPager(flag){
          parent.$("#flag").val(flag);
          parent.$("#pageNum").val($("#pageNum").val());
          parent.$("#totalPage").val($("#totalPage").val());
        }
      </script>
      <style type="text/css">
        .myPaging{
          float: right;
        }
      </style>
  </head>

  <body>
<br/>
   <div class="container" id="contentDiv">
      <div style="border-bottom:solid grey 1px;margin:20px 0px;">
       <h4>订单列表</h4>
      </div>
      <table class="table table-striped table-bordered">
        <tbody>
          <c:choose>
            <c:when test="${fn:length(pager.result)>0 }">
              <c:forEach var="order" items="${pager.result}" varStatus="status">
                <tr class = "dataRow">
                  <div style="margin-bottom:10px;">
                      <div class="row" style="background-color:#ecedee;padding:5px 0 5px 0;">
                        <div class="span2"><small><fmt:formatDate value="${order.createTime}" pattern="yyyy-MM-dd hh:mm"/></small></div>
                        <div class="span2"><small>${order.serial}</small></div>
                        <div class="span2"><small>${order.shopName}</small></div>
                        <div class="span2">
                          <a href="javascript:;" class="download" id="${order.serial}"><span class="btn"><small>下载</small></span></a>
                          <a href="javascript:void(0);" class="delete" id="${order.serial}"><span class="btn"><small>删除</small></span></a>
                        </div>
                      </div>
                      <c:choose>
                        <c:when test="${empty saleProduct.proName}">
                          <c:forEach var="saleProduct" items="${order.saleProducts}" varStatus="status">
                            <div class="row" style="margin:15px 0px;">
                              <div class="span3">${saleProduct.proName}</div>
                              <div class="span3">${saleProduct.price}</div>
                              <div class="span3">${saleProduct.amount}</div>
                            </div>
                          </c:forEach>
                        </c:when>
                      </c:choose>
                  </div>
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
      <div class="pagination myPaging">
        <ul>
          <li <c:if test='${pager.pageNum==1}'>class="disabled"</c:if>><a href="javascript:void(0)" onclick="prePage()">上一页</a></li>
          <li <c:if test='${pager.pageNum==pager.totalPage}'>class="disabled"</c:if>><a href="javascript:nextPage()">下一页</a></li>
        </ul>
      </div>
    </div>
    <input type="hidden" id="pageNum" value="${pager.pageNum}">
    <input type="hidden" id="totalPage" value="${pager.totalPage}">
  </body>
</html>
