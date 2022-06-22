public class JAVATPointPractice {
    public static void main(String[] args) {
        //In This program we will see Endswith, contains methods  with the object
        String address = "Meerut, India";

        if(address.endsWith("India")) { // It will check the Address string if it ends with India then it will execute this 'if'
            if(address.contains("Meerut")) {
                System.out.println("Your city is Meerut");
            }else if(address.contains("Noida")) {
                System.out.println("Your city is Noida");
            }else {
                System.out.println(address.split(",")[0]);
            }
        }else {
            System.out.println("You are not living in India");


    }
    }
}
