package tests.specific;

import jas.core.Compiler;
import jas.core.components.Literal;

import static tests.TestPrint.*;

/**
* Literal Test
 */
public class LiteralTest {
    public static void main(String args[]){
        l(Compiler.compile("('heef'+x)^2*a").expand().simplify());
        l(new Literal("hello"));

    }
}
