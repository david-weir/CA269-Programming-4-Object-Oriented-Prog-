import java.util.Scanner;

public class SumNumber
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int end = in.nextInt();

        int total=0;
        for(int i=1; i<end+1; i++)
        {
            total = total + i;
        }

        System.out.println("The sum of the numbers from 1 to " + end + " is " + total);


    }
}
