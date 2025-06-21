public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Jeeva Priya", "789"));
        context.processPayment(1500.00);
        context.setPaymentStrategy(new PayPalPayment("jeeva@example.com", "securePass123"));
        context.processPayment(999.99);
    }
}
