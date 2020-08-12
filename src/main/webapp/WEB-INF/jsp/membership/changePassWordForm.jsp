<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class='container'>
	<form>
		<div class='row'>
			<input type='text' value='아이디 혹은 이메일을 넣어주세요' readonly /><br/>
			<input type='text' name='email' />
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