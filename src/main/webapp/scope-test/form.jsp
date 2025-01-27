<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
</head>
<body>
	<h1>入力画面</h1>
	<form action="../ScopeTest" method="get">
		<p>リクエストスコープ：<input type="text" name="requestSample" value="リクエストスコープ！"></p>
		<p>セッションスコープ：<input type="text" name="sessionSample" value="セッションスコープ！"></p>
		<input type="submit" value="送信">
	</form>
</body>
</html>