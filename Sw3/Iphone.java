package Sw3;

public class Iphone implements PhoneMessage, PhoneCall, Browser, Camera{
    @Override
    public void makeCalls(String number) {
        System.out.println("IPhone is Calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Iphone Sending message: " + message + " to " + number);
    }


    @Override
    public void browseWeb(String url) {
        System.out.println("IPhone Browsing on the " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("IPhone took a picture");
    }
}
