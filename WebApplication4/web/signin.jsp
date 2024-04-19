<h1>Sign Up Form</h1>
<%  
session.setAttribute("user", "");
session.setAttribute("session","FALSE");
String errmsg=(String)request.getAttribute("error");  
if(errmsg!=null){  
out.print(errmsg+"<br><br>");  
}  
%>    
<form action="signinprocess.jsp" method="get">  
Username:<input type="text" name="user"/><br/><br/>  
Password:<input type="text" name="pass"/><br/><br/>  
<input type="submit" value="signup"/>
</form>
<jsp:include page="footer.jsp"></jsp:include>