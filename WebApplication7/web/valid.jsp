<%-- 
    Document   : valid
    Created on : 19 Mar, 2023, 5:20:31 PM
    Author     : anany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="beans.bean1,beans.validation"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="b1" class="beans.bean1"/>
        <jsp:setProperty name="b1" property="*"/>

        <% 
            boolean b2=validation.valid(b1);
            if(b2==true){
                %>
        <jsp:getProperty name="b1" property="user"/>
        
        <%  }
            
else{
    out.print("invalid");
%>
<jsp:include page="index.jsp"/>
        <%}

%>
        
    </body>
</html>
