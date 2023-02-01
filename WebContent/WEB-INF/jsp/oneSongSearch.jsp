<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>曲検索</title>
</head>
<body>
<p>▶︎タイトルを入力（ひらがな対応）</p>
<form action="/songs/SongSerch" method="post">

<input type="text" name="songName" placeholder="例:Red Hot"> <input type="submit" value="送信">

</form>
<p>▶あいうえお順で探す</p>
<a href="/songs/JpnSyllabary?action=aLine">あ行</a>
<a href="/songs/JpnSyllabary?action=kLine">か行</a>
<a href="/songs/JpnSyllabary?action=sLine">さ行</a>
<a href="/songs/JpnSyllabary?action=tLine">た行</a>
<a href="/songs/JpnSyllabary?action=nLine">な行</a>
<a href="/songs/JpnSyllabary?action=hLine">は行</a>
<a href="/songs/JpnSyllabary?action=mLine">ま行</a>
<a href="/songs/JpnSyllabary?action=yLine">や行</a>
<a href="/songs/JpnSyllabary?action=rLine">ら行</a>
<a href="/songs/JpnSyllabary?action=wLine">わ行</a>
<p>
<a href="/songs/Main">メイン画面へ</a>
</p>
</body>
</html>