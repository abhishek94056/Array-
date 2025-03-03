package Task2;

public class Car {
	public String name, color;
	public float price, mileage;
		public Car(String name,String color,float price,float mileage){
			this.name = name;
			this.color = color;
			this.price = price;
			this.mileage = mileage;		
	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public float getMileage() {
			return mileage;
		}
		public void setMileage(float mileage) {
			this.mileage = mileage;
		}	
}
