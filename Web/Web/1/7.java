
public class SystemP {

		public static void main(String[] args) {
		int x;
		int y = 16;
		String p;
		int i = 0;
		String[] ost = new String[y];
		for (x=894;x>0;++i) {
			p=Integer.toString(x-(x/y)*y);
			if (p.equals("10")){p="a";}
			if (p.equals("11")){p="b";}
			if (p.equals("12")){p="c";}
			if (p.equals("13")){p="d";}
			if (p.equals("14")){p="e";}
			if (p.equals("15")){p="f";}
			x=x/y;
			ost[i]=p;
		}
		String g="";
		i--;
		while (i>-1){
			g=g+(ost[i]);
			--i;
		}
		System.out.println(g);
	}

}
