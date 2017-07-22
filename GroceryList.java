import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String ItemName;
        String ItemNameTwo;
        String ItemNameThree;
        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1?");
        ItemName = keyboard.nextLine();
        out.print("Item 2?");
        ItemNameTwo = keyboard.nextLine();
        out.print("Item 3?");
        ItemNameThree = keyboard.nextLine();
        int ItemQuantity;
        int ItemQuantityTwo;
        int ItemQuantityThree;
        out.println("Now please enter the quantity of each item.");
        out.print("How many " + ItemName + " ?");
        ItemQuantity = keyboard.nextInt();
        out.print("How many " + ItemNameTwo +" ?");
        ItemQuantityTwo = keyboard.nextInt();
        out.print("How many " + ItemNameThree +" ?");
        ItemQuantityThree = keyboard.nextInt();
        float ItemPrice;
        float ItemPriceTwo;
        float ItemPriceThree;
        out.println("Now please enter the price of each item.");
        out.print("How much does one " + ItemName + " cost?");
        ItemPrice = keyboard.nextFloat();
        out.print("How much does one " + ItemNameTwo + " cost?");
        ItemPriceTwo = keyboard.nextFloat();
        out.print("How much does one " + ItemNameThree + " cost?");
        ItemPriceThree = keyboard.nextFloat();
        float totalcost;
        out.println("Calculating your grocery bill.");
        totalcost = (ItemQuantity * ItemPrice) + (ItemQuantityTwo * ItemPriceTwo) + (ItemQuantityThree * ItemPriceThree);
        out.println("Your total cost is " + totalcost + "");
    }
}
        
        
