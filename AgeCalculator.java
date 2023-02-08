import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        System.out.print("Please enter date of birth in  YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalDate dateofbirth = LocalDate.parse(input);
        LocalDate currendate = LocalDate.now();
        Period period = Period.between(dateofbirth,currendate);
        System.out.println("You Are  "+" "+period.getYears()+" "+"Years:" +" "+period.getMonths()+" "+"Months: " + " "+ period.getDays() +" "+"Days old" );
    }
}

