import java.util.Scanner;
public class Resh {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения коэффициентов для уравнения ax^2+by+c=0:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Решим уравнение: "+a+"x^2+"+b+"y+"+c+"=0");
        float d=(b*b)-(4*a*c);
        System.out.println("d="+d);
        if (d<0){ 
        	System.out.print("Вещественных корней нет");
        }
        else { 
        	double x1=((-b)+Math.sqrt(d))/(2*a);
        	double x2=((-b)-Math.sqrt(d))/(2*a);
        	System.out.print("Корни: "+x1+" "+x2);
        }
	}

}
