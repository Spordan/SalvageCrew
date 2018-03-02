import java.util.Random;

public class SpaceShip
{
    private String name;
    private String shipCondition;
    private String captainCondition;

    /**
     * Constructor for objects of class SpaceShip
     */
    public SpaceShip() {
        this.name = RandomShipName();
        this.shipCondition = RandomShipCondition();
        this.captainCondition = RandomCaptainCondition();
    }

    public String RandomShipName() {
        BTNameGen bt = new BTNameGen();
        return bt.GenerateShip();
    }

    public String RandomShipCondition() {
        int result = Utils.RollD100();

        if(result >= 1 && result <= 10) {
            return "Gently used";
        } else if(result >= 11 && result <= 20) {
            return "Heavily modified";
        } else if(result >= 21 && result <= 30) {
            return "Pretty good for it's age";
        } else if(result >= 31 && result <= 40) {
            return "Barely flying";
        } else if(result >= 41 && result <= 50) {
            return "Presentable but mundane";
        } else if(result >= 51 && result <= 60) {
            return "On her last legs";
        } else if(result >= 61 && result <= 70) {
            return "In need of overhaul";
        } else if(result >= 71 && result <= 80) {
            return "A disaster waiting to happen";
        } else if(result >= 81 && result <= 90) {
            return "Surprisingly nice";
        } else {
            return "Cobbled together";
        }
    }

    public String RandomCaptainCondition() {

        int result = Utils.RollD100();

        if(result >= 1 && result <= 10) {
            return "A charismatic leader";
        } else if(result >= 11 && result <= 20) {
            return "A greedy cut throat";
        } else if(result >= 21 && result <= 30) {
            return "A pragmatic problem solver";
        } else if(result >= 31 && result <= 40) {
            return "A bureaucratic thinker";
        } else if(result >= 41 && result <= 50) {
            return "A free thinking rogue";
        } else if(result >= 51 && result <= 60) {
            return "A shrewd diplomat";
        } else if(result >= 61 && result <= 70) {
            return "A loyal idealist";
        } else if(result >= 71 && result <= 80) {
            return "A charming scoundrel";
        } else if(result >= 81 && result <= 90) {
            return "A ruthless schemer";
        } else {
            return "Probably insane";
        }
    }

    public String GetShipName() {
        return this.name;
    }

    public String GetShipCondition() {
        return this.shipCondition;
    }

    public String GetCaptainCondition() {
        return this.captainCondition;
    }
}
