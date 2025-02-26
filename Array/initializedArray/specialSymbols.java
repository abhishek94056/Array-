package initializedArray;

public class specialSymbols {
	//WAP to print only special symbols from the array.

	public static void main(String[] args) {
		char c[]= {'a','#','$','%','&','*','@'};
		for(int i =0;i<c.length;i++) {
			if(!Character.isLetterOrDigit(i)) {
				System.out.println(c[i]);
			}
		}

	}

}

