package P4;

class PaymentProcessor {
    public void processPayment(Order order) {
        PaymentStrategy paymentStrategy = order.getPaymentStrategy();
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("No payment method selected.");
        }
        paymentStrategy.pay(order.getAmount());
    }
}

