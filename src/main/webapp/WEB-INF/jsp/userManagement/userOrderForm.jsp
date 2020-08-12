<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<div>
		<span>
			<input type='text' id='orderPayComplete' value='결제완료' readonly /><br/>
		</span>
		<span>
			<input type='text' id='orderDelivering' value='배송중' readonly /><br/>
		</span>
		<span>
			<input type='text' id='orderDeliveryComplete' value='배송완료' readonly /><br/>
		</span>
		<span>
			<input type='text' id='orderComplete' value='거래완료' readonly /><br/>
		</span>
	</div>
	<p>
	<div>
		<span>
			<p>---- 구매 상품 ----</p>
		</span>
		<span>
			<input type='text' id='orderState' value='배송상태' readonly /><br/>
			<button>거래 완료 / 리뷰 작성</button><br/>
			<button>환불</button><br/>
		</span>
	</div>
</div>