package Sw3;

public class BasicPhone implements PhoneMessage, PhoneCall{
    @Override
    public void makeCalls(String number) {
        System.out.println("Basic Phone is Calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending message: " + message + " to " + number);
    }
}
