<%@page contentType="text/html" pageEncoding="UTF-8" import="stuff.validate"%>

        <jsp:useBean class="stuff.userbean" id="u"/>
        <jsp:setProperty name="u" property="*"/>
        <% 
            int status=validate.validation(u);
            if(status==0){
                session.setAttribute("user", u.user);
                %>
              
        <jsp:forward page="userpage.jsp">
            <jsp:param name="user" value="shit" />
        </jsp:forward>
                <%}
else if(status==1){
out.print("invalid");
%>
<jsp:include page="index.jsp"/>
<%
}
else{
    out.print(status);
}
%>
                    
    </body>
</html>
