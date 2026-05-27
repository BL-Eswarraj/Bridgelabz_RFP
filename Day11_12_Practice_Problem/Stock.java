package Day_11_12_Practice_Problem;

public class Stock {

    private String stockName;
    private int noOfStock;
    private float sharePrice;

    public Stock() {
    }

    public Stock(String stockName, int noOfStock, float sharePrice) {
        this.stockName = stockName;
        this.noOfStock = noOfStock;
        this.sharePrice = sharePrice;
    }

    // Getters & Setters
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNoOfStock() {
        return noOfStock;
    }

    public void setNoOfStock(int noOfStock) {
        this.noOfStock = noOfStock;
    }

    public float getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(float sharePrice) {
        this.sharePrice = sharePrice;
    }

    // Total value of this stock: shares × price
    public float getTotalValue() {
        return noOfStock * sharePrice;
    }

    // Report format
    public String stockReport() {
        return "Stock Name: " + stockName +
                ", No. of Shares: " + noOfStock +
                ", Share Price: " + sharePrice +
                ", Total Value: " + getTotalValue();
    }

    @Override
    public String toString() {
        return stockReport();
    }
}
