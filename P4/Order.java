package P4;

class Order {
    private double amount;
    private PaymentStrategy paymentStrategy;

    public Order(double amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }
}

