package initializedArray;

public class evenNumbers {
	//WAP to count all even numbers in an array.
	public static void main(String[] args) {	
		int even[]= {58,629,8,19,94,33,45,3560,45,4};
		for(int i = 0;i<even.length;i++){
			if(even[i]%2==0) {
				System.err.println(even[i]);
			}
		}
	}
}
