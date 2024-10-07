package src01;

public class stringname {

    public static void main(String[] args) {

        String name = "aKHila";
        String capname = name.toLowerCase();
        String vowels = "aEIou";
        String capvowels = vowels.toLowerCase();
        char[] sname = capname.toCharArray();
        char [] svowels = vowels.toCharArray();
        char itemp;
        String dup ="";
        int count =1;
        for(int i=0;i<name.length();i++){
            itemp = sname[i];
            if(dup.contains(itemp+""))
            {
                continue;
            }
            dup = itemp+dup;
            count =1;
            for(int j=i+1; j<name.length(); j++)
            {
                if(itemp==sname[j]) {
                    count = count + 1;
                }

                }
           // System.out.println("count of" + " " + sname[i] + "=" + count);

            if(sname[i]=='a' || sname[i]=='e' || sname[i]=='i' || sname[i]=='o' || sname[i]=='u')
            {
                System.out.println("count of" + " " + sname[i] + "=" + count);
            }

            }




    }
}
