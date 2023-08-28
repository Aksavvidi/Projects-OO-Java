package gr.aueb.cf.ch16.multiple;

public class TalkingBook implements ITalkingBook{
    @Override
    public void read() {
        System.out.println("Could be read");
    }

    @Override
    public void speak() {
        System.out.println("Can speak");
    }
}
