<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="/css/bootstrap.min.css">
		<script type="text/javascript" src="/js/utils/jquery-3.6.0.min.js"></script>
		<script type="text/javascript" src="/js/registrar.js"></script>
		
		<meta charset="UTF-8">
		<title>Registrar Pet</title>
	</head>
	<body>
		<div class="container">
			<div class="page-header">
				<h1 class="text-center">Registo de Pet</h1>
			</div>
			<div class="page-body" >
				<form id="formNovoPet">
					<div class="row">
						<div class="col-md-4">
							<input type="text" placeholder="Nome do Pet" id="nomePet" name="nomePet"/>
						</div>
						<div class="col-md-4">
							<input type="text" placeholder="Nome do dono" id="nomeDono" name="nomeDono"/>
						</div>
						<div class="col-md-4" style="height: 50px;" >
							<input type="text" placeholder="Identificação do Pet" id="idPet" name="idPet"/>
						</div>
					</div>
						<div class="container">
							<div style="height: 50px;">
								<input type="button" id="btnRegistrar" class="btn btn-primary" value="Registrar"/>
								<a href="/">Retornar</a>
							</div>
					</div>
				</form>
			</div>
		</div>
	</body>
</html>