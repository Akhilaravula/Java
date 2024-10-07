import java.util.Scanner;

public class permut {



    public static void main(String[] args)
    {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value");
        System.out.println(" Enter the R value");
        n = sc.nextInt();
        int r = sc.nextInt();
        int temp = n;
        int fact;
        //System.out.println(n);
        //System.out.println(r);
        int fin = n-r;
        System.out.println(fin);
        for(int i=1;i<n;i++){
            fact = n-i;
            temp = fact* temp;

        }

        int temp1 = fin;
        for( int i=1;i<fin;i++){
            int fact2 = fin-i;
             temp1 = temp1*fact2;



    }



        int finalanswer = temp/temp1;
        System.out.println(finalanswer);

    }
}
