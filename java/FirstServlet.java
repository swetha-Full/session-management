import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "first", urlPatterns = { "/first" })
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("hello first servlet");
		String name = request.getParameter("t1");
		System.out.println(name);

		
		/*HttpSession session=request.getSession();
		session.setAttribute("t1", name);*/
		 
		// RequestDispatcher rd=request.getRequestDispatcher("/second");
		// rd.forward(request, response);
		Cookie cookie=new Cookie("t1", name);
		response.addCookie(cookie);
		response.sendRedirect("/second");
	}
}
