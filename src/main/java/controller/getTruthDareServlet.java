package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TruthDare;

/**
 * Servlet implementation class getTruthDareServlet
 */
@WebServlet("/getTruthDareServlet")
public class getTruthDareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTruthDareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String input = request.getParameter("theButton");
		
		TruthDare userTruthDare = new TruthDare(input);
		
		request.setAttribute("userTruthOrDare", userTruthDare);
		
		getServletContext().getRequestDispatcher("/truthDareResult.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userTruthDare.toString());
		//writer.close();
	}

}
