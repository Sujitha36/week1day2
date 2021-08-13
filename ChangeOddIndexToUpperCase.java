package assignmentweek1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "SujiTha";
		char test1[]= test.toCharArray();
		for(int i=0;i<test1.length;i++) {
						if( i%2!=0) {
				 System.out.println( Character.toUpperCase(test1[i]));
				
			}
			else
			{
				System.out.println(test1[i]);
			}
			
		}
	}

}
