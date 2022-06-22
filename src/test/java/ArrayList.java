import java.util.ArrayList;
import java.util.Collections;

class Main {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("ABC");
        cars.add("DEF");
        cars.add("GHI");
        cars.add("KLM");
        cars.add("NOP");
        cars.add("QRS");
        cars.add("TUV");
        cars.add("WXY");
        cars.add("AZAB");
        cars.add("CDE");
        cars.add("FGHI");
        cars.add("JKLMN");
        cars.remove(2); // To remove the value from the Arraylist
        Collections.sort(cars); // To sort the values in the array
        System.out.println(cars);
//        {
//        cars.removeIf(n -> (n.charAt(0) == 'A'));
//
//        System.out.println("Students name Does not start with S");       ////// We can remove the elements by using REMOVEIF conndition in the arraylist

//        for (String str : cars) {
//            System.out.println(str);
//
//        }}
        System.out.println(cars);
        System.out.println(cars.get(0)); // Get method(IN this it will get the selected index data)
       cars.set(1 ,"NEWElement" ); // Set method in the Arraylist(In this it will set the value against the given index)
        System.out.println(cars.get(1)); // To display the value of the specfic index
        System.out.println(cars); // To display all the values in the array
        System.out.println(cars.size()); // to check the size of array and it will not considered removed element from the array. like if we remove a value and then print it will display actual size of array
       cars.clear();           // IN clear method it will clears all the values from the array
        System.out.println(cars); // it will display the empty array
        System.out.println(cars.size()); // It will display the size of the array

    //    cars.removeIf(cars[1] == )
//       System.out.println(cars.get(7)); // To get the value from the Arraylist
//            for (int i = 0; i < cars.size(); i++) {
//                System.out.println(cars.get(i));
//      }
       }
    }

