package SoNguyen;

public class BaiTapJava {
	public static void main(String[]args) {
		LietKeisPrime(20);
		LietKeSoNguyenToDauTien(10);
		LietKe5ChuSo();
		primeFactorization(60);
		System.out.println(sumDigits(12345));
		isPalindrome(6);
		fibonacciPrimes(10);
	}
	
	// So nguyen To
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i=2;i<=Math.sqrt(n);i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// Liet ke so nguyen To
	public static void LietKeisPrime(int n) {
		for (int i=2;i<n;i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
	}
	// liệt kê n số nguyên tố đầu tiên
	public static void LietKeSoNguyenToDauTien(int n) {
		int count = 0;
		int number = 2;
		
		while (count < n) {
			if (isPrime(number)) {
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
		System.out.println(" ");
	}
	// nguyên tố có 5 chữ số.
	public static void LietKe5ChuSo() {
		for (int i=10000;i <= 99999;i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
	}
	
	//số nguyên n thành các thừa số nguyên tố.
	public static void primeFactorization(int n) {
		for (int i=2;i <= n;i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
	            n = n / i;
			}
		}
		System.out.println(" ");
	}
	
	// tổng các chữ số của một số nguyên n
	public static int sumDigits(int n) {
	    int sum = 0;

	    while (n > 0) {
	        int digit = n % 10;
	        sum += digit;
	        n = n / 10;
	    }
	    return sum;
	}
	
	// số thuận nghịch 
	public static boolean isPalindrome(int n) {
	    int original = n;
	    int reverse = 0;

	    while (n > 0) {
	        int digit = n % 10;
	        reverse = reverse * 10 + digit;
	        n = n / 10;
	    }

	    return original == reverse;
	}
	// số thuận nghịch 
	public static void listSixDigitPalindromes() {
	    for (int i = 100000; i <= 999999; i++) {
	        if (isPalindrome(i)) {
	            System.out.print(i + " ");
	        }
	    }
	}
	
	// Fibonacci nhỏ hơn n
	public static void fibonacciPrimes(int n) {
	    int a = 0;
	    int b = 1;

	    while (a < n) {
	        if (isPrime(a)) {
	            System.out.print(a + " ");
	        }

	        int next = a + b;
	        a = b;
	        b = next;
	    }
	    System.out.println(" ");
	}
}
