package battleAcademy;

import static battleAcademy.HeroType.SUPPORT;

public class Support extends Hero{
    private Integer heal;

    public Support(String heroName, Integer life, Body body, Integer heal) {
        super(heroName, SUPPORT, life, body);
        this.heal = heal;
    }
}
