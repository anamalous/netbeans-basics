<%-- 
    Document   : next
    Created on : 19 Mar, 2023, 5:34:53 PM
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
        <%= request.getParameter("a") %>
         <jsp:getProperty name="b1" property="user"/>
    </body>
</html>
