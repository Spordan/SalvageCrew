import java.util.ArrayList;

public class SalvageCrew {

    private SpaceShip ship;
    private CrewMember crew;

    private ArrayList<String> weaponsArray;
    private ArrayList<String> gearArray;
    private int credits;
    private int debt;

    public static void main(String[] args) {
        SalvageCrew sc = new SalvageCrew();
    }

    public SalvageCrew()
    {
        ship = new SpaceShip();
        crew = new CrewMember();

        weaponsArray = new ArrayList<>();
        gearArray = new ArrayList<>();

        System.out.println("=====================\n");
        System.out.println("Welcome to the Five Parsecs Salvage " +
                "Crew Generator!\n");
        System.out.println("=====================\n");
        System.out.println("The crew of " + ship.GetShipName());
        System.out.println("Your ship is " + ship.GetShipCondition().toLowerCase());
        System.out.println("Your crew captain is " + ship.GetCaptainCondition().toLowerCase());

        crew = new CrewMember();
        System.out.println("\nYour first crew member is:");
        System.out.println(crew.toString());

        crew = new CrewMember();
        System.out.println("\nYour second crew member is:");
        System.out.println(crew.toString());

        crew = new CrewMember();
        System.out.println("\nYour third crew member is:");
        System.out.println(crew.toString());

        crew = new CrewMember();
        System.out.println("\nYour fourth crew member is:");
        System.out.println(crew.toString());

        crew = new CrewMember();
        System.out.println("\nYour fifth crew member is:");
        System.out.println(crew.toString());

        crew = new CrewMember();
        System.out.println("\nYour sixth crew member is:");
        System.out.println(crew.toString());

        System.out.println("\nYour debt is: " + (Utils.RollXD6(3)+20));

        
        RollForPersonalWeapons();
        RollForBattleWeapons();
        RollForGear();

        System.out.println("\nYour weapons stash has:" + weaponsArray);
        System.out.println("\nYour gear stash has:" + gearArray);
    }









    /** SORT THIS MESS AND DUPLICATION OUT!! **/
    // TODO: 02/03/2018 fix

    private void RollForPersonalWeapons() {

        for(int i = 0; i < 3; i++) {
            int result = Utils.RollD100();

            if (result >= 1 && result <= 25) {
                this.weaponsArray.add("Hand gun");
            } else if (result >= 26 && result <= 35) {
                this.weaponsArray.add("Hold-out pistol");
            } else if (result >= 36 && result <= 40) {
                this.weaponsArray.add("Hand cannon");
            } else if (result >= 41 && result <= 65) {
                this.weaponsArray.add("Carbine");
            } else if (result >= 66 && result <= 80) {
                this.weaponsArray.add("Shot gun");
            } else if (result >= 81 && result <= 90) {
                this.weaponsArray.add("Blast pistol");
            } else {
                this.weaponsArray.add("Boarding saber");
            }
        }
    }

    private void RollForBattleWeapons() {

        for(int i = 0; i < 1; i++) {
            int result = Utils.RollD100();

            if (result >= 1 && result <= 15) {
                this.weaponsArray.add("Carbine");
            } else if (result >= 16 && result <= 35) {
                this.weaponsArray.add("Rifle");
            } else if (result >= 36 && result <= 45) {
                this.weaponsArray.add("Shotgun");
            } else if (result >= 46 && result <= 55) {
                this.weaponsArray.add("Marksmen's rifle");
            } else if (result >= 56 && result <= 65) {
                this.weaponsArray.add("Auto rifle");
            } else if (result >= 66 && result <= 80) {
                this.weaponsArray.add("Blast rifle");
            } else if (result >= 81 && result <= 85) {
                this.weaponsArray.add("Hand flamer");
            } else if (result >= 86 && result <= 95) {
                this.weaponsArray.add("Ripper sword");
            } else {
                this.weaponsArray.add("Power claw");
            }
        }
    }

    private void RollForGear() {

        for(int i = 0; i < 3; i++) {

            int result = Utils.RollD100();

            if(result >= 1 && result <= 6) {
                this.gearArray.add("Environmental Suit");
            } else if(result >= 7 && result <= 10) {
                this.gearArray.add("Partial armour");
            } else if(result >= 11 && result <= 14) {
                this.gearArray.add("Communicator");
            } else if(result >= 15 && result <= 19) {
                this.gearArray.add("Purifier");
            } else if(result >= 20 && result <= 23) {
                this.gearArray.add("Fixer");
            } else if(result >= 24 && result <= 28) {
                this.gearArray.add("Nano-Doc");
            } else if(result >= 29 && result <= 33) {
                this.gearArray.add("Scanner");
            } else if(result >= 34 && result <= 37) {
                this.gearArray.add("Investment opportunity");
            } else if(result >= 38 && result <= 43) {
                this.gearArray.add("Booster pills");
            } else if(result >= 44 && result <= 48) {
                this.gearArray.add("Gun sight");
            } else if(result >= 49 && result <= 54) {
                this.gearArray.add("Emergency flares");
            } else if(result >= 55 && result <= 59) {
                this.gearArray.add("Screen generator");
            } else if(result >= 60 && result <= 62) {
                this.gearArray.add("Displacer");
            } else if(result >= 63 && result <= 66) {
                this.gearArray.add("Insta-wall");
            } else if(result >= 67 && result <= 71) {
                this.gearArray.add("Infra-goggles");
            } else if(result >= 72 && result <= 74) {
                this.gearArray.add("Grav harness");
            } else if(result >= 75 && result <= 78) {
                this.gearArray.add("Stabiliser");
            } else if(result >= 79 && result <= 83) {
                this.gearArray.add("Jump belt");
            } else if(result >= 84 && result <= 87) {
                this.gearArray.add("Land deed");
            } else if(result >= 88 && result <= 91) {
                this.gearArray.add("Snooper");
            } else if(result >= 92 && result <= 97) {
                this.gearArray.add("Stim-pack");
            } else {
                this.gearArray.add("Buffer field");
            }
        }
    }





}
