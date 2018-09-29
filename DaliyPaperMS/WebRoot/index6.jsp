<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
  <head>
<title>用户列表</title>
  </head>
  
  <body>
	<table width="100%" border=1>
		<tr>
			<td>renname</td>
			<td>renid</td>
			<td>workload</td>
		</tr>
		<c:forEach items="${depworkloaddata}" var="aaa">
		<tr>
			<td>${aaa.renname }</td>
			<td>${aaa.renid }</td>
			<td>${aaa.workload }</td>
		</tr>
		</c:forEach>
		<tr>
			<td>总计</td>
			<td>-</td>
			<td>${s }</td>
		</tr>
		</table>
  </body>
</html>
