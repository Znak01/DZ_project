<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Human Add</h1>

<form:form
 action="${pageContext.request.contextPath}/human/add"
 method="POST"
 modelAttribute="humanModel">

Human First Name: <form:input path="firstName"/> <br><br>
Human Last Name: <form:input path="lastName"/> <br><br>
Email: <form:input path="mail"/> <br><br>
            Human Country:
            <form:select path="country">
            <form:options items="${countryList}"/>
                       
            </form:select>
            <br><br>
            Age:
            <form:select path="age">
            <form:options items="${ageList2}"/>
            
            </form:select>
            <br><br>
            Gender:
            <form:radiobuttons path="gender" 
            items="${gender}"/>
            <br><br>
            Degree:
            <form:radiobuttons path="degree" 
            items="${degree}"/>
            <br><br>
            Social Net:
            <form:checkbox path="socialnet" value="VK" label="Vkontakte"/>
            <form:checkbox path="socialnet" value="Twitter" label="Twitter"/>
            <br><br>
            Programming language:
            <form:radiobuttons path="programmingLangueg" 
            items="${programmingLanguegList3}"/>
            <br><br>
            OC:
            <form:checkbox path="oc" value="Windows" label="Windows"/>
            <form:checkbox path="oc" value="Mac" label="Mac"/>
            <form:checkbox path="oc" value="Linux" label="Linux"/>
            <br><br>
            Experience:
            <form:select path="ex">
            <form:options items="${exList4}"/>
            
            </form:select>
            <br><br>
            Rang:
            <form:radiobuttons path="rang" 
            items="${rangList5}"/>
            <br> <br>
            
            Technology:
            <form:checkbox path="teh" value="HTML" label="HTML"/>
            <form:checkbox path="teh" value="CSS" label="CSS"/>
            <form:checkbox path="teh" value="JDBC" label="JDBC"/>
            <form:checkbox path="teh" value="Hibarnate" label="Hibarnate"/>
            <form:checkbox path="teh" value="MySQL" label="MySQL"/>
            <form:checkbox path="teh" value="JPA" label="JPA"/>
            <form:checkbox path="teh" value="Spring" label="Spring"/>
            <form:checkbox path="teh" value="REST" label="REST"/>
            <form:checkbox path="teh" value="Servlets" label="Servlets"/>
            <br><br>
            
            Kak uznal o nas?
            <form:radiobuttons path="search" 
            items="${searchList6}"/>
            <br><br>
            
            Are u norm?
            <form:radiobuttons path="norm" 
            items="${normList7}"/>
            <br><br>
            
            
<input type="submit" value="Send">

</form:form>