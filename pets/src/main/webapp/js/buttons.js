$(document).ready(function() {

	$("#btnRegistrarPet").click(function() {
		location.href = "/pets?acao=novo";
	});

	$("#btnListaPet").click(function() {
		location.href = "/pets?acao=petlist";
	});

});