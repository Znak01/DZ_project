
     <h1>Welcome</h1>
      <a href="${pageContext.request.contextPath }/info">Show info </a>
      <p>Lorem ipsum dolor sit amet</p>
      
      <a href="${pageContext.request.contextPath}/adminMain">Admin</a>
      <br />
      <a href="${pageContext.request.contextPath}/userMain">User</a>
      <br />
      <a href="/human/add">Human</a>
      <br />
      
      <form method="post" action="${pageContext.request.contextPath}/user/userMain">
      Chose user by id: <input type="text" name="userId">  <br />
      <input type="submit" value="Chose user"> 
      </form>
      <hr>
  
 