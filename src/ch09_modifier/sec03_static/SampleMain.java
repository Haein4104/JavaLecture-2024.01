package ch09_modifier.sec03_static;

public class SampleMain {

	public static void main(String[] args) {
		// 인스턴트 필드, 메소드를 사용하는 방법
		Sample sample = new Sample();
		System.out.println(sample.instanceField);
		sample.instanceField;

	}

}
