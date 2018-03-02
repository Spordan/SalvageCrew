import java.util.ArrayList;
import java.util.Random;

public class CrewMember
{
    private String name;
    private double reactions, speed, combatSkill, toughness, tech;
    private ArrayList<String> weaponsArray;
    private ArrayList<String> gearArray;
    private int credits;
    private int debt;
    private int xp;
    private int leads;
    private int personalWeaponRolls;
    private int battleWeaponRolls;
    private int gearRolls;
    private Origin origin, motivation, training;

    /**
     * Constructor for objects of class CrewMember
     */
    public CrewMember()
    {
        BTNameGen bt = new BTNameGen();
        this.name = bt.GenerateName();
        this.reactions = 1.0;
        this.speed = 4.0;
        this.combatSkill = 0.0;
        this.toughness = 3.0;
        this.tech = 0.0;

        this.personalWeaponRolls = 0;
        this.battleWeaponRolls = 0;
        this.gearRolls = 0;

        this.weaponsArray = new ArrayList<>();
        this.gearArray = new ArrayList<>();

        this.credits = 8;
        this.debt = Utils.RollXD6(3) + 20;

        this.leads = 0;
        this.xp = 0;

        ConfigOrigin();

        ConfigMotivation();

        ConfigTraining();

        RollForPersonalWeapons();

        RollForBattleWeapons();

        RollForGear();
    }

    public String RandomName() {
        String[] firstNames = new String[] {"Patry", "Billy", "Story", "Justodd", "Arrymo", "Stine", "Froby", "Albew",
                                    "Adard", "Done", "Remy", "Gery", "Jackenn", "Jamy", "Ristor", "Rise", "Jessa",
                                    "Deby", "Ancyn", "Cola", "Kimby", "Donne", "Dorea", "Verla", "Kathri", "Lene",
                                    "Shera", "Risty", "Stammy", "Mildra", "Jana", "Nica", "Xani", "Rotai", "Goni",
                                    "Bari", "Caloo", "Bandi", "Y'Cora", "Lani", "Hupa", "Maza", "Achan", "Pocki",
                                    "Brusse", "Willy", "Weston", "Dante"};
        int rndFirst = new Random().nextInt(firstNames.length);

        String[] lastNames = new String[] {"Kniffin", "Bechtel", "Story", "Iavarone", "Chalet", "Tronstad", "Cantos",
                "Waring", "Adard", "Byrn", "Stasny", "Vangelos", "Sarratt", "Zemke", "Alken", "Voight", "Llewellyn",
                "Basset", "Alessandro", "Holbach", "Paulsen", "Dilucca", "Dowe", "Zahra", "Sonoda", "Thoran",
                "Zechiel", "Hyden", "Konicek", "Irani", "Campbell", "Lezal", "Coly", "Sonand", "Prigonz",
                "Coley", "Bellee", "Arris", "Hingte", "Marte", "Wardez", "Phezal", "Coxand", "Reson",
                "Ganes", "Titley", "Purnell", "Carter"};
        int rndLast = new Random().nextInt(lastNames.length);

        return firstNames[rndFirst] + " " + lastNames[rndLast];
    }

    public void ConfigOrigin() {
        this.origin = RandomOrigin();

        //update base stats with additions from origin
        this.reactions = this.reactions + origin.GetReactionsMod();
        this.speed = this.speed + origin.GetSpeedMod();
        this.combatSkill = this.combatSkill + origin.GetCombatSkillMod();
        this.toughness = this.toughness + origin.GetToughnessMod();
        this.tech = this.tech + origin.GetTechMod();

        this.leads = this.leads + origin.GetLead();
        this.xp = this.xp + origin.GetXPMod();

        this.personalWeaponRolls = this.personalWeaponRolls +
                origin.GetPersonalWeaponMod();
        this.battleWeaponRolls = this.battleWeaponRolls +
                origin.GetBattleWeaponMod();
        this.gearRolls = this.gearRolls + origin.GetGearMod();

        this.credits = this.credits + origin.GetCreditsMod();
    }

