package login;

import java.io.IOException;
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
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginForm extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	public LoginForm() {
		super();
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("LoginForm is called");

		Connection con = null;
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String dbName = "customerdb";
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver).newInstance(); 
			con = DriverManager.getConnection(url + dbName, "root", "root");

			Integer aId = 0;
			Integer achive = 0;
			Integer Rating = 0;
			String sql = null;
			Integer agent=0;
			Integer policy=0;
			Double policyAmt=0.0;
			Double policyDoAmt=0.0;
			Double policyDoCount=0.0;
			String Intro = null;
			Double policycomm=0.0;
			

			String userName = request.getParameter("username");
			String pwd = request.getParameter("password");

			String type = request.getParameter("typeVal");
			if (type.equals("1")) {
				sql = "SELECT max(AG_ID) as AG_Id FROM AgentReg where UserName='" + userName
						+ "' and Password='" + pwd + "'";
				PreparedStatement stmt1 = con.prepareStatement(sql);
				ResultSet rs1 = stmt1.executeQuery();
				if (rs1.next()) {
					aId = rs1.getInt("AG_ID");
					
					
					HttpSession session = request.getSession();
					session.setAttribute("username",userName);
					session.setAttribute("id",aId);
					
					sql = "Select sum(achievement) as policy,sum(totalAmount) as policyAmt from agent_achive where AgentId= '"+ aId +"'";
					PreparedStatement stmt2 = con.prepareStatement(sql);
					ResultSet rs2 = stmt2.executeQuery();
					if (rs2.next()) {
						achive=rs2.getInt("policy");
						policyAmt=rs2.getDouble("policyAmt");
						if (achive<5)
						{
							Rating=1;
						}
						else if (achive<10)
						{
							Rating=11;
						}
						else if (achive<15)
						{
							Rating=111;
						}
						else if (achive<20)
						{
							Rating=1111;
						}
						else
						{
							Rating=11111;
						}
						
						HttpSession session1 = request.getSession();
						session1.setAttribute("Rating",Rating);
						sql = "Select IntroducedBy from agentreg where AG_ID= '"+ aId +"'";
						PreparedStatement stmt3 = con.prepareStatement(sql);
						ResultSet rs3 = stmt3.executeQuery();
						if (rs3.next()) {
							
							Intro=rs3.getString("IntroducedBy");
							if (Intro=="" || Intro== null)
							{
								sql = "Select max(AgentComm) as comm from co_achive";
								PreparedStatement stmt4 = con.prepareStatement(sql);
								ResultSet rs4 = stmt4.executeQuery();
								if (rs4.next()) {
									policycomm=rs4.getDouble("comm");
								
								}
							}
							else
							{
								sql = "Select max(AgentDoComm) as comm from co_achive";
								PreparedStatement stmt4 = con.prepareStatement(sql);
								ResultSet rs4 = stmt4.executeQuery();
								if (rs4.next()) {
									
									policycomm=rs4.getDouble("comm");
								}
							}
						}
						
						HttpSession session2 = request.getSession();
						session2.setAttribute("PolicyAmount",policyAmt);
						session2.setAttribute("Commission",policycomm);
						session2.setAttribute("CommissionAmount",((policyAmt*policycomm)/100));
						
					}
					
					RequestDispatcher rd = request
							.getRequestDispatcher("/AgentAchieve.jsp");
					rd.forward(request, response);
				}

			}else if(type.equals("2")){
				sql = "SELECT max(DO_Id) as DO_Id FROM doReg where UserName='" + userName
						+ "' and Password='" + pwd + "'";
				PreparedStatement stmt1 = con.prepareStatement(sql);
				ResultSet rs1 = stmt1.executeQuery();
				if (rs1.next()) {
					aId = rs1.getInt("DO_Id");
					HttpSession session = request.getSession();
					session.setAttribute("username",userName);
					session.setAttribute("id",aId);
					
					sql = "Select Count(*) as Agentcount from agentreg where introducedby='" + userName + "'";
					PreparedStatement stmt2 = con.prepareStatement(sql);
					ResultSet rs2 = stmt2.executeQuery();
					if (rs2.next()) {
						agent=rs2.getInt("Agentcount");
						HttpSession session1 = request.getSession();
						session1.setAttribute("Agent",agent);
					
					}
					
					sql = "Select sum(achievement) as policy,sum(totalAmount) as policyAmt from agent_achive where AgentId in (select AG_ID from agentreg where introducedby='" + userName + "')";
					PreparedStatement stmt3 = con.prepareStatement(sql);
					ResultSet rs3 = stmt3.executeQuery();
					if (rs3.next()) {
						policy=rs3.getInt("policy");
						policyAmt=rs3.getDouble("policyAmt");
						HttpSession session1 = request.getSession();
						session1.setAttribute("policy",policy);
						session1.setAttribute("policyAmt",policyAmt);
					
					}
					
					RequestDispatcher rd = request
							.getRequestDispatcher("/DoAchieve.jsp");
					rd.forward(request, response);
				}
			}else{
				sql = "SELECT max(CO_Id) as CO_Id FROM coReg where UserName='" + userName
						+ "' and Password='" + pwd + "'";
				PreparedStatement stmt1 = con.prepareStatement(sql);
				ResultSet rs1 = stmt1.executeQuery();
				if (rs1.next()) {
					aId = rs1.getInt("CO_Id");
					HttpSession session = request.getSession();
					session.setAttribute("username",userName);
					session.setAttribute("id",aId);
					
					sql = "Select Count(*) as Agentcount from agentreg where introducedby=''";
					PreparedStatement stmt2 = con.prepareStatement(sql);
					ResultSet rs2 = stmt2.executeQuery();
					if (rs2.next()) {
						agent = rs2.getInt("Agentcount");
						HttpSession session1 = request.getSession();
						session1.setAttribute("agent",agent);
					}
					
					sql = "Select sum(totalAmount) as policy from agent_achive where AgentId in (select AG_ID from agentreg where introducedby='')";
					PreparedStatement stmt3 = con.prepareStatement(sql);
					ResultSet rs3 = stmt3.executeQuery();
					if (rs3.next()) {
						policy = rs3.getInt("policy");
						HttpSession session2 = request.getSession();
						session2.setAttribute("policyamt",policy);
					}
					
					sql = "Select sum(totalAmount) as policy from agent_achive where AgentId in (select AG_ID from agentreg where introducedby='')";
					PreparedStatement stmt4 = con.prepareStatement(sql);
					ResultSet rs4 = stmt4.executeQuery();
					if (rs4.next()) {
						policy = rs4.getInt("policy");
						HttpSession session2 = request.getSession();
						session2.setAttribute("policyamt",policy);
					}
					
					sql = "Select sum(totalAmount) as policyamt, sum(NoOfTargets) as policycount from DO_achive where  da_id in (select max(da_id) from do_achive group by doid)";
					PreparedStatement stmt5 = con.prepareStatement(sql);
					ResultSet rs5 = stmt5.executeQuery();
					if (rs5.next()) {
						policyDoAmt = rs5.getDouble("policyamt");
						policyDoCount=rs5.getDouble("policycount");
						HttpSession session2 = request.getSession();
						session2.setAttribute("policydoamt",policyDoAmt);
						session2.setAttribute("policycount",policyDoCount);
					}
					
					
					RequestDispatcher rd = request
							.getRequestDispatcher("/CoAchievement.jsp");
					rd.forward(request, response);
			}
		}

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
