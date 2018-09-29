<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/hwLayer.css">
    </head>
    <body id="skin-blur-violate">

        <header id="header" class="media">
            <a href="" id="menu-toggle"></a> 
            <a class="logo pull-left" href="${pageContext.request.contextPath }/main.jsp">银河系大日报</a>
            
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
                            <li><a href="">更改信息</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                           
                            <li><a href="${pageContext.request.contextPath }/login.jsp">退出</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                        </ul>
                        <h4 class="m-0">欢迎登录</h4>
                      ${uname}:${roleid}级用户
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
                                <small>Joomla 网站</small>
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
                                <small>Opencart E-Commerce 网站</small>
                                <div class="progress progress-small">
                                     <a href="#" data-toggle="tooltip" title="" class="tooltips progress-bar progress-bar-info" style="width: 43%;" data-original-title="43%">
                                          <span class="sr-only">43% Complete</span>
                                     </a>
                                </div>
                            </div>
                            <div class="side-border">
                                <small>社交媒体API</small>
                                <div class="progress progress-small">
                                     <a href="#" data-toggle="tooltip" title="" class="tooltips progress-bar progress-bar-warning" style="width: 81%;" data-original-title="81%">
                                          <span class="sr-only">81% Complete</span>
                                     </a>
                                </div>
                            </div>
                            <div class="side-border">
                                <small>VB.Net 软件 包</small>
                                <div class="progress progress-small">
                                     <a href="#" data-toggle="tooltip" title="" class="tooltips progress-bar progress-bar-success" style="width: 10%;" data-original-title="10%">
                                          <span class="sr-only">10% Complete</span>
                                     </a>
                                </div>
                            </div>
                            <div class="side-border">
                                <small>浏览器扩展</small>
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
                                    <small class="text-muted">马思纯- 2 Hours ago</small><br>
                                    <a class="t-overflow" href="">吧啦吧啦</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">秦杰 - 5 Hours ago</small><br>
                                    <a class="t-overflow" href="">扶桑一叹渺茫中，此扶桑东更东</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/3.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">史迪仔- On 15/12/2013</small><br>
                                    <a class="t-overflow" href="">想吃辣翅</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/4.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">米奇 - On 14/12/2013</small><br>
                                    <a class="t-overflow" href="">吃早餐啊</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/1.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">肯德基 - On 15/12/2013</small><br>
                                    <a class="t-overflow" href="">小食拼盘四重美味，让你欢享时刻不NG!</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">麦当劳 - On 16/12/2013</small><br>
                                    <a class="t-overflow" href="">晒鸡腿秀恩爱</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/3.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">张希 - On 17/12/2013</small><br>
                                    <a class="t-overflow" href="">别错过年轻的疯狂，时光很匆忙</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/4.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">尼采 - On 18/12/2013</small><br>
                                    <a class="t-overflow" href=""> 一种人知道自己为什么而活，就可以忍受任何一种生活</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/5.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">高尔基 - On 19/12/2013</small><br>
                                    <a class="t-overflow" href="">书是人类进步的阶梯</a>
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
                            <a href="">未看消息</a>
                            <span class="drawer-close">&times;</span>
                        </div>
                        <div class="overflow" style="height: 254px">
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/1.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">高尔基  - 2 Hours ago</small><br>
                                    <a class="t-overflow" href="">书是人类进步的阶梯</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">尼采 - 5 Hours ago</small><br>
                                    <a class="t-overflow" href=""> 一种人知道自己为什么而活，就可以忍受任何一种生活</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/3.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">张希 - On 15/12/2013</small><br>
                                    <a class="t-overflow" href="">别错过年轻的疯狂，时光很匆忙</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/4.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">雨果 - On 14/12/2013</small><br>
                                    <a class="t-overflow" href="">世界上最宽阔的是海洋，比海洋更宽阔的是天空，比天空更宽阔的是人的胸怀</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/1.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">村上春树 - On 15/12/2013</small><br>
                                    <a class="t-overflow" href="">有希望之处定有磨练</a>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img width="40" src="${pageContext.request.contextPath }/img/profile-pics/2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <small class="text-muted">三毛</small><br>
                                    <a class="t-overflow" href="">这个世界上，总有美好的情感与梦想，值得我们追随</a>
                                </div>
                            </div>
                        </div>
                        <div class="media text-center whiter l-100">
                            <a href=""><small>展示全部</small></a>
                        </div>
                    </div>
                </div>
                
                <!-- Breadcrumb -->
                <!--  
                <ol class="breadcrumb hidden-xs">
                    <li><a href="/DaliyPaperMS/view/PRP/PRPQuery.jsp">prp</a></li>
                    <li><a href="/DaliyPaperMS/dep/depset.action">部门设定</a></li>
                    
					<li><a href="/DaliyPaperMS/querydaily/querydailybydate.action">通过时间查询个人日报</a></li>
                    <li class="active"><a href="/DaliyPaperMS/querydaily/querydailybypro.action">通过项目查询个人日报</a></li>
                </ol>
                -->
                <!--
                	作者：offline
                	时间：2017-02-20
                	描述：留作备用
             	 -->
              
                <h4 class="page-title" >个人首页</h4>
                                
                
                <hr class="whiter" />
                
                <!-- Main Widgets -->
               <!--
               	作者：秦杰
               	时间：2017-02-20
               	描述：此处用于展示各种操作的界面
               -->
                <div class="block-area" id="required">
                    <div class="row">
                        <div class="col-md-9">
                            <div class="tile-light p-5 m-b-15">
                                <div class="cover p-relative">
                                    <img src="${pageContext.request.contextPath }/img/cover-bg.jpg" class="w-100" alt="">
                                    <img class="profile-pic" src="${pageContext.request.contextPath }/img/profile-pic.jpg" alt="">
                                    <div class="profile-btn">
                                        <button class="btn btn-alt btn-sm"><i class="icon-bubble"></i> <span>消息</span></button>
                                        <button class="btn btn-alt btn-sm"><i class="icon-user-2"></i> <span>朋友</span></button>
                                    </div>
                                </div>
                                <div class="p-5 m-t-15">
                                    	小王同学是个勤奋好学的好宝宝
                                </div>
                            </div>
                            
                            <div class="m-b-15 text-center profile-summary">
                                <button class="btn btn-sm">42 粉丝</button>
                                <button class="btn btn-sm">69 关注</button>
                                <button class="btn btn-sm hidden-xs">120 评论</button>
                                <button class="btn btn-sm hidden-xs">165 喜欢</button>
                            </div>
                            
                            <div class="row">
                                <!-- Works -->
                                <div class="col-md-7">
                                    <div class="tile">
                                        <h2 class="tile-title">员工进程</h2>
                                        <div class="tile-config dropdown">
                                            <a data-toggle="dropdown" href="" class="tooltips tile-menu" title="" data-original-title="Options"></a>
                                            <ul class="dropdown-menu pull-right text-right"> 
                                                <li><a href="">Edit</a></li>
                                                <li><a href="">Delete</a></li>
                                            </ul>
                                        </div>
                                        
                                        <div class="p-10">
                                            <div class="m-b-10">
                                                		老王喝可乐. - 60%
                                                <div class="progress progress-striped progress-alt">
                                                    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%"></div>
                                                </div>
                                            </div>
                                            
                                            <div class="m-b-10">
                                                		阎梓宁发呆 - 90%
                                                <div class="progress progress-striped progress-alt">
                                                    <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%"></div>
                                                </div>
                                            </div>    
                                            
                                            <div class="m-b-10">
                                              			 孙名杨看小说 - 33%
                                                <div class="progress progress-striped progress-alt">
                                                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="33" aria-valuemin="0" aria-valuemax="100" style="width: 33%"></div>
                                                </div>
                                            </div>
                                            
                                            <div class="m-b-10">
                                                		秦杰喝荔枝 - 50%
                                                <div class="progress progress-striped progress-alt">
                                                    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%"></div>
                                                </div>
                                            </div>
                                            
                                            <div>
                                                	孙百西打电话 - 99%
                                                <div class="progress progress-striped progress-alt">
                                                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="99" aria-valuemin="0" aria-valuemax="100" style="width: 99%"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    
                                    <!-- Completed Projects -->
                                    <div class="tile">
                                        <h2 class="tile-title m-b-5">已完成项目</h2>
                                        <div class="tile-config dropdown">
                                            <a data-toggle="dropdown" href="" class="tooltips tile-menu" title="" data-original-title="Options"></a>
                                            <ul class="dropdown-menu pull-right text-right"> 
                                                <li><a href="">Edit</a></li>
                                                <li><a href="">Delete</a></li>
                                            </ul>
                                        </div>
                                        
                                        <div class="p-10 news">
                                            <div class="col-xs-4">
                                                <div class="tile p-5 m-b-10">
                                                    <a target="_blank" title="Medical-Pro Bootstrap Responsive Template" href="https://wrapbootstrap.com/theme/medical-pro-responsive-template-WB06421XL">
                                                        <img class="w-100" src="${pageContext.request.contextPath }/img/projects/1.png" alt="">
                                                        <small class="t-overflow m-t-10">看牙</small>
                                                    </a>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                            <div class="col-xs-4">
                                                <div class="tile p-5 m-b-10">
                                                    <a target="_blank" title="Black Pearl Responsive Admin Template" href="https://wrapbootstrap.com/theme/black-pearl-responsive-admin-template-WB040H333">
                                                        <img class="w-100" src="${pageContext.request.contextPath }/img/projects/2.png" alt="">
                                                        <small class="t-overflow m-t-10">数据分析</small>
                                                    </a>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                            <div class="col-xs-4">
                                                <div class="tile p-5 m-b-10">
                                                    <a target="_blank" title="UNEKUE Single Page Portfolio Template" href="https://wrapbootstrap.com/theme/unekue-single-page-portfolio-template-WB04R2B18">
                                                        <img class="w-100" src="${pageContext.request.contextPath }/img/projects/3.png" alt="">
                                                        <small class="t-overflow m-t-10">看书</small>
                                                    </a>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                            
                                            
                                            <div class="clearfix"></div>
                                        </div>
                                    </div>
                                    
                                </div>
                                
                                
                                <div class="col-md-5">
                                    <div class="tile">
                                        <h2 class="tile-title">近期活动</h2>
                                        <div class="tile-config dropdown">
                                            <a data-toggle="dropdown" href="" class="tooltips tile-menu" title="" data-original-title="Options"></a>
                                            <ul class="dropdown-menu pull-right text-right"> 
                                                <li><a href="">Edit</a></li>
                                                <li><a href="">Delete</a></li>
                                            </ul>
                                        </div>
                                        
                                        <div class="listview narrow">
                                            <div class="media">
                                                <div class="pull-right">
                                                    <img width="37" src="${pageContext.request.contextPath }/img/profile-pics/1.jpg" alt="">
                                                </div>
                                                <div class="media-body">
                                                    <a class="news-title underline" href="">与小王通话</a>
                                                    <div class="clearfix"></div>
                                                    <small class="muted">30 Minutes ago</small>
                                                </div>
                                            </div>
                                            <div class="media">
                                                <div class="pull-right">
                                                    <img width="37" src="${pageContext.request.contextPath }/img/profile-pics/4.jpg" alt="">
                                                </div>
                                                <div class="media-body">
                                                    <a class="news-title underline" href="">白富美</a> 通过了你的好友申请
                                                    <div class="clearfix"></div>
                                                    <small class="muted">2 Hours ago</small>
                                                </div>
                                            </div>
                                            <div class="media">
                                                <div class="media-body">
                                                    <a class="news-title" href="">上传了7张图片到DOCS文件夹</a>
                                                    <div class="clearfix"></div>
                                                    <small class="muted">3 Hours ago</small>
                                                </div>
                                            </div>
                                            <div class="media">
                                                <div class="media-body">
                                                    加入小组 <a class="news-title underline" href="">'90s Rock Hits'</a>
                                                    <div class="clearfix"></div>
                                                    <small class="muted">5 Hours ago</small>
                                                </div>
                                            </div>
                                            <div class="media">
                                                <div class="pull-right">
                                                    <img width="37" src="${pageContext.request.contextPath }/img/profile-pics/5.jpg" alt="">
                                                </div>
                                                <div class="media-body">
                                                    <a class="news-title underline" href="">发布消息</a> 
                                                    <div class="clearfix"></div>
                                                    <small class="muted">8 Hours ago</small>
                                                </div>
                                            </div>
                                            <div class="media">
                                                <div class="media-body">
                                                   		注册一个会员
                                                    <div class="clearfix"></div>
                                                    <small class="muted">6 Hours ago</small>
                                                </div>
                                            </div>
                                            <div class="media">
                                                <div class="media-body">
                                                    	完成项目 <a class="news-title underline" href="">Joomla</a>
                                                    <div class="clearfix"></div>
                                                    <small class="muted">12 Hours ago</small>
                                                </div>
                                            </div>
                                            <div class="media">
                                                <div class="media-body">
                                                    <a class="news-title underline" href="">出差</a>
                                                    <div class="clearfix"></div>
                                                    <small class="muted">12 Hours ago</small>
                                                </div>
                                            </div>
                                            <div class="media">
                                                <div class="pull-right">
                                                    <img width="37" src="${pageContext.request.contextPath }/img/profile-pics/6.jpg" alt="">
                                                </div>
                                                <div class="media-body">
                                                    <a class="news-title underline" href="">与Emma Stone通话</a>
                                                    <div class="clearfix"></div>
                                                    <small class="muted">2 Days ago</small>
                                                </div>
                                            </div>
                                            <div class="media p-5 text-center l-100">
                                                <a href=""><small>VIEW ALL</small></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                        <div class="col-md-3">
                            
                            <!-- About Me -->
                            <div class="tile">
                                <h2 class="tile-title">About me</h2>
                                <div class="tile-config dropdown">
                                    <a data-toggle="dropdown" href="" class="tooltips tile-menu" title="" data-original-title="Options"></a>
                                    <ul class="dropdown-menu pull-right text-right"> 
                                        <li><a href="">Edit</a></li>
                                        <li><a href="">Delete</a></li>
                                    </ul>
                                </div>
                                
                                <div class="listview icon-list">
                                    <div class="media">
                                        <i class="icon pull-left">&#61744</i>
                                        <div class="media-body">软件工程师</div>
                                    </div>
                                    
                                    <div class="media">
                                        <i class="icon pull-left">&#61753</i>
                                        <div class="media-body">毕业于哈工程</div>
                                    </div>
                                    
                                    <div class="media">
                                        <i class="icon pull-left">&#61713</i>
                                        <div class="media-body">黑龙江，哈尔滨</div>
                                    </div>
                                    <div class="media">
                                        <i class="icon pull-left">&#61713</i>
                                        <div class="media-body">辽宁，大连</div>
                                    </div>

                                </div>
                            </div>
                            <div class="tile">
                                <h2 class="tile-title">通讯</h2>
                                <div class="tile-config dropdown">
                                    <a data-toggle="dropdown" href="" class="tooltips tile-menu" title="" data-original-title="Options"></a>
                                    <ul class="dropdown-menu pull-right text-right"> 
                                        <li><a href="">Edit</a></li>
                                        <li><a href="">Delete</a></li>
                                    </ul>
                                </div>
                                
                                <div class="listview narrow">
                                    <div class="media p-l-5">
                                        <div class="pull-left">
                                            <img width="37" src="${pageContext.request.contextPath }/img/profile-pics/1.jpg" alt="">
                                        </div>
                                        <div class="media-body">
                                            <a class="news-title" href="">蜡笔小新</a>
                                            <div class="clearfix"></div>
                                            <a href=""><small class="text-muted">陌生人</small></a>
                                        </div>
                                    </div>
                                    <div class="media p-l-5">
                                        <div class="pull-left">
                                            <img width="37" src="${pageContext.request.contextPath }/img/profile-pics/2.jpg" alt="">
                                        </div>
                                        <div class="media-body">
                                            <a class="news-title" href="">哆啦A梦</a>
                                            <div class="clearfix"></div>
                                            <a href=""><small class="text-muted">陌生人</small></a>
                                        </div>
                                    </div>
                                    <div class="media" p-l-5">
                                        <div class="pull-left">
                                            <img width="37" src="${pageContext.request.contextPath }/img/profile-pics/3.jpg" alt="">
                                        </div>
                                        <div class="media-body">
                                            <a class="news-title" href="">钢铁侠</a>
                                            <div class="clearfix"></div>
                                            <a href=""><small class="text-muted">陌生人</small></a>
                                        </div>
                                    </div>
                                    <div class="media" p-l-5">
                                        <div class="pull-left">
                                            <img width="37" src="${pageContext.request.contextPath }/img/profile-pics/4.jpg" alt="">
                                        </div>
                                        <div class="media-body">
                                            <a class="news-title" href="">超人</a>
                                            <div class="clearfix"></div>
                                            <a href=""><small class="text-muted">陌生人</small></a>
                                        </div>
                                    </div>
                                    <div class="media" p-l-5">
                                        <div class="pull-left">
                                            <img width="37" src="${pageContext.request.contextPath }/img/profile-pics/5.jpg" alt="">
                                        </div>
                                        <div class="media-body">
                                            <a class="news-title" href="">万磁王</a>
                                            <div class="clearfix"></div>
                                            <a href=""><small class="text-muted">陌生人</small></a>
                                        </div>
                                    </div>
                                    <div class="media p-5 text-center l-100">
                                        <a href=""><small>VIEW ALL</small></a>
                                    </div>
                                </div>
                            </div>
                       
                </div>
                
                
                   
            </section>

            <!-- Older IE Message -->
            <!--[if lt IE 9]>
                <div class="ie-block">
                    <h1 class="Ops">Ooops!</h1>
                    <p>You are using an outdated version of Internet Explorer, upgrade to any of the following web browser in order to access the maximum functionality of this website. </p>
                    <ul class="browsers">
                        <li>
                            <a href="https://www.google.com/intl/en/chrome/browser/">
                                <img src="img/browsers/chrome.png" alt="">
                                <div>Google Chrome</div>
                            </a>
                        </li>
                        <li>
                            <a href="http://www.mozilla.org/en-US/firefox/new/">
                                <img src="img/browsers/firefox.png" alt="">
                                <div>Mozilla Firefox</div>
                            </a>
                        </li>
                        <li>
                            <a href="http://www.opera.com/computer/windows">
                                <img src="img/browsers/opera.png" alt="">
                                <div>Opera</div>
                            </a>
                        </li>
                        <li>
                            <a href="http://safari.en.softonic.com/">
                                <img src="img/browsers/safari.png" alt="">
                                <div>Safari</div>
                            </a>
                        </li>
                        <li>
                            <a href="http://windows.microsoft.com/en-us/internet-explorer/downloads/ie-10/worldwide-languages">
                                <img src="img/browsers/ie.png" alt="">
                                <div>Internet Explorer(New)</div>
                            </a>
                        </li>
                    </ul>
                    <p>Upgrade your browser for a Safer and Faster web experience. <br/>Thank you for your patience...</p>
                </div>   
            <![endif]-->
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
        	$(function(){
        		$("#woshicaidan").load("${pageContext.request.contextPath }/txt/"+${sessionScope.roleid}+".txt");//此处根据session信息更改菜单${userdata.roleid}
        		//$("#woshicaidan").load("${pageContext.request.contextPath }/txt/1.txt");
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
	$("#woshicaidan").load("${pageContext.request.contextPath }/txt/"+${sessionScope.roleid}+".txt");//此处根据session信息更改菜单${userdata.roleid}
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
        			success: function (message) {
            			if (message > 0) {
                			alert("查询成功！");
            			}
        			},
        			error: function (message) {
            			alert("查询失败！");
        			}
				});
			}
			
    			
   			
        </script>
    </body>
</html>
