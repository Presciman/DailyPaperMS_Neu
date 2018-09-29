<%@ page language="java" import="java.util.*" import="com.pojo.Ribaodata" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
        <meta name="format-detection" content="telephone=no">
        <meta charset="UTF-8">

        <meta name="description" content="Violate Responsive Admin Template">
        <meta name="keywords" content="Super Admin, Admin, Template, Bootstrap">

        <title>首页</title>
            
        <!-- CSS 导入-->
        <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/animate.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/font-awesome.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/form.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/calendar.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/icons.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath }/css/generics.css" rel="stylesheet"> 
        <!--
        	作者：秦杰
        	时间：2017-02-20
        	描述：自定义框的链接
        -->
        <!--  <link rel="stylesheet" href="/DaliyPaperMS/css/hwLayer.css">-->
    </head>
    <body id="skin-blur-violate">

        <header id="header" class="media">
            <a href="" id="menu-toggle"></a> 
            <a class="logo pull-left" href="${pageContext.request.contextPath }/index.html">快乐日报</a>
            
            <div class="media-body">
                <div class="media" id="top-menu">
                    <div class="pull-left tm-icon">
                        <a data-drawer="messages" class="drawer-toggle" href="">
                            <i class="sa-top-message"></i>
                            <i class="n-count animated">5</i>
                            <span>我的消息</span>
                        </a>
                    </div>
                    <div class="pull-left tm-icon">
                        <a data-drawer="notifications" class="drawer-toggle" href="">
                            <i class="sa-top-updates"></i>
                            <i class="n-count animated">99</i>
                            <span>系统提醒</span>
                        </a>
                    </div>

                    

                    <div id="time" class="pull-right">
                        <span id="hours"></span>
                        :
                        <span id="min"></span>
                        :
                        <span id="sec"></span>
                    </div>
                    
                    <div class="media-body">
                    	<a >
                        <input type="text" class="main-search" >
                        </a>
                    </div>
                </div>
            </div>
        </header>
        
        <div class="clearfix"></div>
        
        <section id="main" class="p-relative" role="main">
            
            <!-- Sidebar -->
            <aside id="sidebar">
                
                <!-- Sidbar Widgets -->
                <div class="side-widgets overflow">
                    <!-- Profile Menu -->
                    <div class="text-center s-widget m-b-25 dropdown" id="profile-menu">
                        <a href="" data-toggle="dropdown">
                            <img class="profile-pic animated" src="${pageContext.request.contextPath }/img/profile-pic.jpg" alt="">
                        </a>
                        <ul class="dropdown-menu profile-menu">
                            <li><a href="">我的日报</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="">我的消息</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a >设置</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="">退出</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                        </ul>
                        <h4 class="m-0">欢迎登录</h4>
                        此处为返回的用户名的位置
                    </div>
                    
                    <!-- Calendar -->
                    <div class="s-widget m-b-25">
                        <div id="sidebar-calendar"></div>
                    </div>
                    
                    <!-- 此处可拥有一些信息的展示 -->
                    <div class="s-widget m-b-25">
                        <h2 class="tile-title">
                           我的状态
                        </h2>
                        
                        <div class="s-widget-body">
                            <div id="news-feed"></div>
                        </div>
                    </div>
                    
                    <!-- 此处展示正在进行的项目，以及设置项目的进度 -->
                    <div class="s-widget m-b-25">
                        <h2 class="tile-title">
                           正在进行的项目
                        </h2>
                        
                        <div class="s-widget-body">
                            <div class="side-border">
                                <small>Joomla Website</small>
                                <div class="progress progress-small">
                                	<!--
                                    	作者：docqin
                                    	时间：2017-02-20
                                    	描述：下面用来设置项目的进度值
                                    -->
                                     <a href="#" data-toggle="tooltip" title="" class="progress-bar tooltips progress-bar-danger" style="width: 10%;" data-original-title="10%">
                                          <span class="sr-only">10% Complete</span>
                                     </a>
                                </div>
                            </div>
                            <div class="side-border">
                                <small>Opencart E-Commerce Website</small>
                                <div class="progress progress-small">
                                     <a href="#" data-toggle="tooltip" title="" class="tooltips progress-bar progress-bar-info" style="width: 43%;" data-original-title="43%">
                                          <span class="sr-only">43% Complete</span>
                                     </a>
                                </div>
                            </div>
                            <div class="side-border">
                                <small>Social Media API</small>
                                <div class="progress progress-small">
                                     <a href="#" data-toggle="tooltip" title="" class="tooltips progress-bar progress-bar-warning" style="width: 81%;" data-original-title="81%">
                                          <span class="sr-only">81% Complete</span>
                                     </a>
                                </div>
                            </div>
                            <div class="side-border">
                                <small>VB.Net Software Package</small>
                                <div class="progress progress-small">
                                     <a href="#" data-toggle="tooltip" title="" class="tooltips progress-bar progress-bar-success" style="width: 10%;" data-original-title="10%">
                                          <span class="sr-only">10% Complete</span>
                                     </a>
                                </div>
                            </div>
                            <div class="side-border">
                                <small>Chrome Extension</small>
                                <div class="progress progress-small">
                                     <a href="#" data-toggle="tooltip" title="" class="tooltips progress-bar progress-bar-success" style="width: 95%;" data-original-title="95%">
                                          <span class="sr-only">95% Complete</span>
                                     </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                
                <!-- Side Menu 针对我们的菜单栏进行设置-------------------------------------------------   -->
                <ul class="list-unstyled side-menu" id="woshicaidan">
										<li class="active">
                        <a class="sa-side-home" href="/DaliyPaperMS/main.jsp">
                            <span class="menu-item">我的首页</span>
                        </a>
                    </li>
                   <li class="dropdown">
                        <a class="sa-side-form" href="">
                            <span class="menu-item">个人日报管理</span>
                        </a>
                        <ul class="list-unstyled menu-item">
                            <li><a href="/DaliyPaperMS/ribao/chaxun.action">个人日报查询</a></li>
                            <li><a href="/DaliyPaperMS/addRibao.jsp">个人日报添加</a></li> 
                            <li><a href="/DaliyPaperMS/gerenzhoubaodaochu.jsp">个人周报导出</a></li>
                            <li><a href="/DaliyPaperMS/quantianribaochaxun.jsp">全天日报查询</a></li>
                        </ul>
                    <li class="dropdown">
                        <a class="sa-side-ui" href="">
                            <span class="menu-item">员工日报管理</span>
                        </a>
                        <ul class="list-unstyled menu-item">
                            <li><a href="/DaliyPaperMS/ribao/shenhe.action">日报审核</a></li>
                            
                          
                            <li><a href="/DaliyPaperMS/querydailyweixie.action">未写日报查询</a></li>
                            <li><a href="/DaliyPaperMS/querydailyweishenhe.action">未审核日报查询</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="sa-side-chart" href="charts.html">
                            <span class="menu-item">项目管理</span>
                        </a>
                        <ul class="list-unstyled menu-item">
                            <li><a href="/DaliyPaperMS/PRPQuery.jsp">prp设定</a></li>
                           <li><a href="/DaliyPaperMS/ProInsert.jsp">项目添加</a></li>
                           <li><a href="/DaliyPaperMS/ProQuery.jsp">项目查询</a></li>
                           
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="sa-side-chart" href="charts.html">
                            <span class="menu-item">日报统计</span>
                        </a>
                        <ul class="list-unstyled menu-item">
                            
                            <li><a href="/DaliyPaperMS/wyy3.jsp">项目工作量查询</a></li>
                            <li><a href="/DaliyPaperMS/bumengongzuoliangdaochu.jsp">部门工作量查询</a></li>
                        </ul>
                    </li>
                     <li class="dropdown">
                        <a class="sa-side-chart">
                            <span class="menu-item">个人信息管理</span>
                        </a>
                        <ul class="list-unstyled menu-item">
                            <li><a href="/DaliyPaperMS/selectpassword.action">个人信息查询</a></li>
                            <li><a href="/DaliyPaperMS/wyy4.jsp">密码修改</a></li>
                               </ul>
                    </li>
                </ul>

            </aside>
        
            <!-- Content -->
            <section id="content" class="container">
            <!--
            	作者：秦杰
            	时间：2017-02-20
            	描述：此处用来展示 我的消息
            -->
                <!-- Messages Drawer -->
                <div id="messages" class="tile drawer animated">
                    <div class="listview narrow">
                        <div class="media">
                            <a href="">发送消息</a>
                            <span class="drawer-close">&times;</span>
                            
                        </div>
                        <div class="overflow" style="height: 254px">
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/1.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Nadin Jackson - 2 Hours ago</small><br>
                                    <a class="t-overflow" href="">Mauris consectetur urna nec tempor adipiscing. Proin sit amet nisi ligula. Sed eu adipiscing lectus</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">David Villa - 5 Hours ago</small><br>
                                    <a class="t-overflow" href="">Suspendisse in purus ut nibh placerat Cras pulvinar euismod nunc quis gravida. Suspendisse pharetra</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/3.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Harris worgon - On 15/12/2013</small><br>
                                    <a class="t-overflow" href="">Maecenas venenatis enim condimentum ultrices fringilla. Nulla eget libero rhoncus, bibendum diam eleifend, vulputate mi. Fusce non nibh pulvinar, ornare turpis id</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/4.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Mitch Bradberry - On 14/12/2013</small><br>
                                    <a class="t-overflow" href="">Phasellus interdum felis enim, eu bibendum ipsum tristique vitae. Phasellus feugiat massa orci, sed viverra felis aliquet quis. Curabitur vel blandit odio. Vestibulum sagittis quis sem sit amet tristique.</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/1.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Nadin Jackson - On 15/12/2013</small><br>
                                    <a class="t-overflow" href="">Ipsum wintoo consectetur urna nec tempor adipiscing. Proin sit amet nisi ligula. Sed eu adipiscing lectus</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">David Villa - On 16/12/2013</small><br>
                                    <a class="t-overflow" href="">Suspendisse in purus ut nibh placerat Cras pulvinar euismod nunc quis gravida. Suspendisse pharetra</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/3.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Harris worgon - On 17/12/2013</small><br>
                                    <a class="t-overflow" href="">Maecenas venenatis enim condimentum ultrices fringilla. Nulla eget libero rhoncus, bibendum diam eleifend, vulputate mi. Fusce non nibh pulvinar, ornare turpis id</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/4.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Mitch Bradberry - On 18/12/2013</small><br>
                                    <a class="t-overflow" href="">Phasellus interdum felis enim, eu bibendum ipsum tristique vitae. Phasellus feugiat massa orci, sed viverra felis aliquet quis. Curabitur vel blandit odio. Vestibulum sagittis quis sem sit amet tristique.</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/5.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Wendy Mitchell - On 19/12/2013</small><br>
                                    <a class="t-overflow" href="">Integer a eros dapibus, vehicula quam accumsan, tincidunt purus</a>
                                </div>
                            </div>
                        </div>
                        <div class="media text-center whiter l-100">
                            <a href=""><small>展示全部</small></a>
                        </div>
                    </div>
                </div>
                
                <!--
                	作者：秦杰
                	时间：2017-02-20
                	描述：此处用于展示我的提醒信息
                -->
                <!-- Notification Drawer -->
                <div id="notifications" class="tile drawer animated">
                    <div class="listview narrow">
                        <div class="media">
                            <a href="">Notification Settings</a>
                            <span class="drawer-close">&times;</span>
                        </div>
                        <div class="overflow" style="height: 254px">
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/1.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Nadin Jackson - 2 Hours ago</small><br>
                                    <a class="t-overflow" href="">Mauris consectetur urna nec tempor adipiscing. Proin sit amet nisi ligula. Sed eu adipiscing lectus</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">David Villa - 5 Hours ago</small><br>
                                    <a class="t-overflow" href="">Suspendisse in purus ut nibh placerat Cras pulvinar euismod nunc quis gravida. Suspendisse pharetra</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/3.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Harris worgon - On 15/12/2013</small><br>
                                    <a class="t-overflow" href="">Maecenas venenatis enim condimentum ultrices fringilla. Nulla eget libero rhoncus, bibendum diam eleifend, vulputate mi. Fusce non nibh pulvinar, ornare turpis id</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/4.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Mitch Bradberry - On 14/12/2013</small><br>
                                    <a class="t-overflow" href="">Phasellus interdum felis enim, eu bibendum ipsum tristique vitae. Phasellus feugiat massa orci, sed viverra felis aliquet quis. Curabitur vel blandit odio. Vestibulum sagittis quis sem sit amet tristique.</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/1.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">Nadin Jackson - On 15/12/2013</small><br>
                                    <a class="t-overflow" href="">Ipsum wintoo consectetur urna nec tempor adipiscing. Proin sit amet nisi ligula. Sed eu adipiscing lectus</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="img/profile-pics/2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">David Villa - On 16/12/2013</small><br>
                                    <a class="t-overflow" href="">Suspendisse in purus ut nibh placerat Cras pulvinar euismod nunc quis gravida. Suspendisse pharetra</a>
                                </div>
                            </div>
                        </div>
                        <div class="media text-center whiter l-100">
                            <a href=""><small>展示全部</small></a>
                        </div>
                    </div>
                </div>
                
               
                <!--
                	作者：offline
                	时间：2017-02-20
                	描述：留作备用
             	 -->
              
                <h4 class="page-title">日报查询</h4>
                                
                
                <hr class="whiter" />
                
                <!-- Main Widgets -->
               <!--
               	作者：秦杰
               	时间：2017-02-20
               	描述：此处用于展示各种操作的界面
               -->
                <div class="block-area" id="required">
                    <div class="block-area pull-right" id="custom" >
                    <h3 class="block-title">点击进行条件查询</h3>
                    <div class="dropdown">
                        <a data-toggle="dropdown" href="#">条件查询</a>
                        <div class="dropdown-menu dark col-md-3 animated flipInY dropdown-form" role="menu">
                            <header class="dark-header">
                                <h4 class="dark-title m-0">查询条件</h4>
                            </header>
                            <div class="dark-body">
                                <form role="form" action="/DaliyPaperMS/ribao/tiaojianchaxun.action">
                                	 <div class="col-md-8 form-group">
                                		<label>起始日期</label>
                                		<input name="stime" type="date" class="input-sm validate[required] form-control" placeholder="请选择起始时间">
                            		</div>
                            		<div class="clearfix"></div>
                            		<div class="col-md-8 form-group">
                                		<label>截止日期</label>
                                		<input name="etime" type="date" class="input-sm validate[required] form-control" placeholder="请选择截止时间">
                           			 </div>
                               
                            </div>
                            <div class="clearfix"></div>
                            <div class="dark-footer">
                                <button type="submit" class="btn btn-sm btn-alt" >查询</button>
                            </div>
                             </form>
                        </div>
                    </div>
				
                    
                <div class="block-area" id="tableHover">
                    <h3 class="block-title">个人日报查询</h3>
                    <div class="table-responsive overflow">
                        <table class="table table-bordered table-hover tile">
                        	
                                     
                            <thead>
                            


                            
                                <tr>
                                	<th width="10%">日报编号</th>
                                	<th width="10%">项目编号</th>
                                	<th width="10%">prp阶段</th>
                                	<th width="10%">工作量</th>
                                    <th width="10%">加班量</th>
                                    <th width="10%">提交时间</th>
                                    <th width="10%">上司ID</th>
                                    <th width="10%">审核状态</th>
                                    <th width="20%">操作</th>
                                </tr>
                             
                            </thead>
                            <tbody>
                            <% List<Ribaodata> aaa=(List<Ribaodata>) request.getAttribute("ribadata");  %>
                            <c:forEach items="<%=aaa %>" var="item" >
                                <tr>
                                	<td>${item.baoid}</td>
                                	<td>${item.proid}</td>
                                	<td>${item.proprp}</td>
                                	<td>${item.workload}</td>
                                	<td>${item.addtime}</td>
                                	
                                    <td>${item.uptime}</td>
                                    <td>${item.upid} </td>
                                    <td>${item.shenstate} </td>
                                    <td>
                                  
                                    &nbsp;&nbsp;&nbsp;<a href="/DaliyPaperMS/ribao/shanchu.action?baoid=${item.baoid}"><span class="icon">&#61918;</span></a>&nbsp;&nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;<a href=""><span class="icon">&#61952;</span></a>
                                    </td>
                                </tr>
                              </c:forEach>  
                            </tbody>
                        </table>
                    </div>
                </div> 
                       
                </div>
          
        </section>
        
        <!-- Javascript Libraries -->
        <!-- jQuery -->
        <script src="${pageContext.request.contextPath }/js/jquery.min.js"></script> <!-- jQuery Library -->
        <script src="${pageContext.request.contextPath }/js/jquery-ui.min.js"></script> <!-- jQuery UI -->
        <script src="${pageContext.request.contextPath }/js/jquery.easing.1.3.js"></script> <!-- jQuery Easing - Requirred for Lightbox + Pie Charts-->

        <!-- Bootstrap -->
        <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>

 
       
        <!--  Form Related -->
        <script src="${pageContext.request.contextPath }/js/icheck.js"></script> <!-- Custom Checkbox + Radio -->
		<script src="${pageContext.request.contextPath }/js/validation/validate.min.js"></script> <!-- jQuery Form Validation Library -->
        <script src="${pageContext.request.contextPath }/js/validation/validationEngine.min.js"></script> <!-- jQuery Form Validation Library - requirred with above js -->
        <!-- UX -->
        <script src="${pageContext.request.contextPath }/js/scroll.min.js"></script> <!-- Custom Scrollbar -->

        <!-- Other -->
        <script src="${pageContext.request.contextPath }/js/calendar.min.js"></script> <!-- Calendar -->
        <script src="${pageContext.request.contextPath }/js/feeds.min.js"></script> <!-- News Feeds -->
        
        <!-- All JS functions -->
        <script src="${pageContext.request.contextPath }/js/functions.js"></script>
        <script>
           
        /*	$(function(){
        	
        		//$("#woshicaidan").load("${pageContext.request.contextPath}/txt/${roleid}.txt");//此处根据session信息更改菜单${userdata.roleid}
        		//$("#woshicaidan").load("${pageContext.request.contextPath}/txt/1.txt");
        	//	$("#woshicaidan").load("${pageContext.request.contextPath }/txt/"+${sessionScope.roleid}+".txt");
        		//获取删除的信息
        		if(${msg} == 1){
        			alert("删除成功！");
        		}else if( ${msg} == 0){
        			alert("删除失败！！！！");
        		}
        		
        	
        	});*/
        	$(function(){
        		
        		$("#woshicaidan").load("${pageContext.request.contextPath }/txt/"+${sessionScope.roleid}+".txt");//此处根据session信息更改菜单${userdata.roleid}
        		//$("#woshicaidan").load("${pageContext.request.contextPath }/txt/1.txt");
        		//获取删除的信息
        		if(${msg} == 1){
        			alert("删除成功！");
        		}else if( ${msg} == 0){
        			alert("删除失败！！！！");
        		}
        	});
        	
        	function chaxunuser(){
				$("#required").load("${pageContext.request.contextPath }/txt/chaxunuser.txt");
			}
			function ribaotianjia(){
				$("#required").load("${pageContext.request.contextPath }/txt/gerenbibaotianjia.txt");
			}
			function gerenribaochaxun(){
				$("#required").load("${pageContext.request.contextPath }/txt/gerenribaochaxun.txt");
				//请求无条件的日报数据
				$.ajax({
					type:"GET",
					url:"/DaliyPaperMS/ribao/chaxun.action"
				});
	
				
			}
			function submitribao(){
				var jsondt = {
        			"baoid": $("#ribaoid").val(),
        			"proid": $("#proid").val(),
        			"proprp": $("#proprp").val(),
        			"context": $("#context").val(),
        			"workload": $("#workload").val(),
        			"addtime": $("#addtime").val(),
        			"uptime": $("#uptime").val(),
        			"renid": $("#renid").val(),
        			"upid": $("#upid").val(),
        			
   				 };
   				
				$.ajax({
					type:"GET",
					url:"/DaliyPaperMS/ribao/add.action",
					contentType: "application/json; charset=utf-8",
        			data: "jsondata="+ JSON.stringify(jsondt),
        			
        			//dataType: "json",
        			success: function (message) {
            			if (message > 0) {
                			alert("日报已经保存成功！");
            			}
        			},
        			error: function (message) {
            			alert("日报保存失败！");
        			}
				});
	
			}
			function ribaotiaojianchaxun(){
				var jsondt = {
        			"stime": $("#stime").val(),
        			"etime": $("#etime").val()
   				 };
   				 $.ajax({
					type:"GET",
					url:"/DaliyPaperMS/ribao/tiaojianchaxun.action",
					contentType: "application/json; charset=utf-8",
        			data: "jsondata="+ JSON.stringify(jsondt),
        			
        			//dataType: "json",
        			
				});
			}
			
    			
   			
        </script>

    </body>
</html>
