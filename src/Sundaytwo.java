public class Sundaytwo {
    public static void main(String[] args) {
        String name = "akhaaaila";
        char[] Arrayname = name.toCharArray();
        int count = 1;
        char temp;
        String store = "";

        String duplicate = "";
        for (int i = 0; i < name.length(); i++) {
            temp = Arrayname[i];
            count = 1;
            if(store.contains(temp+""))
            {
                continue;
            }

            store = temp+store;



            for (int j = i + 1; j < name.length(); j++) {

                if (temp == Arrayname[j]) {
                    count = count + 1;


                }

            }

            if (count > 1) {
                System.out.println(count);


            }

           if (!duplicate.contains(temp+""))
            {
            duplicate = duplicate+temp;


            }


        }
        System.out.println(duplicate);
    }
}