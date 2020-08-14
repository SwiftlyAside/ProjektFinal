<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <html>
<head>
<title>payPage</title>
</head>
<body>
	<div class='top'>
		<%@ include file= "/WEB-INF/jsp/common/top.jspf" %>
	</div>
	<h2>구매 목록</h2>
	<div id='buyList'></div>
	<div>
		<div>
			<div>
				<h3>주문자 정보 입력</h3>
			</div>
			<div>
				<input type='text' value='주문자명' readonly />
				<input type='text' name='payName' />
			</div>
			<p>
			<div>
				<h3>배송지 정보 입력</h3>
			</div>
			<div>
				<input type='text' value='이름' readonly />
				<input type='text' name='sendName' />
			</div>
			<div>
				<input type='text' value='주소' readonly />
				<input type='text' name='zipcode' />
				<button>주소 찾기</button>
			</div>
			<div>
				<input type='text' name='address1' />
				<input type='text' name='address2' />
			</div>
			<div>
				<input type='text' value='연락처' readonly />
				<input type='text' name='phone' />
			</div>
			<p>
			<div>
				<input type='text' value='배송 메시지' readonly />
			</div>
			<div>
				<input type='text' name='comment' placeholder="배송기사님께 전달할 내용을 적어주세요."/>
			</div>
		</div>
		<p>
		<div>
			<div>
				<h3>결제</h3>
			</div>
			<div>
				<input type='text' value='결제 방법' readonly />
				<input type='radio' name='payway' value='trans' />
				<input type='radio' name='payway' value='card' />
			</div>
			<div>
				<input type='text' value='포인트 사용하기' readonly />
				<input type='text' name='howManyPoint' value='0p' readonly />
				<input type='text' name='point' />
			</div>
			<div>
				<input type='text' value='결제 총액' readonly />
				<input type='text' name='sumPrice' value='100원' readonly />
				<input type='text' name='usedPoint' value='0p' readonly />
				<input type='text' name='totalPrice' value='100원' readonly />
			</div>
			<p>
			<div>
				<input type='checkbox' name='payChk' value='' />
				<button id='payBtn'>구매</button>
			</div>
		</div>
	</div>
</body>
</html>