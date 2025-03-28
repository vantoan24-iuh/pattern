package decorator;

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Đường";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2000; // Thêm 2,000 VND
    }
}
