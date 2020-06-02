package main;

public class isbnThirteen {
	public int isbnthirteen(String num) {

		num = num.replaceAll("-", "");
		int sum = 0;
		int result = 0;
		int n;
		for (int i = 0; i < 12; i++) {
			n = Integer.parseInt(num.substring(i, i + 1));
			sum += (i % 2 == 0) ? n * 1 : n * 3;
			result = sum % 10;

			if (result != 0) {
				result = 10 - result;
			}

		}
		return result;

	}

}
