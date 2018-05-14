package templateMethod.string;

public class StringDuplicar extends StringTransform{

	@Override
	public String transform(String text) {
		return text.concat(text);
	}

}
