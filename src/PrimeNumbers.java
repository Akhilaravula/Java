import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args)
    {
        int[] integer = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        for(int i=1;i<n;i++)
        {
            if(i%2==0){

                System.out.println("Even Numbers are "+ ":" +i);

            }

        }
        for(int j=1;j<n;j++)
        {
            if(j%2!=0)
            {
                System.out.println("Odd Numbers are "+ ":" +j);
            }
        }


    }
}
