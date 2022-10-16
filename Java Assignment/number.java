import java.util.Scanner;
public class number {
    public static void main(String[] args)
    {
        System.out.printf("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        System.out.println("The natural numbers are :");
        for (int i = 0; i <= val; i++)
        {
            if(i%2 == 1)
            {
                System.out.println(i);
            }
        }
        s.close();
    }
}
