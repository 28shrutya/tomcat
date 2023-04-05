<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 
   <table border ="5">
   <tr>
   <th> Name </th>
   <th>userName</th>
   <th>password</th>
   <th> MobNo </th>
   <th> Email</th>
   </tr>
   <c:forEach items="${data}" var="u">
   
   <tr>
         <td>  ${u.name} </td>
          <td> ${u.userName } </td>
         <td> ${u.password } </td>
         <td>  ${u.mobNo} </td> 
         <td> ${u.email} </td>
       
    
  </tr>
  
 </c:forEach>
 </table>   
 <br>
 
 <a href="Register.jsp">Add</a><br>
 <br>
 <a href="login.jsp">Back</a><br>
 
 <br>
<a href=searchby.jsp><input type="submit" value="Search By"></a>
</body>
</html>