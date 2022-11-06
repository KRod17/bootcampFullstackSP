import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Esta clase contiendo dos métodos, un método para generar una cadena de 10 caracteres de forma aleatoria
 * y otro método para validar si un string está en una lista.
 *
 * @author Keivys José Rodríguez - keivys17@gmail.com
 * @version 1.00.000 2022-11-05
 * @since 1
 */
public class Challenge1 {
    /**
     * main method with which the program operation will be carried out
     *
     * @param args this parameter is given by default in the main class
     * @author Keivys José Rodríguez - keivys17@gmail.com
     * @since 1
     */
    public static void main(String[] args) {

        System.out.println("\nExecuting Exercise number one:");
        StringGenerate hola = new StringGenerate();
        hola.RunStringGenerate();
        System.out.println("");
        System.out.println("\nExecuting Exercise number two:");
        CheckList checkList = new CheckList();
        System.out.println(checkList.runCheckList("Dos"));

    }

    /**
     * Esta clase es usada para generar una cadena de 10 caracteres de forma aleatoria.
     *
     * @author Keivys José Rodríguez - keivys17@gmail.com
     * @version 1.00.000 2022-11-05
     * @since 1
     */
    static class StringGenerate {
        /**
         * RunStringGenerate método para generar una cadena de texto aleatoria.
         *
         * @author Keivys José Rodríguez - keivys17@gmail.com
         * @since 1
         */
        String RunStringGenerate() {
            Scanner sc = new Scanner(System.in);
            Random r = new Random();
            ArrayList<Integer> arrayNumbers = new ArrayList<Integer>();
            String checkInput = "";
            Boolean bag = false;

            for (int i = 0; i < 8; i++) {
                Integer num = r.nextInt(9);
                arrayNumbers.add(num);
            }
            try {
                do {
                    System.out.print("\nJust write "
                            + (char) 34 + "Tipo A"
                            + (char) 34 + " or "
                            + (char) 34 + "Tipo B"
                            + (char) 34 + ": ");

                    checkInput = sc.nextLine();

                    if (checkInput.equalsIgnoreCase("Tipo A")) {
                        System.out.print("54");
                        bag = true;
                    } else if (checkInput.equalsIgnoreCase("Tipo B")) {
                        System.out.print("08");
                        bag = true;
                    }
                } while (bag == false);
            } catch (Exception e) {
                System.out.println("Error, please check your input!\n" + e);
            }

            for (int i = 0; i < arrayNumbers.size(); i++) {
                System.out.print(arrayNumbers.get(i));
            }
            return checkInput;
        }
    }

    /**
     * Esta clase contiendo es usada para validar si un string está en una lista.
     *
     * @author Keivys José Rodríguez - keivys17@gmail.com
     * @version 1.00.000 2022-11-05
     * @since 1
     */
    static class CheckList {
        /**
         * runCheckList método para validar si un string esta en la lista.
         * Retorna un Booleano.
         *
         * @author Keivys José Rodríguez - keivys17@gmail.com
         * @since 1
         */
        Boolean runCheckList(String str) {
            Boolean control = false;
            List<String> list = new ArrayList<>();
            // LIST
            list.add("Uno");
            list.add("Dos");
            list.add("Tres");
            list.add("Cuatro");
            list.add("Cinco");
            list.add("Seis");
            list.add("Siete");
            list.add("Ocho");
            list.add("Nueve");
            list.add("Diez");

            if (list.contains(str)) {
                control = true;
            }

            return control;

        }
    }
}