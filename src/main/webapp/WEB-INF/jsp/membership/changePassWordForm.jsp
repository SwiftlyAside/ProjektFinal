<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="home" value="/"/>
<div class='container'>
	<form action="${home}member/changePw" method="post">
		<div class='row'>
			<input type='text' value='아이디 혹은 이메일을 넣어주세요' readonly /><br/>
			<input type='text' name='data' />
		</div>
		<div class='row'>
			<input type='text' value='변경할 비밀번호를 넣어주세요' readonly /><br/>
			<input type='password' name='pw' />
		</div>
		<div class='row'>
			<input type='text' value='변경할 비밀번호를 한 번 더 넣어주세요' readonly /><br/>
			<input type='password' name='pwOk' />
		</div>
		<div class='row'>
			<button id='btnChangePw'>다음</button>
		</div>
	</form>
</div>