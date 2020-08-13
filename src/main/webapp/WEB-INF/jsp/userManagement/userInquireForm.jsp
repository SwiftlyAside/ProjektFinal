<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="home" value="/" />
<div>
	<h3>문의 내용</h3>
	<table>
		<tr>
			<td>
				<button id='insertInquire'>문의 하기</button>
			</td>
			<td>
				<button id='deleteInquire'>삭제 하기</button>
			</td>
		</tr>
	</table>
	<div id='inquireList'></div>
</div>
<script>
	var xhr = new XMLHttpRequest();
	xhr.open('GET', '${home}userInquire/orderProduct');
	xhr.onreadystatechange = function(){
		if(xhr.status == 200 && xhr.readyState == 4){
			var str = xhr.responseText;
			var json = JSON.parse(str);
			var bmpage = document.getElementById('orderProduct');
			for(var i=0;i<json.length;i++){
				bmpage.innerHTML += "<div id='" + json[i].inquireId
				 + "' onclick='clickList(" + json[i].inquireId +");'></div>"
				 + "<div id='detail_" + json[i].inquireId + "' style='display: none;'></div>";
				 
				var div = document.getElementById(json[i].inquireId);
				div.innerHTML = "<b>" + json[i].title + "</b>";
			}
		}
	};
	xhr.send();
	function clickList(inquireId){
		var divContent = document.getElementById('detail_' + inquireId);
		if(divContent.style.display == 'none'){
			divContent.style.display = 'inline';
			getDetail(inquireId);
		}else{
			divContent.style.display = 'none';
		}
	}
	function getDetail(inquireId){
		var xhr = new XMLHttpRequest();
		xhr.open('GET', '${home}userInquire/detail?inquireId=' + inquireId);
		xhr.onreadystatechange = function(){
			if(xhr.status == 200 && xhr.readyState == 4){
				var str = xhr.responseText;
				var json = JSON.parse(str);
				
				var divContent = document.getElementById('detail_' + inquireId);
				divContent.innerHTML = "<div style='border: 1px solid'>"
			    					 + "<div>"
		       						 + "<span>" + json.title + "</span>"
		       						 + "<span>" + json.writeDate + "</span>"
		   							 + "</div>"
		    						 + "<div>"
		        					 + "<textarea name='' id='' cols='30' rows='10' readonly>" + json.content + "</textarea>"
		  							 + "</div>"
		   							 + "<div>"
		       						 + "<textarea name='' id='' cols='30' rows='10'>" + json.answer + "</textarea>"
		   							 + "</div>"
		   							 + "<div>"
		       						 + "<button>답변하기</button>"
		   							 + "</div>"
									 + "</div>";
			}
		};
	}
</script>