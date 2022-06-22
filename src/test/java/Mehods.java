public class Mehods {
    public static void main(String[] args) {
//Mehods d = new Mehods();
Mehods m = new Mehods();  // Making an object to call the simple function
//d.getdata(); // If we simply call the VOID method via object it will not return anything
        System.out.println(m.getdata());
        getdata2(); // We can call the static method without decaliring an object. here we are calling second method without object

    }
    public String getdata()
    {
        System.out.println("THis is my first value");
        System.out.println("THis is my Second value");
        System.out.println("THis is my third value");
        return "Hi This is my string value";        /// It will return a string if we declare a puclic mehtod as String
    }
    public static void getdata2()
    {
        System.out.println("THis is my Mubeen value");
        System.out.println("THis is my Mubeen value");
        System.out.println("THis is my Mubeen value");

    }
}
