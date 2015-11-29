package dopack;

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
 * Servlet implementation class COReg
 */
@WebServlet("/DoAchieve")
public class DOAchivement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DOAchivement() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
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

			String doId = request.getParameter("DOId");
			String doName = request.getParameter("DOName");
			String exp = request.getParameter("Experience");
			String noOfTarget = request.getParameter("NoOfTargets");
			String noOfAch = request.getParameter("NoOfAchievement");
			String noOfAtt = request.getParameter("NoOfMeetingAttended");
			String perComm = request.getParameter("Percentagecommission");
			String noOfCan = request.getParameter("NoOfCanvas");
			String noOfachamt = request.getParameter("NoOfAchievementamt");
			String sqlstatement = "INSERT INTO do_achive"
					+ "(DOId,Name,Experience,NoOfTargets,NoOfAchievement,NoOfMeetingConduct,commission,NoOfCanvas,totalAmount)  values "
					+ "(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sqlstatement);

			ps.setString(1, doId);
			ps.setString(2, doName);
			ps.setString(3, exp);
			ps.setString(4, noOfTarget);
			ps.setString(5, noOfAch);
			ps.setString(6, noOfAtt);
			ps.setString(7, perComm);
			ps.setString(8, noOfCan);
			ps.setString(9, noOfachamt);

			ps.executeUpdate();

			Integer Id = 0;
			String sql = "SELECT max(DA_Id) as ID,Count(*) as Count FROM do_achive";
			PreparedStatement stmt1 = con.prepareStatement(sql);
			ResultSet rs1 = stmt1.executeQuery();
			if (rs1.next())
				Id = rs1.getInt("ID");

			out.println("Do Achieve Successfully Submited.Your DO Achieve id is: "
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
