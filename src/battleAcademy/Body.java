package battleAcademy;

public class Body {
    private Gender gender;
    private Double height;
    private Integer weight;
    private BodyType bodyType;
    private Voice voice;
    private EyesColour eyes;

    private Body(Builder builder) {
        this.gender = builder.gender;
        this.height = builder.height;
        this.weight = builder.weight;
        this.bodyType = builder.bodyType;
        this.voice = builder.voice;
        this.eyes = builder.eyes;
    }

    public static class Builder {
        private Gender gender = Gender.MALE;
        private Double height = 1.80;
        private Integer weight = 80;
        private BodyType bodyType = BodyType.HUMAN_BODY;
        private Voice voice;
        private EyesColour eyes;

        public Builder() {
        }

        public Builder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder withHeight(Double height) {
            this.height = height;
            return this;
        }

        public Builder withWeight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public Builder withBodyType(BodyType bodyType) {
            this.bodyType = bodyType;
            return this;
        }

        public Builder withVoice(Voice voice) {
            this.voice = voice;
            return this;
        }

        public Builder withEyes(EyesColour eyes) {
            this.eyes = eyes;
            return this;
        }


        public Body build() {
            return new Body(this);
        }

        @Override
        public String toString() {
            return "Character with " +
                    "gender=" + gender +
                    ", height=" + height +
                    ", weight=" + weight +
                    ", bodyType=" + bodyType +
                    ", voice type=" + voice +
                    ", eyes type=" + eyes +
                    '}';
        }
    }
}
