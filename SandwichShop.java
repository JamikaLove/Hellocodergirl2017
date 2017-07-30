import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        //Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        
        //Your code goes below here.
        int veggiesSold;
        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies +"");
        out.print("How many veggie sandwiches were sold today?");
        veggiesSold = keyboard.nextInt();
        if (veggiesSold >= goalForVeggies) {
          out.println("Made goal");
        } else {
          out.println("Fell short");
        }
        
        int burgersSold;
        out.println("The sales goal for burgers is " + goalForBurgers +"");
        out.print("How many burgers were sold today?");
        burgersSold = keyboard.nextInt();
        if (burgersSold >= goalForBurgers) {
          out.println("Made goal");
        } else {
          out.println("Fell short");
        }
        int subsSold;
        out.println("The sales goal for subs is " + goalForSubs +"");
        out.print("How many subs were sold today?");
        subsSold = keyboard.nextInt();
        if (subsSold >= goalForSubs) {
          out.println("Made goal");
        } else {
            out.println("Fell short");
        }
        int soupsSold;
        out.println("The sales goal for soup is " + goalForSoup +"");
        out.print("How many soups were sold today?");
        soupsSold = keyboard.nextInt();
        if (soupsSold >= goalForSoup) {
          out.println("Made goal");
        } else {
           out.println("Fell short");
        }
        if (veggiesSold >= goalForVeggies && burgersSold >= goalForBurgers && subsSold >= goalForSubs && soupsSold >=goalForSoup) {
          out.println("Made goal for everything!");
        }
    }
}
    
