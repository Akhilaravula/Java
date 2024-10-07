public class Sundaythree {

    public static void main(String[] args)
    {
         String vowels1 = "aeiou";
         String name = "akhila";
        char[] arrayname = name.toCharArray();
         char temp;
         int count =0;
         for(int i=0; i<name.length();i++)
         {
             temp = arrayname[i];
             if(vowels1.contains(temp+""))
                     {
                        count = count + 1;


                     }

             }

             System.out.println(count);

    }
}
