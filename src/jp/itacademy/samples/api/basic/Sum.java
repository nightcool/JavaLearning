package jp.itacademy.samples.api.basic;

public class Sum {
	public static void main(String[] args) {

		int sum = 0;
		StringBuilder expr = new StringBuilder();

		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			expr.append(i).append("+");
		}
		expr.deleteCharAt(expr.length() - 1);
		expr.append("=").append(sum);

		System.out.println(expr);
	}
}
