<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>楽曲DB登録</title>
</head>
<body>
<h1>楽曲情報登録</h1>
<form action="/songs/SongDbResi" method="post" >
<p>▶曲名：<input type="text" name="songName"  style="width:150px; height:30px;" placeholder="例: Mountain Top"></p>
<p>▶︎ふりがな：<input type="text" name="ruby" style="width:150px; height:30px" placeholder="例: まうんてんとっぷ"></p>
<p>▶再生時間：<input type="text" name="songtime" style="width:150px; height:30px" placeholder="例: 4:08"></p>
<p>▶収録アルバム：<input type="text" name="recoAL" style="width:150px; height:30px" placeholder="例: The End of Yesterday"></p>
<p><input type="submit" value="楽曲DBに登録する"></p>
</form>
</body>
</html>