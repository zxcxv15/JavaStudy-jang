package j21_데이터베이스.controller;

import java.util.ArrayList;
import java.util.HashMap;

import db.DBConnectionMgr;
import j21_데이터베이스.dao.UserDao;
import j21_데이터베이스.dto.User;
import j21_데이터베이스.dto.UserDtl;
import j21_데이터베이스.dto.UserMst;

public class DBMain {

	public static void main(String[] args) {
		UserDao userDao = new UserDao(DBConnectionMgr.getInstance()); //싱글톤
		
		ArrayList<UserMst> userMstList = userDao.getUserMstAll();
		for(UserMst um : userMstList) {
			System.out.println(um);
		}
		
		ArrayList<UserDtl> userDtlList = userDao.getUserDtlAll();
		for(UserDtl ud : userDtlList) {
			System.out.println(ud);
		}
		
		System.out.println(userDao.getUserByUsername("ccc"));
		
		HashMap<String, User> userMap = userDao.getUserByUsername("ccc");
		UserMst userMst = (UserMst)userMap.get("um");
		System.out.println(userMst.getName());
		
		/*
		 * DAO -> User signin(String username, String password)
		 *  
		 * 
		 * */
		
	}

}
