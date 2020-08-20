<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: iveci
  Date: 2020-08-11
  Time: 11:24
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang=en>
<head>
    <meta charset=utf-8>
    <meta http-equiv=X-UA-Compatible content="IE=edge">
    <meta name=viewport content="width=device-width,initial-scale=1">
    <link rel=icon href=/favicon.ico>
    <title>frontend</title>
</head>
<body>
<noscript><strong>We're sorry but frontend doesn't work properly without JavaScript enabled. Please enable it to
    continue.</strong></noscript>
<div id=app></div>
<script src=/js/chunk-vendors.cdd1e580.js.js></script>
<script src=/js/app.f97acbb0.js></script>
<div>
    <%@ include file="/WEB-INF/jsp/common/top.jspf" %>
</div>
<c:set var="home" value="/"/>
<div>
    <c:import url="${home}${path}"/>
</div>
</body>
</html>
