package agentpack;

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Agent
 */
@WebServlet("/Agent")
public class Agent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Agent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init(){
    	System.out.println("gets initialized");
    	
    	
       
    }
    
    
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
        	
        	/* boolean AlreadyExists = false; 
        	 while (!rs.last() || (!AlreadyExists)) 
        	 { 

        	 rs.next(); 
        	 if (rs.getString("Username").compareTo("username")==0) 
        	 { 
        	 AlreadyExists = true; 
        	 response.sendRedirect(response.encodeRedirectURL ("AgReg.jsp")); 
        	 } 
*/
        	// if (!AlreadyExists) 
        	 //{ 
               
                  
             
           
        		 
                 String name = request.getParameter("Name");
                 
                // String firstname=request.getParameter("fname");
                 if(name.equalsIgnoreCase("abc")){
                     request.setAttribute("fname",name);
                    // request.setAttribute("lname",request.getParameter("lname"));
                     response.sendRedirect("AgentAchieve.jsp");
                     
                 }     
                 String mob = request.getParameter("Mobilno");  
                 String email = request.getParameter("Email");  
                 String age = request.getParameter("Age");  
                 String state = request.getParameter("State");  
                 String city = request.getParameter("City");  
                 String user = request.getParameter("Username");  
                 String Pass = request.getParameter("Password");  
                 String Intro = request.getParameter("IntroducedBy");

                

        	 String sqlstatement = "INSERT INTO AgentReg" + "(Name,Mobileno,Email,Age,State,City,Username,Password,IntroducedBy)  values " + "(?,?,?,?,?,?,?,?,?)";                                                   
        	 PreparedStatement ps = con.prepareStatement(sqlstatement); 

        	// ps.setString(1, id);
        	 ps.setString(1, name);
             ps.setString(2, mob);
             ps.setString(3, email);
             ps.setString(4, age);
             ps.setString(5, state);
             ps.setString(6, city);
             ps.setString(7, user);
             ps.setString(8, Pass);
             ps.setString(9, Intro);
        	 
        	
        	 ps.executeUpdate(); 
        	 Integer Id=0;
        	 String sql = "SELECT max(AG_ID) as ID,Count(*) as Count FROM AgentReg"; 
        	 PreparedStatement stmt1 = con.prepareStatement(sql); 
         	 ResultSet rs1 = stmt1.executeQuery(); 
         	 if (rs1.next())
         	Id =rs1.getInt("ID");

                         out.println("Agent Registration Successful.Your Agent id is: "+Id);
                         
                         
                         
                         request.getRequestDispatcher("/AgentAchive.java").include(request, response);  
                  		HttpSession session = request.getSession(false);
                  		if(session!=null){
                  			String id = (String)session.getAttribute("id");
                  			String name1 = (String) session.getAttribute("user");
                  			
                  			
                     /*    request.setAttribute("attributeName",user);
                         RequestDispatcher rd = request.getRequestDispatcher("/AgentAchive");
                         rd.forward(request,response);   */
                         
                         
                        
        	// }
        	 
       
	}
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
