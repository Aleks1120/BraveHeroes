package battleAcademy;

import static battleAcademy.HeroType.MAGE;

public class Mage extends Hero {
    private Integer magicalAttack;

    public Mage(String name, HeroType type, Integer life, Body body, Integer basicAttack, Shield shield, Integer magicalAttack) throws Exception {
        super(name, type, life, body, basicAttack, shield);
        this.magicalAttack = magicalAttack;

        if (basicAttack > 100) {
            throw new Exception("Warrior has reached his limit of basic attack");
        }
    }
}
