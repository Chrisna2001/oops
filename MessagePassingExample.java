class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Messenger {
    public void sendMessage(Message message, String recipient) {
        System.out.println("Sending message to " + recipient + ": " + message.getContent());
    }
}

public class MessagePassingExample {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();

        Message message = new Message("Hello, how are you?");
        messenger.sendMessage(message, "Alice");
        messenger.sendMessage(new Message("I'm doing well, thanks!"), "Bob");
    }
}
