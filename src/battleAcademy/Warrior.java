package battleAcademy;

import static battleAcademy.HeroType.WARRIOR;

public class Warrior extends Hero {
    private Integer additionalAttack;

    public Warrior(String name, Integer health, Body body, Integer basicAttack, Shield shield, Integer additionalAttack) throws Exception {
        super(name, WARRIOR, health, body, basicAttack, shield);
        this.additionalAttack = additionalAttack;
    }
}
