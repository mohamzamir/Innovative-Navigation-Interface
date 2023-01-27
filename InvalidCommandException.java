/**
 * This class is used for throw exception if command can't push in stack then throw the exception
 */
public class InvalidCommandException extends Exception{
    public InvalidCommandException (String m)
    {
        super(m);
    }
}
