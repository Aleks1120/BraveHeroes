package battleAcademy;

public enum HeroType {
    TANK("I am fat"),
    WARRIOR("I am strong"),
    MAGE("I am magestic"),
    SUPPORT("I am healer");

    private String description;

    HeroType(String description){
        this.description = description;
    }
}
