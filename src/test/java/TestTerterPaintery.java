import  java.lang.StringBuilder;

public class TestTerterPaintery {

    public static void main(String[] args) {
//        String test="@$PRICE_SCALE";
//    //    output= price scale
//        String test2=test.toLowerCase();
//        StringBuilder sb4=new StringBuilder(test2);
//        // test.toLowerCase();
//        sb4.delete(0,2); //it will delete the value with the selected indexes
//        sb4.delete(5,6); //it will delete the value with the selected indexes
//        sb4.replace(5,5," "); //it will replace the value with the selected indexes

// Removed Test

//        String test1=test.replace("@","");
//        String test2=test1.replace("$","");
//        String test3=test2.replace("_"," ");
//test3.toLowerCase();

//        //System.out.println(sb4); //prints Hlo
//        String test="@$PRICE_SCALE";
//        //scale
//        String test1= test.toLowerCase();
//        //StringBuilder sb4=new StringBuilder(test1);
//        //sb4.delete(0,8);
//        //System.out.println(sb4);
//        //
//        String test3=test1.replace("@$price_","");
//        System.out.println(test3);



        String test="Mubeen is very good person and he is good in programming";
        String s= "and";
        StringBuilder sb5=new StringBuilder(s);
        StringBuilder sb4=new StringBuilder(test);
        if(test.contains("and"))
        {
            System.out.println("cvfghjkb");
           // sb5.compareTo()
        }

       // System.out.println(sb5.compareTo(sb4) + "cvb");
       // System.out.println(sb5.equals(sb4) + "cvb");
       // sb5.equals()


        /////
        String s12 = "This is a sample sentence.";
        String[] words = s12.split(" ");
        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            if(words[i]!="sample"){
                System.out.println(words[i]);

            }
          //  words[i] = words[i].replaceAll();
        }

    }
}
