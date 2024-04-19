<%  
if((request.getParameter("password")).equals("pass1234")){  
out.println("logged in user:"+request.getParameter("user")+"<br><br>");
session.setAttribute("user",request.getParameter("user"));
%>
<jsp:include page="logout.jsp"></jsp:include>
<%
}  
else  
{
    request.setAttribute("error","username or password incorrect");
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%>  