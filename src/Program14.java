/*  abstract class   Vehicle {


    abstract void test();


}

class B extends  Vehicle
{

           public void method(){
      System.out.println("first method");

  }
           public void test()
    {
        System.out.println("second method");
    }
    public static void main(String[] args) {

      Vehicle b = new B();
       b.test();



    }
}
*/

interface Flying {
    void fly();
}

interface Swimming {
    void swim();
}

class Bird implements Flying {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Fish implements Swimming {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

class Duck implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class Program14
{

    public static void main(String[] args) {
        Flying bird = new Bird();
        Fish fish = new Fish();
        Duck duck = new Duck();

        bird.fly();  // Output: Bird is flying
        fish.swim(); // Output: Fish is swimming
        duck.fly();  // Output: Duck is flying
        duck.swim(); // Output: Duck is swimming
    }
}



