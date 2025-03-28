package strategy;

public class FreeShipping implements ShippingStrategy {
    @Override
    public double calculateShippingFee(double weight) {
        return 0; // Miễn phí vận chuyển
    }
}
