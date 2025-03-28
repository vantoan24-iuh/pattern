package decorator;

public class CaramelDecorator extends BeverageDecorator {
    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 7000; // Thêm 7,000 VND
    }
}

