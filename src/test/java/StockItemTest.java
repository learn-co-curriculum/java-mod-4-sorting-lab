import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockItemTest {

    @Test
    void compareTo() {
        StockItem item1 = new StockItem("bev-cup-24oz", 200) ;
        StockItem item2 = new StockItem("popcorn-tub-lrg", 250);
        StockItem item3 = new StockItem("bev-cup-36oz", 200);

        assertTrue(item1.compareTo(item2) < 0);
        assertTrue(item2.compareTo(item3) > 0);
        assertTrue(item1.compareTo(item3) == 0);

    }


}