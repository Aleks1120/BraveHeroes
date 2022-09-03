package battleAcademy;

public class ExtraShield {
    private Integer powerShieldA;
    private Integer powerShieldB;

    private ExtraShield(Integer powerShieldA, Integer powerShieldB) {
        this.powerShieldA = powerShieldA;
        this.powerShieldB = powerShieldB;
    }

    static ExtraShield powerForShieldA(Integer reduceAttack){
        return new ExtraShield(reduceAttack, null);
    }
    static ExtraShield powerForShieldB(Integer reduceAttack){
        return new ExtraShield(null, reduceAttack);
    }
}
