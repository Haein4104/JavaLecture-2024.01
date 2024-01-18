package ch05_reference;

public class Q3_MaxPal {

	public static void main(String[] args) {
	// 3. 두개의 세자리수를 곱해서 나온 결과가 palindrome일때	* palindrome : 거꾸로해도 같은 수
	// 가장 큰 palindrome 수와 어떤 수를 곱해서 나온 결과인가?					(ex. 1123211) 
		int maxPal = 0, x = 0, y = 0;
		for (int i = 100; i <= 999; i++) {
			for (int k = i; k <= 999; k++) {
				int mul = i * k;
				if (isPalindrome(String.valueOf(mul))) {	// "" + mul
					if (mul > maxPal) {
						maxPal = mul; x = i; y = k;
					}
				}
			}
		}
		System.out.println(x + " x " + y + " = " + maxPal);		// 913 x 993 = 906609
	}
	
	static boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}
	
	static String reverse(String str) {
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reverseStr += str.charAt(i);
		return reverseStr;
	}
}
