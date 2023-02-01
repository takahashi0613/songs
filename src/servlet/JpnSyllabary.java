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
 * Servlet implementation class JpnSyllabary
 */
@WebServlet("/JpnSyllabary")
public class JpnSyllabary extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");

		SongDAO dao=new SongDAO();
		List<Song> List=dao.aLineSearch(action);
		request.setAttribute("List", List);

		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/oneSongResult.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
