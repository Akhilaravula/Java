package ProgramPractice01;

public class regex {

    public static boolean isvalidString(String s) {
            if(s.length()>3){
                return false;
            }

        boolean hasupper = false;
        boolean haslower = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)) {
                hasupper = true;
            }
                else if(Character.isLowerCase(c))
            {
                haslower = true;
            }
        }
         return hasupper && haslower;
    }

    public static void main(String[] args){
        System.out.println(isvalidString("T3p"));
    }

}
