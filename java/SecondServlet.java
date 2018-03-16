import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="second",urlPatterns= {"/second"})

public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException { 
		//response.setContentType("text/html");  
	   Cookie cookies[]=request.getCookies();
		PrintWriter out = response.getWriter();  
	    
		out.println("Second Servlet");
	    
		
	/*	HttpSession session=request.getSession();
		String n=session.getAttribute("t1").toString();*/ 
		
		String str=null;
		for(Cookie cookie:cookies)
		{
			if(cookie.getName().equals("t1"))
			{
				str=cookie.getValue();
			}
		}
	    out.print("Welcome "+str); 
	} 
}
