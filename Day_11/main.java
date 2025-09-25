package Day_11;
import java.util.*;
public class main {
    public static void main(String[] args) {
        //Declaration
        //String name = "Tony";
        String sentence = "My name is shreya";
        System.out.println(sentence);

        //Taking Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();     // reads full line as name
        String sentences = sc.nextLine(); // reads another full line
        System.out.println(name);
        System.out.println(sentences);

        //Concatenation (Joining 2 strings)
        String firstName = "Tony";
        String secondName = "Stark";
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);

        //Print length of a String
        System.out.println(fullName.length());

        //Access characters of a string
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        //Compare 2 strings
        //CompareTo
        //1. s1 > s2 : +ve value
        //2. s1 == s2 : 0
        //3. s1 < s2 : _ve value
        String name1 = "Tony";
        String name2 = "Tony";

        if(name1.compareTo(name2) ==0 ) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        //equals
        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        //DO NOT USE == to check for string equality
        //Gives correct answer here
        if(name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        //Gives incorrect answer here
        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
        //------------------------------------------------------------------

        //Substring
        System.out.println(name.substring(0, 4));

        //ParseInt Method of Integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //ToString Method of String class
        System.out.println(str.length());
    }
}
