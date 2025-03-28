package decorator;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sữa";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 5000; // Thêm 5,000 VND
    }
}
