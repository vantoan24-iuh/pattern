package decorator;

public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Cà phê";
    }

    @Override
    public double getCost() {
        return 20000; // 20,000 VND
    }
}

