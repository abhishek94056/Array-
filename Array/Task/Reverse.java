package Task;
import java.util.Scanner;
public class Reverse {
	//WAP to accept 10 numbers from the user and create its copy in another array in reverse order.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value in The array: ");
		int rev[] = new int[10];                //Get input From User
		for(int i = 0;i<rev.length;i++) {
			rev[i]=s.nextInt();
		}
		
		System.out.println("array in reverse order: ");
		int rev2[] = new int[10];                 //Create New Array
		for(int i = 9;i>=0;i--) {                 //make it reverse Order
			rev2[i]=rev[i];                       //copy in new Array
			System.out.println(rev2[i]);
		}
		
	}

}
