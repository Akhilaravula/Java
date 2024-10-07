package src01;

public class reverse {
    public static void main(String[] args) {
        String name = "MAM";
        char c;
        String pname = "";

        for(int i=0;i<name.length();i++){
            c = name.charAt(i);
            pname = c+pname;

        }
        System.out.println(pname);

    }
}
