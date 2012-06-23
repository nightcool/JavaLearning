package jp.itacadmy.samples.oop.deco;

public class DecoStar extends DecoratedString {

	protected DecoStar(String str) {
		super(str);
	}

	protected String decorate(String str) {
		return "š" + str + "š";

	}
}
