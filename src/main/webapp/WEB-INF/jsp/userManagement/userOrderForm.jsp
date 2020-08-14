<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<table>
		<tr>
			<td>
				<p class='orderTitle'>결제완료</p>
				<p class='orderState' id='orderPayComplete'></p>
			</td>
			<td>
				<p class='orderTitle'>배송중</p>
				<p class='orderState' id='orderDelivering'></p>
			</td>
			<td>
				<p class='orderTitle'>배송완료</p>
				<p class='orderState' id='orderDeliveryComplete'></p>
			</td>
			<td>
				<p class='orderTitle'>거래완료</p>
				<p class='orderState' id='orderComplete'></p>
			</td>
		</tr>
		
		<tr><td colspan='4'><p style='height: 50px;'></td></tr>
		
		<tr>
			<td colspan='3' rowspan='4'>
				<span id='orderProduct'>--주문 상품 체크--</span>
			</td>
		<tr>
			<td>
				<p class='orderTitle'>배송 상태</p>
			</td>
		</tr>
		<tr>
			<td>
				<button>거래 완료 / 리뷰 작성</button>
			</td>
		</tr>
		<tr>
			<td>
				<button>환불</button>
			</td>
		</tr>
	</table>
</div>
<style scoped="scoped">
	.orderTitle{
		background-color: #696;
		padding: 10px;
		box-sizing: border-box;
		width: 100px;
	}
	.orderState{
		background-color: #966;
	}
</style>