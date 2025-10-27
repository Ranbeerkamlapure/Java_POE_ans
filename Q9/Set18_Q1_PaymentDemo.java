class PaymentGateway {
    void processPayment(double amount) {}
}

class CreditCardPayment extends PaymentGateway {
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}

class PayPalPayment extends PaymentGateway {
    void processPayment(double amount) {
        System.out.println("Connecting to PayPal for ₹" + amount);
    }
}

public class Set18_Q1_PaymentDemo {
    public static void main(String[] args) {
        PaymentGateway p1 = new CreditCardPayment();
        PaymentGateway p2 = new PayPalPayment();

        p1.processPayment(500);
        p2.processPayment(750);
    }
}
