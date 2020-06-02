package main;

public class isbnTen {
	public int isbnten(String num) {
		int sum = 0;
		int result ;
		for (int i = 1; i <= 9; ++i) {
			sum += (i * num.charAt(i - 1) - '0');
		}

		result = (sum % 11);
		if (result != 0) {
			result = 13 - result;
			System.out.println("Invalid");
		} else {
			System.out.println("valid");
			result = 0;

		}
		return result;
	}
}
