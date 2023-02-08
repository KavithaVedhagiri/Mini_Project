import java.util.Scanner;
public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int count = 1;
        while (count <= 3) {
            System.out.println("Enter credit/debit card number : ");
            String number = obj.next();
            int length = number.length();

            if (length == 15) {
                if ((number.startsWith("34")) || (number.startsWith("37"))) {
                    System.out.println("American Express");
                } else if ((number.startsWith("2123")) || (number.startsWith("1800"))) {
                    System.out.println("JCB");
                }
            } else if ((length == 13) || (length == 16)) {
                if ((number.startsWith("51")) || (number.startsWith("52")) || (number.startsWith("53")) || (number.startsWith("54")) || (number.startsWith("55"))) {
                    System.out.println("Master Card");
                } else if (number.startsWith("6011")) {
                    System.out.println("Discover");
                } else if (number.startsWith("4")) {
                    System.out.println("Visa card");
                } else if (number.startsWith("3")) {
                    System.out.println("JCB");
                }
            } else if (length == 14) {
                if ((number.startsWith("36")) || (number.startsWith("38")) || (number.startsWith("300")) || (number.startsWith("301")) || (number.startsWith("302")) || (number.startsWith("303")) || (number.startsWith("304")) || (number.startsWith("305"))) {
                    System.out.println("Diners Club & Carte Blanche");
                }
            } else {
                System.out.println("Invalid credit/debit card number");
            }
            char ch[] = number.toCharArray();
            int incre[] = new int[ch.length / 2];
            int remain[] = new int[incre.length];
            int j = 0;
            for (int i = ch.length - 2; i >= 0; i -= 2) {
                incre[j] = (ch[i] - 0) * 2;
                j++;
            }
            int k = 0;
            for (int i = 1; i < ch.length; i += 2) {
                remain[k] = ch[i] - 0;
                k++;
            }
            int sumof = 0;
            for (int i = 0; i < incre.length; i++) {
                int remainder = incre[i] % 10;
                int quotient = incre[i] / 10;
                sumof += quotient + remainder;
            }
            int sum = 0;
            for (int i = 0; i < remain.length; i++) {
                sum += remain[i];
            }
            int result = sumof + sum;
            if (result % 10 == 0) {
                System.out.println("Given card number is valid");
                break;
            }
            else {
                System.out.println("Given card number is not valid");
                count++;
            }
            }
        if(count==4){
            System.out.println("Max attempt is exceeded");
        }

    }
}

