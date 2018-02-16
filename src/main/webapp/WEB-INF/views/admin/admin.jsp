<h1>ADMIN</h1>
<h2>Chose action:</h2>

      <a href="${pageContext.request.contextPath}/item/add">Add new Item</a>
      <br />
      <a href="${pageContext.request.contextPath}/item/list">List of Items</a>
      <br />
      
      <form method="post" action="${pageContext.request.contextPath}/item/item">
      Chose item by id: <input type="text" name="itemId">  <br />
      <input type="submit" value="Chose item"> 
      </form>
      <br />
      <form method="post" action="${pageContext.request.contextPath}/user/user">
      Chose user by id: <input type="text" name="userId">  <br />
      <input type="submit" value="Chose user"> 
      </form>
      <hr>