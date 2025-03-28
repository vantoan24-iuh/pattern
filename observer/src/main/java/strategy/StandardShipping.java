package strategy;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingFee(double weight) {
        return weight * 5000; // 5,000 VND/kg
    }
}