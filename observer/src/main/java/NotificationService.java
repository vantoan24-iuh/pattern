import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    // Phương thức gửi thông báo đến tất cả người đăng ký
    public void notifyUsers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
