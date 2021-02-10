package comparing;

import java.util.Comparator;

public class SerialComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		int i = (int)p1.compareTo(p2);
        if (i == 0) {
            i = p1.getPrice() - p2.getPrice();
        }
        return i;
    }


}
