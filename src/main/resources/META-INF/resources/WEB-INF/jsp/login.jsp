<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Welcome - Login Page</title>
	</head>
	<body>
		<div class="container">
			<h1>Welcome to Login Page!</h1>
			<form method="post">
				Name: <input type="text" name="name" /> Password:
				<input type="password" name="password" />
				<button type="submit">Submit !</button>
			</form>
			<div>
				<pre>${errorMsg}</pre>
			</div>
		</div>
	</body>
</html>
