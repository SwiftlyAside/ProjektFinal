<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class='container'>
	<form>
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
			<span>
				<img alt="" src="">
			</span>
			<span>
				<input type='text' value='나만의 아이콘' readonly /><br/>
				<input type='file' name='uploadFile' />
			</span>
			<span>
				<p>300x300의 jsp, png 형식만 지원됩니다.</p>
			</span>
		</div>
		<div class='row'>
			<button class='btn' id='btnModifyMember'>수정하기</button>
		</div>
	</form>
</div>