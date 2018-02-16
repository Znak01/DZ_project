<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>List of Items</h1>

<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Price</th>
<th>Edit</th>
</tr>
<c:forEach items="${itemList}" var="item">
<tr>
<td>${item.id}</td>
<td>${item.name}</td>
<td>${item.price}</td>
</tr>
<td>
<a href="${pageContext.request.contextPath}/item/${item.id}/edit">Edit</a>
</td>
</c:forEach>

</table>