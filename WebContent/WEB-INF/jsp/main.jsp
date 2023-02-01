<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ page import="model.Song,java.util.*" %> --%>
<%-- <%
	List<Song> songList=
		(List<Song>)request.getAttribute("songList");
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
<title>ELLEGARDEN曲検索結果</title>
<link rel="stylesheet" href="css/song.css">
</head>
<body>
<h1>ELLEGARDEN楽曲逆引き検索</h1>
<p>曲のタイトルを入力すると再生時間や収録アルバムを表示します</p>
<p>
<img src="images/ELLEGARDEN2.jpg" alt="エルレの写真" width="600" height="230">
<!-- 以下は画像の大きさ確認用コード-->
<!-- <p><img src="images/ALimage/eleven fire crackers.jpg" alt="eleven fire crackersの写真" width="300" height="300"></p>
<p><img src="images/ALimage/RIOT ON THE GRILL.jpg" alt="RIOT ON THE GRILLの写真" width="300" height="300"></p>
<p><img src="images/ALimage/Pepperoni Quattro.jpg" alt="Pepperoni Quattroの写真" width="300" height="300"></p> -->

<p>
<a href="/songs/SongSerch">タイトルからさがす</a>
<%-- <% for(Song song : songList){ %>
<p>曲名 ▶︎ <%= song.getSongName() %></p>
<p>再生時間 ▶ ︎<%= song.getSongTime() %></p>
<p>収録アルバム ▶ ︎<%= song.getRecoAl() %><p><br>
<% } %> --%>

</p>

<a href="/songs/LoginUser">楽曲DB管理画面へ</a>
</body>
</html>