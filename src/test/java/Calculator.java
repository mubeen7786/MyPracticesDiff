import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char choice;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int marks = input.nextInt();
        //int m = input.nextInt();


        //int marks=65;
        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }

    }
}


// System.out.print("Would you like to continue?(yes/no) ");
//        String cont = input.nextLine();
//    }while((!(dg == 'C' || dg == 'F')) && cont.equalsIgnoreCase("yes"));




//System.out.println("Would you like to continue?(yes/no)");
//    reply=input.next().toUpperCase();
//   }while(reply.equals("YES"));



//System.out.println("Would you like to continue?(yes/no)");
//        prompt = input.next();
//        }while(prompt.equalsIgnoreCase("yes"));


