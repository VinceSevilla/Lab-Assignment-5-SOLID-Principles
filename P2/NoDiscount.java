package P2; 

class NoDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return 0.0;
    }
}

