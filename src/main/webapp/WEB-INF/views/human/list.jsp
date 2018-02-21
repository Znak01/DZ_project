<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>Humans List</h1>

<c:forEach items="${humanList}" var="human">
     Human First Name: ${human.firstName} <br>
     Human Last Name: ${human.lastName} <br>
     Human Country: ${human.country} <br>


</c:forEach>