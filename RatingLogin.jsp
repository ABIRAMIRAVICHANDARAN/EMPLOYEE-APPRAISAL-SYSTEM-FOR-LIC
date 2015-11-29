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
  <tr class="tablebody">
  
    <td height="132" width="50%">
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
	color: #047A9B;"> Appraisal Details</legend>
    <table>
    
    
        <form action="<%=request.getContextPath()%>/RatingLogin" method="get">
       &nbsp;&nbsp;
       <select name="typeVal" style="width:100px; height:40px">
       <option value="1">Agent</option>
       <option value="2">DO</option>
       
       </select>
       <br>
       <br>
    	&nbsp;&nbsp;<span>UserName:</span>
        <br>
        &nbsp;&nbsp;<input name="username"  value="" size="40" type="text">
        <br>
 		&nbsp;&nbsp;<span>Password:</span>
        <br>
     	&nbsp;&nbsp;<input name="password"  value="" size="40" type="password" >
        <br>
        &nbsp;&nbsp;<input class="button" value="Submit"  type="submit">
        </form>
</table>
</fieldset>
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
