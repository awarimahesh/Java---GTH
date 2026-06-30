/*
. A notification system must send Email, SMS, and WhatsApp messages. 
How would you design it for future scalability?
*/

abstract class Notification {
    abstract void send(String message);
}

class EmailNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SMSNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class WhatsAppNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("WhatsApp: " + message);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Notification n;

        n = new EmailNotification();
        n.send("Order Placed");

        n = new SMSNotification();
        n.send("Order Shipped");

        n = new WhatsAppNotification();
        n.send("Order Delivered");
    }
}





/*
Abstraction provides a common contract (send()).
Polymorphism allows different notification types to implement their own sending logic.
To add a new notification type (e.g., PushNotification), 
simply create a new class extending Notification and implement send().
 No changes are needed to existing classes.
*/