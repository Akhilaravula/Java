package ProgramPractice01;

public class FirstPage {


     public static String displayMSG1(String browser)
     {
         if(browser.equalsIgnoreCase("chrome")) {
             System.out.println("This is chrome browser");
         }
             else if(browser.equalsIgnoreCase("Edge")){
                 System.out.println("This is Edge browser");

         }
         return  browser;
     }


}
