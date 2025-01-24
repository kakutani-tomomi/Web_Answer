<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>製品情報登録</title>
</head>
<body>
	<h1>製品情報登録</h1>
	<form action="../ProductRegistration" method="get">
		<p>
		コード：<input type="text" name="productCode"><br>
	    製品名：<input type="text" name="productName"><br>
	    価格：<input type="text" name="price"><br>
	    カテゴリ：<input type="text" name="category"><br>
	    </p>
	    <input type="submit" value="登録する">
	</form>
</body>
</html>