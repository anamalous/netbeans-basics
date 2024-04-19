<%@page import="bean.insertsignin"%>
<jsp:useBean id="obj" class="bean.User"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%
Boolean status=insertsignin.insertdata(obj);  
if(status){  
out.println("user "+obj.getUser()+" signed in!");

session.setAttribute("user",obj.getUser());
session.setAttribute("session","TRUE");  
}  
else  
{  
request.setAttribute("error","unable to create user");
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%>  