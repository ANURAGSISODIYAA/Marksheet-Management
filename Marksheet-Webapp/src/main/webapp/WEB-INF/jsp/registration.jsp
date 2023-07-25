<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<p><a href="login.do"> Login here</a></p>
	<form:form method="POST" action="submitRegister.do" modelAttribute="Registration">
      
		<table width="100" border="0">
			 <tr>
				<td>
					<div class="form-control">		        
 				
						<form:errors path="firstName" style="color: red;"></form:errors>
						<label>
							<p>
								First Name
							</p>
							<form:input path="firstName" id="firstName" />
						</label>
					</div>
				</td>
			</tr> 
			<tr>
				<td>
					<div class="form-control">
						<form:errors path="lastName" style="color: red;"></form:errors>
						<label>
							<p>
								Last Name
							</p>
							<form:input path="lastName" id="lastName" />
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="form-control">
						<label>
							<form:errors path="emailId" style="color: red;"></form:errors>
							<p>
								Email Id
							</p>
							<form:input path="emailId" id="emailId" />
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="form-control">
						<label>
							<form:errors path="mobileNumber" style="color: red;"></form:errors>
							<p>
								Mobile Number
							</p>
							<form:input path="mobileNumber" id="mobileNumber" />
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="form-control">
						<label>
							<form:errors path="password" style="color: red;"></form:errors>
							<p>
								Password
							</p>
							<form:password path="password" id="password" />
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"/>
				</td>
			</tr>
		</table>
	</form:form>	
</body>
</html>