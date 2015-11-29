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
@WebServlet("/DOReg")
public class DOReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DOReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");  
        PrintWriter out = response.getWriter(); 

        Connection con=null;
        String url="jdbc:mysql://localhost:3306/";
        String dbName="customerdb";
        String driver="com.mysql.jdbc.Driver";
       
        
        
        try{  
        	
        	Class.forName(driver).newInstance();  
            con = DriverManager.getConnection(url+dbName,"root", "root"); 
            
			
       		 String name = request.getParameter("name");
                String mob = request.getParameter("mobileNo");  
                String email = request.getParameter("email");
                String qualification = request.getParameter("qualification");
                String age = request.getParameter("age");  
                String state = request.getParameter("state");  
                String city = request.getParameter("city");  
                String user = request.getParameter("username");  
                String Pass = request.getParameter("password");  
                String joindate = request.getParameter("joiningDate");

                

       	 String sqlstatement = "INSERT INTO DoReg" + "(Name,Mobileno,Email,Qualification,Age,State,City,Username,Password,JoiningDate)  values " + "(?,?,?,?,?,?,?,?,?,?)";                                                   
       	 PreparedStatement ps = con.prepareStatement(sqlstatement); 

       	 
       	 ps.setString(1, name);
            ps.setString(2, mob);
            ps.setString(3, email);
            ps.setString(4, qualification);
            ps.setString(5, age);
            ps.setString(6, state);
            ps.setString(7, city);
            ps.setString(8, user);
            ps.setString(9, Pass);
            ps.setString(10, joindate);
       	 
       	
       	 ps.executeUpdate(); 
       	 
       	Integer Id=0;
   	 String sql = "SELECT max(DO_Id) as ID,Count(*) as Count FROM DoReg"; 
   	 PreparedStatement stmt1 = con.prepareStatement(sql); 
    	 ResultSet rs1 = stmt1.executeQuery(); 
    	 if (rs1.next())
    	Id =rs1.getInt("ID");

                    out.println("DO Registration Successful.Your DO id is: "+Id);
       	
       	 
      }
       	 catch(Exception e){
   	   
   	      e.printStackTrace();
   	   
      }finally{
   	   
   	   try {
			con.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
      }
	}
		
	

}
