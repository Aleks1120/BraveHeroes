package battleAcademy;

import static battleAcademy.HeroType.SUPPORT;

public class Support extends Hero {
    private Integer heal;

    public Support(String name, Integer health, Body body, Integer basicAttack, Shield shield, Integer heal) throws Exception {
        super(name, SUPPORT, health, body, basicAttack, shield);
        this.heal = heal;

        if (basicAttack >= 70) {
            throw new RuntimeException("Support was not able to perform basi attack");
        }
    }
}
