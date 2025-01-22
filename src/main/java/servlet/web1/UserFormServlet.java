package servlet.web1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserFormServlet
 */
@WebServlet("/UserForm")
public class UserFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//エンコーディング方法指定
				request.setCharacterEncoding("UTF-8");
				//リクエストパラメータの取得
				String name = request.getParameter("name");
				String mailAddress = request.getParameter("mailAddress");
				//リクエストスコープへの格納
				request.setAttribute("name", name);
				request.setAttribute("mailAddress", mailAddress);
				//リクエストの転送・画面遷移
				RequestDispatcher rd = request.getRequestDispatcher("web1/result.jsp");
				rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
