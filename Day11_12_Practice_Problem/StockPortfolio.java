package Day_11_12_Practice_Problem;

import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public float getTotalPortfolioValue() {
        float total = 0;
        for (Stock s : stocks) {
            total += s.getTotalValue();
        }
        return total;
    }

    public void printReport() {
        System.out.println("\n----- STOCK REPORT -----");
        for (Stock s : stocks) {
            System.out.println(s.stockReport());
        }
        System.out.println("Total Portfolio Value = " + getTotalPortfolioValue());
    }
}
