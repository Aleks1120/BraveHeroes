package battleAcademy;

import static battleAcademy.HeroType.TANK;

public class Tank extends Hero {
    private Integer additionalHealth;
    private Integer reduceAttack;

    public Tank(String name, Integer health, Body body, Integer basicAttack, Shield shield, Integer additionalHealth) throws Exception {
        super(name, TANK, health, body, basicAttack, shield);
        this.additionalHealth = additionalHealth;

        if (basicAttack >= 70) {
            throw new RuntimeException("Tank was not able to perform basic attack");
        }
    }
}
