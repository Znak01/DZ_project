<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register page</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/user/add" method="post">
First Name: <input type="text" name="firstName"> <br />
Last Name: <input type="text" name="lastName">  <br />
Login: <input type="text" name="login"> <br />
Age: <input type="text" name="age"> <br />
Email: <input type="email" name="email"> <br /> 
Password: <input type="password" name="password"> <br />
<input type="submit" value="Send to server">
</form>

</body>
</html>