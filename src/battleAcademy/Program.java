package battleAcademy;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        try {

            Player player1 = new Player("Stefan", true,12,
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
            Warrior warrior = new Warrior(5, "Nocturne",600, body1);
            Tank tank = new Tank("Orn", 1000, body2, 30, 60);
            Support support = new Support("Nami", 400, body3, 20);
            Player player2 = new Player("Toni", null, 1, LocalDate.of(2022, 8, 16));



            System.out.println(body1);

        } catch (Exception exception) {
            System.out.println("Something went wrong: " + exception.getMessage());
        }
    }
}
