<h1>Add new Item</h1>

<form method="post" action="${pageContext.request.contextPath}/item/add">
      Name: <input type="text" name="name"> <br /> 
      Price: <input type="text" name="price"> <br /> 
      <input type="submit" value="Add item">
</form>