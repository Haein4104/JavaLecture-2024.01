package ch05_reference;

public class Q3_연습문제 {

	public static void main(String[] args) {
		// 3. 두개의 세자리수를 곱해서 나온 결과가 palindrome일때
		// 가장 큰 palindrome 수와 어떤 수를 곱해서 나온 결과인가?
		function isPalindrome(s) {
		    return s == s.split('').reverse().join('');
		}

		let maxPal = 0, max1 = 0, max2 = 0;
		for (let i = 100; i <= 999; i++) {
		    for (let k = i; k <= 999; k++) {
		        let mul = i * k;
		        if (isPalindrome(String(mul))) {
		            if (mul > maxPal) {
		                maxPal = mul; max1 = i; max2 = k;
		            }
		        }
		    }
		}
		console.log(`${max1} x ${max2} = ${maxPal}`);       // 913 x 993 = 906609

	}

}
