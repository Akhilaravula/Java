public class reverse {
    public static void main(String[] args) {
        String name = "Akhilahihaaa";
        char ch;
        String rever = "";
        String dup="";
        String test = "";


        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);

            rever = ch + rever;


            if (!dup.toLowerCase().contains(ch+"")) {

                dup = dup+ch;


            }

        }
        System.out.println(dup);


    }
}