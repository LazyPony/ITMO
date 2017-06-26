public class Mass {

	public static void main(String[] args) {
		int mass[][] = new int[8][5];
		
	     for(int i=0;i<8;i++) {
	         for(int j=0;j<5;j++) {
	             mass[i][j]=(int)(10+Math.random()*90);
	             System.out.print(mass[i][j]+" "); 
	         }System.out.println();
	     }
	     
	     System.out.println();
	     
		for (int i = 0; i < 8; ++i) {
			for (int j = 0; j < 5; ++j)  {

			System.out.print("mass[" + i + "] = "+ mass[i][j]+" ");}
			System.out.println();}

	}

}
