package Interpreter;

import java.io.Serializable;

public interface Expression extends Serializable {
    double interpret();
}
