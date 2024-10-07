package ProgramPractice01;

public class constcall {
    int a=1; int b=3;
    public constcall( ){

    }
    public constcall(int a,int b){
        this.a= a;
        this.b =b;
    }
    public void display()
    {

        //System.out.println(c + d);
        System.out.println(a + b);
    }
    public void display1()
    {

        //System.out.println(c + d);
        System.out.println(a + b);
    }

    public static void main(String[] args){
        constcall c = new constcall();
        constcall c1 = new constcall(2,4);
        c.display();
        c1.display1();
        //c1.display();


    }

}
