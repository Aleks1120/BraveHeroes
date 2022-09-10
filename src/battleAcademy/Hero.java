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
         Integer health,
         Body body,
         Integer basicAttack,
         Shield shield) throws Exception {
        this.name = name;
        this.type = type;
        this.health = health;
        this.body = body;
        setBasicAttack(basicAttack);
        this.shield = shield;
    }

    private void setBasicAttack(Integer basicAttack) throws Exception {
        if (basicAttack < 50 || basicAttack > 150) {
            throw new RuntimeException("Can not perform basic attack");
        }
        this.basicAttack = basicAttack;
    }
}
