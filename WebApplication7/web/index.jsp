<%-- 
    Document   : index
    Created on : 19 Mar, 2023, 5:03:36 PM
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
        <%@include file="header.jsp" %>
        <form action="valid.jsp" method="post">
           <input type="text" name="user"/>
           <input type="text" name="pass"/>
            <input type="submit"/>
        </form>
        <%@include file="footer.jsp" %>
    </body>
</html>
