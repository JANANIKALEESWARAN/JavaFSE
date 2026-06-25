// Component Interface
interface Notifier {
    void send(String message);
}

// Concrete Component
class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Email Notification: " + message);
    }
}

// Abstract Decorator
abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.send(message);
    }
}

// Concrete Decorator - SMS
class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("SMS Notification: " + message);
    }
}

// Concrete Decorator - Slack
class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("Slack Notification: " + message);
    }
}

// Test Class
public class Main {
    public static void main(String[] args) {

        System.out.println("Email Only:");
        Notifier email = new EmailNotifier();
        email.send("Order Placed");

        System.out.println("\nEmail + SMS:");
        Notifier emailSMS =
                new SMSNotifierDecorator(new EmailNotifier());
        emailSMS.send("Order Confirmed");

        System.out.println("\nEmail + SMS + Slack:");
        Notifier allChannels =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        allChannels.send("Order Shipped");
    }
}