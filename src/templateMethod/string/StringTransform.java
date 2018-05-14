package templateMethod.string;

import java.util.Scanner;

public abstract class StringTransform {
	
	protected void read() {
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		text = transform(text);
		System.out.println("Readed: " + text);
	}
	
	public abstract String transform(String text);
}
