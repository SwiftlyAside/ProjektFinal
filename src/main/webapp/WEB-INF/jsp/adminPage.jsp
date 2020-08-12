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
	<span class='myPageForm-left'> 
		<%@ include file="admin/adminMenu.jsp"%>
	</span>
	<span class='myPageForm-right'> 
		<c:import url="${home }${path }"/>
	</span>
</body>
</html>