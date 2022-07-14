import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {
    public static void main(String[]args)
    {
          getDay();
    }

    public static void getDay( )
    {

        Scanner cal = new Scanner(System.in);
        System.out.println("Enter the date ,month and year ");
        System.out.println("Enter the date ");
        int  dd = cal.nextInt();
        cal.nextLine();
        System.out.println("Enter the month ");
        int mm = cal.nextInt();
        System.out.println("Enter the year ");
        int yy = cal.nextLine();
        LocalDate dt = LocalDate.of(yy, mm, dd);
        System.out.print(dt.getDayOfWeek());



    }
}
