<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="home" value="/" />
<html>
<head>
<title>USERINDEX</title>
</head>
<body>
	<div class='top'>
		<%@ include file="/WEB-INF/jsp/common/top.jspf"%>
	</div>
	<table>
		<tr>
			<td class='myPageForm-left'>
				<span>
					<%@ include file="userManagement/userMenu.jsp"%>
				</span>
			</td>
			<td class='myPageForm-right'>
				<span>
					<c:import url="${home }${path }" />
				</span>
			</td>
		</tr>
	</table>
</body>
<style>
.myPageForm-left {
	width: 30%;
}

.myPageForm-right {
	width: 70%;
}
</style>
</html>