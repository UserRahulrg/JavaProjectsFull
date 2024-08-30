<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%
			String msg = (String)request.getAttribute("msg");
		%>
		<form action="loginController" method="post">
		
		<%if(msg!=null){ %><h4><%=msg%></h4><%}%>
		
		<label>USERNAME:</label><br>
		<input type="text" placeholder="enter your username" name="username"><br>
		
		<label>Password:</label><br>
		<input type="password" placeholder="enter your password" name="password"><br>
		
		
		<input type="submit" value="submit">
		
		</form>
</body>
</html>