package bean;

public class Customer {

	int id;
	
	String name;
	int quantity;
	float rate;
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getQuantity() {
		return quantity;
	}
	public final void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public final float getRate() {
		return rate;
	}
	public final void setRate(float rate) {
		this.rate = rate;
	}
	
}
