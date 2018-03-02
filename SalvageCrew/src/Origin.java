public class Origin
{
    private String name;
    private double reactionsMod;
    private double speedMod;
    private double toughnessMod;
    private double combatSkillMod;
    private double techMod;
    private int xpMod;
    private int creditsMod;
    private int lead;
    private int gearMod, personalWeaponMod, battleWeaponMod;

    /**
     * Constructor for objects of class Origin
     */
    public Origin(String name, double reactionsMod, double speedMod,
                  double toughnessMod, double combatSkillMod, double techMod,
                  int xpMod, int creditsMod, int lead, int gearMod,
                  int personalWeaponMod, int battleWeaponMod)
    {
        this.name = name;
        this.reactionsMod = reactionsMod;
        this.speedMod = speedMod;
        this.toughnessMod = toughnessMod;
        this.combatSkillMod = combatSkillMod;
        this.techMod = techMod;
        this.xpMod = xpMod;
        this.creditsMod = creditsMod;
        this.lead = lead;
        this.gearMod = gearMod;
        this.personalWeaponMod = personalWeaponMod;
        this.battleWeaponMod = battleWeaponMod;
    }

    public String GetName() {
        return this.name;
    }

    public double GetReactionsMod() {
        return this.reactionsMod;
    }

    public double GetSpeedMod() {
        return this.speedMod;
    }

    public double GetToughnessMod() {
        return this.toughnessMod;
    }

    public double GetCombatSkillMod() {
        return this.combatSkillMod;
    }

    public double GetTechMod() {
        return this.techMod;
    }

    public int GetPersonalWeaponMod() {
        return this.personalWeaponMod;
    }

    public int GetBattleWeaponMod() {
        return this.battleWeaponMod;
    }

    public int GetGearMod() {
        return this.gearMod;
    }

    public int GetCreditsMod() {
        return this.creditsMod;
    }

    public int GetLead() {
        return lead;
    }

    public int GetXPMod() {
        return this.xpMod;
    }
}
