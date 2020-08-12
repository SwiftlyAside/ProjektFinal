<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="home" value="/" />
<div>
	<div>
		<span>리뷰 내용</span>
	</div>
	<div>
		<span>
			<button id='deleteReview'>삭제 하기</button>
		</span>
	</div>
	<%-- <c:if test="${reviewCnt ne ''}">
		<c:set var="cnt" value="1" />
		<c:forEach var="reviewCnt" items="${reviewCnt }">
			<c:set var="cnt" value="${i + 1 }" /> --%>
			<div>
				<a href="${home }user/"><button>
					<!-- <p id='${reviewId}'>${reviewNo}. ${reviewTitle}</p> -->
					<p id='${reviewId }'>1. 삼성의 시금치는 역시 진한 맛이 나는군요.</p>
				</button></a>
			</div>
		<%-- </c:forEach>
	</c:if> --%>
</div>