package p11api.p02quiz;

public class Car {
	private String company;
	private int price;
	
	public Car(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "회사:" + company + ", 가격:" + price + "원";
	}
}
