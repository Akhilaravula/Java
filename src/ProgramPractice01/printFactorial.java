package ProgramPractice01;

public class printFactorial {

    public static void main(String[] args){
        int n= 5;
        int fact = 5;
        for(int i =1;n>i;i++) {
            fact = fact * (n - i);


        }
        System.out.println(fact);
        int den = 3;
        int fden = 3-1;
        int fact2= fden;
        for(int i=1;fden>i;i++) {
            fact2 = fact2 * (fden - i);
        }
        System.out.println(fact2);
        System.out.println(fact/fact2);
    }
}
