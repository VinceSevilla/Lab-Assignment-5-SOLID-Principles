package P3;

class BasicPhone implements Callable, Messageable {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }
}
