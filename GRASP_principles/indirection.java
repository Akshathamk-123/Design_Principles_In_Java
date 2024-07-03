import java.text.SimpleDateFormat;
import java.util.Date;

// ChatRoom class
class ChatRoom {
    public void showMessage(User user, String message) {
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println(timeStamp + " [" + user.getName() + "]: " + message);
    }
}

// User class
class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chatRoom.showMessage(this, message);
    }
}
// Main class to test the implementation
public class indirection {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        user1.setChatRoom(chatRoom);
        user2.setChatRoom(chatRoom);

        user1.sendMessage("Hello, Bob!");
        user2.sendMessage("Hi, Alice! How are you?");
    }
}

