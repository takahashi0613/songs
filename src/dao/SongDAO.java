package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Song;



public class SongDAO {
	private Connection db;
	private PreparedStatement ps;
	private ResultSet rs;

	private void connect() throws NamingException,SQLException {
		Context context=new InitialContext();
		DataSource ds=(DataSource)context.lookup("java:comp/env/songs");
		db=ds.getConnection();
	}
	private void disconnect() {
		try {
			if(db != null) {
				db.close();
			}
			if(ps != null) {
				ps.close();
			}
			if(rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	public List<Song> findAll(){
		List<Song> songList=new ArrayList<>();
		try {
			connect();
			String sql="SELECT * FROM songs ORDER BY id ASC";
			ps=db.prepareStatement(sql);
			rs=ps.executeQuery();

			while(rs.next()) {
				int id= rs.getInt("id");
				String songName=rs.getString("songName");
				String ruby=rs.getString("ruby");
				String songtime=rs.getString("songtime");
				String recoAl=rs.getString("recoAl");
				String keyWord=rs.getString("keyWord");
				String ALimage=rs.getString("ALimage");
				Song song=new Song(id,songName,ruby,songtime,recoAl,keyWord,ALimage);
				songList.add(song);
			}
		} catch (NamingException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}finally {
			disconnect();
		}
		return songList;
	}
	public List<Song> getListBySearchSongName(String SearchSongName){
		List<Song> List=new ArrayList<>();
		try {
			connect();
			ps=db.prepareStatement("SELECT * FROM songs WHERE songName=? OR ruby=?");
			ps.setString(1,SearchSongName);
			ps.setString(2,SearchSongName);
			System.out.println(ps);
			rs=ps.executeQuery();

			while(rs.next()) {
				int id= rs.getInt("id");
				String songName=rs.getString("songName");
				String ruby=rs.getString("ruby");
				String songtime=rs.getString("songtime");
				String recoAl=rs.getString("recoAl");
				String keyWord=rs.getString("keyWord");
				String ALimage=rs.getString("ALimage");
				Song song=new Song(id,songName,ruby,songtime,recoAl,keyWord,ALimage);
				List.add(song);
			}
		} catch (NamingException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}finally {
			disconnect();
		}
		return List;
	}
	public List<Song> aLineSearch(String line){  //引数lineにaLine
		List<Song> List=new ArrayList<>();
		try {
			connect();
//			String str=line;
			String sql="";
			switch(line) {
				case "aLine":
					sql="SELECT * FROM songs WHERE ruby REGEXP '^(あ|い|う|え|お)+'";
					break;
				case "kLine":
					sql="SELECT * FROM songs WHERE ruby REGEXP '^(か|き|く|け|こ)+'";
//					ps=db.prepareStatement(sql2); 先生からのアドバイス前のコード。冗長になっている。
//					rs=ps.executeQuery();
					break;
				case "sLine":
					sql="SELECT * FROM songs WHERE ruby REGEXP '^(さ|し|す|せ|そ)+'";
					break;
				case "tLine":
					sql="SELECT * FROM songs WHERE ruby REGEXP '^(た|ち|つ|て|と)+'";
					break;
				case "nLine":
					sql="SELECT * FROM songs WHERE ruby REGEXP '^(な|に|ぬ|ね|の)+'";
					break;
				case "hLine":
					sql="SELECT * FROM songs WHERE ruby REGEXP '^(は|ひ|ふ|へ|ほ)+'";
					break;
				case "mLine":
					sql="SELECT * FROM songs WHERE ruby REGEXP '^(ま|み|む|め|も)+'";
					break;
				case "yLine":
					sql="SELECT * FROM songs WHERE ruby REGEXP '^(や|い|ゆ|え|よ)+'";
					break;
				case "rLine":
					sql="SELECT * FROM songs WHERE ruby REGEXP '^(ら|り|る|れ|ろ)+'";
					break;
				case "wLine":
					sql="SELECT * FROM songs WHERE ruby REGEXP '^(わ|ゐ|う|ゑ|を)+'";
					break;
			}
			ps=db.prepareStatement(sql);
			rs=ps.executeQuery();

			while(rs.next()) {
				int id= rs.getInt("id");
				String songName=rs.getString("songName");
				String ruby=rs.getString("ruby");
				String songtime=rs.getString("songtime");
				String recoAl=rs.getString("recoAl");
				String keyWord=rs.getString("keyWord");
				String ALimage=rs.getString("ALimage");
				Song song=new Song(id,songName,ruby,songtime,recoAl,keyWord,ALimage);
				List.add(song);
			}
		} catch (NamingException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}finally {
			disconnect();
		}
		return List;
	}
	public void inSertOne(Song song){  //１曲分のレコード追加メソッド
		try {
			connect();
			ps=db.prepareStatement(
					"INSERT INTO songs(songName,ruby,songtime,recoAL)"
					+"VALUES(?,?,?,?)");
			ps.setString(1, song.getSongName());
			ps.setString(2, song.getRuby());
			ps.setString(3, song.getSongTime());
			ps.setString(4, song.getRecoAl());
//			int result=ps.executeUpdate();
			ps.execute();

		} catch (NamingException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
}
