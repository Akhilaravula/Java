package ProgramPractice01;

import java.util.ArrayList;
import java.util.Locale;

public class prgramVowels {
    public static void main(String[] args) {
        String name = "akhila";
        String casename1 = name.toLowerCase();
        char[] casename = casename1.toCharArray();
        int count = 1;
        char temp;
        String dupstore = " ";
        char[] arrname = name.toCharArray();
        for (int i = 0; i < casename1.length(); i++) {
            temp = arrname[i];
            if(dupstore.contains(temp+""))
            {
                continue;
            }
            dupstore= temp+dupstore;
            count = 1;
            for (int j = i + 1; j < casename1.length(); j++) {
                if(temp == arrname[j]) {
                    count = count + 1;

                }



            }
            /**if(count>=0) {
                System.out.println(arrname[i] + " " + count);
            }*/
            if(casename[i]== 'a' || casename[i] == 'e' ||casename[i] == 'i' || casename[i] == 'o' || casename[i] == 'u')
            {
                System.out.println(casename[i] + " = " + count);

            }

        }

    }
}