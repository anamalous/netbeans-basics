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
