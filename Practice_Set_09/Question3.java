package Day_11.Practice_Set_9;
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String email = sc.next();
        String userName = "";


        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }


        System.out.println(userName);
    }
}
