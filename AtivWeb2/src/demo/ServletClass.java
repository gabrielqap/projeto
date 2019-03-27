package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.classeControladora;

/**
 * Servlet implementation class ServletClass
 */
@WebServlet("/ServletClass")
public class ServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private classeControladora control;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String nomeFuncionario = request.getParameter("nomeFuncionario");
		String nomeDepFuncionario = request.getParameter("NomeDepFuncionario");
		String salario = request.getParameter("Salario");
		
		control.AdicionaFuncionario(nomeFuncionario, nomeDepFuncionario, salario);
		PrintWriter out = response.getWriter();
        RequestDispatcher rd = null;
        out.println("<html>");

        out.println("<head>");

        out.println("<title>Servlet Cadastro</title>");

        out.println("</head>");

        out.println("<body><center>");

        out.println("<h1>Informação do cadastro</h1><br><br><hr>");

        out.println("Foi cadastrado com sucesso, no sistema!!!!<br><hr><br>");

        out.println("</center></body>");

        out.println("</html>");
        out.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
