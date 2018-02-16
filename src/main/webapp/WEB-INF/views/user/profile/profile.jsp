<h1>${user.firstName}</h1>
<h2>${user.lastName}</h2>
<h2>${user.login}</h2>
<h2>${user.password}</h2>
<h2>${user.email}</h2>
<h2>${user.age}</h2>

<a href="${pageContext.request.contextPath}/user/profile/edit-user">Edit</a> <br />
<a href="${pageContext.request.contextPath}/user/profile/history">History</a>