package gr.aueb.cf.ch16.def;

public class Main {

    public static void main(String[] args) {
        IWelcome welcomeCf = new CodingFactory();
        welcomeCf.sayHelloCodingFactory();
    }
}
