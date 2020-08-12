<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var='home' value='/' />
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
	<div class='container'>
		<h2>{{ message }}</h2>
		<form>
			<div class='row'>
				<div class='col'>
					<button class='btn' id='btnLoginAnonymous'>비회원으로 주문하기</button>
				</div>
				<div class='col'>
					<input type='text' name='id' placeholder="아이디 입력" />
				</div>
				<div class='col'>
					<input type='password' name='pw' placeholder="패스워드입력" />
				</div>
				<div class='col'>
					<button class='btn' id='btnLogin'>로그인</button>
				</div>
				<div class='col'>
					<span>
						<a href='${home }local/findMember'>아이디 찾기
							<!-- <button class='btn' id='btnFindMember'>아이디 찾기</button> -->
						</a>
					</span>
					<span>
						<a href='${home }local/changePass'>비밀번호 수정
							<!-- <button class='btn' id='btnChangePw'>비밀번호 수정</button> -->
						</a>
					</span>
					<span>
						<a href='${home }local/makeMember'>회원가입
							<!-- <button class='btn' id='btnMakeMember'>회원가입</button> -->
						</a>
					</span>
				</div>
			</div>
		</form>
	</div>
<script>
	var container = new Vue({
		el: '.container',
		data: {
			message: '안녕하세요 vue'
		}
	})
</script>
