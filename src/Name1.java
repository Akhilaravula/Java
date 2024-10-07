// Program Read and Print an Integer value in Java
import java.util.HashSet;
import java.util.Scanner;

public class Name1 {

    public static void main(String[] args)
    {

        int width, breadth;
        System.out.println("Enter the width: ");
        Scanner s = new Scanner(System.in);
        width = s.nextInt();
        System.out.println("Enter the breadth:");
        breadth = s.nextInt();
        int area= width * breadth;
        System.out.println("area"+ area);


    }


}
