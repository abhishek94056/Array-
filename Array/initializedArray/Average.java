package initializedArray;

public class Average {
	//WAP to calculate average of all numbers in an array.
	public static void main(String[] args) {
		int avg[]= {62,6,82,96,529,17,0,063,438};
		int sum = 0;
		int n = avg.length;
		{			
			for(int i =0;i<avg.length;i++) {
				sum+=avg[i];
			}
			System.out.println(sum/n);
		}	
	}
}
