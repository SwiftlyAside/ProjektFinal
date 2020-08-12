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
    <link rel=stylesheet href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900">
    <link rel=stylesheet href=https://cdn.jsdelivr.net/npm/@mdi/font@latest/css/materialdesignicons.min.css>
    <link href=/css/chunk-vendors.ea60d3dc.css rel=preload as=style>
    <link href=/js/app.f97acbb0.js rel=preload as=script>
    <link href=/js/chunk-vendors.5ac65b82.js rel=preload as=script>
    <link href=/css/chunk-vendors.ea60d3dc.css rel=stylesheet>
</head>
<body>
<noscript><strong>We're sorry but frontend doesn't work properly without JavaScript enabled. Please enable it to
    continue.</strong></noscript>
<div id=app></div>
<script src=/js/chunk-vendors.5ac65b82.js></script>
<script src=/js/app.f97acbb0.js></script>
<div>
    <%@ include file="common/top.jspf" %>
</div>
<c:set var="home" value="/"/>
<div>
    <c:import url="${home}${path}"/>
</div>
</body>
</html>
