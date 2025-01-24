<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
List<String> productNameList = (List)request.getAttribute("productNameList");
String category = (String)request.getAttribute("category");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>製品名一覧表示</title>
</head>
<body>
	<h1>指定カテゴリの製品名一覧を表示します。</h1>
	<%if(productNameList.size() > 0){ %>
	<p>カテゴリ名：<%=category %><br>
		<%for(String productName : productNameList) {%>
			<%=productName %><br>
		<%} %>
	<%}else{ %>
		<%=category %>に所属する製品はありませんでした。
	<%} %>
	</p>
</body>
</html>