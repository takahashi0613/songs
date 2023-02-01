<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>楽曲DB管理画面へログイン</title>
</head>
<body>
<h1>楽曲DB管理画面へログイン</h1>
<p>パスワードを入力</p>
<form action="/songs/SongDb" method="post">
<input type="text" >
<input type="submit" value="ログイン">
</form>

<a href="/songs/Main">メイン画面へ</a>
</body>
</html>