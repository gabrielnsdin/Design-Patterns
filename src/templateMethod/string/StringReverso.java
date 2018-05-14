package templateMethod.string;

public class StringReverso extends StringTransform{
	
	@Override
	public String transform(String text) {
		
		return new StringBuilder(text).reverse().toString();
	}

}
