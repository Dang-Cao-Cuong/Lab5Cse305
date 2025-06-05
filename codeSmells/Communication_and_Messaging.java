import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    // Getters for message properties
    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSummary() {
        String summary = new String();
        summary += "Content: " + content + "\n" +
                "Sender: " + sender + "\n" +
                "Recipient: " + recipient;
        return summary;
    }

    public String getDetail() {
        String detail = new String();
        detail += "Content: " + content + "\n" +
                "Sender: " + sender + "\n" +
                "Recipient: " + recipient + "\n" +
                "Content Length: " + content.length() + "\n" +
                "Sender Uppercase: " + sender.toUpperCase() + "\n" +
                "Recipient Lowercase: " + recipient.toLowerCase();
        return detail;
    }
}

class MessagingService {
    private final Map<String, List<Message>> inbox;

    public MessagingService() {
        this.inbox = new HashMap<>();
    }

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(message.getRecipient(), k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, new ArrayList<>());
    }

    public void printAllMessages() {
        for (String recipient : inbox.keySet()) {
            List<Message> messages = inbox.get(recipient);
            for (Message message : messages) {
                System.out.println( message.getSummary());              
            }
        }
    }
}

public class Communication_and_Messaging {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();
        // sending messages
        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        messagingService.sendMessage("Maintenance request received.",
                "Tenant A", "Property Manager");
        // retrieving messages for a recipient
        List<Message> tenantAMessages = messagingService.getMessagesForRecipient("Tenant A");
        for (Message message : tenantAMessages) {
            System.out.println("From: " + message.getSender() + ", Content: " + message.getContent());
        }
        // Calling the new method
        Message exampleMessage = new Message("Test", "Sender", "Recipient");
        System.out.println(exampleMessage.getDetail());
        messagingService.printAllMessages();
    }
}