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
   <table border ="2">
   <tr>
   <th> userName </th>
   <th> password </th>
   </tr>
   <c:forEach items="${data}" var="u">
   <tr>
   
   <td>  ${u.userName} </td>
  
   <td>  ${u.password} </td> 
    
    </tr>
    </c:forEach>
 </table>   
    
</body>
</html>