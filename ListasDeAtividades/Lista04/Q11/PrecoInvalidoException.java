package ListasDeAtividades.Lista04.Q11;

public class PrecoInvalidoException extends RuntimeException{

    public PrecoInvalidoException() {
    }

    public PrecoInvalidoException(String message) {
        super(message);
    }

    public PrecoInvalidoException(Throwable cause) {
        super(cause);
    }

    public PrecoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrecoInvalidoException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
