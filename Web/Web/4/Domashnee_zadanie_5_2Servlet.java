package com;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Domashnee_zadanie_5_2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String ename = req.getParameter("ename");
		String mname = req.getParameter("mname");
		String cname = req.getParameter("cname");
		String ecalls = req.getParameter("ecalls");
		String ecenas = req.getParameter("ecenas");
		String mrass = req.getParameter("mrass");
		String crass = req.getParameter("crass");
		String cdengis = req.getParameter("cdengis");
		String ccalls = req.getParameter("ccalls");
		String mspisok = req.getParameter("mspisok");
		int ecall = Integer.parseInt(ecalls);
		int ecena = Integer.parseInt(ecenas);
		int mras = Integer.parseInt(mrass);
		int cras = Integer.parseInt(crass);
		int cdengi = Integer.parseInt(cdengis);
		int ccall = Integer.parseInt(ccalls);
		
		Eda E = new Eda();
		E.init(ename, ecall, ecena);
		Magazin M = new Magazin();
		M.init(mname, mras, mspisok);
		Chelovek C = new Chelovek();
		C.init(cname, cdengi, cras, ccall);
		resp.getWriter().println(C.kupit(E, M));
		
		
		
	}
}
