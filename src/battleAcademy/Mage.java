package battleAcademy;

import static battleAcademy.HeroType.MAGE;

public class Mage extends Hero {
    private Integer magicalAttack;

    public Mage(String name, Integer health, Body body, Integer basicAttack, Shield shield, Integer magicalAttack) throws Exception {
        super(name, MAGE, health, body, basicAttack, shield);
        this.magicalAttack = magicalAttack;

        if (basicAttack > 100) {
            throw new RuntimeException("Mage has reached his limit of basic attack");
        }
    }
}
