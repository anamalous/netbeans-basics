<jsp:include page="header.jsp"></jsp:include>
<h1>Login Form</h1>
<%  
session.setAttribute("user", "");
session.setAttribute("session","FALSE");
String errmsg=(String)request.getAttribute("error");  
if(errmsg!=null){  
out.print(errmsg+"<br><br>");  
}  
%>    
<form action="loginprocess.jsp" method="get">  
Username:<input type="text" name="user"/><br/><br/>  
Password:<input type="text" name="pass"/><br/><br/>  
<input type="submit" value="login"/>
</form>
<jsp:include page="footer.jsp"></jsp:include>