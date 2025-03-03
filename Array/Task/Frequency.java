package Task;
import java.util.Scanner;
public class Frequency {
	//WAP to accept 10 numbers from the user and print frequency of 4 in it.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value in The array: ");
		int fre[] = new int[10];                            //Get input From User
		for(int i = 0;i<fre.length;i++) {
			fre[i]=s.nextInt();
		}
		
		//print the Frequency
		int count = 0;
		for(int i =0;i<fre.length;i++) {
			if(fre[i]==4) {
				count++;
			}
		}
		System.out.println(" frequency of 4: "+count);
	}
}
