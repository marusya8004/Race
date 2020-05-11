package Exceptions;

public class NoSuchTransport extends Exception {

    public NoSuchTransport(String message, NoSuchTransport e) {
        super(message, e);
    }
    public NoSuchTransport() {
    }
}
