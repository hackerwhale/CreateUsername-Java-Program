import java.util.*;
 
public class CreateUsername {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.println();
     System.out.println("Enter your email address:  ");
     String email = sc.next();
     String userName = "";
 
     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }
     System.out.println();
     System.out.println("****************************************");
     System.out.println("Here's your generated username:  ");
     System.out.println(userName);
   }
}
