import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTablesGrid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Welcome to Multiplication Tables!");
        System.out.println("How large would you like to see them? ");
        size = input.nextInt();
        printMultiplicationTable(size);
    }
    public static void printMultiplicationTable(int size)
    {
        if (size <= 20)
        {
            System.out.format("      ");
            for(int a = 0; a<=size;a++ )
            {
                System.out.format("%4d",a);
            }
            System.out.println();
        
            for(int a = 0 ;a<=size;a++) 
            {
                System.out.format("%4d |",a);
                for(int b=0;b<=size;b++) 
                {
                    System.out.format("%4d",a*b);
                }
                System.out.println();
            }
        }
    }
}


        