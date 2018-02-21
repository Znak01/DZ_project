<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>List of Users</h1>

<table border="1">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Login</th>
<th>Age</th>
<th>Email</th>
<th>Password</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach items="${userList}" var="user">
<tr>
<td>${user.id}</td>
<td>${user.firstName}</td>
<td>${user.lastName}</td>
<td>${user.login}</td>
<td>${user.age}</td>
<td>${user.email}</td>
<td>${user.password}</td>
<td>
<a href="${pageContext.request.contextPath}/user/${user.id}/edit">Edit</a>
</td>
<td>
<a href="${pageContext.request.contextPath}/user/${user.id}/delete">Delete</a>
</td>
</tr>

</c:forEach>

</table>