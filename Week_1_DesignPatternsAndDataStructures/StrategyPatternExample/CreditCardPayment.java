public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;
    private String cvv;

    public CreditCardPayment(String cardNumber, String name, String cvv) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card (" + cardNumber + ")");
    }
}
