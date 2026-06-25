import java.util.*;

// Observer Interface
interface Observer {
    void update(String stockName, double price);
}

// Subject Interface
interface Stock {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Concrete Subject
class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockName, price);
        }
    }

    public void setStockPrice(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;

        System.out.println("\nStock Updated:");
        System.out.println(stockName + " = Rs." + price);

        notifyObservers();
    }
}

// Concrete Observer - Mobile App
class MobileApp implements Observer {
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    public void update(String stockName, double price) {
        System.out.println("Mobile App [" + user +
                "] notified: " + stockName +
                " = Rs." + price);
    }
}

// Concrete Observer - Web App
class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    public void update(String stockName, double price) {
        System.out.println("Web App [" + user +
                "] notified: " + stockName +
                " = Rs." + price);
    }
}


public class Main {
    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("Janani");
        Observer web = new WebApp("Admin");

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStockPrice("TCS", 4200.50);
        market.setStockPrice("INFY", 1850.75);

        market.removeObserver(web);

        market.setStockPrice("WIPRO", 310.25);
    }
}