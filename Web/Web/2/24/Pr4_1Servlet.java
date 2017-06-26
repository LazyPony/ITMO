package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Pr4_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int mass[][] = new int[5][8];
		
	     for(int i=0;i<5;++i) {
	         for(int j=0;j<8;++j) {
	             mass[i][j]=(int)(-99+Math.random()*199);
	             resp.getWriter().println(mass[i][j]+" "); 
	         }resp.getWriter().println("<br>");
	     }
	     int x=-100;
			for (int i = 0; i < 5; ++i) {
				for (int j = 0; j < 8; ++j)  {
	if (x < mass[i][j]) {
		x=mass[i][j];
	}
				}
				}
			resp.getWriter().println("Maximum value: "+x);
	}
}
