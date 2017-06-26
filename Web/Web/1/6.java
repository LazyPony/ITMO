
public class Transfer {

	public static void main(String[] args) {
		String arr[] = {"фото", "фотография", "перец", "перечница", "яндекс", "яндекс+","антилопа"};

		for (int j = 0; j < arr.length; j++){
			 for (int i = j + 1; i < arr.length; i++)
			{
				 int m=arr[j].compareTo(arr[i]);
				 if ( m> 0) 
		               {
					  String t = arr[j];
		              arr[j] = arr[i];
		              arr[i] = t;
	                   }
	        }
			                               }
		for (int j = 0; j < arr.length; j++)
		{
			System.out.println(arr[j]);
		}
	}
}
