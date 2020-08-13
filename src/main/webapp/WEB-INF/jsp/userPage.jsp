<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="home" value="/"/>
<html>
<head>
<title>USER PAGE</title>
</head>
<body>
	<div class='top'>
		<%@ include file="/WEB-INF/jsp/common/top.jspf"%>
	</div>
	<span class='myPageForm-left'> 
		<%@ include file="userManagement/userMenu.jsp"%>
	</span>
	<span class='myPageForm-right'> 
		<c:import url="${home }${path }"/>
	</span>
</body>
<style>
.myPageForm-left {
	width: 30%;
	height: 80%;
}

.myPageForm-right {
	width: 70%;
	height: 80%;
}
</style>
</html>