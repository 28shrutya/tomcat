<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="5">
<tr>
<th>RollNo</th>
<th>Name</th>
<th>UserName</th>
<th>password</th>
</tr>
<c:forEach items="${data}" var="s">
<tr>
      <td>${s.rollno}</td>
      <td>${s.name}</td>
       <td>${s.username}</td>
       <td>${s.password}</td>
       <td><a href="edit?rollno=${s.rollno}">EDIT</a>||<a href="delete?rollno=${s.rollno}">DELETE</a></td>
 </tr>
 </c:forEach>
 </table>
 </body>
 </html>
 












