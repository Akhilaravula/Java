public class Program3 {

    public static void main(String[] args) {
        String str = "Aahila";
        char[] ArrayName = str.toCharArray();
        String withoutduplication ="";
        int count =1;
        String store= new String();

        for(int i=0;i<str.length();i++) {

            char temp = ArrayName[i];

            if(store.contains(temp+"")||(store.toLowerCase().contains(temp+"")) ) {
                continue;
            }
            store = store+temp+"";
            System.out.println(store);
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                String str1 = ArrayName[j]+"";
                String str2 = temp+"";
                if (str1.equalsIgnoreCase(str2)) {

                    count = count + 1;


                }


            }

            if (count > 1) {
                System.out.println(count);
            }


            if (!withoutduplication.contains(temp + "")) {
                withoutduplication = withoutduplication + temp;
            }

        }
        System.out.println(withoutduplication);













    }

}
