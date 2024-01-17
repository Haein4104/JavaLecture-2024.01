package ch04_control;
public class Q5_연습문제 {

	public static void main(String[] args) {
		// 다음 이중 for 문을 실행했을 때 'A'는 몇 회 출력되는지 쓰시오.		
		int count = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 2) {
					continue;
				}
				if(j == 1) {
					break;
				}
				System.out.println("A");
				count++;
				/*
				i0 j0 A  j1 X	j2 X  A출력, if(j == 1) {break;}
				i1 j0 A  j1 X 	j2 X  A출력, if(j == 1) {break;}
				i2 j0 X  j1 X   j2 X  출력 불가능, if(i == 2) {continue;}
				i3 j0 A  j1 X 	j2 X  A출력, if(j == 1) {break;}
				i4 j0 A  j1 X 	j2 X  A출력, if(j == 1) {break;}
				i5  = 끝
			*/
			}
		}
		System.out.println("= " + count + "회");
	}
}
