package P4;

class EWalletPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("You are paying in GCash: $" + amount);
    }
}

