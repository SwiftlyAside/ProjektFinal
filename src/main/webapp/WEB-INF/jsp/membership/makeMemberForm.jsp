<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="home" value="/"/>
<div class='container'>
	<form action="${home}member/makeMember" method="post">
		<div class='row'>
			<input type='text' value='아이디' readonly /><br/>
			<input type='text' name='id' />
		</div>
		<div class='row'>
			<input type='text' value='이름' readonly /><br/>
			<input type='text' name='name' />
		</div>
		<div class='row'>
			<input type='text' value='이메일' readonly /><br/>
			<input type='text' name='email' />
		</div>
		<div class='row'>
			<input type='text' value='비밀번호' readonly /><br/>
			<input type='text' name='pw' />
		</div>
		<div class='row'>
			<input type='text' value='비밀번호 확인' readonly /><br/>
			<input type='text' name='pwOk' />
		</div>
		<div class='row'>
			<button class='btn' id='btnMakeMember'>화원가입</button>
		</div>
	</form>
</div>