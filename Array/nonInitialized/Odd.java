package nonInitialized;
import java.util.Scanner;
public class Odd {
	public static void main(String[] args) {
		int odd[]=new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter arry element: ");
		for(int i =0;i<odd.length;i++) {
			odd[i]=s.nextInt();
		}
		System.out.println("Arry list is given: ");
		for(int i=0;i<odd.length;i++) {
			if(odd[i]%2==0) {
				System.out.print(odd[i]);
			}
		}
		
	}

}
