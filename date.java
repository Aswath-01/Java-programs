package javaprograms;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CalendarFields {
    public static void main(String[] args) {
        Scanner ic = new Scanner(System.in);
         System.out.print("Enter year: ");
        int year = ic.nextInt();
         System.out.print("Enter month (1-12): ");
        int month = ic.nextInt();
        System.out.print("Enter day: ");
        int day = ic.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year + 4);
        cal.set(Calendar.MONTH, month -1);
        cal.set(Calendar.DATE, day);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(cal.getTime());
        
        System.out.println("Formatted Date (with +4 years): " + formattedDate);
        
        ic.close();
    }
}
