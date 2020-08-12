<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var='home' value='/' />
<div class='userMenu'>
	<div>
		<img alt="img" src="">
	</div>
	<div>
		<input type='text' name='id' value="관리자" readonly />
	</div>

	<p>
	<div>
		<input type='text' value="상품 관리" readonly />
	</div>
	<div>
		<a <%--href='${home }user/modifyInfo'--%>>
			<button>등록</button>
		</a>
		<a <%--href='${home }user/modifyInfo'--%>>
			<button>수정</button>
		</a
		<a <%--href='${home }user/modifyInfo'--%>>
			<button>삭제</button>
		</a>
		<a <%--href='${home }user/modifyInfo'--%>>
			<button>할인 정보</button>
		</a>
	</div>
	<p>
	<div>
		<input type='text' value='판매' readonly />
	</div>
	<div>
		<a <%--href='${home }user/orderInfo'--%>>
			<button>결제 정보 확인</button>
		</a>
		<a <%--href='${home }user/orderInfo'--%>>
			<button>환불 요청 확인</button>
		</a>
	</div>
	<p>
	<div>
		<input type='text' value='정산' readonly />
	</div>
	<div>
		<a <%--href='${home }user/bookmarkInfo'--%>>
			<button>정산</button>
		</a>
	</div>
	<p>
	<div>
		<input type='text' value='사이트 관리' readonly />
	</div>
	<div>
		<a <%--href='${home }user/inquireInfo'--%>>
			<button>문의 내용 답변</button>
		</a>
<%--		<a &lt;%&ndash;href='${home }user/inquireInfo'&ndash;%&gt;>--%>
<%--			<button>상품 메뉴 커스텀</button>--%>
<%--		</a>--%>
	</div>
</div>