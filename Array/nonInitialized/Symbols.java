package nonInitialized;
import java.util.Scanner;
public class Symbols {
	//WAP to accept 10 symbols from the user and check if $ is present in array or not.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch[]=new char[10];
		
		//Get input From the User
		System.out.println("Enter The Value of Array: ");
		for(char i =0;i<ch.length;i++) {
			ch[i]=s.next().charAt(0);
		}
		
		boolean b = false;
		//Print The Array
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
			if(ch[i]=='$') {
				b=true;
			}			
		}
		
		if(b) {                //check if $ is present in array or not
			System.out.println("$ is present");
		}
		else {
			System.out.println("$ is not present");
		}	
	}
}
