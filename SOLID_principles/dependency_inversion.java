package SOLID_principles;
// NotificationSender interface
interface NotificationSender {
    void send(String message);
}
// EmailSender class
class EmailSender implements NotificationSender {
    private String emailAddress;

    public EmailSender(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email to " + emailAddress + ": " + message);
    }
}

// SmsSender class
class SmsSender implements NotificationSender {
    private String phoneNumber;

    public SmsSender(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
// NotificationService class
class NotificationService {
    private NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void notifyUser(String message) {
        notificationSender.send(message);
    }
}
// Main class to test Dependency Inversion Principle
public class dependency_inversion {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender("user@example.com");
        NotificationSender smsSender = new SmsSender("123-456-7890");

        NotificationService emailNotificationService = new NotificationService(emailSender);
        NotificationService smsNotificationService = new NotificationService(smsSender);

        emailNotificationService.notifyUser("Your email notification message.");
        smsNotificationService.notifyUser("Your SMS notification message.");
    }
}

