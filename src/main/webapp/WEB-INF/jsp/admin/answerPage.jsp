<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 2020-08-13
  Time: 오전 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="/" var="home"/>
<div>
    고객 문의 내용 리스트
</div>
<p>
<div>
    <div id="1" onclick="show(event)">문의! Click Me!</div>
    <div id="detail_1" style="display: none"></div>
    <hr>
    <div id="2"></div>
    <div id="3"></div>
</div>

<script>
    function show(event) {
      let target = document.getElementById('detail_' + event.target.id);
      if (target.style.display === 'none') {
        target.style.display = 'inline';
        detail(event.target.id);
      } else
        target.style.display = 'none';
    }

    function detail(id) {
      let xlr = new XMLHttpRequest();
      xlr.open('GET', '${home}admin/detail?questionNo=' + id);
      xlr.onreadystatechange = () => {
        if (xlr.status === 200 && xlr.readyState === 4) {
          let target = document.getElementById('detail_' + id);
          target.innerHTML = xlr.responseText;
        }
      }
      xlr.send();
    }

    (function () {
      let xlr = new XMLHttpRequest();
      xlr.open('GET', '${home}admin/showAll');
      xlr.onreadystatechange = () => {
        if (xlr.status === 200 && xlr.readyState === 4){
          let target = document.getElementById('1');
          target.innerHTML += xlr.responseText;
        }
      }
      xlr.send();
    })();
</script>