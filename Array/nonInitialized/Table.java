package nonInitialized;
import java.util.Scanner;
public class Table {
	//WAP to accept 3 numbers and print the table of each array element.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Get Input From the user
		int t[] = new int[3];
		System.out.println("Enter Arry element: ");
		for(int i = 0;i<t.length;i++) {
			t[i]=s.nextInt();
		}
		

		//print the table of each array element.
		for(int i =0;i<t.length;i++) {
	
			//Table of 1st Element
			if(t[i]==t[0]) {
				System.out.println("Table of "+t[0]+" is: ");
				for(int a =1;a<=10;a++) {
					System.out.println(t[0]+" x "+a+" = "+t[0]*a);
				}	
			}//Table of 2nd Element
			if(t[i]==t[1]) {
				System.out.println("Table of "+t[1]+" is: ");
				for(int b =1;b<=10;b++) {
					System.out.println(t[1]+" x "+b+" = "+t[1]*b);
				}			
			}//Table of 3rd Element
			if(t[i]==t[2]) {
				System.out.println("Table of "+t[2]+" is: ");
				for(int c =1;c<=10;c++) {
					System.out.println(t[2]+" x "+c+" = "+t[2]*c);
				}			
			}
		}	
	}
}
