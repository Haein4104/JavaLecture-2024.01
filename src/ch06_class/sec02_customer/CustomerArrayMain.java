package ch06_class.sec02_customer;

public class CustomerArrayMain {

	public static void main(String[] args) {
		Customer[] customers = new Customer[3];
		customers[0] = new Customer(1, "짐", 39);
		customers[1] = new Customer(2, "리", 23);
		customers[2] = new Customer(3, "브라이언", 17);
		
		Customer[] customers2 = {
				new Customer(1, "짐", 39), new Customer(2, "리", 23),
				new Customer(3, "브라이언", 17), new Customer(4, "엠마", 31)
		};
		
//		for (int i = 0; i < customers.length; i++)
//			System.out.println(customers[i]);
		
		for (Customer customer: customers2)
			System.out.println(customer);
		

	}

}
