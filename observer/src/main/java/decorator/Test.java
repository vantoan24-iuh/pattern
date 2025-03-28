package decorator;

public class Test {
    public static void main(String[] args) {
        // Đồ uống cơ bản - Cà phê
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " - Giá: " + coffee.getCost() + " VND");

        // Thêm sữa vào cà phê
        Beverage coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println(coffeeWithMilk.getDescription() + " - Giá: " + coffeeWithMilk.getCost() + " VND");

        // Thêm sữa và đường
        Beverage coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println(coffeeWithMilkAndSugar.getDescription() + " - Giá: " + coffeeWithMilkAndSugar.getCost() + " VND");

        // Thêm sữa, đường và caramel
        Beverage fullOptionCoffee = new CaramelDecorator(coffeeWithMilkAndSugar);
        System.out.println(fullOptionCoffee.getDescription() + " - Giá: " + fullOptionCoffee.getCost() + " VND");
    }
}
