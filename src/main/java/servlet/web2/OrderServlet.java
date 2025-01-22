package servlet.web2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/Order")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//エンコーディング方法指定
				request.setCharacterEncoding("UTF-8");
				//リクエストパラメータの取得・個数をintに変換
				String itemName = request.getParameter("itemName"); 
				int quantity = Integer.parseInt(request.getParameter("quantity"));
				//個数による単価変更
				int unitPrice = 3000;//元の単価

				if (quantity >= 15) {
					unitPrice = 2500;
				} else if (quantity >= 10) {
					unitPrice = 2700;
				}
				
				int totalPrice = unitPrice * quantity;

				//リクエストスコープに格納
				request.setAttribute("itemName", itemName); //商品名
				request.setAttribute("quantity", quantity); //個数 
				request.setAttribute("unitPrice", unitPrice); //単価
				request.setAttribute("totalPrice", totalPrice); //合計金額

				//画面遷移
				RequestDispatcher rd = request.getRequestDispatcher("web2/order-confirmation.jsp");
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
