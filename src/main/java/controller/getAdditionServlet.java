package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NumAddition;

/**
 * Servlet implementation class getAddCalculation
 */
@WebServlet("/getAdditionServlet")
public class getAdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAdditionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstNumber = request.getParameter("firstNumber");
		String secondNumber = request.getParameter("secondNumber");
		
		NumAddition userAddition = new NumAddition(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber));
		
		request.setAttribute("userNumAddition", userAddition);
		
		getServletContext().getRequestDispatcher("/additionResult.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userAddition.toString());
		//writer.close();
	}

}
