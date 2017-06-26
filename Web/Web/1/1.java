
public class Posit {
	public static void main(String[] args) {
		float x = (float) (Math.random()*20);
		float y = (float) (Math.random()*20);
		System.out.println ("������� ��� �����: "+ x +" � "+y+". ������, ����� �� ����� ����� � 10:");
		float ra1 = Math.abs(10-x);
		float ra2 = Math.abs(10-y);
		if(ra1==ra2){
			System.out.println (x+" � "+y+" ��������� �� ������ ���������� �� 10.");
		}
		if(ra1<ra2){
			System.out.println (x+" ����� � 10, ��� "+y);
		}
		if(ra1>ra2) {
			System.out.println (y+" ����� � 10, ��� "+x);
		}
	}


}
