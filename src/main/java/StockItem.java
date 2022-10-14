
public class StockItem {
    private String sku;
    private int quantityOnHand;

    public StockItem(String sku, int quantityOnHand) {
	this.sku = sku;
	this.quantityOnHand = quantityOnHand;
    }

    @Override
    public String toString() {
	return "\n" +"StockItem{" +
		"sku='" + sku + '\'' +
		", quantityOnHand=" + quantityOnHand +
		'}';
    }

}
