package Sw3;

public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();


        System.out.println();

        System.out.println("Basic Phone:");
        basicPhone.makeCalls("0458424457");
        basicPhone.sendSMS("09588774", "What's up baby");
        
        System.out.println();

        System.out.println("Samsung:");
        samsung.makeCalls("09636541243");
        samsung.sendSMS("09343421421", "How are you?");
        samsung.browseWeb("neuvle.com");
        samsung.takePicture();

        System.out.println();

        System.out.println("Iphone:");
        iphone.makeCalls("097614621462");
        iphone.sendSMS("09238213921", "How are you?");
        iphone.browseWeb("Cornhub.com");
        iphone.takePicture();
    
    }
}
