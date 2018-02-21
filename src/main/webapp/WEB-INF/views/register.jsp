<h1>Register</h1>

<form action="${pageContext.request.contextPath}/user/add" method="post">
First Name: <input type="text" name="firstName"> <br />
Last Name: <input type="text" name="lastName">  <br />
Login: <input type="text" name="login"> <br />
Age: <input type="text" name="age"> <br />
Email: <input type="email" name="email"> <br /> 
Password: <input type="password" name="password"> <br />
<input type="submit" value="Send to server">
</form>
