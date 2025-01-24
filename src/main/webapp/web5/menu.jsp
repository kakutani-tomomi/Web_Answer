<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索画面</title>
</head>
<body>
	<h1>カテゴリ指定</h1>
	<form action="../ProductList" form="get">
	<p>カテゴリを選択してください：</p>
	<select name="category">
		<option value="コンピュータ">コンピュータ</option>
		<option value="モバイルデバイス">モバイルデバイス</option>
		<option value="ウェアラブル">ウェアラブル</option>
		<option value="ゲーム">ゲーム</option>
	</select>
	<input type="submit" value="表示">
	</form>
</body>
</html>