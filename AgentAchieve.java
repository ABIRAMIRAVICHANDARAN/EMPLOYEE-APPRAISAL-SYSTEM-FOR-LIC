package agentpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AgentAchieve")
public class AgentAchieve extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AgentAchieve() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void init() {
		System.out.println("gets initialized");

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	/*	 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        request.getRequestDispatcher("/AgReg.jsp").include(request, response);  
		HttpSession session = request.getSession(false);
		if(session!=null){
			String id = (String)session.getAttribute("id");
			String name = (String) session.getAttribute("user");
			
			
			
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
		
		
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "customerdb";
		String driver = "com.mysql.jdbc.Driver";

		try {

			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url + dbName, "root", "root");

			/*
			 * boolean AlreadyExists = false; while (!rs.last() ||
			 * (!AlreadyExists)) {
			 * 
			 * rs.next(); if (rs.getString("Username").compareTo("username")==0)
			 * { AlreadyExists = true;
			 * response.sendRedirect(response.encodeRedirectURL ("AgReg.jsp"));
			 * }
			 */
			// if (!AlreadyExists)
			// {

			
		/*	HttpSession session = request.getSession();
			String id = (String)session.getAttribute("id");
			String name = (String) session.getAttribute("name1");
*/
			HttpSession session = request.getSession();
			String name = (String)session.getAttribute("fname");
			String agentId = request.getParameter("AgentId");
			//String name = request.getParameter("AgentName");
			String noOfTarget = request.getParameter("NoOfTargets");
			String noAchive = request.getParameter("NoOfAchievement");
			String noOfMeet = request.getParameter("NoOfMeetingAttended");
			String currComm = request.getParameter("CurrentCommission");
			String totAmt = request.getParameter("TotalAmount");
			String dur = request.getParameter("Duration");
			String comm = request.getParameter("complaints");
			
			String sqlstatement = "INSERT INTO agent_achive"
					+ "(Name,target,achievement,meetingAttended,currentCommission,totalAmount,duration,AgentId,Complaints)  values "
					+ "(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sqlstatement);

			ps.setString(1, name);
			ps.setString(2, noOfTarget);
			ps.setString(3, noAchive);
			ps.setString(4, noOfMeet);
			ps.setString(5, currComm);
			ps.setString(6, totAmt);
			ps.setString(7, dur);
			ps.setString(8, agentId);
			ps.setString(9, comm);

			ps.executeUpdate();
			Integer Id = 0;
			String sql = "SELECT max(AA_Id) as ID,Count(*) as Count FROM agent_achive";
			PreparedStatement stmt1 = con.prepareStatement(sql);
			ResultSet rs1 = stmt1.executeQuery();
			if (rs1.next())
				Id = rs1.getInt("ID");

			out.println("Agent Achievement Successfully Submited.Your Agent Achivement id is: "
					+ Id);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
