import java.util.Scanner;

public class chandfac {
    public static void main(String[] args){

        int n;
        int r;

       int fact;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");

        n  = sc.nextInt();
        double temp =n;
        System.out.println(n);
        for(int i=1; i<n;i++)
        {
            fact = n-i;
            temp = fact*temp;

        }
        System.out.println(temp);




    }
}
