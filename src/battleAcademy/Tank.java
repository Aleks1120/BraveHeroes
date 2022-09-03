package battleAcademy;

import static battleAcademy.HeroType.TANK;

public class Tank extends Hero{
    private Integer additionalHealth;
    private Integer reduceAttack;

    public Tank(String heroName, Integer life, Body body, Integer additionalHealth, Integer reduceAttack) {
        super(heroName, TANK, life, body);
        this.additionalHealth = additionalHealth;
        this.reduceAttack = reduceAttack;
    }
}
