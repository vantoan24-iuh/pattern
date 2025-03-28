package strategy;

public class Test {
    public static void main(String[] args) {
        ShippingContext context = new ShippingContext();

        // Chọn phương thức giao hàng tiêu chuẩn
        context.setStrategy(new StandardShipping());
        System.out.println("Phí vận chuyển tiêu chuẩn: " + context.calculateShipping(2) + " VND");

        // Chọn phương thức giao hàng nhanh
        context.setStrategy(new ExpressShipping());
        System.out.println("Phí vận chuyển nhanh: " + context.calculateShipping(2) + " VND");

        // Chọn phương thức giao hàng miễn phí
        context.setStrategy(new FreeShipping());
        System.out.println("Phí vận chuyển miễn phí: " + context.calculateShipping(2) + " VND");
    }
}
