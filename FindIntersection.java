package assignmentweek1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x[]= {1,2,9,6,0,5};
		int y[]= {1,2,3,0};
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[j]) {
					System.out.println(x[i]);
				}
			}
		}
		
	}

}
