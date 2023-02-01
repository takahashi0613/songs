<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Song,java.util.List" %>
<%
List<Song> SongList=(List<Song>)request.getAttribute("List");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果</title>
<link rel="stylesheet" href="css/song.css">
</head>
<body>
<% for(Song s : SongList){ %>
<p>▼アルバムジャケット写真▼</p>
<%=s.getALimage() %>
<p>曲名 ▶︎ <%= s.getSongName() %></p>
<p>再生時間 ▶ ︎<%= s.getSongTime() %></p>
<p>収録アルバム ▶ ︎<%= s.getRecoAl() %><p><br>
<%} %>
<p></p>
<p></p>
<a href="/songs/SongSerch">検索条件を変更</a>
</body>
</html>