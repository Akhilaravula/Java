package ProgramPractice01;

public class reverseNumbers {
    public static void main(String[] args)
    {
        int number = 121;
        int res=0;
        int n= number;
        int s;
        for(int i=1;number!=0;i++){
            s= number%10;
            res = res*10+s;
            number = number/10;
        }
        System.out.println(res);
        System.out.println(n);

        if(number == res){
            System.out.println("Palindrome number");

        }
        else
            System.out.println("No");


    }
}
