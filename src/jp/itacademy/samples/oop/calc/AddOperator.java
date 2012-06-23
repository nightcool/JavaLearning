package jp.itacademy.samples.oop.calc;

public class AddOperator implements Operator {

	public String getName() {
		return "add";
	}

	public int execute(int x, int y) {
		return x + y;
	}
}
