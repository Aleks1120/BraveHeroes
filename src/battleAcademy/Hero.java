package battleAcademy;

public abstract class Hero {
    private String name;
    private HeroType type;
    private Integer health;
    private Body body;

    Hero(String name,
         HeroType type,
         Integer life,
         Body body) {
        this.name = name;
        this.type = type;
        this.health = life;
        this.body = body;
    }
}
