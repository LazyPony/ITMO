package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Pr2_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String var1 = req.getParameter("var1");
	 	 int a = Integer.parseInt(var1);
	 	
	 	 String var2 = req.getParameter("var2");
	 	 int b = Integer.parseInt(var2);
	 	 
	 	String var3 = req.getParameter("var3");
	 	 int c = Integer.parseInt(var3);
	 	 
	 	float d=(b*b)-(4*a*c);
	 	resp.getWriter().println("d="+d);
        if (d<0){ 
        	resp.getWriter().println("Вещественных корней нет");
        }
        else { 
        	double x1=((-b)+Math.sqrt(d))/(2*a);
        	double x2=((-b)-Math.sqrt(d))/(2*a);
        	resp.getWriter().println("Корни: "+x1+" "+x2);
        }
	 	 
	}
}
