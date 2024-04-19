<jsp:include page="header.html"></jsp:include>
<h1>Login Form</h1>
<%  
session.setAttribute("user", "");
String errmsg=(String)request.getAttribute("error");  
if(errmsg!=null){  
out.print(errmsg+"<br><br>");  
}  
%>    
<form action="login.jsp" method="post">  
Email:<input type="text" name="user"/><br/><br/>  
Password:<input type="password" name="password"/><br/><br/>  
<input type="submit" value="login"/>
</form>
<jsp:include page="footer.jsp"></jsp:include>