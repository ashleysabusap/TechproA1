public class PaymentProcessor {

    public static void processPayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency);
    }

    public void processPayment(double amount, String currency, String paymentMethod) {
        System.out.println("Processing payment of " + amount + " " + currency + " via " + paymentMethod);
    }

    public static void main(String[] args) {

        // static method po itetch
        processPayment(500.00, "PHP");

        // non-static method po itetchh
        PaymentProcessor obj = new PaymentProcessor();
        obj.processPayment(1000.00, "USD", "Credit Card");
    }
}
