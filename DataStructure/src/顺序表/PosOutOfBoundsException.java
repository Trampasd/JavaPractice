package 顺序表;

public class PosOutOfBoundsException extends RuntimeException{
    public PosOutOfBoundsException() {
    }

    public PosOutOfBoundsException(String message) {
        super(message);
    }
}
