package jp.itacadmy.samples.oop.deco;

public class Main {

	public static void main(String[] args) {

		DecoratedString deco = new DecoStar("Hello World");
		deco.show();

		deco = new DecoStrong("Hello World");
		deco.show();
	}
}
