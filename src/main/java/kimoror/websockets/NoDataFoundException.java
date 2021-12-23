package kimoror.websockets;

public class NoDataFoundException extends RuntimeException{
    public NoDataFoundException() {
        super("No input data");
    }
}
