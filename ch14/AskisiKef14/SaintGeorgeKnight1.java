package gr.aueb.cf.ch14.AskisiKef14;

/**
 * Defines a Singleton SaintGeorgeKnight
 */

public class SaintGeorgeKnight1 {
    private static final SaintGeorgeKnight1 INSTANCE = new SaintGeorgeKnight1();

    private SaintGeorgeKnight1() {}

    public static SaintGeorgeKnight1 embarkOnMission1() {
        return  INSTANCE;
    }

}
