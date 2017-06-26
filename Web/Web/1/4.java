public class Mass {

	public static void main(String[] args) {
		int mass[][] = new int[5][8];
		
	     for(int i=0;i<5;++i) {
	         for(int j=0;j<8;++j) {
	             mass[i][j]=(int)(-99+Math.random()*199);
	             System.out.print(mass[i][j]+" "); 
	         }System.out.println();
	     }
	     
	     System.out.println();
	     
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 8; ++j)  {

			System.out.print("mass[" + i + "] = "+ mass[i][j]+"  ");}
			System.out.println();}

		System.out.println();
		
		int x=-100;
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 8; ++j)  {
if (x < mass[i][j]) {
	x=mass[i][j];
}
			}
			}
System.out.println("Максимальное значение массива: "+x);
	}

}

