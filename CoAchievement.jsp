<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
  <tr >
  
    <td height="132" width="50%">
       <form action="<%=request.getContextPath()%>/CoAchieve" method="post">
		<div align="justify" id="dcr1" >
		
		<fieldset style="background: none repeat scroll 0 0 #FFFFFF;border: 2px solid threedface;border-radius: 10px;box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);margin: 40px;padding: 50px;position: relative;display: block;width: 60%;">
		<legend style="background: none repeat scroll 0 0 #FFFFFF;
	border-image: none;
	border-style: solid;
	border-width: medium 2px 2px;
	box-shadow: 15px 15px 15px 15px #E3E3E3 inset;
	font-size: 140%;
	font-weight: bold;
	padding: 10px 20px;
	position: absolute;
	text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.3);
	top: -16px;
	color: #047A9B;"> Class1 Officer - Appraisal </legend>
<table style="padding-top: -80px" >

 <tr><td>

      		CO Id  : </td><td>  <input  align="center"  value="<%=session.getAttribute("id") %>" name="coId" size="20"/>
      		
 </tr></td>
 
<tr><td>
 
			CO Name  : </td><td>  <input  name="name"  value="<%=session.getAttribute("username") %>" size="20"/>

</tr></td>
			
			
			
 <tr><td>
 
			No.Of Agent Approvals    : </td><td>  <input  name="noOfAgentAppr"  value="<%=session.getAttribute("agent") %>" size="20" />
			
</tr></td>

 <tr><td>
 
		   Agent.Appr Amount: </td><td>   <input  name="agentAmt" value="<%=session.getAttribute("policyamt") %>" size="20"/>
		     
</tr></td>
<tr><td>
 
			Experience  : </td><td>  <input  name="exp" size="20"/>

</tr></td>

 <tr><td>
 
			% of Commission    : </td><td>  <input  name="agentComm" size="20"/>
			
</tr></td>

<tr><td>
 
			No.Of DO&Agent Approvals    : </td><td>  <input value="<%=session.getAttribute("policycount") %>" name="agentDo"size="20" />
			
</tr></td>

 <tr><td>
 
		    DO&Agent Approvals Amount:  </td><td> <input  name="agentDoAmt" value="<%=session.getAttribute("policydoamt") %>" size="20"/>
		     
</tr></td>

 

 <tr><td>
 
			DO&Agent % Commission-Agent   : </td><td>  <input  name="agentDoComm" size="20"/>
			
</tr></td>


 <tr><td>
 
			DO&Agent % Commission-DO   :  </td><td> <input  name="agentCommDo" size="20"/>
			
</tr></td>

 
 <tr><td colspan="2" align="center">

		<input type="submit" value="Submit" /></tr></td></br>

</table>
</fieldset>
</form>
        <font color="red"><span>&nbsp;
        
        </span>        
                
      
            </font> 

  </td></tr>
  
  <tr>
    <td colspan="2" height="19" bgcolor="#255593" width="100%">&nbsp;</td>
  </tr>
</tbody></table>
             
           
    
</body>
</html>