    public void ConfigMotivation() {
        this.motivation = RandomMotivation();

        //update base stats with additions from origin
        this.reactions = this.reactions + motivation.GetReactionsMod();
        this.speed = this.speed + motivation.GetSpeedMod();
        this.combatSkill = this.combatSkill + motivation.GetCombatSkillMod();
        this.toughness = this.toughness + motivation.GetToughnessMod();
        this.tech = this.tech + motivation.GetTechMod();

        this.leads = this.leads + motivation.GetLead();
        this.xp = this.xp + motivation.GetXPMod();

        this.personalWeaponRolls = this.personalWeaponRolls +
                motivation.GetPersonalWeaponMod();
        this.battleWeaponRolls = this.battleWeaponRolls +
                motivation.GetBattleWeaponMod();
        this.gearRolls = this.gearRolls + motivation.GetGearMod();

        this.credits = this.credits + motivation.GetCreditsMod();
    }

    public void ConfigTraining() {
        this.training = RandomTraining();

        //update base stats with additions from origin
        this.reactions = this.reactions + training.GetReactionsMod();
        this.speed = this.speed + training.GetSpeedMod();
        this.combatSkill = this.combatSkill + training.GetCombatSkillMod();
        this.toughness = this.toughness + training.GetToughnessMod();
        this.tech = this.tech + training.GetTechMod();

        this.leads = this.leads + training.GetLead();
        this.xp = this.xp + training.GetXPMod();

        this.personalWeaponRolls = this.personalWeaponRolls +
                training.GetPersonalWeaponMod();
        this.battleWeaponRolls = this.battleWeaponRolls +
                training.GetBattleWeaponMod();
        this.gearRolls = this.gearRolls + training.GetGearMod();

        this.credits = this.credits + training.GetCreditsMod();
    }

