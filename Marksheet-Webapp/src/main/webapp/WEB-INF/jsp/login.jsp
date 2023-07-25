<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
        <p><a href="registration.do"> Register here</a></p>
  
      <form:form  method="POST" action="validateLogin.do"  modelAttribute="UserDTO">
        <table width="100%" border="0">
          <tr>
            <td><div class="form-control">
                             <form:errors path="emailId"  class="label error-label"></form:errors> 
             
               <label>
                  <p>
                    Email
                  </p> <form:input path="emailId" id="emailId" /> </label>
              </div> 
            </td>
          </tr>
          <tr>
            <td><div class="form-control">
                            <form:errors path="password"  class="label error-label"></form:errors> 
            
                <label>
                  <p>
                    Password 
                  </p> <form:password path="password" id="password" /> </label>
              </div>
            </td>
          </tr>
              <tr>
          
            <td colspan="2"><input type="submit" value="Submit" />
            </td>
          </tr>
        </table>
      </form:form>
</body>
</html>