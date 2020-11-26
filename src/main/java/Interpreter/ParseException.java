package Interpreter;

import java.io.Serializable;

public class ParseException extends Exception implements Serializable {
    public ParseException(String msg){ super(msg);}
}