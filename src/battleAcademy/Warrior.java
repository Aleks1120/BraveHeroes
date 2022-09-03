package battleAcademy;

import static battleAcademy.HeroType.WARRIOR;

public class Warrior extends Hero {
    private Integer additionalAttack;

    Warrior(Integer additionalAttack,
            String heroName,
            Integer life,
            Body body) {
        super(heroName, WARRIOR, life, body);
        this.additionalAttack = additionalAttack;
    }
}
