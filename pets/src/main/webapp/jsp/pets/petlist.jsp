<%@page import="java.util.ArrayList"%>
<%@page import="br.com.unifip.pets.Pets"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="/bootstrap.css/bootstrap.min.css">
		
		<meta charset="UTF-8">
		<title>Registros de Pets</title>
	</head>
	<body>
		<div class="container">
			<div class="page-header">
					<h1 class="text-center">Pets</h1>
			</div>
			<div class="page-body">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Dono do Pet</th>
							<th scope="col">Nome do Pet</th>
							<th scope="col">Identificação</th>
						</tr>
					</thead>
					<tbody>
						<%
							List<Pets> pets = new ArrayList<>();
							
							if(request.getAttribute("listaDePets") != null) {
								pets = (List<Pets>) request.getAttribute("listaDePets");
							}
							
							for(Pets pet : pets) {
						%>
									<tr>
										<td><%= pet.getNome() %></td>
										<td><%= pet.getDono() %></td>
										<td><%= pet.getId() %></td>
									</tr>
						<%

							}
						%>
					</tbody>
				</table>
			</div>
			<a href="/">Voltar</a>
		</div>
	</body>
</html>