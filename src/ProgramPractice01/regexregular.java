// Java Program to check on Regex
import java.io.*;
import java.util.regex.*;

// Driver class
class regexregular {
    // Main function
    public static void main(String[] args)
    {
        // Checks if the string matches with the regex
        String regex = "^(?=.*[0-9])" + "([a-z])(?=.*[A-Z])" + "(?=.*['@+*&%$#!])" + "(?=\\S+$).{3,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("Paperwork@56789");
        System.out.println(m.matches());

    }
}

