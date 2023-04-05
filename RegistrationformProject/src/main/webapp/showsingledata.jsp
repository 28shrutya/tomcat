<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
 <pre>
<c:forEach items="${data}" var="u">
      Name:${name}
      User Name: ${usern }
      mobNo:  ${mobno} 
      email: ${email} 
 </c:forEach> 
</pre>    

</body>
</html>