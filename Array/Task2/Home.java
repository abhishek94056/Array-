package Task2;
import java.util.Scanner;
public class Home {	
	/*A. Create array of Car where class Car look like:
		public class Car {
			public String name, color;
			public float price, mileage;
		}

		1. Print name of the most expensive car.
		2. Print name of the car with highest mileage.
		3. Print all black colored cars.*/

	public static void main(String[] args) {
		Car c[]=new Car[5];                           // Creating an array of c objects
		Scanner s =new Scanner(System.in);
		for(int i =0;i<c.length;i++) {
			System.out.println("Enter Car Name: ");
			String name=s.nextLine();
			System.out.println("Enter Car color: ");
			String color = s.nextLine();
			System.out.println("Enter Car price: ");
			float price = s.nextFloat();
			System.out.println("Enter Car mileage: ");
			float mileage = s.nextFloat();
			s.nextLine();
			c[i]=new Car(name, color, price, mileage);
		}
		
		//1. Print name of the most expensive car.
		String carName = c[0].getName();
		float carPrice =c[0].getPrice();
		for(int i =0;i<c.length;i++) {
			if(carPrice<c[i].getPrice()) {
				carName = c[i].getName();
				carPrice = c[i].getPrice();
			}
		}
		System.out.println("the most expensive car is "+carName+" Which price is "+carPrice+".Rs");
		
		//2. Print name of the car with highest mileage.
		float carMileage = c[0].getMileage();
		for(int i =0;i<c.length;i++) {
			if(carMileage<c[0].getMileage()) {
				carMileage = c[i].getMileage();
				carName = c[i].getName();
			}
		}
		System.out.println(carName+" Get highest mileage with "+carMileage+"L/KM");
		
		//3. Print all black colored cars.
		for(int i =0;i<c.length;i++) {
			if(c[i].getColor().equals("Black")) {
				carName = c[i].getName();
				System.out.println(carName+" is the Black Car.");
			}
		}
	}

}
