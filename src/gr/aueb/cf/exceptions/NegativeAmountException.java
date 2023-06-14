package gr.aueb.cf.exceptions;

public class NegativeAmountException extends Exception{
    private static final long serialVersionUID = 1L;

    public NegativeAmountException(double amount) {
        super("Amonunt: " + amount + " is negative");
    }
}
