abstract class Animal {
    public  String str2 = "First";
    public abstract void method1();

    void method() {
        System.out.println(str2);
    }
}
   class Plant extends Animal {


        public  void method1() {
            System.out.println("override");
        }

        public static void main(String[] args) {


           Plant p = new Plant();
            p.method1();
            p.method();
        }
    }