<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String name = (String)request.getAttribute("name");
String mailAddress = (String)request.getAttribute("mailAddress");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録結果</title>
</head>
<body>
	<h1>ユーザー登録が完了しました</h1>
	<p>名前： <%=name %></p>
	<p>メールアドレス： <%=mailAddress %></p>
</body>
</html>