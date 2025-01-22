<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
 String[] greetingArray = {"morning","afternoon","evening"};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%for(String greeting : greetingArray) {%>
	<p>Good <%=greeting %>!</p>
	<%} %>
</body>
</html>