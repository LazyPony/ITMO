package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Pr1_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String var1 = req.getParameter("var1");
	 	 float ra1 = Float.parseFloat(var1);
	 	
	 	 String var2 = req.getParameter("var2");
	 	 float ra2 = Float.parseFloat(var2);
	 	float ra3 = Math.abs(10-ra1);
		float ra4 = Math.abs(10-ra2);
	 	 
	 	if(ra3==ra4)
	 		{resp.getWriter().println (var1+" и "+var2+" находятся на равном расстоянии от 10.");
	 		}
		if(ra3<ra4)
			{resp.getWriter().println (var1+" ближе к 10, чем "+var2);
			}
		if(ra3>ra4)
			{resp.getWriter().println (var2+" ближе к 10, чем "+var1);
			}
	}
}
