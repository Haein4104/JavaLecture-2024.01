// 생성자 (constructor) - toString() Method - getters/setters method 만들기
package ch06_class.sec02_customer;

public class Customer {
	private int cid; 	// cid : 고유값
	private String name;
	private int age;
	private boolean adult;
	
	// 생성자 (constructor) : 필드 유무여부 처음엔 다 만들어서 필요에 따라 쓰세용
	public Customer() {}
	public Customer(int cid, String name, int age) {
		super();
		this.cid = cid;
		this.name = name;
		this.age = age;
		this.adult = age > 19 ? true : false;		// 나이가 19 이상이면 참 : 아니면 거짓
	}
	
	public Customer(int cid, String name, int age, boolean adult) {
		super();
		this.cid = cid;
		this.name = name;
		this.age = age;
		this.adult = adult;
	}
	// toString() Method
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", adult=" + adult + "]";
	}
	
	// getters/setters method ~~~ int get / void set / boolean is
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
}
