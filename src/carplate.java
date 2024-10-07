import java.util.Scanner;

public class carplate
{
    public static void main(String[] args) {
        int n;
        int temp;
        int sum =0;
        int[] integ = new int[4];
        int[] integ1 = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        for(int i=0;n>0;i++)
        {
            temp = n%10;
            integ[i]= temp;
            n= n/10;

        }
        for(int i=0;i< integ.length;i++) {

            sum = sum+integ[i];

        }
        System.out.println(sum);




    }


}
