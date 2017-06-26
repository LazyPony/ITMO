package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Pr3_1_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int mass[][] = new int[8][5];
		
	     for(int i=0;i<8;++i) {
	         for(int j=0;j<5;++j) {
	             mass[i][j]=(int)(10+Math.random()*90);
	             resp.getWriter().println(mass[i][j]+" "); 
	         }resp.getWriter().println("<br>");
	     }
	     
	}
}
