
     <h1>Welcome</h1>
      <a href="${pageContext.request.contextPath }/info">Show info </a>
      <p>Lorem ipsum dolor sit amet</p>
      
      <a href="${pageContext.request.contextPath}/admin/admin">Admin</a>
      <br />
      <form method="post" action="${pageContext.request.contextPath}/user/user">
      Chose user by id: <input type="text" name="userId">  <br />
      <input type="submit" value="Chose user"> 
      </form>
      <hr>
  
 