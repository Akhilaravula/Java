package src01;

public class feb {

    public static void main(String[] args) {

        int first = 5;
        int sec= 7;
        int sum=0;
        int output=0;
        System.out.println(first+ + sec);
        for(int i=0;i<10;i++)
        {

            sum = first+sec;
            first = sec;
            sec= sum;

            System.out.println(sum);

        }


    }
}
