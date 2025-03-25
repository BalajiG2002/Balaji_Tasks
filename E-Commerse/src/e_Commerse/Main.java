package e_Commerse;
import e_Commerse.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ent the num of orders:");
		int m = sc.nextInt();
		
		List<Order> ords=new ArrayList<>();
		for(int i =0;i<m;i++) {
		System.err.println("ent the "+ (i+1) +" order details");	
		
		Order ord1 = Order_Service.ord_details(sc);	
		Order_Service.calculateTotalprize(ord1);
		ords.add(ord1);
	}
		System.out.println("-----------summary----------");
		
		for (int i = 0;i<m;i++) {
			ords.get(i).dispOrddetails();
	        System.out.println("====================");

		}
		

}
}
