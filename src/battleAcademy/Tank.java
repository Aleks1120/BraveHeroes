package battleAcademy;

import static battleAcademy.HeroType.TANK;

public class Tank extends Hero {
    private Integer additionalHealth;
    private Integer reduceAttack;

    public Tank(String name, HeroType type, Integer life, Body body, Integer basicAttack, Shield shield, Integer additionalHealth) throws Exception {
        super(name, type, life, body, basicAttack, shield);
        this.additionalHealth = additionalHealth;

        if (basicAttack >= 70) {
            throw new Exception("Only warriors and mage can have upper basic attack");
        }
    }
}
