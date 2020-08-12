<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var='home' value='/' />
<div class='userMenu'>
	<div>
		<img alt="img" src=""><input type='text' name='point' value='0p' readonly/>
	</div>
	<div>
		<input type='text' name='id' />
	</div>
	<div>
		<a href='${home }user/modifyInfo'>
			<button id='modifyUserInfo'>회원정보 수정</button>
		</a>
	</div>
	<p>
	<div>
		<input type='text' value='주문/조회' readonly />
	</div>
	<div>
		<a href='${home }user/orderInfo'>
			<button id='inquireOrderInfo'>주문/배송조회</button>
		</a>
	</div>
	<div>
		<button id=''>현금영수증/세금계산서</button>
	</div>
	<p>
	<div>
		<input type='text' value='나의 활동 내역' readonly />
	</div>
	<div>
		<a href='${home }user/bookmarkInfo'>
			<button id='bookmarkInfo'>찜목록</button>
		</a>
	</div>
	<div>
		<a href='${home }user/inquireInfo'>
			<button id='inquireInfo'>문의 내용</button>
		</a>
	</div>
	<div>
		<a href='${home }user/reviewInfo'>
			<button id='reviewInfo'>제품 리뷰</button>
		</a>
	</div>
</div>