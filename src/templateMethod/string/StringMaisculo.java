package templateMethod.string;

public class StringMaisculo extends StringTransform{

	@Override
	public String transform(String text) {
		return text.toUpperCase();
	}

}
