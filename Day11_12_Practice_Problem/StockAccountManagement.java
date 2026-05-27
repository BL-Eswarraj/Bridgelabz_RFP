package Day_11_12_Practice_Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockAccountManagement {

    private final static Scanner sc = new Scanner(System.in);
    private final static List<Stock> stocks = new ArrayList<>();

    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio();
        System.out.print("\nEnter number of stocks to add: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Stock # " + (i + 1));
            Stock s = inizalizeStock();
            portfolio.addStock(s);
        }
        portfolio.printReport();
        sc.close();
    }

    private static Stock inizalizeStock() {
        Stock st = new Stock();
        System.out.print("Enter your Stock Name : ");
        String stockName = sc.next();
        st.setStockName(stockName);
        System.out.print("Enter your No.of Stock : ");
        int noOfStock = sc.nextInt();
        st.setNoOfStock(noOfStock);
        System.out.print("Enter your Stock Price : ");
        float stockPrice = sc.nextFloat();
        st.setSharePrice(stockPrice);
        return st;
    }
}
