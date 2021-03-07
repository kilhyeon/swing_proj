package swing_proj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import swing_proj.dto.Member_info;
import swing_proj.util.JdbcUtil;

public class BookCon {

	public static void main(String[] args) {
ArrayList<Member_info> list = null;
		
		String sql = "select mNO, mName, mBirth, mTel, mCp, mAdd from member_info";

		try (	Connection con = JdbcUtil.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
			)
		{			
			// 1. JDBC 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			list = new ArrayList<>();
			System.out.println(list);
			while (rs.next()) {
				list.add(getMember_info(rs));
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver Not Found");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Member_info Query 결과는");
		for (Member_info m : list) {
			System.out.println(m);
		}

	}

	private static Member_info getMember_info(ResultSet rs) throws SQLException {
		int mNo = rs.getInt("mNo");
		String mName = rs.getString("mName");
		int mBirth = rs.getInt("mBirth");		
		int mTel = rs.getInt("mTel");
		int mCp = rs.getInt("mCp");
		String mAdd = rs.getString("mAdd");
		return new Member_info(mNo, mName, mBirth, mTel, mCp, mAdd);
	}

}