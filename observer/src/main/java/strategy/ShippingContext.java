package strategy;

public class ShippingContext {
    private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShipping(double weight) {
        if (strategy == null) {
            throw new IllegalStateException("Chưa chọn phương thức vận chuyển!");
        }
        return strategy.calculateShippingFee(weight);
    }
}
