package battleAcademy;

import static battleAcademy.HeroType.SUPPORT;

public class Support extends Hero {
    private Integer heal;

    public Support(String name, HeroType type, Integer life, Body body, Integer basicAttack, Shield shield, Integer heal) throws Exception {
        super(name, type, life, body, basicAttack, shield);
        this.heal = heal;

        if (basicAttack >= 70) {
            throw new Exception("Only warriors and mage can have upper basic attack");
        }
    }
}
