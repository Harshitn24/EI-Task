import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Stock {
    void addObserver(Trader observer);

    void removeObserver(Trader observer);

    void notifyObservers();
}

// Concrete Subject
class StockMarket implements Stock {
    private List<Trader> traders = new ArrayList<>();
    private double stockPrice;

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    public double getStockPrice() {
        return stockPrice;
    }

    @Override
    public void addObserver(Trader trader) {
        traders.add(trader);
    }

    @Override
    public void removeObserver(Trader trader) {
        traders.remove(trader);
    }

    @Override
    public void notifyObservers() {
        for (Trader trader : traders) {
            trader.update();
        }
    }
}

// Observer interface
interface Trader {
    void update();
}

// Concrete Observer
class ConcreteTrader implements Trader {
    private String name;
    private StockMarket stockMarket;

    public ConcreteTrader(String name, StockMarket stockMarket) {
        this.name = name;
        this.stockMarket = stockMarket;
    }

    @Override
    public void update() {
        System.out.println(name + " notified: Stock Price changed to " + stockMarket.getStockPrice());
    }
}

// Demo
public class ObserverPatternDemo {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Trader trader1 = new ConcreteTrader("Trader 1", stockMarket);
        Trader trader2 = new ConcreteTrader("Trader 2", stockMarket);

        stockMarket.addObserver(trader1);
        stockMarket.addObserver(trader2);

        stockMarket.setStockPrice(100.5);
        stockMarket.setStockPrice(102.3);
    }
}
