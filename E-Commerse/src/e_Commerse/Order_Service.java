package e_Commerse;
import e_Commerse.Order;
import java.util.*;

public class Order_Service {
	public static Order ord_details(Scanner sc) {
		System.out.println("ENT the Order id");
		 int orderId = sc.nextInt();
		System.out.println("ENT the customer Name:");
		 String custName = sc.next();
		System.out.print("ENT the Product Name:");
		String prdName = sc.next();
		System.out.println("ENT the Quiantity:");
		int quant = sc.nextInt();
		System.out.println("ENT the prize of single product:");
		double price = sc.nextDouble();
		 
		 return new Order( orderId, custName, prdName, quant, price);
		 
	}
	
	public static void calculateTotalprize(Order ord) {
		int quant = ord.getQuant();
		double prize=ord.getPrice();
		String custName= ord.getCustName();
		String prdName=ord.getPrdName();
		double tot_prize = quant*prize; 
		System.out.println(" the total prize of "+custName+" of product "+prdName+" is "+tot_prize);
		}
	

}
