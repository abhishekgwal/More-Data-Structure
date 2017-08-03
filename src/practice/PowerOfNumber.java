package practice;

// Refer to recursion project folder for same program with recursive solution

public class PowerOfNumber {

	double power(double m, double n) {
		double res = m;
		if (n == 0)
			return 1;
		for(double i = 1; i < n ; i++) {
			res = res * m;
		}
		return res;
	}
	
	public static void main(String[] args) {

		PowerOfNumber obj = new PowerOfNumber();
		double pow = obj.power(5, 3);
		System.out.println(pow);
	}

}
