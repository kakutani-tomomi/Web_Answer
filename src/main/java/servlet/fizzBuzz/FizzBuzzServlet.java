package servlet.fizzBuzz;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.FizzBuzzService;

/**
 * Servlet implementation class FizzBuzzServlet
 */
@WebServlet("/FizzBuzz")
public class FizzBuzzServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FizzBuzzServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FizzBuzzService fizzBuzzService = new FizzBuzzService();

		List<String> fizzBuzzList = fizzBuzzService.getFizzBuzzList();

		request.setAttribute("fizzBuzzList", fizzBuzzList);

		RequestDispatcher rd = request.getRequestDispatcher("fizzbuzz/result.jsp");
		rd.forward(request, response);
	}
}
