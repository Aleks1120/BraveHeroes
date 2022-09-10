package battleAcademy;

import java.time.LocalDate;

import static battleAcademy.HeroType.*;

public class Program {
    public static void main(String[] args) {

        try {

            Player player1 = new Player("Stefan", true, 12,
                    LocalDate.of(2020, 12, 15));
            Body body1 = new Body.Builder()
                    .withGender(Gender.MALE)
                    .withHeight(1.73)
                    .withWeight(60)
                    .withBodyType(BodyType.MERMAID)
                    .withVoice(Voice.QUIET)
                    .withEyes(EyesColour.RED)
                    .build();
            Body body2 = new Body.Builder().build();
            Body body3 = new Body.Builder().build();
            Body body4 = new Body.Builder().build();
            Shield shield1 = new Shield(ShieldType.SHIELD_A, 3);
            Shield shield2 = new Shield(ShieldType.SHIELD_B, 50);
            Shield shield3 = new Shield(ShieldType.SHIELD_A, 50);
            Warrior warrior = new Warrior("Nocturne", 600, body1, 12, shield1, 50);
            Tank tank = new Tank("Orn", 1000, body2, 30, shield2, 50);
            Support support = new Support("Nami", 450, body3, 12, shield1, 10);
            Mage mage = new Mage("Katarina", 700, body4, 70, shield3, 60);
            Player player2 = new Player("Toni", null, 1, LocalDate.of(2022, 8, 16));


            System.out.println(body1);

        } catch (Exception exception) {
            System.out.println("Something went wrong: " + exception.getMessage());
        }
    }
}
