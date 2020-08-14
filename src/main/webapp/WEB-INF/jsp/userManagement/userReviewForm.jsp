<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="home" value="/" />
<div>
	<h3>리뷰 내용</h3>
	<p>
	<div id='reviewList'></div>
</div>

<script>
	var xhr = new XMLHttpRequest();
	xhr.open('GET', '/myPage/reviewInfo');
	xhr.onreadystatechange = function(){
		if(xhr.status == 200 && xhr.readyState == 4){
			var str = xhr.responseText;
			var json = JSON.parse(str);
			var bmpage = document.getElementById('reviewList');
			for(var i=0;i<json.length;i++){
				bmpage.innerHTML += "<div id='" + json[i].reviewid
				 + "' onclick='clickReviewList(" + json[i].reviewid +");'></div>"
				 + "<div id='detail_" + json[i].reviewid + "' style='display: none;'></div>";
				 
				var div = document.getElementById(json[i].reviewid);
				div.innerHTML = "<b>" + json[i].grade + " " + json[i].pid + "</b>";
			}
		}
	};
	xhr.send();
	
	function clickReviewList(reviewid){
		var divContent = document.getElementById('detail_' + reviewid);
		if(divContent.style.display == 'none'){
			divContent.style.display = 'inline';
			getReviewDetail(reviewid);
		}else{
			divContent.style.display = 'none';
		}
	}
	function getReviewDetail(reviewid){
		var xhr = new XMLHttpRequest();
		xhr.open('GET', '/myPage/getReviewDetail?reviewId=' + reviewid);
		xhr.onreadystatechange = function(){
			if(xhr.status == 200 && xhr.readyState == 4){
				var str = xhr.responseText;
				var json = JSON.parse(str);
				console.log(json);
				var divContent = document.getElementById('detail_' + reviewid);
				divContent.innerHTML = "<div style='border: 1px solid'>"
		       						 + "<span>" + json.writedate + "</span>"
		       						 + "<span>" + json.content + "</span>"
		       						 + "<div><button id='reviewBtn_" + json.userid + "'>삭제</button></div>"
									 + "</div>";
				 					 
			}
		};
		xhr.send();
	}
</script>