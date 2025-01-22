<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ご注文内容</h1>
	<form action="../Order" method="get">
		<p>商品名 : ガジェットA</p>
		<input type="hidden" name="itemName" value="ガジェットA">
		<select name="quantity">
			<%for(int i = 1; i <= 20;i++) {%>
				<option value=<%=i %>><%=i %></option>
			<%} %>
		</select><br>
		<p>割引情報：</p>
		<ul>
			<li>10個以上購入で単価2700円</li>
			<li>15個以上購入で単価2500円</li>
		</ul>
		<input type="submit" value="注文を確定する">
	</form>
</body>
</html>