$(document).ready(function() {
	
	$("#btnRegistrar").click(function() {
		$.ajax({
			url:"http://localhost:8080/pets",
			data:$("#formNovoPet").serialize(),
			type:"POST"
		}).done(function() {
			console.log("Ok")
		}).fail(function() {
			console.log("Erro")
		});
	});
	
});