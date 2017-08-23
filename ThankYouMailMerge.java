import static java.lang.System.out;
import java.util.Scanner;

public class ThankYouMailMerge
{
public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        String fullName = "";
        String amountDonated = "";
        
        System.out.println("Thank You Notes");
        while (keepGoing)
        {
            
            System.out.print("Please enter a donor's full name.");
            fullName = keyboard.nextLine();
            if (!fullName.equals("quit"))
            {
            System.out.print("Please enter the amount of the donation.");
            amountDonated = keyboard.nextLine();
            }
            if (!fullName.equals("quit"))
            {
            keepGoing = true;
            System.out.println("Dear "+ fullName + "");
            System.out.println("Thank you for your donation! We rely on donors like you to keep");
            System.out.println("our organization effective, and you came through for us");
            System.out.println("Your donation of $ " + amountDonated + " will help our");
            System.out.print("efforts to make a difference in the world.\n");
            System.out.println("As you may know, we are a registered non-profit organization,");
            System.out.print("so your donation is tax deductible. You may use this letter as a receipt");
            System.out.println("for tax purposes.\n");
            System.out.println("Thank You again for your support!\n");
            System.out.println("Sincerely\n");
            System.out.println("Paula Jones\n");
            System.out.println("YourCharity.org");
            }
            if (fullName.equals("quit"))
            {
                keepGoing = false;
            }
            
            
        }
    }
}
