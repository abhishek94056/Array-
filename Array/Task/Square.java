package Task;
import java.util.Scanner;
public class Square {
	//WAP to accept 10 numbers from the user and print 
	//only those array elements whose square is also present in the array.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value in The array: ");
		int sq[] = new int[10];                        //Get input From User
		for(int i = 0;i<sq.length;i++) {
			sq[i]=s.nextInt();
		}
		
		System.out.println("The Value Which is Square Present in the Array: ");
		boolean b = false;	                          //check valid element
		for(int i = 0;i<sq.length;i++) {
			int square = sq[i]*sq[i];                 //create square of each number
			for(int j = 0;j<sq.length;j++) {
				if(square==sq[j]) {                   //check square found or not
					System.out.println(sq[i]);
					b = true;                         //check atleast one value is found or not
					break;				              //stop iteration
			}				
		}
		if(!b) {                                       //b is false then print this
			System.out.println("The Value Which is Square not Present in the Array");
		}
	}
}
}



