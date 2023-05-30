<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Login HMS</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<link href="css/styles.css" rel="stylesheet" />

</head>
<!-- Button Color Code : #64a19d -->
<body class="page-top">
	<header class="masthead" style="min-height: 0;">
		<form style="width: 30%; margin-left: 35%; padding-top: 3%;"
			method="post">
			<h4 class="mx-auto my-0 text-uppercase"
				style="padding-left: 45px; padding-top: 87px; color: red; text-shadow: 2px 2px 5px #000000;">${requestScope.message }</h4>
			<h1 class="mx-auto my-0 text-uppercase"
				style="font-size: 58px; padding: 5%; padding-bottom: 0%; font-weight: 700; font-family: sans-serif; letter-spacing: 0.5rem; padding-left: 25%;">Login</h1>
			<!-- Email input -->
			<div class="form-outline mb-4">
				<label class="form-label" for="form2Example1" style="color: white;">Login
					Id</label> <input type="text" id="form2Example1" name="loginId"
					class="form-control" style="opacity: 0.6;" />

			</div>

			<!-- Password input -->
			<div class="form-outline mb-4">
				<label class="form-label" for="form2Example2" style="color: white;">Password</label>
				<input type="password" id="form2Example2" class="form-control"
					style="opacity: 0.6;" name="password" />
			</div>

			<!-- 2 column grid layout for inline styling -->
			<div class="row mb-4">
				<div class="col d-flex justify-content-center">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" value=""
							id="form2Example31" checked /> <label style="color: white;"
							class="form-check-label" for="form2Example31"> Remember
							me </label>
					</div>
				</div>

				<div class="col">
					<a href="#!" style="color: white;">Forgot password?</a>
				</div>
			</div>

			<!-- Submit button -->
			<button type="submit" class="btn btn-primary btn-block mb-4">Sign
				in</button>

			<!-- Register buttons -->
			<!--<div class="text-center">
			<p>
				Not a member? <a href="#!">Register</a>
			</p>
			<p>or sign up with:</p>
			<button type="button" class="btn btn-link btn-floating mx-1">
				<i class="fab fa-facebook-f"></i>
			</button>

			<button type="button" class="btn btn-link btn-floating mx-1">
				<i class="fab fa-google"></i>
			</button>

			<button type="button" class="btn btn-link btn-floating mx-1">
				<i class="fab fa-twitter"></i>
			</button>

			<button type="button" class="btn btn-link btn-floating mx-1">
				<i class="fab fa-github"></i>
			</button>
		</div> -->
		</form>
	</header>
</body>
</html>