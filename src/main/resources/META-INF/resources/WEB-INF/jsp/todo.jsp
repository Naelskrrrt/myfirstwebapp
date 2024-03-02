<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link
			rel="stylesheet"
			href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css"
		/>
		<title>Todos - Add new todo</title>
	</head>
	<body>
		<div class="container">
			<h1>Add a new Todo</h1>
			<form method="post" class="form-group">
                <div class="row">
                    <div class="col-2">
                        <label for="id">Description:</label>
                    </div>
                    <div class="col-7">
                        <input type="text" name="description" class="form-control"/>
                    </div>
                    <div class="col-3">
                        <button type="submit" class="btn btn-primary">Add Todo</button>
                    </div>
                </div>
				
<%--				<div>Target Date: <input type="date" name="targetDate" class="form-control" /></div>--%>
<%--				<button type="submit">Add Todo</button>--%>
			</form>
		</div>

		<script src="/webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
		<script src="/webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>
</html>
