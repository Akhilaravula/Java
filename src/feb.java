import java.sql.Array;

public class feb {
    public static void main(String[] args) {


        int[] num = new int[10];
        num[0] = 5;
        num[1] = 7;


        int count=10;

        System.out.println(num[0] +" "+num[1]);
        for(int i=2;i< num.length;i=i+1)
            {
               num[i] = num[0]+num[1];
                System.out.println(""+num[i]);
                num[0] = num[1];
                num[1] = num[i];

                }


            }








    }



