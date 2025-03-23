package P3;

public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.makeCall("123456789");
        basicPhone.sendSMS("123456789", "Hello!");

        Samsung samsung = new Samsung();
        samsung.makeCall("09123456789");
        samsung.browseWeb("www.google.com");
        samsung.takePicture();
        
        iPhone iphone = new iPhone();
        iphone.makeCall("143");
        iphone.browseWeb("www.apple.com");
        iphone.takePicture();
    }
}

