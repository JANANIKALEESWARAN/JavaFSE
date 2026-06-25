// Target Interface
interface PaymentProcessor {
    void processPayment(double amount);
}

// Adaptee 1
class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " processed using PayPal.");
    }
}

// Adaptee 2
class StripeGateway {
    public void payAmount(double amount) {
        System.out.println("Payment of Rs." + amount + " processed using Stripe.");
    }
}

// Adapter for PayPal
class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway paypal;

    public PayPalAdapter(PayPalGateway paypal) {
        this.paypal = paypal;
    }

    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}

// Adapter for Stripe
class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe;

    public StripeAdapter(StripeGateway stripe) {
        this.stripe = stripe;
    }

    public void processPayment(double amount) {
        stripe.payAmount(amount);
    }
}

// Test Class
public class Main {
    public static void main(String[] args) {

        PaymentProcessor paypal =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripe =
                new StripeAdapter(new StripeGateway());

        paypal.processPayment(5000);
        stripe.processPayment(2500);
    }
}