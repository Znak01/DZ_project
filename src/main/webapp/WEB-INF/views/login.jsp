<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/register" method="post">
Login: <input type="text" name="login"> <br />
Password: <input type="password" name="password"> <br />
<input type="submit" value="Enter">
</form>

</body>
</html>