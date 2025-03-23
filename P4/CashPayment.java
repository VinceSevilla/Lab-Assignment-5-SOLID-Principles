package P4;

class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("You are paying in Cash: $" + amount);
    }
}

