import  java.lang.StringBuilder;

class StringBuilder1 {
    public static void main(String args[]) {
        System.out.println("StringBuilder append() method");
       StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");//now original string is changed      It will append the string
        System.out.println(sb);//prints Hello Java

        System.out.println("StringBuilder insert() method");
        StringBuilder sb1 = new StringBuilder("HelloThisisMubbeen ");
        sb1.insert(5, "Java");//now original string is changed       it will insert into the mid of the string
        System.out.println(sb1);//prints HJavaello


        System.out.println("StringBuilder Replace() method");
        StringBuilder sb3=new StringBuilder("ABCDEFGHIJKLMNOP");
        sb3.replace(2,2,"ZZZ"); //it will replace the value with the selected indexes
        System.out.println(sb3);//prints Java




        System.out.println("StringBuilder delete() method");
        StringBuilder sb4=new StringBuilder("Hello");
        sb4.delete(1,3); //it will delete the value with the selected indexes
        System.out.println(sb4);//prints Hlo

        System.out.println("StringBuilder Reverse() method");

        StringBuilder sb5=new StringBuilder("I Am mubeen");
        sb5.reverse();
        System.out.println(sb5);//prints olleH



        // StringBuilder capacity() method
        StringBuilder sb6=new StringBuilder();
        System.out.println(sb6.capacity());//default 16
        sb6.append("Hello");
        System.out.println(sb6.capacity());//now 16
        sb6.append("Java is my favourite language");
        System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2

    }


}
