package nonInitialized;
import java.util.Scanner;
public class Average {
	//WAP to accept 5 numbers from the user and calculate average of all unit place digits of every array element.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int avg[]=new int[5];
		int sum =0;
		
		//Get Input of arry value From the user.
		System.out.println("Enter Arry Value: ");
		for(int i=0;i<avg.length;i++){
			avg[i]=s.nextInt();
			int dig = avg[i]%10;    //Find Unit Place
			sum+=dig;               //Sum of Unit Place			
		}
		
		//Print the Arry Value
		System.out.println("the given Arry is: ");
		for(int i=0;i<avg.length;i++) {
			System.out.println(avg[i]);
		}
		
		//Find Average
		System.out.println("average of all unit place digits of every array elementis: "+sum/avg.length);
	}
}
