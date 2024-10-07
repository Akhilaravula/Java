package ProgramPractice01;

public class reverseString {
    public static void main(String[] args){

        String name = "Mam";
        String lowname = name.toLowerCase();
        String temp = "";

        for(int i=0;i<lowname.length();i++)
        {
            temp = lowname.charAt(i)+ temp;
        }
        System.out.println(temp);

        if(lowname.equals(temp))
        {
            System.out.println("Given String is a Palindrome");
        }
        else{
            System.out.println("Given String is not a Palindrome");
        }
    }
}
