package Staff.Exeptions;

public class NotEnoughWorkersException extends Throwable {
    public NotEnoughWorkersException(String s) {
        super(s);
    }
}
