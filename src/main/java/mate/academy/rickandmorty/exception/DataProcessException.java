package mate.academy.rickandmorty.exception;

public class DataProcessException extends RuntimeException {
    public DataProcessException(String message, Throwable cause) {
        super(message, cause);
    }
}
