package templateMethod.string;

public class StringTransformTest {
	
	public static void main(String[] args) {
		StringTransform transform = new StringMaisculo();
		transform.read();

		transform = new StringMinusculo();
		transform.read();
		
		transform = new StringDuplicar();
		transform.read();
		
		transform = new StringReverso();
		transform.read();
	}
}
