package copack;

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

/**
 * Servlet implementation class CoAchieve
 */
@WebServlet("/CoAchieve")
public class CoAchieve extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CoAchieve() {
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
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

		
			
			String coId = request.getParameter("coId");
			String coName = request.getParameter("name");
			String exp = request.getParameter("exp");
			String noOfAgentAppr = request.getParameter("noOfAgentAppr");
			String agentAmt = request.getParameter("agentAmt");
			String agentComm = request.getParameter("agentComm");
			String agentDo = request.getParameter("agentDo");
			String agentDoAmt = request.getParameter("agentDoAmt");
			String agentDoComm = request.getParameter("agentDoComm");
			String agentCommDo = request.getParameter("agentCommDo");

			String sqlstatement = "INSERT INTO co_achive"
					+ "(COId,Name,Experience,NoOfAgentAppr,AgentAmt,AgentComm,agentDo,AgentDoAmt,AgentDoComm,AgentCommDo)  values "
					+ "(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sqlstatement);

			ps.setString(1, coId);
			ps.setString(2, coName);
			ps.setString(3, exp);
			ps.setString(4, noOfAgentAppr);
			ps.setString(5, agentAmt);
			ps.setString(6, agentComm);
			ps.setString(7, agentDo);
			ps.setString(8, agentDoAmt);
			ps.setString(9, agentDoComm);
			ps.setString(10, agentCommDo);

			ps.executeUpdate();

			Integer Id = 0;
			String sql = "SELECT max(CA_Id) as ID,Count(*) as Count FROM co_achive";
			PreparedStatement stmt1 = con.prepareStatement(sql);
			ResultSet rs1 = stmt1.executeQuery();
			if (rs1.next())
				Id = rs1.getInt("ID");

			out.println("Commission   Successfully Approved ");

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
