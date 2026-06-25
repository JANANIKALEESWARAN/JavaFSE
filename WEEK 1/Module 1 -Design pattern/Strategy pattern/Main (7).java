 // Strategy Interface
interface PaymentStrategy {
    void pay(double amount);
}

// Concrete Strategy - Credit Card
class CreditCardPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount +
                " using Credit Card.");
    }
}

// Concrete Strategy - PayPal
class PayPalPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount +
                " using PayPal.");
    }
}

// Context Class
class PaymentContext {

    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}

// Test Class
public class Main {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        // Credit Card Payment
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(5000);

        // PayPal Payment
        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(2500);
    }
}