public class Stock {
    // Instance variables (like Python's self.variable)
    private String stockName;
    private int numberOfShares;
    private double sharePrice;
    
    // Constructor (like Python's __init__)
    public Stock(String stockName, int numberOfShares, double sharePrice) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }
    
    // Getter methods (to access private variables)
    public String getStockName() {
        return stockName;
    }
    
    public int getNumberOfShares() {
        return numberOfShares;
    }
    
    public double getSharePrice() {
        return sharePrice;
    }
    
    // Calculate stock value (shares * price)
    public double calculateStockValue() {
        return numberOfShares * sharePrice;
    }
    
    // String representation (like Python's __str__)
    @Override
    public String toString() {
        return String.format("%-20s %10d %15.2f %20.2f", 
                            stockName, 
                            numberOfShares, 
                            sharePrice, 
                            calculateStockValue());
    }
}