package assignmentweek1.day2;

import java.util.Arrays;
public class MissingElementsInArray {

		
		public static void main(String[] args) {
			int[] arr = { 1, 2, 3, 5, 8, 4, 7 };
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			for (int i = 0; i < arr.length; i++) {
				int j = i + 1;
				if (arr[i] != j) {
					System.out.println("The Missing element in array is:" + j);
					break;
				}
			}
		}
	}


