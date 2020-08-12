<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class='bookmark'>
	<h2>bookmark page~</h2>
	<c:if test="${bookmarkCnt ne ''}">
	<c:set var="cnt" value="1" />
		<c:forEach var="bookmarkCnt" items="${bookmarkLst }">
			<c:set var="cnt" value="${i + 1 }" />
			<div id='${productId }'>
				<span>
					<img alt="" src="">
				</span>
				<span>
					<label><b>${productName }</b></label><br/>
					<label>${productPrice }</label><br/>
					<button id='btn${productId }'>선물하기</button>
				</span>
			</div>
			<c:if test="${cnt % 2 == 0 }"><br/></c:if>
		</c:forEach>
	</c:if>
</div>