<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" language="JavaScript">
function showImage() {
	
   
    document.getElementById("myImageId1").style.visibility = 'hidden';
    document.getElementById("myImageId2").style.visibility = 'hidden';
    document.getElementById("myImageId3").style.visibility = 'hidden';
    document.getElementById("myImageId4").style.visibility = 'hidden';
    document.getElementById("myImageId5").style.visibility = 'hidden';
    var amt=<%=session.getAttribute("Policy") %>
    if (parseInt(amt) <5)
    	{
    	 document.getElementById("myImageId1").style.visibility = 'visible';
    	}
    else if (parseInt(amt) <10)
    	{
    	 document.getElementById("myImageId1").style.visibility = 'visible';
    	 document.getElementById("myImageId2").style.visibility = 'visible';
    	}
    else if (parseInt(amt) <15)
	{
	 document.getElementById("myImageId1").style.visibility = 'visible';
	 document.getElementById("myImageId2").style.visibility = 'visible';
	 document.getElementById("myImageId3").style.visibility = 'visible';
	}
    else if (parseInt(amt) <20)
	{
	 document.getElementById("myImageId1").style.visibility = 'visible';
	 document.getElementById("myImageId2").style.visibility = 'visible';
	 document.getElementById("myImageId3").style.visibility = 'visible';
	 document.getElementById("myImageId4").style.visibility = 'visible';
	}
    else 
	{
	 document.getElementById("myImageId1").style.visibility = 'visible';
	 document.getElementById("myImageId2").style.visibility = 'visible';
	 document.getElementById("myImageId3").style.visibility = 'visible';
	 document.getElementById("myImageId4").style.visibility = 'visible';
	 document.getElementById("myImageId5").style.visibility = 'visible';
	}
   
}
        
      </script>
</head>
<body onload=showImage() >

  
<table style="border-collapse: collapse" id="AutoNumber1" height="561" border="0" bordercolor="#255593" cellpadding="0" cellspacing="0" width="100%">
  <tr>
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
        <form action="<%=request.getContextPath()%>/Appraisal" method="post">
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
	color: #047A9B;"> Appraisal Details</legend>
<table align="center">

 <tr><td>

      		Total Policy Amount : </td><td>  <input  align="center" type="text" value="<%=session.getAttribute("PolicyAmount") %>"  name="Policy"  size="20"/>
      		
      		
</td> </tr>
 <tr><td>

      		commission :  </td><td> <input  align="center" type="text" value="<%=session.getAttribute("Commission") %>"  name="comm"  size="20"/>
      		
      		
</td> </tr>
	
 <tr><td>

      		commission Amount: </td><td>  <input  align="center" type="text" value="<%=session.getAttribute("CommissionAmount") %>"  name="commamt"  size="20"/>
      		
      		
</td> </tr>
<tr><td>

      		No.Of Policy: </td><td>   <input  align="center" type="text" value="<%=session.getAttribute("Policy") %>"  name="commamt"  size="20"/>
      		
      		
</td> </tr>
			<tr>
			<td colspan="2" align="center">
			Ratings :   <img  src="image/star.png" height="30" border="0" width="30" id="myImageId1" >
 <img  src="image/star.png" height="30" border="0" width="30" id="myImageId2" >
 <img  src="image/star.png" height="30" border="0" width="30" id="myImageId3" >
 <img  src="image/star.png" height="30" border="0" width="30" id="myImageId4" >
 <img  src="image/star.png" height="30" border="0" width="30" id="myImageId5" >
			</td>
			</tr>

</table>
 </fieldset>    
</div>
 
</form>
       </table>
             
      
    
</body>
</html>
