<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript" src="/isFang/js/bootstrap.min.js"></script>

 <div class="container" id="contentDiv">
 <div class="navbar navbar-inverse navbar-fixed-top">
   <div class="navbar-inner">
     <div class="container">
       <a class="brand" href="/isFang/main.jsp">
         简易ERP
       </a>
       <div class="nav-collapse collapse">
         <ul class="nav">
           <li class="dropdown">
             <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               订单管理
               <b class="caret">
               </b>
             </a>
             <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
               <li>
                 <a href="javascript:content('orderSearch')">
                   订单查询
                 </a>
               </li>
               <li>
                 <a href="javascript:content(2)">
                   订单新增
                 </a>
               </li>
             </ul>
           </li>
           <li class="dropdown">
             <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               商品管理
               <b class="caret">
               </b>
             </a>
             <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
               <li>
                 <a href="javascript:content(1)">
                   产品列表
                 </a>
               </li>
               <li>
                 <a href="javascript:content(3)">
                   产品新增
                 </a>
               </li>
             </ul>
           </li>

           <li class="dropdown">
             <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               店家管理
               <b class="caret">
               </b>
             </a>
             <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
               <li>
                 <a href="javascript:content('shopList')">
                   店家列表
                 </a>
               </li>
               <li>
                 <a href="javascript:content('addShop')">
                   店家新增
                 </a>
               </li>
             </ul>
           </li>

           
         </ul>
       </div>
     </div>
   </div>
 </div>