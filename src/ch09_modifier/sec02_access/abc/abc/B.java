package ch09_modifier.sec02_access.abc.abc;

public class B {
	void abc() {
		A a = new A();
		System.out.println(a.a + a.b + a.c);	// a.d는 private이라 쓸 수 없음. 쓰면 error
	}
}
