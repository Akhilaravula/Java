public class reverse01
{
    public static void main(String[] args){
        int rev=0,org;
        int n= 123;//It is the number variable to be checked for palindrome

        org=n;
        while(n!=0)
        {
           rev = (rev*10)+(n%10);
           n= n/10;

        }
        System.out.println("palindrome number :"+rev);
        System.out.println("palindrome number " +org);

        if(org==rev) {
            System.out.println("palindrome number ");
        }
        else {
            System.out.println("not palindrome");
        }




}
}
