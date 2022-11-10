import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This class contains two methods
 * First method to generate a string of 10 characters randomly.
 * Second method to validate if a string is in a list.
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

        List<String> list = new ArrayList<>();
        // LIST
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");

        System.out.println("\nExecuting Exercise number one:");
        StringGenerate stringGenerate = new StringGenerate();
        stringGenerate.runStringGenerate("a");
        System.out.println("");
        System.out.println("\nExecuting Exercise number two:");
        CheckList checkList = new CheckList();
        System.out.println(checkList.runCheckList("Doce", list));
    }

    /**
     * This class is used to generate a string of 10 characters randomly.
     *
     * @author Keivys José Rodríguez - keivys17@gmail.com
     * @version 1.00.000 2022-11-05
     * @since 1
     */
    static class StringGenerate {
        /**
         * RunStringGenerate this method is used to generate a random text string.
         *
         * @author Keivys José Rodríguez - keivys17@gmail.com
         * @since 1
         * @param x
         * @return checkInput
         */
        String runStringGenerate(String x) {
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
                    if (x.equalsIgnoreCase("A")) {
                        System.out.print("54");
                        bag = true;
                    } else if (x.equalsIgnoreCase("B")) {
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
     * This class is used to check if a string is in a list.
     *
     * @author Keivys José Rodríguez - keivys17@gmail.com
     * @version 1.00.000 2022-11-05
     * @since 1
     */
    static class CheckList {
        /**
         * runCheckList This method is used to check if a string is in a list.
         *
         * @author Keivys José Rodríguez - keivys17@gmail.com
         * @since 1
         * @param list
         * @return control
         */
        Boolean runCheckList(String str, List<String> list) {
            Boolean control = true;

            if (list.contains(str)) {
                control = false;
            }

            return control;

        }
    }
}