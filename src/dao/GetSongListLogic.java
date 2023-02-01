package dao;

import java.util.List;

import model.Song;

public class GetSongListLogic {
	public List<Song> execute(){
		SongDAO dao=new SongDAO();
		List<Song> songList=dao.findAll();
		return songList;
	}
}
