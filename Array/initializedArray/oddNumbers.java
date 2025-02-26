package initializedArray;

public class oddNumbers {
	//WAP to add all odd numbers in an array.
	public static void main(String[] args) {
		int odd[]= {2,85,82,582,85,6,2,917,0,2479};
		for(int i=0;i<odd.length;i++) {
			if(odd[i]%2!=0) {
				System.out.println(odd[i]);
			}
		}
	}
}
