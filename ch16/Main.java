package gr.aueb.cf.ch16;

public class Main {

    public static void main(String[] args) {
        ISpeakable alice = new Cat("Alice");
        ISpeakable bob = new Dog("Bob");

//        alice.speak();
//        bob.speak(); //αντι για αυτο

        doSpeak(alice);
        doSpeak(bob);
    }

    public static void doSpeak (ISpeakable speakable) {
        speakable.speak();
    }
}
