class Program0 {
    public static void main(String[] args) {
        String str = "AkaKKAAaaila";
        //String str2 = str.toLowerCase();
        char[] ArrName = str.toCharArray();
         int count= 1;
         String store = new String();
         String withoutduplicate = "";

            for (int i = 0; i<str.length(); i++) {
                char temp = ArrName[i];

                if(store.contains(temp+"")|| (store.toLowerCase()).contains(temp+""))
                {
                    continue;
                }

                store= store+temp;




                count =1;
            for (int j = i + 1; j < str.length(); j++)
            {
                 String temp1 = temp+"";
                 String temp2 = ArrName[j]+"";
                if (temp1.equalsIgnoreCase(temp2)) {
                    count = count+1;



                }

            }

            if(count>1) {
                System.out.println("character" + " " + ArrName[i] + "= " + count);





            }
            if(!withoutduplicate.contains(temp+""))
            {
                withoutduplicate= withoutduplicate+temp;
}


            /* if(count==1 )
            {
                withoutduplicate = withoutduplicate+temp;

            }
            count =1;*/



        }
        System.out.println(withoutduplicate);





    }
}
