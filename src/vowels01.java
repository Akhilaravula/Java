public class vowels01 {

    public static void main(String[] args) {

        String vowels = "AEIou";
        String name = "AKHila";
        char[] vowels1 = vowels.toCharArray();
        char[] Arrayname = name.toCharArray();
        String store = "";
        int count = 1;

        for (int i = 0; i < name.length(); i++) {

            char temp = Arrayname[i];

            if (store.contains(temp + "") || (store.toLowerCase()).contains(temp + "")) {
                continue;
            }
            store = store + temp + "";

            count = 1;
            for (int j = i + 1; j < name.length(); j++) {
                String str1 = Arrayname[j] + "";
                String str2 = temp + "";
                if (str1.equalsIgnoreCase(str2)) {

                    count = count + 1;
                }

            }

            if (Arrayname[i] == 'A' || Arrayname[i] == 'e' || Arrayname[i] == 'i' || Arrayname[i] == 'o' || Arrayname[i] == 'u')  {
                System.out.println(Arrayname[i] + ":" + count);

            }



        }
    }
}
