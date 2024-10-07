import java.lang.reflect.Array;

public class vowels {

    public static void main(String[] args) {
        String name = " akhila";
        String vowels = "AEiOU";
        char[] Arrayname = name.toCharArray();
        char[] Arrayvowels = vowels.toCharArray();
        String store ="";
        String dup ="";
        String vos = new String();
         int count =0;

             for(int i=0;i<name.length();i++)
             {
                 char temp = Arrayname[i];
                      store = temp+"";

                     if(dup.contains(store)){
                         continue;
                     }
                     dup = dup+store;
                     System.out.println(dup);

                     if(vowels.toLowerCase().contains(store.toLowerCase().toLowerCase()))
                     {

                      count= count+1;
                      vos = store;


                      }




            }










    }
}
