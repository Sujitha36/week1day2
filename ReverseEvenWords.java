package assignmentweek1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String xyz = "Learn selenium";
		String[] words=xyz.split("\\s");
		for(int i=0;i<words.length;i++) {
			if(i%2==0) {
				 int revlength=words[i].length();
				 for(int j=revlength-1;j>=0;j--) {
					 
				
				 
			        // print reversed String
			        System.out.print(words[i].charAt(j));
			}
				 
				 System.out.print(" ");
			
		}
			else {
				System.out.print(words[i] + " ");
			}
	}
	}

}
