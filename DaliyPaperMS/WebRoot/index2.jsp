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
			<td>time</td>
			<td>id</td>
		</tr>
		<c:forEach items="${ribaodata}" var="aaa">
		<tr>
			<td>${aaa.uptime }</td>
			<td>${aaa.context }</td>
		</tr>
		</c:forEach>
		</table>
  </body>
</html>
