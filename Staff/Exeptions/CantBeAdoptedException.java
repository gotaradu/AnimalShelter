package Staff.Exeptions;

import Animals.Cat;

public class CantBeAdoptedException extends Exception {
    public CantBeAdoptedException(String message) {
        super(message);
    }
}
