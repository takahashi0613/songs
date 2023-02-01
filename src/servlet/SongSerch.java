package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SongDAO;
import model.Song;

/**
 * Servlet implementation class SongSerch
 */
@WebServlet("/SongSerch")
public class SongSerch extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/oneSongSearch.jsp");
				rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String songName = request.getParameter("songName");
		SongDAO dao=new SongDAO();
		List<Song> List=dao.getListBySearchSongName(songName);
		request.setAttribute("List", List);

		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/oneSongResult.jsp");
		rd.forward(request, response);
	}
}
