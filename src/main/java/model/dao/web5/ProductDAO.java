package model.dao.web5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	/**
	 * 対象カテゴリの製品名を取得するメソッド
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public List<String> productNameSearch(String category) throws ClassNotFoundException, SQLException {
		//戻り値用のList定義
		List<String> productNameList = new ArrayList<String>();
		//sql準備
		String sql = "SELECT product_name FROM m_product WHERE category = ?;";
		//DB接続・実行準備
		try (Connection con = ConnectionManager.getConnection();
			 PreparedStatement pstmt = con.prepareStatement(sql)) {
			//プレースホルダにcategoryのセット
			pstmt.setString(1, category);
			//sqlの実行
			ResultSet res = pstmt.executeQuery();
			//抽出結果をListに格納
			while (res.next()) {
				String productName = res.getString("product_name");
				productNameList.add(productName);
			}
		}
		System.out.println(productNameList);
		return productNameList;
	}
}
