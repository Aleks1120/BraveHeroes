package battleAcademy;

public abstract class Hero {
    private String name;
    private HeroType type;
    private Integer health;
    private Body body;
    private Integer basicAttack;
    private Shield shield;

    Hero(String name,
         HeroType type,
         Integer life,
         Body body,
         Integer basicAttack,
         Shield shield) throws Exception {
        this.name = name;
        this.type = type;
        this.health = life;
        this.body = body;
        setBasicAttack();
        this.shield = shield;
    }

    Integer getBasicAttack() {
        return basicAttack;
    }

    private void setBasicAttack() throws Exception {
        if (basicAttack < 50 || basicAttack > 150) {
            throw new Exception(" Can not perform basic attack");
        }
        this.basicAttack = basicAttack;
    }

}
