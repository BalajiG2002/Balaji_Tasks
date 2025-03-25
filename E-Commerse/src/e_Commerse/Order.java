package e_Commerse;

public class Order {
	int orderId;
	String custName;
	String prdName;
	int quant;
	double price;
	public Order(int orderId, String custName, String prdName, int quant, double price) {
		super();
		this.orderId = orderId;
		this.custName = custName;
		this.prdName = prdName;
		this.quant = quant;
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public void dispOrddetails(){{
		System.out.println("order id "+ orderId);
		System.out.println("customer name "+custName);
		System.out.println("product namr "+prdName);
		System.out.println("prize "+price);
		System.out.println("quantity "+quant);

	}
}
}
