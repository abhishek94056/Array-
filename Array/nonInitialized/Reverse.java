package nonInitialized;
import java.util.Scanner;
public class Reverse {
	//WAP to accept names of 5 friends and print them in reverse order.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//get input From the User
		int num[] = new int[5];
		int r;
		System.out.println("Enter Array List: ");
		for(int i =0;i<num.length;i++){
			num[i]=s.nextInt();
		}
		
		//print the arry in Reverse Order.
		System.out.println("Folowing is Arry in Reverse order: ");
		for(int i = 4;i>=0;i--) {       //indext 4 to 0
			System.out.println(num[i]);
		}
		
	}

}
