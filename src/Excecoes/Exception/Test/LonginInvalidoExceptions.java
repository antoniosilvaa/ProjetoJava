package Excecoes.Exception.Test;

public class LonginInvalidoExceptions extends Exception{
    public LonginInvalidoExceptions(String message) {
        super(message);
    }

    public LonginInvalidoExceptions() {
        super("login Invalido");
    }
}
