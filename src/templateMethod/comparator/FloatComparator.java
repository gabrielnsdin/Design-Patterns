package templateMethod.comparator;

import java.util.Comparator;

public class FloatComparator implements Comparator<Double>{

	@Override
	public int compare(Double o1, Double o2) {
		if((o1 - o1.intValue()) > (o2 - o2.intValue())) {
			return 1;
		}
		
		if((o1 - o1.intValue()) < (o2 - o2.intValue())) {
			return -1;
		}
		
		return 0;
	}

}
