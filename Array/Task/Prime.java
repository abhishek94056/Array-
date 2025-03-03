package Task;
import java.util.Scanner;
public class Prime {
	//WAP to accept 10 numbers from the user and print only prime array elements.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value in The array: ");
		int pri[] = new int[10];                        //Get input From User
		for(int i = 0;i<pri.length;i++) {
			pri[i]=s.nextInt();
		}
		
		System.out.println("prime array elements: ");
		
		boolean b = false;
		for(int i = 0;i<pri.length;i++) {           //Create the Arry
			if(pri[i]<=0) {                         //negative number and zero is not a prime number
				System.out.println("Prime array is not available");
			}
			else {                                         //if number is greater than 0 then check it
				for(int j =2;j<Math.sqrt(pri[i]);j++) {    //check number from 2 to till the square root of this number
					if(pri[i]%j==0) {                      //check prime or not
						System.out.println(pri[j]);
						b=true;
						break;                              //stop iteration
					}
				}	
			}			
		}
		if(!b) {
			System.out.println("Prime array is not available");
		}
	}
}
