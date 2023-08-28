package gr.aueb.cf.ch16;

/**
 * A place where cats learn to speak.
 */
public class GenericSpeakingSchool {
    private final ISpeakable speakable;

    public GenericSpeakingSchool(ISpeakable speakable) {
        this.speakable = speakable;
    }

    public void learnToSpeak(){
       speakable.speak();
        // cat.speak();
    }
}

//public class SpeakingSchool {
// private final Cat cat = new Cat(); //private instance τησ κλάσης Cat
//public SpeakingSchool () { }
//public void learnToSpeak(){
// cat.speak(); } εδω ειναι tightly couple