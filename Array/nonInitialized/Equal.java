package nonInitialized;
import java.util.Scanner;
public class Equal {
	// WAP to accept 5 numbers and check if 1st and last array element is equal.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array element: ");
		int equal[] = new int[5];
		for(int i=0;i<equal.length;i++) {
			equal[i]=s.nextInt();  //Get input From the user.
		}
		
		//Print the array.
		int last = equal[equal.length-1];
		for(int i =0;i<equal.length;i++) {
			System.out.println(equal[i]);
		}
		
		//check if 1st and last array element is equal.
		if(equal[0]==last) {
			System.out.println("1st and last array element is equal.");
		}
		else {
			System.out.println("not equal");
		}

	}

}
