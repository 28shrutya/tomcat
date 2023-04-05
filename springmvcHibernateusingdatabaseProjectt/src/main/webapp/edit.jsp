<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<pre>
<input type="hidden" name="rollno" value="${s.rollno}">
Name: <input type="text" name="name" value="${s.name}">
UserName: <input type="text" name="username" value="${s.username}">
Password: <input type="text" name="password" value="${s.password}">

<input type="submit" value="UPDATE">


</pre>
</form>
</body>
</html>