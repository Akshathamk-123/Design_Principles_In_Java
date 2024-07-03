package SOLID_principles;


import java.util.ArrayList;
import java.util.List;


// UserRepository class
class UserRepository {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public List<User> getUsers() {
        return users;
    }
}

// User class
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }
}
// EmailService class
class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Sending welcome email to " + user.getEmail());
    }
}
// UserRegistrationService class
class UserRegistrationService {
    private UserRepository userRepository;
    private EmailService emailService;

    public UserRegistrationService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void registerUser(String name, String email) {
        User user = new User(name, email);
        userRepository.addUser(user);
        emailService.sendWelcomeEmail(user);
    }
}
// Main class to test the implementation
public class Single_Responsibility {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        EmailService emailService = new EmailService();
        UserRegistrationService userRegistrationService = new UserRegistrationService(userRepository, emailService);

        // Register a user
        userRegistrationService.registerUser("Alice", "alice@example.com");
    }
}

