public class Test {
    public static void main(String[] args) {
        // Tạo dịch vụ thông báo
        NotificationService notificationService = new NotificationService();

        // Tạo các người dùng
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        // Đăng ký người dùng vào hệ thống nhận thông báo
        notificationService.register(user1);
        notificationService.register(user2);
        notificationService.register(user3);

        // Gửi thông báo
        notificationService.notifyUsers("Có một tin nhắn mới!");

        // Hủy đăng ký một người dùng
        notificationService.unregister(user2);

        // Gửi thông báo lần nữa
        notificationService.notifyUsers("Cập nhật mới có sẵn!");
    }
}
