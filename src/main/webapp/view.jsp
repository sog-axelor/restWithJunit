<%@page import="java.util.List"%>
<%@page import="com.unique.Db.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Our Employee</title>
</head>
<body>
	<h1 align="center">Our Valuable Employee</h1>

	<table border=2 align="center">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>City</th>
            <th>State</th>
            <th>Phone</th>
            <th>Operation</th>
            
        </tr>
			  <% for (Employee e :(List<Employee>)request.getAttribute("list")) { %>
			<tr width="42" height="42">
				<td><%=e.getId()%></td>
				<td><%=e.getName()%></td>
				<td><%=e.getCity()%></td>
				<td><%=e.getState()%></td>
				<td><%=e.getPhone()%></td>
				<td><a href="delete/<%=e.getId()%>">Delete</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	

</body>
</html>

