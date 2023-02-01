package model;

import java.io.Serializable;

public class Song implements Serializable{
	private int id;
	private String songName; //曲名
	private String ruby; //曲名のふりがな
	private String songTime; //曲の長さ
	private String recoAl; //収録されているアルバム名
	private String keyWord; //曲に関連するキーワード
	private String ALimage;

	public Song() {}
	public Song(String songName,String ruby,String songtime,String recoAl,String keyWord,String ALimage) {
		this.songName=songName;
		this.ruby=ruby;
		this.songTime=songtime;
		this.recoAl=recoAl;
		this.keyWord=keyWord;
		this.ALimage=ALimage;
	}
	public Song(int id,String songName,String ruby,String songtime,String recoAl,String keyWord,String ALimage) {
		this(songName,ruby,songtime,recoAl,keyWord,ALimage);
		this.id=id;
	}
	public Song(String songName,String ruby,String songtime,String recoAl) {
		this.songName=songName;
		this.ruby=ruby;
		this.songTime=songtime;
		this.recoAl=recoAl;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getRuby() {
		return ruby;
	}

	public void setRuby(String ruby) {
		this.ruby = ruby;
	}

	public String getSongTime() {
		return songTime;
	}

	public void setSongTime(String songTime) {
		this.songTime = songTime;
	}

	public String getRecoAl() {
		return recoAl;
	}

	public void setRecoAl(String recoAl) {
		this.recoAl = recoAl;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getALimage() {
		return ALimage;
	}
	public void setALimage(String ALimage) {
		this.ALimage=ALimage;
	}


}
