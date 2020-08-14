<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="home" value='/' />
<form id='frmCart'>
	<div id='cart'>
		<h2>ShoppingCart Page</h2>
	</div>
	<div><button id='gotopayBtn'  onclick='gotoPay();'>구매</button></div>
</form>
<script>
	var lst = [];
	var map = {};
	map.id = '001';
	map.name = '마티스';
	map.price = '299,000';
	lst.push(map);
	map = {};
	map.id = '002';
	map.name = '마티스2';
	map.price = '199,000';
	lst.push(map);
	localStorage.setItem('shoppingCart', JSON.stringify(lst));
	
	
	var cart = document.getElementById('cart');
	var shoppingCart = JSON.parse(localStorage.getItem('shoppingCart'));
	
	for(var i=0;i<shoppingCart.length;i++){
		cart.innerHTML += "<div id='" + shoppingCart[i].id + "'></div>";
		var div = document.getElementById(shoppingCart[i].id);
		div.innerHTML = "<span><img alt='' src=''></span>"
			+ "<span><label id='pname" + shoppingCart[i].id + "'></label><br/>"
			+ "<label id='pprice" + shoppingCart[i].id + "'></label><br/>"
			+ "<button id='delBtn" + shoppingCart[i].id + "'"
			+ 	"onclick='deleteCartLst('" + i + "')'>X</button></span>";
		var pname = document.getElementById('pname' + shoppingCart[i].id);
		var pprice = document.getElementById('pprice' + shoppingCart[i].id);
		pname.innerHTML = '<b>' + shoppingCart[i].name + '</b>';
		pprice.innerHTML = shoppingCart[i].price;
	}
	function deleteCartLst(i){
		/* 배열삭제 구분 */
		localStorage.setItem('shoppingCart', JSON.stringify(lst));
		alert('삭제');
	}
	function gotoPay(){
		var frm = document.getElementById('frmCart');
		frm.action = '${home }buy/gotoPay';
		frm.submit();
	}
</script>