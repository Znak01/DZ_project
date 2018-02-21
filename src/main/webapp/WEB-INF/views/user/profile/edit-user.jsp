<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>User Edit</h1>

<form:form 
action="${pageContext.request.contextPath}/user/${user.id}/edit" 
method="POST" 
modelAttribute = "user">
 <form:hidden path="id"/>
First Name: <form:input path="firstName" /> <br />
Last Name: <form:input path="lastName" />  <br />
Login: <form:input path="login" /> <br />
Age: <form:input path="age" /> <br />
Email: <form:input path="email" /> <br /> 
Password: <form:input path="password" /> <br />

<input type="submit" value="Send to server">
</form:form>
