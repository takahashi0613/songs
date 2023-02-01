package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SongDAO;
import model.Song;

/**
 * Servlet implementation class SongDbResi
 */
@WebServlet("/SongDbResi")
public class SongDbResi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String songName=request.getParameter("songName");
		String ruby=request.getParameter("ruby");
		String songtime=request.getParameter("songtime");
		String recoAL=request.getParameter("recoAL");

		Song song = new Song(songName,ruby,songtime,recoAL);
		SongDAO dao= new SongDAO();
		dao.inSertOne(song);


		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/songDbResult.jsp");
		rd.forward(request, response);
	}

}
