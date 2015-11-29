package com.common.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	
	public static Connection createConnection(){
		Connection con=null;
        String url="jdbc:mysql://localhost:3306/";
        String dbName="customerdb";
        String driver="com.mysql.jdbc.Driver";
        
        try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url+dbName,"root", "root"); 
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
        
        return con;
	}
}