    private void RollForPersonalWeapons() {

        for(int i = 0; i < this.personalWeaponRolls; i++) {
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

        for(int i = 0; i < this.battleWeaponRolls; i++) {
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

        for(int i = 0; i < this.gearRolls; i++) {

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + this.name + "\n");
        sb.append("Reactions: " + this.reactions + "\n");
        sb.append("Speed: " + this.speed + "\n");
        sb.append("Combat Skill: " + this.combatSkill + "\n");
        sb.append("Toughness: " + this.toughness + "\n");
        sb.append("Tech: " + this.tech + "\n");
        sb.append("Credits: " + this.credits + "\n");
        sb.append("Leads: " + this.leads + "\n");
        sb.append("Origin: " + this.origin.GetName() + "\n");
        sb.append("Motivation: " + this.motivation.GetName() + "\n");
        sb.append("Training: " + this.training.GetName() + "\n");
        sb.append("XP: " + this.xp + "\n");

        StringBuilder weaponsSB = new StringBuilder();
        for(String s : this.weaponsArray) {
            weaponsSB.append(s + ", ");
        }
        sb.append("Weapons: " + weaponsSB.toString() + "\n");

        StringBuilder gearSB = new StringBuilder();
        for(String s : this.gearArray) {
            gearSB.append(s + ", ");
        }
        sb.append("Gear: " + gearSB.toString() + "\n");

        return sb.toString();
    }

    private Origin RandomOrigin() {
        Origin o;

        int result = Utils.RollD100();

        if(result >= 1 && result <= 9) {
            o = new Origin("Core systems world", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 0, 1, 0, 0);
        } else if(result >= 10 && result <= 15) {
            o = new Origin("Frontier colony", 0.5, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 0, 0, 0, 0);
        } else if(result >= 16 && result <= 25) {
            o = new Origin("Mid-tech world", 0.0, 0.0, 0.0, 0.0, 0.0,
                    2, 0, 0, 0, 0, 0);
        } else if(result >= 26 && result <= 33) {
            o = new Origin("High-tech world", 0.0, 0.0, 0.0, 0.0, 0.5,
                    0, 0, 0, 0, 0, 0);
        } else if(result >= 34 && result <= 42) {
            o = new Origin("Trade hub", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, Utils.RollXD6(1), 0, 0, 0, 0);
        } else if(result >= 43 && result <= 48) {
            o = new Origin("Struggling colony", 0.5, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 0, 0, 1, 0);
        } else if(result >= 49 && result <= 56) {
            o = new Origin("Mega-city", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 0, 0, 1, 0);
        } else if(result >= 57 && result <= 61) {
            o = new Origin("Prison planet", 0.0, 0.0, 0.5, 0.0, 0.0,
                    0, 0, 0, 0, 0, 0);
        } else if(result >= 62 && result <= 66) {
            o = new Origin("Hostile environment colony", 0.0, 0.0, 0.5, 0.0, 0.0,
                    0, 0, 0, 0, 0, 1);
        } else if(result >= 67 && result <= 75) {
            o = new Origin("Deep space fleet", 0.0, 0.0, 0.0, 0.0, 0.5,
                    0, 0, 1, 1, 0, 0);
        } else if(result >= 76 && result <= 83) {
            o = new Origin("Military outpost", 0.0, 0.0, 0.0, 0.5, 0.0,
                    0, 0, 0, 0, 0, 1);
        } else if(result >= 84 && result <= 91) {
            o = new Origin("Scientific outpost", 0.0, 0.0, 0.0, 0.0, 0.5,
                    0, 0, 0, 0, 0, 0);
        } else {
            o = new Origin("Resource extraction colony", 0.0, 0.0, 0.5, 0.0, 0.0,
                    0, Utils.RollXD6(1), 0, 0, 0, 0);
        }

        return o;
    }



    private Origin RandomMotivation() {
        Origin o;

        int result = Utils.RollD100();

        if(result >= 1 && result <= 8) {
            o = new Origin("Wealth", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, Utils.RollXD6(1), 0, 0, 0, 0);
        } else if(result >= 9 && result <= 14) {
            o = new Origin("Fame", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 1, 0, 0, 0);
        } else if(result >= 15 && result <= 19) {
            o = new Origin("Glory", 0.0, 0.0, 0.0, 0.5, 0.0,
                    0, 0, 0, 0, 0, 1);
        } else if(result >= 20 && result <= 26) {
            o = new Origin("Survival", 0.0, 0.0, 0.5, 0.0, 0.0,
                    0, 0, 0, 0, 0, 0);
        } else if(result >= 27 && result <= 32) {
            o = new Origin("Escape", 0.0, 1.0, 0.0, 0.0, 0.0,
                    0, 0, 0, 0, 0, 0);
        } else if(result >= 33 && result <= 39) {
            o = new Origin("Adventure", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, Utils.RollXD6(1), 0, 0, 1, 0);
        } else if(result >= 40 && result <= 44) {
            o = new Origin("Truth", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 1, 0, 0, 0);
        } else if(result >= 45 && result <= 49) {
            o = new Origin("Technology", 0.0, 0.0, 0.0, 0.0, 0.5,
                    0, 0, 0, 1, 0, 0);
        } else if(result >= 50 && result <= 56) {
            o = new Origin("Discovery", 0.0, 0.0, 0.0, 0.0, 0.5,
                    0, 0, 1, 0, 0, 0);
        } else if(result >= 57 && result <= 63) {
            o = new Origin("Loyalty", 0.0, 0.0, 0.0, 0.0, 0.0,
                    2, 0, 0, 0, 0, 0);
        } else if(result >= 64 && result <= 69) {
            o = new Origin("Revenge", 0.0, 0.0, 0.0, 0.0, 0.0,
                    1, 0, 0, 0, 1, 0);
        } else if(result >= 70 && result <= 74) {
            o = new Origin("Romance", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 1, 0, 0, 0);
        } else if(result >= 75 && result <= 79) {
            o = new Origin("Faith", 0.0, 0.0, 0.0, 0.0, 0.0,
                    2, 0, 0, 0, 0, 0);
        } else if(result >= 80 && result <= 84) {
            o = new Origin("Political", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 1, 0, 0, 0);
        } else if(result >= 85 && result <= 90) {
            o = new Origin("Power", 0.0, 0.0, 0.0, 0.0, 0.0,
                    2, 0, 0, 0, 0, 0);
        } else if(result >= 91 && result <= 95) {
            o = new Origin("Order", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 0, 0, 1, 0);
        } else {
            o = new Origin("Freedom", 0.0, 0.0, 0.0, 0.0, 0.0,
                    1, 0, 0, 0, 0, 0);
        }

        return o;
    }


    private Origin RandomTraining() {
        Origin o;

        int result = Utils.RollD100();

        if(result >= 1 && result <= 5) {
            o = new Origin("Trader", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, Utils.RollXD6(1), 0, 2, 0, 0);
        } else if(result >= 6 && result <= 11) {
            o = new Origin("Laborer", 0.0, 0.0, 0.5, 0.0, 0.0,
                    0, 1, 0, 0, 0, 0);
        } else if(result >= 12 && result <= 16) {
            o = new Origin("Researcher", 0.0, 0.0, 0.0, 0.0, 1.0,
                    0, 0, 0, 1, 0, 0);
        } else if(result >= 17 && result <= 23) {
            o = new Origin("Space Freighter", 0.0, 0.0, 0.5, 0.0, 0.0,
                    0, 0, 0, 0, 0, 0);
        } else if(result >= 24 && result <= 29) {
            o = new Origin("Naval security", 0.0, 0.0, 0.0, 0.5, 0.0,
                    0, 0, 0, 0, 0, 1);
        } else if(result >= 30 && result <= 35) {
            o = new Origin("Engineer", 0.0, 0.0, 0.0, 0.0, 1.0,
                    0, 0, 0, 0, 0, 0);
        } else if(result >= 36 && result <= 42) {
            o = new Origin("Ship's crew", 0.0, 0.0, 0.0, 0.0, 0.5,
                    0, 0, 0, 0, 0, 0);
        } else if(result >= 43 && result <= 49) {
            o = new Origin("Pilot", 0.0, 0.0, 0.0, 0.0, 0.5,
                    0, 0, 0, 0, 0, 0);
        } else if(result >= 50 && result <= 55) {
            o = new Origin("Starport enforcer", 0.0, 0.0, 0.0, 0.5, 0.0,
                    0, 0, 0, 0, 0, 1);
        } else if(result >= 56 && result <= 61) {
            o = new Origin("Doctor", 0.0, 0.0, 0.0, 0.0, 0.0,
                    0, Utils.RollXD6(1), 0, 1, 0, 0);
        } else if(result >= 62 && result <= 68) {
            o = new Origin("Traveller", 0.0, 0.0, 0.0, 0.0, 0.0,
                    3, 0, 0, 0, 1, 0);
        } else if(result >= 69 && result <= 73) {
            o = new Origin("Scientist", 0.0, 0.0, 0.0, 0.0, 1.0,
                    0, 0, 0, 1, 0, 0);
        } else if(result >= 74 && result <= 80) {
            o = new Origin("Scoundrel", 0.5, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 0, 0, 0, 0);
        } else if(result >= 81 && result <= 88) {
            o = new Origin("Freelancer", 0.5, 0.0, 0.0, 0.0, 0.0,
                    0, 0, 0, 0, 1, 0);
        } else if(result >= 89 && result <= 93) {
            o = new Origin("Starport scum", 0.0, 0.5, 0.0, 0.0, 0.0,
                    0, 0, 0, 0, 1, 0);
        } else {
            o = new Origin("Treasure hunter", 0.0, 0.5, 0.0, 0.0, 0.0,
                    0, 0, 0, 2, 0, 0);
        }

        return o;
    }
}
