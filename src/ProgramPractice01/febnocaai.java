package ProgramPractice01;

public class febnocaai {

    public static void main(String[] args)
    {
        int[] number = new int[10];
         number[0] = 5;
        number[1]= 7;
        System.out.println(number[0]+ " "+number[1]);
         for(int i =2; i<10;i++)
         {
             number[i]= number[0]+number[1];
             number[0] = number[1];
             number[1]=  number[i];
             System.out.println(number[i]);

         }


    }
}
