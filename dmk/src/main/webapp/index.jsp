<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>DIGITAL MK TECNOLOGIA</title>

<style type="text/css">
form {
	position: absolute;
	top: 38%;
	left: 33%;
	height: 20%
}

 h5{
	position: absolute;
	top: 25%;
	left: 40%;
}
 .msg{
	position: absolute;
	top: 80%;
	left: 40%;
	font-size: 15px;
    color: red purple;
    background: #fff3cd;
    border-color: blue purple;
	
	}
</style>
</head>
<body>
<h5>DIGITAL MK - TECNOLOGIA</h5>
	<form action="servletLogin" method="post" class="row g-3 needs-validation" novalidate >

		<input type="hidden" value="<%=request.getParameter("url")%>"name="url">
		<!-- na serlet chamar a url -->

		<div class="col-mb-8">
			   <label class="form-label">Login:</label> 
			   <input class="form-control"name="login" placeholder="Usuario" aria-label="Last name" type="text" required= "required">
			   
			   </div>
			   
	
		      <div class="col-mb-8">
			    <label class="form-label">Senha:</label> <input class="form-control" placeholder="Senha" aria-label="Last name" name="senha" type="password" required= "required">
			  
		</div>
		
		
		<input type="submit" value="Logar" class="btn btn-primary">
		
		
	

	</form>
	<h5 class="msg">${msg }</h5>
	<h4>${msg2 }</h4>
	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script>
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous">
		</script>
		
		
		<!-- validação de login quando informado vazio -->
		<script type="text/javascript">
		
		(() => {
			  'use strict'

			  // Fetch all the forms we want to apply custom Bootstrap validation styles to
			  const forms = document.querySelectorAll('.needs-validation')

			  // Loop over them and prevent submission
			  Array.from(forms).forEach(form => {
			    form.addEventListener('submit', event => {
			      if (!form.checkValidity()) {
			        event.preventDefault()
			        event.stopPropagation()
			      }

			      form.classList.add('was-validated')
			    }, false)
			  })
			})()
		
		
		</script>
</body>
</html>