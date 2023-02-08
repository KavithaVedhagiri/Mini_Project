import java.util.Scanner;
class PasswordException extends Exception {

    public PasswordException(String pwd) {
          super(pwd);

    }
}
 public class Password {


     public static void main(String[] args) throws PasswordException {

             Scanner in = new Scanner(System.in);
             String user, password;
             System.out.println("Enter User Name");
             user = in.nextLine();
             System.out.println("Password");
             password = in.nextLine();
             boolean valid = false;

             if ((password.length() > 15 || password.length() < 8)) {
                 {
                     valid = false;
                     throw new PasswordException("Character Should be >=8 or <=15");

                 }
             } else {

                 for (int i = 0; i < password.length(); i++) {
                     char pass = password.charAt(i);

                     if ((pass >= 97 || pass <= 122) && (pass >= 65 || pass <= 90) && (pass >= 48 || pass <= 57) && (pass >= 33 || pass <= 46)) {
                         valid = true;
                     } else {
                         valid = false;
                         throw new PasswordException("Passwor should contain atleast one upper case letter one special character one number one lower case letter");
                     }

                         if (valid == true) {
                             System.out.println("Password accepted");
                             break;
                         }
                     }
                 }
             }
         }