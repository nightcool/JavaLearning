package jp.itacadmy.samples.oop.deco;

public class DecoStrong extends DecoratedString {

	protected DecoStrong(String str) {
		super(str);
	}

	protected String decorate(String str) {
		return "<strong>" + str + "</strong>";
	}
}
