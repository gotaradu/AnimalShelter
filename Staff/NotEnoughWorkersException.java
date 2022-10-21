package Staff;

public class NotEnoughWorkersException extends Throwable {
    public NotEnoughWorkersException(String s) {
        super(s);
    }
}
