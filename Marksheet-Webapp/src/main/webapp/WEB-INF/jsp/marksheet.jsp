<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form:form method="POST" action="submitMarksheet.do"
		modelAttribute="Mk">
		<table width="100%" border="0">
			<tr>
				<td><div class="form-control">
						<%-- <form:errors path="name"  class="label error-label"></form:errors> --%>
						<label>
							<p>Student Name</p> <form:input path="studentName"
								id="studentName" />
						</label>
					</div></td>
				<td><div class="form-control">
						<%-- 						<form:errors path="description" class="label error-label"></form:errors>
 --%>
						<label>
							<p>Remarks</p> <form:input path="remarks" id="remarks" />
						</label>
					</div></td>
			</tr>
			<tr>
				<td><div class="form-control">
						<%-- 						<form:errors path="price" class="label error-label"></form:errors>
 --%>
						<label>
							<p>Total Marks</p> <form:input path="totalMarks" id="totalMarks" />
						</label>
					</div></td>
			<tr>
				<td><div class="form-control">
						<%-- 						<form:errors path="expireDate" class="label error-label"></form:errors>
 --%>
						<label>
							<p>ROLL_NUMBER</p> <form:password path="rollNumber"
								id="rollNumber" />
						</label>
					</div></td>


				<td><div class="form-control">
						<%-- <form:errors path="subject"  class="label error-label"></form:errors> --%>
						<label>
							<p>Grade</p> <input type="grade" id="grade" />
						</label>
					</div></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" />
					</form></td>

			</tr>
		</table>
	</form:form>


	<table style="width: 100%">
		<tr>
			<th>MARKSHEET_ID</th>
			<th>STUDENT_NAME</th>
			<th>REMARKS</th>
			<th>TOTAL_MARKS</th>
			<th>ROLLNUMBER</th>
			<th>GRADE</th>
		</tr>
		
	<%-- 	<c:forEach var="marksheetList"  items="${List}" >
 		<tr>
 			<td>${singleList.studentId}</td>
 			<td>${singleList.studentName}</td>
 			<td>${singleList.studentClass}</td>
 			<td>${singleList.studentYear}</td>
 			<td>${singleList.studentAddress}</td>
 		</tr>
 </c:forEach>
 --%>
		<%-- <tr>
			<c:forEach items="${marksheetList}" var="singleList">
			<td><c:out value="${singleList.remarks}" /></td>
   <td><c:out value="${singleList.totalMarks}" /></td>
   <td><c:out value="${singleList.rollNumber}" /></td>
   <td><c:out value="${singleList.grade}" /></td>``` --%>
			
			<%-- 	<td><c:out value="${singleList[0].marksheetId}" /></td>
				<td><c:out value="${singleList[0]}" /></td>
				<td><c:out value="${singleList}" /></td>
				
				<td>{singleList}</td> --%>
				
				<%-- <td><c:out value="${singleList.productName}" /></td>
				<td><c:out value="${singleList.description}" /></td>
				<td><c:out value="${singleList.price}" /></td>
				<td><c:out value="${singleList.productCode}" /></td>
				<td><c:out value="${singleList.expireDate}" /></td> --%>
			<%-- </c:forEach>
		</tr> --%>

	</table>


</body>
</html>