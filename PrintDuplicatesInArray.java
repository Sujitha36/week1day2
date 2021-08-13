package assignmentweek1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,8,9,4,5,2,3,4,1};

		
		// get the length of the array 
		// declare an int variable named count 
int count;
		for(int i=0;i<arr.length;i++)
			
		// iterate from 0 to the array length-1 (outer loop starts here)
		{
			count=1;
		for(int j=i+1;j<arr.length;j++) {
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			if(arr[i]==arr[j]) {
				count++;              
			}
		}// compare both the loop variables 
		if(count>1) {
		System.out.println(arr[i]);
		}
		}

	}

	}


