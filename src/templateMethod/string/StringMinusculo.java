package templateMethod.string;

public class StringMinusculo extends StringTransform{

	@Override
	public String transform(String text) {
		return text.toLowerCase();
	}

}
