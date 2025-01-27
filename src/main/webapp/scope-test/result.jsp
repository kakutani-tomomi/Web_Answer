<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String requestSample = (String)request.getAttribute("requestSample");
String sessionSample = (String)session.getAttribute("sessionSample");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>最終画面</title>
</head>
<body>
	<h1>最終テスト画面</h1>
	<p>リクエストスコープ：<%=requestSample %></p>
	<p>セッションスコープ：<%=sessionSample %></p>
</body>
</html>