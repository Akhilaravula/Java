package ProgramPractice01;

import java.util.HashSet;
import java.util.Set;

import java.lang.String.*;

public class StringFunctions {

    public void comparestring()
    {
        String compareStr1 = "Akhila";
        String compareStr2 = "AkhilA";
        int result = compareStr1.compareToIgnoreCase(compareStr2);
        if(result==0) {
            System.out.println("String is matched");
        }
        else
        {
            System.out.println("String is not matched");
        }
        }

     public void concatstring()
     {
         String concatStr1 = "Akhila";
         String concatStr2 = " Reddy";
         String result = concatStr1.concat(concatStr2);
         System.out.println(result);
     }
    public void formatString()
    {
        String input = "AkiL";
        String result = String.format(input,"AkiL");
        System.out.println(result);
    }
    public void regexString()
    {
        String input = "Aki@L1";
        boolean result = input.matches("AKi@L1");
        System.out.println(result);

    }
    public void nonrepeatedch(){
        String word = "george";
        char temp;
        int count =0;
        String dup=" ";
        char[] ch  = word.toCharArray();
        for(int i=0;i<word.length();i++){
            temp= ch[i];
            if(dup.contains(temp+"")){
                continue;
            }
              dup = dup+temp;
            count = 1;
            for(int j= i+1;j<word.length();j++){
                if(temp == ch[j]) {
                    count = count+1;

                }
            }
            System.out.println(ch[i]);
        }

    }
    public void removeduplicates(){
        String input = "Java is a program and Java is not a fun";
        String result="";
        Set<String> wordSet = new HashSet<>();
        String words[] = input.split("\\s+");
        for(String word: words){
            if(!wordSet.contains(word)){
                wordSet.add(word);
                result= result+" "+word;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args)
    {
        StringFunctions sf = new StringFunctions();
        sf.comparestring();
        sf.concatstring();
        sf.formatString();
        sf.regexString();
        sf.nonrepeatedch();
        sf.removeduplicates();
    }



}

