package src01;

import java.nio.file.Files;

public class carplate {
    public static void main(String[] args) {
        int n= 121;
        int rev=0;
        int reminder;
        for(int i = 0; n!=0; i++)
        {
            reminder = n%10;
            rev =  (rev*10) + reminder;
            n= n/10;

        }
        System.out.println(rev);
    }

}
