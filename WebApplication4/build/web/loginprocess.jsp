<%@page import="bean.validator"%>
<jsp:useBean id="obj" class="bean.User"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%
Boolean status=validator.validate(obj);  
if(status){  
out.println("logged in user: "+obj.getUser());
session.setAttribute("user",obj.getUser());
session.setAttribute("session","TRUE");  
}  
else  
{  
request.setAttribute("error","username or password incorrect");
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%>  