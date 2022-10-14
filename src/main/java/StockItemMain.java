import java.util.Arrays;

public class StockItemMain {

    public static void main(String[] args) {
	StockItem[] items = { 
            new StockItem("bev-cup-24oz", 100),
	    new StockItem("bev-cup-36oz", 50),
	    new StockItem("m&m-3oz",320) };

	//Arrays.sort throws an exception if StockItem does not implement java.lang.Comparable
	Arrays.sort(items);
	System.out.println("Sorted by quantity on hand:" + Arrays.toString(items));
    }

}
