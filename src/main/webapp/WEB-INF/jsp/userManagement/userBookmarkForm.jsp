<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="home" value='/' />
<div id='bookmark'>
	<h2>bookmark page~</h2>
</div>
<script>
	var xhr = new XMLHttpRequest();
	xhr.open('GET', '${home}member/bookmarkInfo');
	xhr.onreadystatechange = function(){
		if(xhr.status == 200 && xhr.readyState == 4){
			var str = xhr.responseText;
			var json = JSON.parse(str);
			var bmpage = document.getElementById('bookmark');
			for(var i=0;i<json.length;i++){
				bmpage.innerHTML += "<div id='" + json[i].productId + "'></div>";
				var div = document.getElementById(json[i].productId);
				div.innerHTML = "<span><img alt='' src=''></span>"
					+ "<span><label id='pname" + json[i].productId + "'></label><br/>"
					+ "<label id='pprice" + json[i].productId + "'></label><br/>"
					+ "<button id='btn" + json[i].productId + "'>선물하기</button></span>";
					
				var pname = document.getElementById('pname' + json[i].productId);
				var pprice = document.getElementById('pprice' + json[i].productId);
				pname.innerHTML = '<b>' + json[i].productName + '</b>';
				pprice.innerHTML = json[i].productPrice;
			}
			
		}
	};
	xhr.send();
</script>