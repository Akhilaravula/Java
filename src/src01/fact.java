package src01;

public class fact {

    public static void main(String[] args) {

        int n =5;
        int fact = n;
        int m = n-2;
        int fact2 = m;
        for(int i =1;i<n;i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
        for(int i =1;i<m;i++)
        {
            fact2 = fact2 * i;
        }
        System.out.println(fact2);
        System.out.println(fact/fact2);
    }
}
