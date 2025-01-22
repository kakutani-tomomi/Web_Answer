<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String itemName = (String)request.getAttribute("itemName");
	int quantity = (int)request.getAttribute("quantity");
	int unitPrice = (int)request.getAttribute("unitPrice");
	int totalPrice = (int)request.getAttribute("totalPrice");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認画面</title>
</head>
<body>
	<h1>注文確認</h1>
	<p>商品名：<%=itemName %></p>
	<p>数量：<%=quantity %></p>
	<p>単価：￥<%=unitPrice %></p>
	<p>合計金額：￥<%=totalPrice %></p>
</body>
</html>