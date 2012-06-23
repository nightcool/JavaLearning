package jp.itacademy.samples.oop.calc;

public class SubtractOperator implements Operator {

	public String getName() {
		return "subtract";
	}

	public int execute(int x, int y) {
		return x - y;
	}
}
