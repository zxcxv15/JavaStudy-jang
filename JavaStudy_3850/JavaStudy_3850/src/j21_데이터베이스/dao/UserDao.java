package j21_데이터베이스.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.HashMap;

import db.DBConnectionMgr;
import j21_데이터베이스.dto.User;
import j21_데이터베이스.dto.UserDtl;
import j21_데이터베이스.dto.UserMst;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserDao {
	private final DBConnectionMgr pool;

	public ArrayList<UserMst> getUserMstAll() {

		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<UserMst> userMstList = new ArrayList<UserMst>();

		try {
			con = pool.getConnection();
			sql = "SELECT\r\n" + "	*\r\n" + "FROM\r\n" + "	user_mst";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				UserMst um = UserMst
						.builder()
						.usercode(rs.getInt(1))
						.email(rs.getString(2))
						.name(rs.getString(3))
						.username(rs.getString(4))
						.password(rs.getString(5))						
						.create_date(rs.getTimestamp(6).toLocalDateTime())
						.update_date(rs.getTimestamp(7).toLocalDateTime())
						.build();

				userMstList.add(um);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs); // 반납?
		}

		return userMstList;
	}

	public ArrayList<UserDtl> getUserDtlAll() {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<UserDtl> UserDtlList = new ArrayList<UserDtl>();

		try {
			con = pool.getConnection();
			sql = "SELECT\r\n"
					+ "	*\r\n"
					+ "FROM\r\n"
					+ "	user_dtl";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserDtl ud = UserDtl.builder()
									.usercode(rs.getInt(1))
									.address(rs.getString(2))
									.phone(rs.getString(3))
									.gender(rs.getInt(4))
									.create_date(rs.getTimestamp(5).toLocalDateTime())
									.update_date(rs.getTimestamp(6).toLocalDateTime())
									.build();
				UserDtlList.add(ud);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}

		return UserDtlList;
	}
	
	public HashMap<String, User> getUserByUsername(String username) { 
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;		
		 
		HashMap<String, User> userMap = new HashMap<String, User>();
		
		try {
			con = pool.getConnection();
			sql = "SELECT\r\n"
					+ "	*\r\n"
					+ "FROM\r\n"
					+ "	user_mst um\r\n"
					+ "	LEFT OUTER JOIN user_dtl ud ON(ud.usercode = um.usercode)\r\n"
					+ "	where\r\n"
					+ "	um.username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username); //첫번째 ?위치
			rs = pstmt.executeQuery();
			
			try {
				rs.next();
				UserMst um = UserMst.builder()
									.usercode(rs.getInt(1))
									.email(rs.getString(2))
									.name(rs.getString(3))
									.username(rs.getString(4))
									.password(rs.getString(5))						
									.create_date(rs.getTimestamp(6).toLocalDateTime())
									.update_date(rs.getTimestamp(7).toLocalDateTime())
									.build();
				UserDtl ud = UserDtl.builder()
									.usercode(rs.getInt(8))
									.address(rs.getString(9))
									.phone(rs.getString(10))
									.gender(rs.getInt(11))
									.create_date(rs.getTimestamp(12).toLocalDateTime())
									.update_date(rs.getTimestamp(13).toLocalDateTime())
									.build();
				
				userMap.put("um", um);
				userMap.put("ud", ud);
												

			}catch(SQLDataException e) {
				System.out.println("해당 username으로 데이터를 찾을 수 없습니다.");		
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(rs.getInt(1));
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return userMap;
	}
	
}
