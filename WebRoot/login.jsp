<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="img/favicon.png">
    <style type="text/css">
      body{
          background: #728eaa;
      }
      #container {
          width: 430px;
          margin: 30px auto;
          padding: 60px 30px;
          background: #c9d0de;
          border: 1px solid #e1e1e1;
      }
      .caption{
        font-size:large;
      }

    </style>
    <title></title> 
    <script type="text/javascript">
      $(function(){
       
      });
      
      
    </script>
  </head>

  <body>
    <div id="container">
        <label class="caption">
              用户登录
        </label>
        <form class="form-horizontal" action="login!valideUserInfo" method="post">
          <div class="control-group">
            <label class="control-label" for="inputEmail">
              Email
            </label>
            <div class="controls">
              <input type="text" id="inputEmail" placeholder="Email" name="email">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="inputPassword">
              Password
            </label>
            <div class="controls">
              <input type="password" id="inputPassword" placeholder="Password" name="password">
            </div>
          </div>
          <div><label style="color:red">${errorMsg}</label></div>
          <div class="control-group">
            <div class="controls">
              <input type="submit" class="btn" value="Sign in"/>
            </div>
          </div>
        </form>
        
    </div>
    <p class="text-center" id="footer">
        方昱皓的官方网站&copy;2014.
      </p>
  </body>
</html>
