<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 2020-08-13
  Time: 오전 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div style="border: 1px solid">
    <div>
        <span>문의 제목</span>
        <span>문의 날짜</span>
    </div>
    <div>
        <textarea name="" id="" cols="30" rows="10" readonly>문의 내용</textarea>
    </div>
    <div>
        <textarea name="" id="" cols="30" rows="10">답변 내용 입력</textarea>
    </div>
    <div>
        <button>답변하기</button>
    </div>
</div>
this is detail page !
파라미터를 통해 넘어온 번호 : ${questionNo}