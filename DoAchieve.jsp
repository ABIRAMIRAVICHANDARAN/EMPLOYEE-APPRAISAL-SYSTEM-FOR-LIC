<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agent Achieve</title>
</head>
<body>
           
  <table style="border-collapse: collapse" id="AutoNumber1" height="561" border="0" bordercolor="#255593" cellpadding="0" cellspacing="0" width="100%">
  <tbody><tr>
    <td colspan="2" height="124" bgcolor="yellow" width="100%">
   <img src="image/LIC3.jpg" height="164" border="0" width="840">
    <center><p><h1>Life Insurance Corporation Of India</h1></center>
    </td>
  </tr>
  <tr>
    <td rowspan="3" height="416" width="50%">&nbsp;<p>
      <img src="image/1.jpg" height="450" border="0" width="478"></p>
    <p>&nbsp;</p></td>
    <td height="150" valign="bottom" width="50%">
    
    <p align="left">&nbsp;</p></td>
  </tr>
  <tr class="tablebody">
  
    <td height="132" width="50%">
       <form action="<%=request.getContextPath()%>/DoAchieve" method="post">
		<div align="justify" id="dcr1" >
<table align="center">


<tr><td>

      		Do Id   :   <input type="text" value="<%=session.getAttribute("id") %>" name="DOId" size="20"/>
      		
 </td></tr>
 
 <tr><td>

      		Name   :   <input type="text"  name="DOName" value="<%=session.getAttribute("username") %>" size="20"/>
      		
 </td></tr>
 

			
			
 <tr><td>
 
			No.Of Agent    :   <input type="text" name="NoOfTargets" value="<%=session.getAttribute("Agent") %>" size="20" />
			
</td></tr>

 <tr><td>
 
		        Policy Achieved :   <input type="text" name="NoOfAchievement" value="<%=session.getAttribute("policy") %>" size="20"/>
		     
</td></tr>
 <tr><td>
 
		        Policy Achieved Amount :   <input type="text" name="NoOfAchievementamt" value="<%=session.getAttribute("policyAmt") %>" size="20"/>
		     
</td></tr>
<tr><td>
 
			Experience  :   <input type="text" name="Experience" size="20"/>

</td></tr>

 <tr><td>

			No.Of Meeting Conducted    :   <input type="text" name="NoOfMeetingAttended" size="20"/>
			
</td></tr>

 <tr><td>
 
			% Of Commission    :   <input type="text" name="Percentagecommission" size="20"/>
			
</td></tr>

 <tr><td>
 
			No.Of Canvas  :   <input type="textarea" name="NoOfCanvas" size="30"/>
			
</td></tr>


 <tr><td>

		<input type="submit" value="Submit" />
</td></tr>

	
</table>
</div>
</form>
        <font color="red"><span>&nbsp;
        
        </span>        
                
      
            </font> 

  </td></tr>
  <tr>
    <td height="132" width="50%">
       
    
    </td>
    
  </tr>
  <tr>
    <td colspan="2" height="19" bgcolor="#255593" width="100%">&nbsp;</td>
  </tr>
</tbody></table>
             
           
    
</body>
</html>
