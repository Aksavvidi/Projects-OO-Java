package gr.aueb.cf.ch16.abst;

public class Cat extends Animal {

    //Should be overridden
    @Override
    public void speak() {
        System.out.println("Νιάου");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... she ate all her food!");
    }
}
