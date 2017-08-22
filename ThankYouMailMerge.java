import static java.lang.System.out;
import java.util.Scanner;

public class ThankYouMailMerge
{
public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        String firstName = "";
        String lastName = "";
        String fullName = firstName + lastName;
        fullName = "";
        String amountDonated = "";
        
        while (keepGoing)
        {
            
            System.out.print("Please enter a donor's full name.");
            fullName = keyboard.next();
            if (!fullName.equals("quit") || fullName.equals(firstName + lastName))
            {
            System.out.print("Please enter the amount of the donation.");
            amountDonated = keyboard.next();
            }
            if (!fullName.equals("quit") || fullName.equals(firstName + lastName))
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
