package gr.aueb.cf.ch17.Knight;

public class Main {

    public static void main(String[] args) {
        IKnight joa = new Knight();
        IKnight saintGeorge = new Knight();


        joa.embarkOnMission(Main::saveThePrincess);
        saintGeorge.embarkOnMission(Main::killTheDragon);//:: τελεστης εμβέλιασ

        //lamdas
        /*joa.embarkOnMission(() ->System.out.println("Save the princess"));
        saintGeorge.embarkOnMission(() -> killTheDragon());*/

        //anonymous
       /* joa.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save the princess");
            }
        });

        saintGeorge.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                killTheDragon();
            }
        });*/
    }

    public static void killTheDragon() {
        System.out.println("Kill the Dragon");
    }
    public static void saveThePrincess(){
        System.out.println("Save the princess");
    }
}
