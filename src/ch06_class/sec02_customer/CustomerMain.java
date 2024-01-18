package ch06_class.sec02_customer;

public class CustomerMain {

	public static void main(String[] args) {
		Customer jim = new Customer();
		jim.setCid(1); jim.setName("짐"); jim.setAge(39); jim.setAdult(true);	
		
		Customer lee = new Customer(2, "리", 23, true);
		
		Customer brian = new Customer(3, "브라이언", 17);
		
		System.out.println(jim);
		System.out.println(lee);
		System.out.println(brian);
		

	}

}
