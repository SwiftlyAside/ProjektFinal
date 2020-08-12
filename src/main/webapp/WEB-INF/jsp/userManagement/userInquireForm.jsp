<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="home" value="/" />
<div>
	<div>
		<span>문의 내용</span>
	</div>
	<div>
		<span>
			<button id='insertInquire'>문의 하기</button>
			<button id='deleteInquire'>삭제 하기</button>
		</span>
	</div>
	<%-- <c:if test="${inquireCnt ne ''}">
		<c:set var="cnt" value="1" />
		<c:forEach var="inquireCnt" items="${inquireCnt }">
			<c:set var="cnt" value="${i + 1 }" /> --%>
			<div>
				<a href="${home }user/insertInquire"><button>
					<!-- <p>${writeday} ${productName}상품에 대한 문의내용입니다.</p> -->
					<p>2020-08-12 OOO상품에 대한 문의내용입니다.</p>
				</button></a>
			</div>
		<%-- </c:forEach>
	</c:if> --%>
</div>