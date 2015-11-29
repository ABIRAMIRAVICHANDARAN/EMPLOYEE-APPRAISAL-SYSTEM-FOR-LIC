package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Appraisal")
public class Appraisal extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

	public Appraisal() {
		super();
	}

	public void init() {
		System.out.println("gets initialized");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.setAttribute("value", 100);
RequestDispatcher fd=request.getRequestDispatcher("Appraisal.jsp");
fd.forward(request, response);

/*
		Connection con = null;

		try {

			String url = "jdbc:mysql://localhost:3306/";
			String dbName = "customerdb";
			String driver = "com.mysql.jdbc.Driver";
			
//			String val = (String) request.getAttribute("rating");

			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url + dbName, "root", "root");

			Integer Id = 0;
			String sql = "select max(AG_ID) as AG_ID from agentReg";
			PreparedStatement stmt1 = con.prepareStatement(sql);
			ResultSet rs1 = stmt1.executeQuery();
			if (rs1.next())
				Id = rs1.getInt("ID");
//			val = Id.toString();
			out.println("Agent Registration Successful.Your Agent id is: " + Id);
			request.setAttribute("rating", String.valueOf(Id));
			request.getRequestDispatcher("Appraisal.jsp").forward(request, response);
			
		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}*/
	}
	
	


}
