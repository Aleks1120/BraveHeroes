package battleAcademy;

import java.time.LocalDate;

public class Player {

    private String name;
    private Boolean experience;
    private Integer level;
    private LocalDate dateOfRegistration;

    Player(String name,
           Boolean experience,
           Integer level,
           LocalDate dateOfRegistration) throws Exception {
        this.name = name;
        this.experience = experience;
        setLevel(level);
        this.dateOfRegistration = dateOfRegistration;
    }

    String getName() {
        return name;
    }

    private void setExperience(Integer experience) {
    }

    Integer getLevel() {
        return level;
    }

    private void setLevel(Integer level) throws Exception {
        if (level > 30) {
            throw new RuntimeException("Has reached maximum level");
        }
        this.level = level;
    }

    private void setDateOfRegistration(Integer dateOfRegistration) {
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", level=" + level +
                ", dateOfRegistration=" + dateOfRegistration +
                '}';
    }
}
