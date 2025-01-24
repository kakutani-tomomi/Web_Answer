package servlet.web7;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.web7.ProductDAO;
import model.entity.web7.ProductBean;

/**
 * Servlet implementation class ProductRegistrationServlet
 */
@WebServlet("/ProductRegistration")
public class ProductRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductRegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータの取得
		String strProductCode = request.getParameter("productCode");
		String productName = request.getParameter("productName");
		String strPrice = request.getParameter("price");
		String category = request.getParameter("category");

		//daoのインスタンス生成・メソッド利用
		ProductDAO productDao = new ProductDAO();
		try {
			//コードと価格をintに変換
			int productCode = Integer.parseInt(strProductCode);
			int price = Integer.parseInt(strPrice);
			
			//beanのインスタンス生成・値をセット
			ProductBean productBean = new ProductBean();
			productBean.setProductCode(productCode);
			productBean.setProductName(productName);
			productBean.setPrice(price);
			productBean.setCategory(category);
			
			//メソッド呼び出し・登録情報が格納されたオブジェクトを渡す
			productDao.insert(productBean);
			
			//スコープに登録情報が入ったオブジェクトを格納
			request.setAttribute("productBean", productBean);
			
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("web7/product-registration-result.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
