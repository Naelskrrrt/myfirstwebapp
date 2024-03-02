<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>My first JSP App</title>
		<link
			rel="stylesheet"
			href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css"
		/>
	</head>
	<body>
		<div class="container">
			<div>
				<h1>Welcome ${name}!</h1>
			</div>
			<hr/>
			<div>
				<table class="table">
					<thead>
						<tr>
							<th>id</th>
							<th>Description</th>
							<th>Target Date</th>
							<th>isDone</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${todos}" var="todo">
							<tr>
								<td>${todo.id}</td>
								<td>${todo.description}</td>
								<td>${todo.targetDate}</td>
								<td>${todo.done}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<a href="add-todo" class="btn btn-success">Add Todo</a>
		</div>

		<script src="/webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
		<script src="/webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>
</html>
