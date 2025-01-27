<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
List<String> fizzBuzzList = (List<String>)request.getAttribute("fizzBuzzList");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
	<%for(String str : fizzBuzzList) {%>
		<li><%=str %></li>
	<%} %>
	</ul>
</body>
</html>