package gr.aueb.cf.ch16;

public class SpeakingSchoolDemo {
    public static void main(String[] args) {
        ISpeakable whiteCat = new Cat("White");
        ISpeakable blackDog = new Dog("Black");

        //Wiring based on DI IoC  (Dependency Injection) ή
        //αλλιώς IoC (Inversion of Control)
        var genericSpeakingSchool = new GenericSpeakingSchool(whiteCat);// to var είναι η κλαση που βλέπει δεξια
        var genericSpeakingSchool1 = new GenericSpeakingSchool(blackDog); //ειναι τα ιδια var kai GenericSpeakingSchool

        }
    }

