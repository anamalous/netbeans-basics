<h1>user details</h1>    
<table border="2">  
    <tr><td>about</td><td>data</td></tr>
    <tr><td>user</td><td> <%= session.getAttribute("user")%> </td></tr>
    <tr><td>email</td><td> <%= request.getParameter("email")%> </td></tr>
    <tr><td>contact</td><td> <%= request.getParameter("contact")%> </td></tr>
    <tr><td>age</td><td> <%= request.getParameter("age")%> </td></tr>
</table>