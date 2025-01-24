package model.dao.web7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.dao.web5.ConnectionManager;
import model.entity.web7.ProductBean;


public class ProductDAO {
	/**
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * 
	 */
	public int insert(ProductBean productBean) throws ClassNotFoundException, SQLException {
		//戻り値用の件数定義
		int registCount = 0;
		//sql定義
		String sql = "INSERT INTO m_product VALUES(?,?,?,?);";
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			//更新情報の取り出し
			int productCode = productBean.getProductCode();
			String productName = productBean.getProductName();
			int price = productBean.getPrice();
			String category = productBean.getCategory();
			//プレースホルダに値をセット
			pstmt.setInt(1, productCode);
			pstmt.setString(2, productName);
			pstmt.setInt(3, price);
			pstmt.setString(4, category);
			//sqlの実行
			registCount = pstmt.executeUpdate();
		}

		return registCount;
	}
}
