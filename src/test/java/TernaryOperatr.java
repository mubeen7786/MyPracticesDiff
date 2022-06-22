import java.util.Scanner;

public class TernaryOperatr {
    // Ternary Operator is latest form of if else (If the condition is true, the result of ? is returned. But, if the condition is false, the result of : is returned.)
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            do {


                System.out.print("Enter an integer: ");
                int number = input.nextInt();
                // int input=13;
                //Using ternary operator
                String output = (number % 2 == 0) ? "even number" : "odd number"; // Ternary Operator is latest form of if else
                System.out.println(output);

                        System.out.println("Type YES to continue");
            }
            while (input.next().equalsIgnoreCase("YES"));
        }
}
