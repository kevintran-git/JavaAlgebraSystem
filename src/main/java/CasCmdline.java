import jas.core.Compiler;
import jas.core.JASException;

import java.util.Scanner;

import static jas.utils.ColorFormatter.*;

/**
* JMC Computer Algebra System commandline application
 */
public class CasCmdline {
    public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(boldBlack("\t: "));
            String input = scanner.nextLine();
            if (input.equals("exit")) return;
            try {
                System.out.println(boldBlack("\t= ") + Compiler.compile(input).simplify().coloredString() + "\n");
            } catch (JASException e) {
                System.out.println(lightBlue("\t> ") + lightRed(e.getMessage()) + "\n");
            }
        }
    }
}
