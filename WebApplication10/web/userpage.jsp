<%-- 
    Document   : userpage
    Created on : 19 Mar, 2023, 11:41:49 PM
    Author     : anany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= request.getParameter("user") %>
        
                <form action="index.jsp">
                    <input type="submit" value="logout"/>
                </form>
                
    </body>
</html>
