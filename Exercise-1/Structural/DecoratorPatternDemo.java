// Component
interface Notification {
    void send();
}

// Concrete component
class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending email notification.");
    }
}

// Decorator
abstract class NotificationDecorator implements Notification {
    protected Notification decoratedNotification;

    public NotificationDecorator(Notification notification) {
        this.decoratedNotification = notification;
    }

    @Override
    public void send() {
        decoratedNotification.send();
    }
}

// Concrete decorators
class SMSNotificationDecorator extends NotificationDecorator {
    public SMSNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        decoratedNotification.send();
        System.out.println("Sending SMS notification.");
    }
}

class PushNotificationDecorator extends NotificationDecorator {
    public PushNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        decoratedNotification.send();
        System.out.println("Sending push notification.");
    }
}

// Demo
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();

        Notification smsNotification = new SMSNotificationDecorator(notification);
        Notification pushNotification = new PushNotificationDecorator(smsNotification);

        pushNotification.send();
    }
}
