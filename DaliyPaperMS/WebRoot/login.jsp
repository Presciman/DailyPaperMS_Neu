<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<!--[if IE 9 ]><html class="ie9"><![endif]-->
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
        <meta name="format-detection" content="telephone=no">
        <meta charset="UTF-8">

        <meta name="description" content="Violate Responsive Admin Template">
        <meta name="keywords" content="Super Admin, Admin, Template, Bootstrap">

        <title>登录</title>
            
        <!-- CSS -->
        <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/form.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/animate.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/generics.css" rel="stylesheet"> 
    </head>
    <body id="skin-blur-violate">
        <section id="login">
            <header>
                <h1>登录日报管理系统</h1>
                <p>FBI Warning</p>
            </header>
        
            <div class="clearfix"></div>
            
            <!-- Login -->
            <form class="box tile animated active" id="box-login" action="${pageContext.request.contextPath }/login/normal.action" method="post">
                <h2 class="m-t-0 m-b-15">Login</h2>
                <input type="text" class="login-control m-b-10" name="uname" placeholder="用户名">
                <input type="password" class="login-control" name="pwd" placeholder="密码">
                <div class="checkbox m-b-20">
                    <label>
                        <input type="checkbox">
                        记住用户
                    </label>
                </div>
                <button class="btn btn-sm m-r-5">登录</button>
        
                
                <small>
                    <a class="box-switcher" data-switch="box-register" href="">没有账号</a> 或者
                    <a class="box-switcher" data-switch="box-reset" href="">忘记密码</a>
                </small>
            </form>
            
            <!-- Register -->
            <form class="box animated tile" id="box-register">
                <h2 class="m-t-0 m-b-15">注册</h2>
                <input type="text" class="login-control m-b-10" placeholder="真实姓名">
                <input type="text" class="login-control m-b-10" placeholder="Usern用户昵称ame">
                <input type="email" class="login-control m-b-10" placeholder="邮箱地址">    
                <input type="password" class="login-control m-b-10" placeholder="密码">
                <input type="password" class="login-control m-b-20" placeholder="确定密码">

                <button class="btn btn-sm m-r-5">注册</button>

                <small><a class="box-switcher" data-switch="box-login" href="">已经拥有账户？</a></small>
            </form>
            
            <!-- Forgot Password -->
            <form class="box animated tile" id="box-reset">
                <h2 class="m-t-0 m-b-15">忘记密码</h2>
                <p>请填写您的验证邮箱地址，稍后我们待我们确定后会将密码发送到您的邮箱</p>
                <input type="email" class="login-control m-b-20" placeholder="邮箱地址">    

                <button class="btn btn-sm m-r-5">新密码</button>

                <small><a class="box-switcher" data-switch="box-login" href="">已经拥有账户？</a></small>
            </form>
        </section>                      
        
        <!-- Javascript Libraries -->
        <!-- jQuery -->
        <script src="js/jquery.min.js"></script> <!-- jQuery Library -->
        
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js"></script>
        
        <!--  Form Related -->
        <script src="js/icheck.js"></script> <!-- Custom Checkbox + Radio -->
        
        <!-- All JS functions -->
        <script src="js/functions.js"></script>
    </body>
</html>


