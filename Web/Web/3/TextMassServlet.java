package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TextMassServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("utf-8");
		String Str = new String ("����-���� ���� � ���������. ������� ���� � ��� ���� ����� ��������, ���� ���� �������. ��� ������ ����� � �������� ������ ������� � ���� ������ �� �������. ��������� ����, ���������� � ����� � �����: � ��������, ���������! ����������, ����������! ���� ���� ������ � ������ ��������; ����� ������ �� �������, �� ������� �� ���������, �� ��������� �� ���� �����! �������� ������� ����� � ������� ����. ��� �� ��������, ������ � ����� ����� � ���, �������� �������� ������-��������. ���� ���������, ��� ��� ����. ��� ��� ���� ����, ���� ������� � ������� � �������� ������� �������: � ��, �������! ��, ��������! ����������, ����������! ���� ���� ������, ������ ��������. ����� ������� ������!");
		resp.getWriter().println(Str);
		Str=Str.replace('-',' ');
		Str=Str.replace('.',' ');
		Str=Str.replace('!',' ');
		Str=Str.replace(',',' ');
		Str=Str.replace('�',' ');
		Str=Str.replace(':',' ');
		Str=Str.replace(';',' ');
		resp.getWriter().println("<br>");
		resp.getWriter().println("<br>");
		int blockCount = Str.split(" +").length;
		String[] s = Str.split(" +");
		String[][] t = new String[blockCount][2];
		
		int i=0;
		int q=0;
		int h=0;
		int z=0;
		int a=0;
		while (i<(blockCount)) {
		while (q<(z+1)){
			if (s[i].equals(t[q][0])){
				a=1;
				h=Integer.parseInt(t[q][1]);
				h++;
				t[q][1]=Integer.toString(h);
				s[i]="";
				q=0;
				break;
			                  }
			q++;
					         } 
                
		if(a==0) {
			t[z][0]=s[i];
			h=1;
			t[z][1]=Integer.toString(h);
			z++;
			q=0;
			s[i]="";
		}
		
		    i++; a=0;                    } 

			for ( int k = 0; k < z; ++k) {
			for ( int j = 0; j < 2; ++j)  {

				resp.getWriter().println( t[k][j]+" ");}
			    resp.getWriter().println("<br>");
			}

		
			}
	
}
