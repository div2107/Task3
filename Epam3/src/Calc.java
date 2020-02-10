

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int number1, number2;
		  String operator;
		  response.setContentType("text/html");
		     response.setCharacterEncoding("UTF-8");
		     PrintWriter out = response.getWriter();
		     number1 = Integer.parseInt(request.getParameter("number1"));
		     number2 = Integer.parseInt(request.getParameter("number2"));
		     operator = request.getParameter("operator");
		     
		     
		     /*OperatingClass oc = new OperatingClass(number1, number2, operator);*/
		     
		     out.print("<html>");
		     out.print("<head><title>calculator</title></head>");
		     out.print("<body>");
		     if(operator.equals("+"))
		      out.print(number1+number2);
		     else if(operator.equals("-"))
		    	out.print(number1-number2);
		     else if((operator.equals("*")))
		    	 out.print(number1*number2);
		     else if((operator.equals("/")))
		    	 out.print((double)number1/(double)number2);
		     out.print("</body");
		  out.print("</html>");
	
		   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
