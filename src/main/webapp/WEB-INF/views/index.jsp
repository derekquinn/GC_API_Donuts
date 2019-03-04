<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mary Ann's | Home</title>
</head>
<body>
<h1></h1><b>Donuts Are Life</b></h1>

<table>
			<tr>
				<th>Name</th>
				<th>ID</th>

			</tr>

			<c:forEach var="donut" items="${ donut }">

			
				<tr>
					<td><a href="/details/${donut.id}/">${ donut.name }</a></td>
					<td>${ donut.id }</td>

				</tr>
			</c:forEach>
			
			
		</table>


</body>
</html>