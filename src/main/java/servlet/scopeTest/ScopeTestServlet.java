package servlet.scopeTest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ScopeTestServlet
 */
@WebServlet("/ScopeTest")
public class ScopeTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScopeTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//リクエストパラメータの取得
		String requestSample = request.getParameter("requestSample");
		String sessionSample = request.getParameter("sessionSample");
		
		//requestSampleをリクエストスコープに格納
		request.setAttribute("requestSample", requestSample);
		
		//sessionSampleをセッションスコープに格納
		HttpSession session = request.getSession();
		session.setAttribute("sessionSample", sessionSample);
		
		//リクエストの転送処置
		RequestDispatcher rd = request.getRequestDispatcher("scope-test/test.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("scope-test/result.jsp");
		rd.forward(request, response);
	}

}
