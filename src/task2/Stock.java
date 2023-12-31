package task2;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        double a = (currentPrice - previousClosingPrice)/previousClosingPrice;
        return a;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", previousClosingPrice=" + previousClosingPrice + '\'' +
                ", currentPrice=" + currentPrice + '\'' +
                ", изменение= " + getChangePercent() +
                '}';
    }

    public static void main(String[] args) {
        Stock stock = new Stock("gpn", "gpromneft", 935.6, 847);
        System.out.println(stock);
//        v2
    }
}
