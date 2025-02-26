package initializedArray;

public class minMax {
	//WAP to find minimum and maximum number of array.
	public static void main(String[] args) {
		int num[] ={6,82,5,86,271,10,1,10,64,82};
		int min = num[0];
		int max = num[0];
		for(int i =0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("Minimum number is: "+min);
		System.out.println("Maximum number is: "+max);
	}
}
