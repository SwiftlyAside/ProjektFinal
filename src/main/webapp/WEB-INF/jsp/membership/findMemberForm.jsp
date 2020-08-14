<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="home" value="/"/>
<div class='container'>
	<form action="${home}member/findId" method="post">
		<div>
			<input type='text' value='이메일로 아이디 찾기' readonly />
		</div>
		<div>
			<input type='text' name='email' placeholder="이메일 입력" />
			<button class='btn' id='btnFindMember'>다음</button>
		</div>
	</form>
</div>