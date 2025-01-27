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
<title>スコープテスト</title>
</head>
<body>
	<h1>スコープテスト</h1>
	<form action="ScopeTest" method="post">
		<p>リクエストスコープ：<%=requestSample %></p>
		<p>セッションスコープ：<%=sessionSample %></p>
		<input type="submit" value="最後の画面へ">
	</form>
</body>
</html>