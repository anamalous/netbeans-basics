<%-- 
    Document   : footer
    Created on : 19 Feb, 2023, 11:12:09 AM
    Author     : anany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
    <body>
        <br>
       <% 
           out.print(LocalDateTime.now()); 
       %>
    </body>
</html>
