import jas.core.Compiler;
import jas.core.JASException;

import java.util.Scanner;

import static jas.utils.ColorFormatter.*;
import static tests.TestPrint.l;
import static tests.TestPrint.p;

/**
* JMC Computer Algebra System commandline application
 */
public class CasCmdline {
    public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
        while (true) {
            p(boldBlack("\t: "));
            String input = scanner.nextLine();
            if (input.equals("exit")) return;
            try {
                l(boldBlack("\t= ") + Compiler.compile(input).simplify().coloredString() + "\n");
            } catch (JASException e) {
                l(lightBlue("\t> ") + lightRed(e.getMessage()) + "\n");
            }
        }
    }
}
