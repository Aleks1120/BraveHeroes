package battleAcademy;

import static battleAcademy.HeroType.WARRIOR;

public class Warrior extends Hero {
    private Integer additionalAttack;

    public Warrior(String name, HeroType type, Integer life, Body body, Integer basicAttack, Shield shield, Integer additionalAttack) throws Exception {
        super(name, type, life, body, basicAttack, shield);
        this.additionalAttack = additionalAttack;
    }
}
