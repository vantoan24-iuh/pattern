package strategy;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingFee(double weight) {
        return weight * 10000; // 10,000 VND/kg
    }
}
