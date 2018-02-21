<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Edit Item</h1>

<form:form 
method="POST" 
action="${pageContext.request.contextPath}/admin/${itemId}/edit" 
modelAttribute="item">
      <form:hidden path="id"/>
      Name: <form:input path="name" /> <br /> 
      Price: <form:input path="price" /> <br /> 
      
      <input type="submit" value="Add item">
</form:form>