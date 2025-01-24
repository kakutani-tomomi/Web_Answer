<%@page import="model.entity.web7.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	ProductBean productBean = (ProductBean)request.getAttribute("productBean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録完了画面</title>
</head>
<body>
	<h1>登録結果</h1>
	<p>以下の製品情報を登録しました。<br>
		コード：<%=productBean.getProductCode() %><br>
	    製品名：<%=productBean.getProductName() %><br>
	    価格：<%=productBean.getPrice() %><br>
	    カテゴリ：<%=productBean.getCategory() %><br>
	</p>
</body>
</html>