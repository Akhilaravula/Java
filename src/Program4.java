import java.util.HashSet;

public class Program4 {

    public static void main(String[] args) {

        String str = "akhila";
        char[] Arrayname = str.toCharArray();
        HashSet h = new HashSet();
        for(int i =0;i<str.length();i++){
            char temp = Arrayname[i];
             h.add(temp);

        }
        System.out.println(h);
    }
}
