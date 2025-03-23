package P4;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(100, new EWalletPayment());
        PaymentProcessor processor1 = new PaymentProcessor();
        processor1.processPayment(order1);

        Order order2 = new Order(50, new CashPayment());
        PaymentProcessor processor2 = new PaymentProcessor();
        processor2.processPayment(order2);

        Order order3 = new Order(200, new CreditCardPayment());
        PaymentProcessor processor3 = new PaymentProcessor();
        processor3.processPayment(order3);
    }
}
