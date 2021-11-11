package br.com.unifip.pets.servlet;


import java.io.IOException;
import java.util.List;

import br.com.unifip.pets.Pets;
import br.com.unifip.pets.petservice.PetService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PetServlet
 */
@WebServlet("/pets")
public class PetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PetService service = new PetService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		if("novo".equals(acao)) {
			request.getRequestDispatcher("/jsp/pets/registrar.jsp").forward(request, response);
		} else if("petlist".equals(acao)) {
			List<Pets> pets = service.buscaTodos();
			request.setAttribute("listaDePets", pets);
			request.getRequestDispatcher("/jsp/pets/petlist.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nomePet");
		String dono = request.getParameter("nomeDono");
		String id = request.getParameter("idPet");
		service.grava(new Pets(nome, dono, id));
		System.out.println("Cadastrar Pet: nome:" + nome + ", dono do pet: " + dono + ", identificação do pet: " + id );
	}

}