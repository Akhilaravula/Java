package ProgramPractice01;

public class Printnumber {
    public static void main(String[] args)
    {
        //10=1+9=2+7=3+4
        int n= 1234;
        int org = n;
        int output=0;
        for(int i=1;n!=0;i++){
            output = output+n%10;
            n= n/10;
        }
        System.out.println(output);
    }
}
