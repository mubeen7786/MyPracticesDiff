public class StringMethods {
    public static void main(String[] args) {

        //Basically string is an object and we can declare a string simpley or String literal
        String s = "THis is mubeen akhtar";
        String s1 = "THis is mubeen akhtar"; // This is the simple method to declare the string and if we give same values to differenct string veriables then it will show an error thats why we user New method

        String s2 = new String("Hi Babes welcome here");
        String s3 = new String("Hi Babes welcome here");
//        String[] splittedstring = s.split(" ");    // Split the String on the basis of space in string
//        System.out.println(splittedstring[0]);
//        System.out.println(splittedstring[1]);
//        System.out.println(splittedstring[2]);


        String[] splittedstring = s.split("mubeen");    // Split the String on the basis of space in string
        System.out.println(splittedstring[0]);
        System.out.println(splittedstring[1]);
       // System.out.println(splittedstring[2]);
        System.out.println(splittedstring[1].trim()); // Trim is basically used to remove the spaces from the start


//        for (int i =0; i<=s.length();i++) // If we want to show a string character by character
//    {
//        System.out.println(s.charAt(i));
//    }
        for (int i =s.length()-1;i>=0; i--) // If we want to  display the Reverse character by character
        {
            System.out.println(s.charAt(i));
        }

    }
}
