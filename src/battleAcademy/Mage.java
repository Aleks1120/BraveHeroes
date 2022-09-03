package battleAcademy;

import static battleAcademy.HeroType.MAGE;

public class Mage extends Hero{
    private Integer attack;

    public Mage(String heroName, Integer life, Body body, Integer attack) {
        super(heroName, MAGE, life, body);
        this.attack = attack;
    }
}
