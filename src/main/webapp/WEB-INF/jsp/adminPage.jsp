<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="home" value="/"/>
<html>
<head>
<title>ADMIN PAGE</title>
</head>
<body>
	<div class='top'>
		<%@ include file="common/top.jspf"%>
	</div>
	<table>
		<tr>
		<td>
			<%@ include file="admin/adminMenu.jsp"%>
		</td>
		<td style="width: 100%; text-align: center">
			<c:import url="${home }${path }"/>
		</td>
		</tr>
	</table>
</body>
</html>